/**
 */
package jp.hishidama.xtext.afw.flow_dsl.flowDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslFactory
 * @model kind="package"
 * @generated
 */
public interface FlowDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "flowDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.hishidama.jp/xtext/afw/flow_dsl/FlowDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "flowDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FlowDslPackage eINSTANCE = jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslPackageImpl.init();

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.ScriptImpl <em>Script</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.ScriptImpl
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslPackageImpl#getScript()
   * @generated
   */
  int SCRIPT = 0;

  /**
   * The feature id for the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Operators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__OPERATORS = 2;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__LIST = 3;

  /**
   * The number of structural features of the '<em>Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.PackageDeclareImpl <em>Package Declare</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.PackageDeclareImpl
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslPackageImpl#getPackageDeclare()
   * @generated
   */
  int PACKAGE_DECLARE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARE__NAME = 0;

  /**
   * The number of structural features of the '<em>Package Declare</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.ImportDeclareImpl <em>Import Declare</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.ImportDeclareImpl
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslPackageImpl#getImportDeclare()
   * @generated
   */
  int IMPORT_DECLARE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DECLARE__NAME = 0;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DECLARE__WILDCARD = 1;

  /**
   * The number of structural features of the '<em>Import Declare</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DECLARE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.OperatorDeclareImpl <em>Operator Declare</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.OperatorDeclareImpl
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslPackageImpl#getOperatorDeclare()
   * @generated
   */
  int OPERATOR_DECLARE = 3;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_DECLARE__OPERATOR = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_DECLARE__NAME = 1;

  /**
   * The number of structural features of the '<em>Operator Declare</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_DECLARE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslImpl <em>Flow Dsl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslImpl
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslPackageImpl#getFlowDsl()
   * @generated
   */
  int FLOW_DSL = 4;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_DSL__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_DSL__NAME = 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_DSL__PARAMS = 2;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_DSL__STATEMENTS = 3;

  /**
   * The number of structural features of the '<em>Flow Dsl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_DSL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowParameterImpl <em>Flow Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowParameterImpl
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslPackageImpl#getFlowParameter()
   * @generated
   */
  int FLOW_PARAMETER = 5;

  /**
   * The feature id for the '<em><b>In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_PARAMETER__IN = 0;

  /**
   * The feature id for the '<em><b>Out</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_PARAMETER__OUT = 1;

  /**
   * The number of structural features of the '<em>Flow Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowInImpl <em>Flow In</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowInImpl
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslPackageImpl#getFlowIn()
   * @generated
   */
  int FLOW_IN = 6;

  /**
   * The feature id for the '<em><b>Inout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_IN__INOUT = 0;

  /**
   * The feature id for the '<em><b>Model</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_IN__MODEL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_IN__NAME = 2;

  /**
   * The feature id for the '<em><b>Importer Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_IN__IMPORTER_DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Importer Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_IN__IMPORTER_NAME = 4;

  /**
   * The number of structural features of the '<em>Flow In</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_IN_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowOutImpl <em>Flow Out</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowOutImpl
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslPackageImpl#getFlowOut()
   * @generated
   */
  int FLOW_OUT = 7;

  /**
   * The feature id for the '<em><b>Inout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_OUT__INOUT = 0;

  /**
   * The feature id for the '<em><b>Model</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_OUT__MODEL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_OUT__NAME = 2;

  /**
   * The feature id for the '<em><b>Exporter Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_OUT__EXPORTER_DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Exporter Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_OUT__EXPORTER_NAME = 4;

  /**
   * The number of structural features of the '<em>Flow Out</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_OUT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowStatementImpl <em>Flow Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowStatementImpl
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslPackageImpl#getFlowStatement()
   * @generated
   */
  int FLOW_STATEMENT = 8;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_STATEMENT__ARGUMENTS = 0;

  /**
   * The number of structural features of the '<em>Flow Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowStatement1Impl <em>Flow Statement1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowStatement1Impl
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslPackageImpl#getFlowStatement1()
   * @generated
   */
  int FLOW_STATEMENT1 = 9;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_STATEMENT1__ARGUMENTS = FLOW_STATEMENT__ARGUMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_STATEMENT1__NAME = FLOW_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_STATEMENT1__OPERATOR = FLOW_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_STATEMENT1__METHOD = FLOW_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Flow Statement1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_STATEMENT1_FEATURE_COUNT = FLOW_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowStatement2Impl <em>Flow Statement2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowStatement2Impl
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslPackageImpl#getFlowStatement2()
   * @generated
   */
  int FLOW_STATEMENT2 = 10;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_STATEMENT2__ARGUMENTS = FLOW_STATEMENT__ARGUMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_STATEMENT2__NAME = FLOW_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Flow Statement2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_STATEMENT2_FEATURE_COUNT = FLOW_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.OperatorArgumentImpl <em>Operator Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.OperatorArgumentImpl
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslPackageImpl#getOperatorArgument()
   * @generated
   */
  int OPERATOR_ARGUMENT = 11;

  /**
   * The feature id for the '<em><b>In</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_ARGUMENT__IN = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_ARGUMENT__NAME = 1;

  /**
   * The number of structural features of the '<em>Operator Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_ARGUMENT_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.Script
   * @generated
   */
  EClass getScript();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.Script#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Package</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.Script#getPackage()
   * @see #getScript()
   * @generated
   */
  EReference getScript_Package();

  /**
   * Returns the meta object for the containment reference list '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.Script#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.Script#getImports()
   * @see #getScript()
   * @generated
   */
  EReference getScript_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.Script#getOperators <em>Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operators</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.Script#getOperators()
   * @see #getScript()
   * @generated
   */
  EReference getScript_Operators();

  /**
   * Returns the meta object for the containment reference list '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.Script#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>List</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.Script#getList()
   * @see #getScript()
   * @generated
   */
  EReference getScript_List();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.PackageDeclare <em>Package Declare</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declare</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.PackageDeclare
   * @generated
   */
  EClass getPackageDeclare();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.PackageDeclare#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.PackageDeclare#getName()
   * @see #getPackageDeclare()
   * @generated
   */
  EAttribute getPackageDeclare_Name();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.ImportDeclare <em>Import Declare</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Declare</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.ImportDeclare
   * @generated
   */
  EClass getImportDeclare();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.ImportDeclare#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.ImportDeclare#getName()
   * @see #getImportDeclare()
   * @generated
   */
  EAttribute getImportDeclare_Name();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.ImportDeclare#isWildcard <em>Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wildcard</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.ImportDeclare#isWildcard()
   * @see #getImportDeclare()
   * @generated
   */
  EAttribute getImportDeclare_Wildcard();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorDeclare <em>Operator Declare</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator Declare</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorDeclare
   * @generated
   */
  EClass getOperatorDeclare();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorDeclare#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorDeclare#getOperator()
   * @see #getOperatorDeclare()
   * @generated
   */
  EAttribute getOperatorDeclare_Operator();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorDeclare#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorDeclare#getName()
   * @see #getOperatorDeclare()
   * @generated
   */
  EAttribute getOperatorDeclare_Name();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDsl <em>Flow Dsl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow Dsl</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDsl
   * @generated
   */
  EClass getFlowDsl();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDsl#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDsl#getComment()
   * @see #getFlowDsl()
   * @generated
   */
  EAttribute getFlowDsl_Comment();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDsl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDsl#getName()
   * @see #getFlowDsl()
   * @generated
   */
  EAttribute getFlowDsl_Name();

  /**
   * Returns the meta object for the containment reference list '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDsl#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDsl#getParams()
   * @see #getFlowDsl()
   * @generated
   */
  EReference getFlowDsl_Params();

  /**
   * Returns the meta object for the containment reference list '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDsl#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDsl#getStatements()
   * @see #getFlowDsl()
   * @generated
   */
  EReference getFlowDsl_Statements();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowParameter <em>Flow Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow Parameter</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowParameter
   * @generated
   */
  EClass getFlowParameter();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowParameter#getIn <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>In</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowParameter#getIn()
   * @see #getFlowParameter()
   * @generated
   */
  EReference getFlowParameter_In();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowParameter#getOut <em>Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Out</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowParameter#getOut()
   * @see #getFlowParameter()
   * @generated
   */
  EReference getFlowParameter_Out();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowIn <em>Flow In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow In</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowIn
   * @generated
   */
  EClass getFlowIn();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowIn#getInout <em>Inout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inout</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowIn#getInout()
   * @see #getFlowIn()
   * @generated
   */
  EAttribute getFlowIn_Inout();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowIn#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Model</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowIn#getModel()
   * @see #getFlowIn()
   * @generated
   */
  EAttribute getFlowIn_Model();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowIn#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowIn#getName()
   * @see #getFlowIn()
   * @generated
   */
  EAttribute getFlowIn_Name();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowIn#getImporterDescription <em>Importer Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Importer Description</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowIn#getImporterDescription()
   * @see #getFlowIn()
   * @generated
   */
  EAttribute getFlowIn_ImporterDescription();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowIn#getImporterName <em>Importer Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Importer Name</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowIn#getImporterName()
   * @see #getFlowIn()
   * @generated
   */
  EAttribute getFlowIn_ImporterName();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowOut <em>Flow Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow Out</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowOut
   * @generated
   */
  EClass getFlowOut();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowOut#getInout <em>Inout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inout</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowOut#getInout()
   * @see #getFlowOut()
   * @generated
   */
  EAttribute getFlowOut_Inout();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowOut#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Model</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowOut#getModel()
   * @see #getFlowOut()
   * @generated
   */
  EAttribute getFlowOut_Model();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowOut#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowOut#getName()
   * @see #getFlowOut()
   * @generated
   */
  EAttribute getFlowOut_Name();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowOut#getExporterDescription <em>Exporter Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exporter Description</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowOut#getExporterDescription()
   * @see #getFlowOut()
   * @generated
   */
  EAttribute getFlowOut_ExporterDescription();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowOut#getExporterName <em>Exporter Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exporter Name</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowOut#getExporterName()
   * @see #getFlowOut()
   * @generated
   */
  EAttribute getFlowOut_ExporterName();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement <em>Flow Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow Statement</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement
   * @generated
   */
  EClass getFlowStatement();

  /**
   * Returns the meta object for the containment reference list '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement#getArguments()
   * @see #getFlowStatement()
   * @generated
   */
  EReference getFlowStatement_Arguments();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement1 <em>Flow Statement1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow Statement1</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement1
   * @generated
   */
  EClass getFlowStatement1();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement1#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement1#getName()
   * @see #getFlowStatement1()
   * @generated
   */
  EAttribute getFlowStatement1_Name();

  /**
   * Returns the meta object for the reference '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement1#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Operator</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement1#getOperator()
   * @see #getFlowStatement1()
   * @generated
   */
  EReference getFlowStatement1_Operator();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement1#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement1#getMethod()
   * @see #getFlowStatement1()
   * @generated
   */
  EAttribute getFlowStatement1_Method();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement2 <em>Flow Statement2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow Statement2</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement2
   * @generated
   */
  EClass getFlowStatement2();

  /**
   * Returns the meta object for the reference '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement2#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement2#getName()
   * @see #getFlowStatement2()
   * @generated
   */
  EReference getFlowStatement2_Name();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorArgument <em>Operator Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator Argument</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorArgument
   * @generated
   */
  EClass getOperatorArgument();

  /**
   * Returns the meta object for the reference '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorArgument#getIn <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>In</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorArgument#getIn()
   * @see #getOperatorArgument()
   * @generated
   */
  EReference getOperatorArgument_In();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorArgument#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorArgument#getName()
   * @see #getOperatorArgument()
   * @generated
   */
  EAttribute getOperatorArgument_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FlowDslFactory getFlowDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.ScriptImpl <em>Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.ScriptImpl
     * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslPackageImpl#getScript()
     * @generated
     */
    EClass SCRIPT = eINSTANCE.getScript();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__PACKAGE = eINSTANCE.getScript_Package();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__IMPORTS = eINSTANCE.getScript_Imports();

    /**
     * The meta object literal for the '<em><b>Operators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__OPERATORS = eINSTANCE.getScript_Operators();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__LIST = eINSTANCE.getScript_List();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.PackageDeclareImpl <em>Package Declare</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.PackageDeclareImpl
     * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslPackageImpl#getPackageDeclare()
     * @generated
     */
    EClass PACKAGE_DECLARE = eINSTANCE.getPackageDeclare();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARE__NAME = eINSTANCE.getPackageDeclare_Name();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.ImportDeclareImpl <em>Import Declare</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.ImportDeclareImpl
     * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslPackageImpl#getImportDeclare()
     * @generated
     */
    EClass IMPORT_DECLARE = eINSTANCE.getImportDeclare();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_DECLARE__NAME = eINSTANCE.getImportDeclare_Name();

    /**
     * The meta object literal for the '<em><b>Wildcard</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_DECLARE__WILDCARD = eINSTANCE.getImportDeclare_Wildcard();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.OperatorDeclareImpl <em>Operator Declare</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.OperatorDeclareImpl
     * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslPackageImpl#getOperatorDeclare()
     * @generated
     */
    EClass OPERATOR_DECLARE = eINSTANCE.getOperatorDeclare();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR_DECLARE__OPERATOR = eINSTANCE.getOperatorDeclare_Operator();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR_DECLARE__NAME = eINSTANCE.getOperatorDeclare_Name();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslImpl <em>Flow Dsl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslImpl
     * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslPackageImpl#getFlowDsl()
     * @generated
     */
    EClass FLOW_DSL = eINSTANCE.getFlowDsl();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOW_DSL__COMMENT = eINSTANCE.getFlowDsl_Comment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOW_DSL__NAME = eINSTANCE.getFlowDsl_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW_DSL__PARAMS = eINSTANCE.getFlowDsl_Params();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW_DSL__STATEMENTS = eINSTANCE.getFlowDsl_Statements();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowParameterImpl <em>Flow Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowParameterImpl
     * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslPackageImpl#getFlowParameter()
     * @generated
     */
    EClass FLOW_PARAMETER = eINSTANCE.getFlowParameter();

    /**
     * The meta object literal for the '<em><b>In</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW_PARAMETER__IN = eINSTANCE.getFlowParameter_In();

    /**
     * The meta object literal for the '<em><b>Out</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW_PARAMETER__OUT = eINSTANCE.getFlowParameter_Out();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowInImpl <em>Flow In</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowInImpl
     * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslPackageImpl#getFlowIn()
     * @generated
     */
    EClass FLOW_IN = eINSTANCE.getFlowIn();

    /**
     * The meta object literal for the '<em><b>Inout</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOW_IN__INOUT = eINSTANCE.getFlowIn_Inout();

    /**
     * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOW_IN__MODEL = eINSTANCE.getFlowIn_Model();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOW_IN__NAME = eINSTANCE.getFlowIn_Name();

    /**
     * The meta object literal for the '<em><b>Importer Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOW_IN__IMPORTER_DESCRIPTION = eINSTANCE.getFlowIn_ImporterDescription();

    /**
     * The meta object literal for the '<em><b>Importer Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOW_IN__IMPORTER_NAME = eINSTANCE.getFlowIn_ImporterName();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowOutImpl <em>Flow Out</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowOutImpl
     * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslPackageImpl#getFlowOut()
     * @generated
     */
    EClass FLOW_OUT = eINSTANCE.getFlowOut();

    /**
     * The meta object literal for the '<em><b>Inout</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOW_OUT__INOUT = eINSTANCE.getFlowOut_Inout();

    /**
     * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOW_OUT__MODEL = eINSTANCE.getFlowOut_Model();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOW_OUT__NAME = eINSTANCE.getFlowOut_Name();

    /**
     * The meta object literal for the '<em><b>Exporter Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOW_OUT__EXPORTER_DESCRIPTION = eINSTANCE.getFlowOut_ExporterDescription();

    /**
     * The meta object literal for the '<em><b>Exporter Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOW_OUT__EXPORTER_NAME = eINSTANCE.getFlowOut_ExporterName();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowStatementImpl <em>Flow Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowStatementImpl
     * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslPackageImpl#getFlowStatement()
     * @generated
     */
    EClass FLOW_STATEMENT = eINSTANCE.getFlowStatement();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW_STATEMENT__ARGUMENTS = eINSTANCE.getFlowStatement_Arguments();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowStatement1Impl <em>Flow Statement1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowStatement1Impl
     * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslPackageImpl#getFlowStatement1()
     * @generated
     */
    EClass FLOW_STATEMENT1 = eINSTANCE.getFlowStatement1();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOW_STATEMENT1__NAME = eINSTANCE.getFlowStatement1_Name();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW_STATEMENT1__OPERATOR = eINSTANCE.getFlowStatement1_Operator();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOW_STATEMENT1__METHOD = eINSTANCE.getFlowStatement1_Method();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowStatement2Impl <em>Flow Statement2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowStatement2Impl
     * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslPackageImpl#getFlowStatement2()
     * @generated
     */
    EClass FLOW_STATEMENT2 = eINSTANCE.getFlowStatement2();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW_STATEMENT2__NAME = eINSTANCE.getFlowStatement2_Name();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.OperatorArgumentImpl <em>Operator Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.OperatorArgumentImpl
     * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslPackageImpl#getOperatorArgument()
     * @generated
     */
    EClass OPERATOR_ARGUMENT = eINSTANCE.getOperatorArgument();

    /**
     * The meta object literal for the '<em><b>In</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATOR_ARGUMENT__IN = eINSTANCE.getOperatorArgument_In();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR_ARGUMENT__NAME = eINSTANCE.getOperatorArgument_Name();

  }

} //FlowDslPackage
