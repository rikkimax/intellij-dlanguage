package io.github.intellij.dlanguage.resolve

import com.intellij.psi.PsiElement
import com.intellij.psi.ResolveState
import com.intellij.psi.scope.PsiScopeProcessor
import com.intellij.testFramework.UsefulTestCase
import io.github.intellij.dlanguage.psi.DLanguageAliasDeclaration
import io.github.intellij.dlanguage.psi.DLanguageDeclaration
import io.github.intellij.dlanguage.psi.named.DlangAliasInitializer
import io.github.intellij.dlanguage.utils.StructBody
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever
import junit.framework.TestCase
import org.junit.Test

class ScopeProcessorTest : UsefulTestCase() {

    @Test
    fun testProcessDeclarationsWithEmptyList() {
        val element = mock<StructBody>()
        whenever(element.declarations).thenReturn(emptyList())
        val processor = mock<PsiScopeProcessor>()
        val state = mock<ResolveState>()
        val lastParent = mock<PsiElement>()
        val place = mock<PsiElement>()

        val shouldContinue = ScopeProcessorImpl.processDeclarations(element, processor, state, lastParent, place)
        TestCase.assertTrue("Should continue", shouldContinue)
    }

    @Test
    fun testProcessDeclarationsShouldntContinue() {
        val alias = mock<DLanguageAliasDeclaration>()
        val aliasInitializer: DlangAliasInitializer = mock<DlangAliasInitializer>()
        whenever(alias.aliasInitializers).thenReturn(listOf(aliasInitializer))
        val declaration = mock<DLanguageDeclaration>()
        whenever(declaration.aliasDeclaration).thenReturn(alias)

        val element = mock<StructBody>()
        whenever(element.declarations).thenReturn(listOf(declaration))
        val processor = mock<PsiScopeProcessor>()
        val state = mock<ResolveState>()
        whenever(processor.execute(declaration, state)).thenReturn(false)
        val lastParent = mock<PsiElement>()
        val place = mock<PsiElement>()

        val shouldContinue = ScopeProcessorImpl.processDeclarations(element, processor, state, lastParent, place)
        TestCase.assertFalse("Shouldn't continue", shouldContinue)
    }

}
