/**
 */
package jp.hishidama.xtext.afw.batch_dsl.batchDsl;

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
 * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDslFactory
 * @model kind="package"
 * @generated
 */
public interface BatchDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "batchDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.hishidama.jp/xtext/afw/batch_dsl/BatchDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "batchDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BatchDslPackage eINSTANCE = jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchDslPackageImpl.init();

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.ScriptImpl <em>Script</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.ScriptImpl
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchDslPackageImpl#getScript()
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
   * The feature id for the '<em><b>List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__LIST = 2;

  /**
   * The number of structural features of the '<em>Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.PackageImpl
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchDslPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = 0;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.ImportImpl
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__NAME = 0;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__WILDCARD = 1;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchDslImpl <em>Batch Dsl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchDslImpl
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchDslPackageImpl#getBatchDsl()
   * @generated
   */
  int BATCH_DSL = 3;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BATCH_DSL__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BATCH_DSL__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BATCH_DSL__NAME = 2;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BATCH_DSL__STATEMENTS = 3;

  /**
   * The number of structural features of the '<em>Batch Dsl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BATCH_DSL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchParameterImpl <em>Batch Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchParameterImpl
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchDslPackageImpl#getBatchParameter()
   * @generated
   */
  int BATCH_PARAMETER = 4;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BATCH_PARAMETER__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BATCH_PARAMETER__NAME = 1;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BATCH_PARAMETER__PATTERN = 2;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BATCH_PARAMETER__REQUIRED = 3;

  /**
   * The number of structural features of the '<em>Batch Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BATCH_PARAMETER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchStatementImpl <em>Batch Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchStatementImpl
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchDslPackageImpl#getBatchStatement()
   * @generated
   */
  int BATCH_STATEMENT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BATCH_STATEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Job Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BATCH_STATEMENT__JOB_NAME = 1;

  /**
   * The feature id for the '<em><b>After</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BATCH_STATEMENT__AFTER = 2;

  /**
   * The number of structural features of the '<em>Batch Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BATCH_STATEMENT_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script</em>'.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.Script
   * @generated
   */
  EClass getScript();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.Script#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Package</em>'.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.Script#getPackage()
   * @see #getScript()
   * @generated
   */
  EReference getScript_Package();

  /**
   * Returns the meta object for the containment reference list '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.Script#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.Script#getImports()
   * @see #getScript()
   * @generated
   */
  EReference getScript_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.Script#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>List</em>'.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.Script#getList()
   * @see #getScript()
   * @generated
   */
  EReference getScript_List();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the attribute list '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.Package#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.Package#getName()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_Name();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.Import#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.Import#getName()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_Name();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.Import#isWildcard <em>Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wildcard</em>'.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.Import#isWildcard()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_Wildcard();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDsl <em>Batch Dsl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Batch Dsl</em>'.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDsl
   * @generated
   */
  EClass getBatchDsl();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDsl#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDsl#getComment()
   * @see #getBatchDsl()
   * @generated
   */
  EAttribute getBatchDsl_Comment();

  /**
   * Returns the meta object for the containment reference list '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDsl#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDsl#getParams()
   * @see #getBatchDsl()
   * @generated
   */
  EReference getBatchDsl_Params();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDsl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDsl#getName()
   * @see #getBatchDsl()
   * @generated
   */
  EAttribute getBatchDsl_Name();

  /**
   * Returns the meta object for the containment reference list '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDsl#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDsl#getStatements()
   * @see #getBatchDsl()
   * @generated
   */
  EReference getBatchDsl_Statements();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchParameter <em>Batch Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Batch Parameter</em>'.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchParameter
   * @generated
   */
  EClass getBatchParameter();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchParameter#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchParameter#getComment()
   * @see #getBatchParameter()
   * @generated
   */
  EAttribute getBatchParameter_Comment();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchParameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchParameter#getName()
   * @see #getBatchParameter()
   * @generated
   */
  EAttribute getBatchParameter_Name();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchParameter#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pattern</em>'.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchParameter#getPattern()
   * @see #getBatchParameter()
   * @generated
   */
  EAttribute getBatchParameter_Pattern();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchParameter#isRequired <em>Required</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Required</em>'.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchParameter#isRequired()
   * @see #getBatchParameter()
   * @generated
   */
  EAttribute getBatchParameter_Required();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchStatement <em>Batch Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Batch Statement</em>'.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchStatement
   * @generated
   */
  EClass getBatchStatement();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchStatement#getName()
   * @see #getBatchStatement()
   * @generated
   */
  EAttribute getBatchStatement_Name();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchStatement#getJobName <em>Job Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Job Name</em>'.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchStatement#getJobName()
   * @see #getBatchStatement()
   * @generated
   */
  EAttribute getBatchStatement_JobName();

  /**
   * Returns the meta object for the reference list '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchStatement#getAfter <em>After</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>After</em>'.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchStatement#getAfter()
   * @see #getBatchStatement()
   * @generated
   */
  EReference getBatchStatement_After();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BatchDslFactory getBatchDslFactory();

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
     * The meta object literal for the '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.ScriptImpl <em>Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.ScriptImpl
     * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchDslPackageImpl#getScript()
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
     * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__LIST = eINSTANCE.getScript_List();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.PackageImpl
     * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchDslPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.ImportImpl
     * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchDslPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__NAME = eINSTANCE.getImport_Name();

    /**
     * The meta object literal for the '<em><b>Wildcard</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__WILDCARD = eINSTANCE.getImport_Wildcard();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchDslImpl <em>Batch Dsl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchDslImpl
     * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchDslPackageImpl#getBatchDsl()
     * @generated
     */
    EClass BATCH_DSL = eINSTANCE.getBatchDsl();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BATCH_DSL__COMMENT = eINSTANCE.getBatchDsl_Comment();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BATCH_DSL__PARAMS = eINSTANCE.getBatchDsl_Params();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BATCH_DSL__NAME = eINSTANCE.getBatchDsl_Name();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BATCH_DSL__STATEMENTS = eINSTANCE.getBatchDsl_Statements();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchParameterImpl <em>Batch Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchParameterImpl
     * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchDslPackageImpl#getBatchParameter()
     * @generated
     */
    EClass BATCH_PARAMETER = eINSTANCE.getBatchParameter();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BATCH_PARAMETER__COMMENT = eINSTANCE.getBatchParameter_Comment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BATCH_PARAMETER__NAME = eINSTANCE.getBatchParameter_Name();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BATCH_PARAMETER__PATTERN = eINSTANCE.getBatchParameter_Pattern();

    /**
     * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BATCH_PARAMETER__REQUIRED = eINSTANCE.getBatchParameter_Required();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchStatementImpl <em>Batch Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchStatementImpl
     * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchDslPackageImpl#getBatchStatement()
     * @generated
     */
    EClass BATCH_STATEMENT = eINSTANCE.getBatchStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BATCH_STATEMENT__NAME = eINSTANCE.getBatchStatement_Name();

    /**
     * The meta object literal for the '<em><b>Job Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BATCH_STATEMENT__JOB_NAME = eINSTANCE.getBatchStatement_JobName();

    /**
     * The meta object literal for the '<em><b>After</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BATCH_STATEMENT__AFTER = eINSTANCE.getBatchStatement_After();

  }

} //BatchDslPackage
