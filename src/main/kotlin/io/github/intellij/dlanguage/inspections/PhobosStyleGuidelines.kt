package io.github.intellij.dlanguage.inspections

import com.intellij.codeInspection.LocalInspectionTool
import com.intellij.codeInspection.ProblemsHolder
import com.intellij.psi.PsiElement
import io.github.intellij.dlanguage.DlangBundle
import io.github.intellij.dlanguage.psi.DlangVisitor
import io.github.intellij.dlanguage.psi.impl.named.*
import io.github.intellij.dlanguage.utils.ClassDeclaration
import java.util.regex.Pattern

/**
 * Created by francis on 1/5/2018.
 */
class PhobosStyleGuidelines : LocalInspectionTool() {
    override fun getDescriptionFileName(): String = "PhobosStyleGuidelines.html"
    override fun getDisplayName(): String = "Name does not comply with Phobos Style Guidelines"
    override fun buildVisitor(holder: ProblemsHolder, isOnTheFly: Boolean): DlangVisitor = PhobosStyleGuidelinesVisitor(holder)
    override fun getGroupDisplayName(): String = DlangBundle.message("d.inspections.groupname")
}

class PhobosStyleGuidelinesVisitor(val holder: ProblemsHolder) : DlangVisitor() {
    val varFunNameRegex = Pattern.compile("^([\\p{Ll}_][_\\w\\d]*|[\\p{Lu}\\d_]+)$")
    val aggregateNameRegex = Pattern.compile("^\\p{Lu}[\\w\\d]*$")
    val moduleNameRegex = Pattern.compile("^[\\p{Ll}_\\d]+$")

    fun checkName(type: String, name: String, elem: PsiElement, regex: Pattern) {
        val matcher = regex.matcher(name)
        if (name.length > 0 && matcher.find())
            holder.registerProblem(elem, type + " name '" + name + "' does not match style guidelines.")
    }

    override fun visitModuleDeclaration(o: DlangModuleDeclarationImpl) {
        for (identifier in o.identifierChain!!.identifiers) {
            checkName("Module", identifier.name, identifier, moduleNameRegex)
        }
    }

    override fun visitDeclarator(o: DLanguageDeclaratorImpl) {
        checkName("Variable", o.name.decapitalize(), o.nameIdentifier!!, varFunNameRegex)
    }

    override fun visitFunctionDeclaration(o: DLanguageFunctionDeclarationImpl) {
        checkName("Function", o.name.decapitalize(), o.nameIdentifier!!, varFunNameRegex)
    }

    override fun visitInterfaceOrClass(o: DlangInterfaceOrClassImpl) {
        val type: String
        if (o.parent is ClassDeclaration)
            type = "Class"
        else
            type = "Interface"
        checkName(type, o.name, o, aggregateNameRegex)
    }

    override fun visitStructDeclaration(o: DlangStructDeclarationImpl) {
        checkName("Struct", o.name, o, aggregateNameRegex)
    }

    override fun visitUnionDeclaration(o: DlangUnionDeclarationImpl) {
        checkName("Union", o.name, o, aggregateNameRegex)
    }

    override fun visitEnumDeclaration(o: DlangEnumDeclarationImpl) {
        checkName("Enum", o.name, o, aggregateNameRegex)
    }


}
