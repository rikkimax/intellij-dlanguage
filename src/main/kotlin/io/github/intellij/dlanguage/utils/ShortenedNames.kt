package io.github.intellij.dlanguage.utils

import io.github.intellij.dlanguage.psi.DLanguageDeclaratorIdentifierList
import io.github.intellij.dlanguage.psi.DLanguageThrowExpression
import io.github.intellij.dlanguage.psi.named.*

    /**
 * Created by francis on 6/13/2017.
 */
//typealias AliasDeclaration = DLanguageAliasDeclaration\
typealias InterfaceOrClass = DlangInterfaceOrClass
typealias ClassDeclaration = io.github.intellij.dlanguage.psi.DLanguageClassDeclaration
typealias Constructor = DlangConstructor
typealias Destructor = DlangDestructor
typealias EnumDeclaration = DlangEnumDeclaration
typealias EnumMember = DlangEnumMember
typealias ForeachType = DlangForeachType
typealias Identifier = DlangIdentifier
typealias SingleImport = DlangSingleImport
typealias InterfaceDeclaration = io.github.intellij.dlanguage.psi.DLanguageInterfaceDeclaration
typealias LabeledStatement = io.github.intellij.dlanguage.psi.DLanguageLabeledStatement
typealias ModuleDeclaration = DlangModuleDeclaration
typealias Parameter = DlangParameter
typealias SharedStaticConstructor = io.github.intellij.dlanguage.psi.DLanguageSharedStaticConstructor
typealias SharedStaticDestructor = io.github.intellij.dlanguage.psi.DLanguageSharedStaticDestructor
typealias StaticConstructor = io.github.intellij.dlanguage.psi.DLanguageStaticConstructor
typealias StaticDestructor = io.github.intellij.dlanguage.psi.DLanguageStaticDestructor
typealias StructDeclaration = DlangStructDeclaration
typealias TemplateDeclaration = DlangTemplateDeclaration
typealias TemplateMixinDeclaration = io.github.intellij.dlanguage.psi.DLanguageTemplateMixinDeclaration
typealias TemplateParameter = io.github.intellij.dlanguage.psi.DLanguageTemplateParameter
typealias UnionDeclaration = DlangUnionDeclaration
typealias Unittest = io.github.intellij.dlanguage.psi.DLanguageUnittest
typealias AliasDeclaration = io.github.intellij.dlanguage.psi.DLanguageAliasDeclaration
typealias AliasInitializer = DlangAliasInitializer
typealias AliasThisDeclaration = io.github.intellij.dlanguage.psi.DLanguageAliasThisDeclaration
typealias AlignAttribute = io.github.intellij.dlanguage.psi.DLanguageAlignAttribute
typealias AndAndExpression = io.github.intellij.dlanguage.psi.DLanguageAndAndExpression
typealias AndExpression = io.github.intellij.dlanguage.psi.DLanguageAndExpression
typealias AnonymousEnumDeclaration = io.github.intellij.dlanguage.psi.DLanguageAnonymousEnumDeclaration
typealias ArgumentList = io.github.intellij.dlanguage.psi.DLanguageArgumentList
typealias Arguments = io.github.intellij.dlanguage.psi.DLanguageArguments
typealias ArrayInitializer = io.github.intellij.dlanguage.psi.DLanguageArrayInitializer
typealias ArrayLiteral = io.github.intellij.dlanguage.psi.DLanguageArrayLiteral
typealias ArrayMemberInitialization = io.github.intellij.dlanguage.psi.DLanguageArrayMemberInitialization
typealias AsmAddExp = io.github.intellij.dlanguage.psi.DLanguageAsmAddExp
typealias AsmAndExp = io.github.intellij.dlanguage.psi.DLanguageAsmAndExp
typealias AsmBrExp = io.github.intellij.dlanguage.psi.DLanguageAsmBrExp
typealias AsmEqualExp = io.github.intellij.dlanguage.psi.DLanguageAsmEqualExp
typealias AsmExp = io.github.intellij.dlanguage.psi.DLanguageAsmExp
typealias AsmInstruction = io.github.intellij.dlanguage.psi.DLanguageAsmInstruction
typealias AsmLogAndExp = io.github.intellij.dlanguage.psi.DLanguageAsmLogAndExp
typealias AsmLogOrExp = io.github.intellij.dlanguage.psi.DLanguageAsmLogOrExp
typealias AsmMulExp = io.github.intellij.dlanguage.psi.DLanguageAsmMulExp
typealias AsmOrExp = io.github.intellij.dlanguage.psi.DLanguageAsmOrExp
typealias AsmPrimaryExp = io.github.intellij.dlanguage.psi.DLanguageAsmPrimaryExp
typealias AsmRelExp = io.github.intellij.dlanguage.psi.DLanguageAsmRelExp
typealias AsmShiftExp = io.github.intellij.dlanguage.psi.DLanguageAsmShiftExp
typealias AsmStatement = io.github.intellij.dlanguage.psi.DLanguageAsmStatement
typealias AsmTypePrefix = io.github.intellij.dlanguage.psi.DLanguageAsmTypePrefix
typealias AsmUnaExp = io.github.intellij.dlanguage.psi.DLanguageAsmUnaExp
typealias AsmXorExp = io.github.intellij.dlanguage.psi.DLanguageAsmXorExp
typealias AssertArguments = io.github.intellij.dlanguage.psi.DLanguageAssertArguments
typealias AssertExpression = io.github.intellij.dlanguage.psi.DLanguageAssertExpression
typealias AssignExpression = io.github.intellij.dlanguage.psi.DLanguageAssignExpression
typealias AssocArrayLiteral = io.github.intellij.dlanguage.psi.DLanguageAssocArrayLiteral
typealias AtAttribute = io.github.intellij.dlanguage.psi.DLanguageAtAttribute
typealias Attribute = io.github.intellij.dlanguage.psi.DLanguageAttribute
typealias AttributeDeclaration = io.github.intellij.dlanguage.psi.DLanguageAttributeDeclaration
typealias AutoDeclaration = io.github.intellij.dlanguage.psi.DLanguageAutoDeclaration
typealias AutoDeclarationPart = DlangAutoDeclarationPart
typealias BaseClass = io.github.intellij.dlanguage.psi.DLanguageBaseClass
typealias BaseClassList = io.github.intellij.dlanguage.psi.DLanguageBaseClassList
typealias BlockStatement = io.github.intellij.dlanguage.psi.DLanguageBlockStatement
typealias BreakStatement = io.github.intellij.dlanguage.psi.DLanguageBreakStatement
typealias CaseRangeStatement = io.github.intellij.dlanguage.psi.DLanguageCaseRangeStatement
typealias CaseStatement = io.github.intellij.dlanguage.psi.DLanguageCaseStatement
typealias CastExpression = io.github.intellij.dlanguage.psi.DLanguageCastExpression
typealias CastQualifier = io.github.intellij.dlanguage.psi.DLanguageCastQualifier
typealias Catch = DlangCatch
typealias Catches = io.github.intellij.dlanguage.psi.DLanguageCatches
typealias CmpExpression = io.github.intellij.dlanguage.psi.DLanguageCmpExpression
typealias CompileCondition = io.github.intellij.dlanguage.psi.DLanguageCompileCondition
typealias ConditionalDeclaration = io.github.intellij.dlanguage.psi.DLanguageConditionalDeclaration
typealias ConditionalStatement = io.github.intellij.dlanguage.psi.DLanguageConditionalStatement
typealias Constraint = io.github.intellij.dlanguage.psi.DLanguageConstraint
typealias ContinueStatement = io.github.intellij.dlanguage.psi.DLanguageContinueStatement
typealias DebugCondition = io.github.intellij.dlanguage.psi.DLanguageDebugCondition
typealias DebugSpecification = io.github.intellij.dlanguage.psi.DLanguageDebugSpecification
typealias Declaration = io.github.intellij.dlanguage.psi.DLanguageDeclaration
typealias DeclarationOrStatement = io.github.intellij.dlanguage.psi.DLanguageDeclarationOrStatement
typealias DeclarationsAndStatements = io.github.intellij.dlanguage.psi.DLanguageDeclarationsAndStatements
typealias Declarator = DlangDeclarator
typealias DefaultStatement = io.github.intellij.dlanguage.psi.DLanguageDefaultStatement
typealias DeleteExpression = io.github.intellij.dlanguage.psi.DLanguageDeleteExpression
typealias Deprecated = io.github.intellij.dlanguage.psi.DLanguageDeprecated
typealias DoStatement = io.github.intellij.dlanguage.psi.DLanguageDoStatement
typealias EnumBody = io.github.intellij.dlanguage.psi.DLanguageEnumBody
typealias EnumMemberAttribute = io.github.intellij.dlanguage.psi.DLanguageEnumMemberAttribute
typealias EponymousTemplateDeclaration = io.github.intellij.dlanguage.psi.DLanguageEponymousTemplateDeclaration
typealias EqualExpression = io.github.intellij.dlanguage.psi.DLanguageEqualExpression
typealias Expression = io.github.intellij.dlanguage.psi.DLanguageExpression
typealias ExpressionStatement = io.github.intellij.dlanguage.psi.DLanguageExpressionStatement
typealias FinalSwitchStatement = io.github.intellij.dlanguage.psi.DLanguageFinalSwitchStatement
typealias Finally = io.github.intellij.dlanguage.psi.DLanguageFinally
typealias ForStatement = io.github.intellij.dlanguage.psi.DLanguageForStatement
typealias ForeachStatement = io.github.intellij.dlanguage.psi.DLanguageForeachStatement
typealias ForeachTypeList = io.github.intellij.dlanguage.psi.DLanguageForeachTypeList
typealias FunctionAttribute = io.github.intellij.dlanguage.psi.DLanguageFunctionAttribute
typealias FunctionBody = io.github.intellij.dlanguage.psi.DLanguageFunctionBody
typealias FunctionCallExpression = io.github.intellij.dlanguage.psi.DLanguageFunctionCallExpression
typealias FunctionContract = io.github.intellij.dlanguage.psi.DLanguageFunctionContract
typealias FunctionDeclaration = DlangFunctionDeclaration
typealias FunctionLiteralExpression = io.github.intellij.dlanguage.psi.DLanguageFunctionLiteralExpression
typealias GotoStatement = io.github.intellij.dlanguage.psi.DLanguageGotoStatement
typealias IdentifierChain = io.github.intellij.dlanguage.psi.DLanguageIdentifierChain
typealias IdentifierList = DLanguageDeclaratorIdentifierList
typealias IdentifierOrTemplateChain = io.github.intellij.dlanguage.psi.DLanguageIdentifierOrTemplateChain
typealias IdentifierOrTemplateInstance = io.github.intellij.dlanguage.psi.DLanguageIdentifierOrTemplateInstance
typealias IdentityExpression = io.github.intellij.dlanguage.psi.DLanguageIdentityExpression
typealias IfStatement = io.github.intellij.dlanguage.psi.DLanguageIfStatement
typealias ImportBind = io.github.intellij.dlanguage.psi.DLanguageImportBind
typealias ImportBindings = io.github.intellij.dlanguage.psi.DLanguageImportBindings
typealias ImportDeclaration = io.github.intellij.dlanguage.psi.DLanguageImportDeclaration
typealias ImportExpression = io.github.intellij.dlanguage.psi.DLanguageImportExpression
typealias InContractExpression = io.github.intellij.dlanguage.psi.DLanguageInContractExpression
typealias InOutContractExpression = io.github.intellij.dlanguage.psi.DLanguageInOutContractExpression
typealias InExpression = io.github.intellij.dlanguage.psi.DLanguageInExpression
typealias InStatement = io.github.intellij.dlanguage.psi.DLanguageInStatement
typealias InOutStatement = io.github.intellij.dlanguage.psi.DLanguageInOutStatement
typealias Index = io.github.intellij.dlanguage.psi.DLanguageIndex
typealias IndexExpression = io.github.intellij.dlanguage.psi.DLanguageIndexExpression
typealias Initializer = io.github.intellij.dlanguage.psi.DLanguageInitializer
typealias Invariant = io.github.intellij.dlanguage.psi.DLanguageInvariant
typealias IsExpression = io.github.intellij.dlanguage.psi.DLanguageIsExpression
typealias KeyValuePair = io.github.intellij.dlanguage.psi.DLanguageKeyValuePair
typealias KeyValuePairs = io.github.intellij.dlanguage.psi.DLanguageKeyValuePairs
typealias LastCatch = io.github.intellij.dlanguage.psi.DLanguageLastCatch
typealias LinkageAttribute = io.github.intellij.dlanguage.psi.DLanguageLinkageAttribute
typealias MemberFunctionAttribute = io.github.intellij.dlanguage.psi.DLanguageMemberFunctionAttribute
typealias MissingFunctionBody = io.github.intellij.dlanguage.psi.DLanguageMissingFunctionBody
typealias MixinDeclaration = io.github.intellij.dlanguage.psi.DLanguageMixinDeclaration
typealias MixinExpression = io.github.intellij.dlanguage.psi.DLanguageMixinExpression
typealias MixinTemplateDeclaration = io.github.intellij.dlanguage.psi.DLanguageMixinTemplateDeclaration
typealias MixinTemplateName = io.github.intellij.dlanguage.psi.DLanguageMixinTemplateName
typealias MulExpression = io.github.intellij.dlanguage.psi.DLanguageMulExpression
typealias NamedImportBind = io.github.intellij.dlanguage.psi.DLanguageNamedImportBind
typealias NamespaceList = io.github.intellij.dlanguage.psi.DLanguageNamespaceList
typealias NewAnonClassExpression = io.github.intellij.dlanguage.psi.DLanguageNewAnonClassExpression
typealias NewExpression = io.github.intellij.dlanguage.psi.DLanguageNewExpression
typealias NonVoidInitializer = io.github.intellij.dlanguage.psi.DLanguageNonVoidInitializer
typealias Operands = io.github.intellij.dlanguage.psi.DLanguageOperands
typealias OrExpression = io.github.intellij.dlanguage.psi.DLanguageOrExpression
typealias OrOrExpression = io.github.intellij.dlanguage.psi.DLanguageOrOrExpression
typealias OutContractExpression = io.github.intellij.dlanguage.psi.DLanguageOutContractExpression
typealias OutStatement = io.github.intellij.dlanguage.psi.DLanguageOutStatement
typealias Parameters = io.github.intellij.dlanguage.psi.DLanguageParameters
typealias Postblit = io.github.intellij.dlanguage.psi.DLanguagePostblit
typealias PowExpression = io.github.intellij.dlanguage.psi.DLanguagePowExpression
typealias PragmaDeclaration = io.github.intellij.dlanguage.psi.DLanguagePragmaDeclaration
typealias PragmaExpression = io.github.intellij.dlanguage.psi.DLanguagePragmaExpression
typealias PragmaStatement = io.github.intellij.dlanguage.psi.DLanguagePragmaStatement
typealias PrimaryExpression = io.github.intellij.dlanguage.psi.DLanguagePrimaryExpression
typealias Register = io.github.intellij.dlanguage.psi.DLanguageRegister
typealias RelExpression = io.github.intellij.dlanguage.psi.DLanguageRelExpression
typealias ReturnStatement = io.github.intellij.dlanguage.psi.DLanguageReturnStatement
typealias ScopeGuardStatement = io.github.intellij.dlanguage.psi.DLanguageScopeGuardStatement
typealias ShiftExpression = io.github.intellij.dlanguage.psi.DLanguageShiftExpression
typealias ShortenedFunctionBody = io.github.intellij.dlanguage.psi.DLanguageShortenedFunctionBody
typealias SpecifiedFunctionBody = io.github.intellij.dlanguage.psi.DLanguageSpecifiedFunctionBody
typealias Statement = io.github.intellij.dlanguage.psi.DLanguageStatement
typealias StatementNoCaseNoDefault = io.github.intellij.dlanguage.psi.DLanguageStatementNoCaseNoDefault
typealias StaticAssertDeclaration = io.github.intellij.dlanguage.psi.DLanguageStaticAssertDeclaration
typealias StaticAssertStatement = io.github.intellij.dlanguage.psi.DLanguageStaticAssertStatement
typealias StaticForeachDeclaration = io.github.intellij.dlanguage.psi.DLanguageStaticForeachDeclaration
typealias StaticIfCondition = io.github.intellij.dlanguage.psi.DLanguageStaticIfCondition
typealias StorageClass = io.github.intellij.dlanguage.psi.DLanguageStorageClass
typealias StructBody = io.github.intellij.dlanguage.psi.DLanguageStructBody
typealias StructInitializer = io.github.intellij.dlanguage.psi.DLanguageStructInitializer
typealias StructMemberInitializer = io.github.intellij.dlanguage.psi.DLanguageStructMemberInitializer
typealias StructMemberInitializers = io.github.intellij.dlanguage.psi.DLanguageStructMemberInitializers
typealias SwitchStatement = io.github.intellij.dlanguage.psi.DLanguageSwitchStatement
typealias Symbol = io.github.intellij.dlanguage.psi.DLanguageSymbol
typealias SynchronizedStatement = io.github.intellij.dlanguage.psi.DLanguageSynchronizedStatement
typealias TemplateAliasParameter = io.github.intellij.dlanguage.psi.DLanguageTemplateAliasParameter
typealias TemplateArgument = io.github.intellij.dlanguage.psi.DLanguageTemplateArgument
typealias TemplateArgumentList = io.github.intellij.dlanguage.psi.DLanguageTemplateArgumentList
typealias TemplateArguments = io.github.intellij.dlanguage.psi.DLanguageTemplateArguments
typealias TemplateInstance = io.github.intellij.dlanguage.psi.DLanguageTemplateInstance
typealias TemplateMixinExpression = io.github.intellij.dlanguage.psi.DLanguageTemplateMixinExpression
typealias TemplateParameterList = io.github.intellij.dlanguage.psi.DLanguageTemplateParameterList
typealias TemplateParameters = io.github.intellij.dlanguage.psi.DLanguageTemplateParameters
typealias TemplateSingleArgument = io.github.intellij.dlanguage.psi.DLanguageTemplateSingleArgument
typealias TemplateThisParameter = io.github.intellij.dlanguage.psi.DLanguageTemplateThisParameter
typealias TemplateTupleParameter = io.github.intellij.dlanguage.psi.DLanguageTemplateTupleParameter
typealias TemplateTypeParameter = io.github.intellij.dlanguage.psi.DLanguageTemplateTypeParameter
typealias TemplateValueParameter = io.github.intellij.dlanguage.psi.DLanguageTemplateValueParameter
typealias TemplateValueParameterDefault = io.github.intellij.dlanguage.psi.DLanguageTemplateValueParameterDefault
typealias TernaryExpression = io.github.intellij.dlanguage.psi.DLanguageTernaryExpression
typealias ThrowStatement = DLanguageThrowExpression
typealias TraitsExpression = io.github.intellij.dlanguage.psi.DLanguageTraitsExpression
typealias TryStatement = io.github.intellij.dlanguage.psi.DLanguageTryStatement
typealias Type = io.github.intellij.dlanguage.psi.DLanguageType
typealias Type_2 = io.github.intellij.dlanguage.psi.DLanguageType_2
typealias TypeSpecialization = io.github.intellij.dlanguage.psi.DLanguageTypeSpecialization
typealias TypeSuffix = io.github.intellij.dlanguage.psi.DLanguageTypeSuffix
typealias TypeidExpression = io.github.intellij.dlanguage.psi.DLanguageTypeidExpression
typealias TypeofExpression = io.github.intellij.dlanguage.psi.DLanguageTypeofExpression
typealias UnaryExpression = io.github.intellij.dlanguage.psi.DLanguageUnaryExpression
typealias VariableDeclaration = io.github.intellij.dlanguage.psi.DLanguageVariableDeclaration
typealias VariadicArgumentsAttribute = io.github.intellij.dlanguage.psi.DLanguageVariadicArgumentsAttribute
typealias VariadicArgumentsAttributes = io.github.intellij.dlanguage.psi.DLanguageVariadicArgumentsAttributes
typealias Vector = io.github.intellij.dlanguage.psi.DLanguageVector
typealias VersionCondition = io.github.intellij.dlanguage.psi.DLanguageVersionCondition
typealias VersionSpecification = DlangVersionSpecification
typealias WhileStatement = io.github.intellij.dlanguage.psi.DLanguageWhileStatement
typealias WithStatement = io.github.intellij.dlanguage.psi.DLanguageWithStatement
typealias XorExpression = io.github.intellij.dlanguage.psi.DLanguageXorExpression
typealias AddExpression = io.github.intellij.dlanguage.psi.DLanguageAddExpression
