/**
 */
package jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl;

import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDsl;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslFactory;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowIn;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowOut;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowParameter;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement1;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement2;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.ImportDeclare;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorArgument;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorDeclare;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.PackageDeclare;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.Script;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowDslPackageImpl extends EPackageImpl implements FlowDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scriptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageDeclareEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importDeclareEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operatorDeclareEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass flowDslEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass flowParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass flowInEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass flowOutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass flowStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass flowStatement1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass flowStatement2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operatorArgumentEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FlowDslPackageImpl()
  {
    super(eNS_URI, FlowDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link FlowDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FlowDslPackage init()
  {
    if (isInited) return (FlowDslPackage)EPackage.Registry.INSTANCE.getEPackage(FlowDslPackage.eNS_URI);

    // Obtain or create and register package
    FlowDslPackageImpl theFlowDslPackage = (FlowDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FlowDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FlowDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theFlowDslPackage.createPackageContents();

    // Initialize created meta-data
    theFlowDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theFlowDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FlowDslPackage.eNS_URI, theFlowDslPackage);
    return theFlowDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScript()
  {
    return scriptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScript_Package()
  {
    return (EReference)scriptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScript_Imports()
  {
    return (EReference)scriptEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScript_Operators()
  {
    return (EReference)scriptEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScript_List()
  {
    return (EReference)scriptEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageDeclare()
  {
    return packageDeclareEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDeclare_Name()
  {
    return (EAttribute)packageDeclareEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportDeclare()
  {
    return importDeclareEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportDeclare_Name()
  {
    return (EAttribute)importDeclareEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportDeclare_Wildcard()
  {
    return (EAttribute)importDeclareEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperatorDeclare()
  {
    return operatorDeclareEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperatorDeclare_Operator()
  {
    return (EAttribute)operatorDeclareEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperatorDeclare_Name()
  {
    return (EAttribute)operatorDeclareEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFlowDsl()
  {
    return flowDslEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFlowDsl_Comment()
  {
    return (EAttribute)flowDslEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFlowDsl_Name()
  {
    return (EAttribute)flowDslEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFlowDsl_Params()
  {
    return (EReference)flowDslEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFlowDsl_Statements()
  {
    return (EReference)flowDslEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFlowParameter()
  {
    return flowParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFlowParameter_In()
  {
    return (EReference)flowParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFlowParameter_Out()
  {
    return (EReference)flowParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFlowIn()
  {
    return flowInEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFlowIn_Inout()
  {
    return (EAttribute)flowInEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFlowIn_Model()
  {
    return (EAttribute)flowInEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFlowIn_Name()
  {
    return (EAttribute)flowInEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFlowIn_ImporterDescription()
  {
    return (EAttribute)flowInEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFlowIn_ImporterName()
  {
    return (EAttribute)flowInEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFlowOut()
  {
    return flowOutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFlowOut_Inout()
  {
    return (EAttribute)flowOutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFlowOut_Model()
  {
    return (EAttribute)flowOutEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFlowOut_Name()
  {
    return (EAttribute)flowOutEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFlowOut_ExporterDescription()
  {
    return (EAttribute)flowOutEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFlowOut_ExporterName()
  {
    return (EAttribute)flowOutEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFlowStatement()
  {
    return flowStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFlowStatement_Arguments()
  {
    return (EReference)flowStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFlowStatement1()
  {
    return flowStatement1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFlowStatement1_Name()
  {
    return (EAttribute)flowStatement1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFlowStatement1_Operator()
  {
    return (EReference)flowStatement1EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFlowStatement1_Method()
  {
    return (EAttribute)flowStatement1EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFlowStatement2()
  {
    return flowStatement2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFlowStatement2_Name()
  {
    return (EReference)flowStatement2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperatorArgument()
  {
    return operatorArgumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperatorArgument_In()
  {
    return (EReference)operatorArgumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperatorArgument_Name()
  {
    return (EAttribute)operatorArgumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowDslFactory getFlowDslFactory()
  {
    return (FlowDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    scriptEClass = createEClass(SCRIPT);
    createEReference(scriptEClass, SCRIPT__PACKAGE);
    createEReference(scriptEClass, SCRIPT__IMPORTS);
    createEReference(scriptEClass, SCRIPT__OPERATORS);
    createEReference(scriptEClass, SCRIPT__LIST);

    packageDeclareEClass = createEClass(PACKAGE_DECLARE);
    createEAttribute(packageDeclareEClass, PACKAGE_DECLARE__NAME);

    importDeclareEClass = createEClass(IMPORT_DECLARE);
    createEAttribute(importDeclareEClass, IMPORT_DECLARE__NAME);
    createEAttribute(importDeclareEClass, IMPORT_DECLARE__WILDCARD);

    operatorDeclareEClass = createEClass(OPERATOR_DECLARE);
    createEAttribute(operatorDeclareEClass, OPERATOR_DECLARE__OPERATOR);
    createEAttribute(operatorDeclareEClass, OPERATOR_DECLARE__NAME);

    flowDslEClass = createEClass(FLOW_DSL);
    createEAttribute(flowDslEClass, FLOW_DSL__COMMENT);
    createEAttribute(flowDslEClass, FLOW_DSL__NAME);
    createEReference(flowDslEClass, FLOW_DSL__PARAMS);
    createEReference(flowDslEClass, FLOW_DSL__STATEMENTS);

    flowParameterEClass = createEClass(FLOW_PARAMETER);
    createEReference(flowParameterEClass, FLOW_PARAMETER__IN);
    createEReference(flowParameterEClass, FLOW_PARAMETER__OUT);

    flowInEClass = createEClass(FLOW_IN);
    createEAttribute(flowInEClass, FLOW_IN__INOUT);
    createEAttribute(flowInEClass, FLOW_IN__MODEL);
    createEAttribute(flowInEClass, FLOW_IN__NAME);
    createEAttribute(flowInEClass, FLOW_IN__IMPORTER_DESCRIPTION);
    createEAttribute(flowInEClass, FLOW_IN__IMPORTER_NAME);

    flowOutEClass = createEClass(FLOW_OUT);
    createEAttribute(flowOutEClass, FLOW_OUT__INOUT);
    createEAttribute(flowOutEClass, FLOW_OUT__MODEL);
    createEAttribute(flowOutEClass, FLOW_OUT__NAME);
    createEAttribute(flowOutEClass, FLOW_OUT__EXPORTER_DESCRIPTION);
    createEAttribute(flowOutEClass, FLOW_OUT__EXPORTER_NAME);

    flowStatementEClass = createEClass(FLOW_STATEMENT);
    createEReference(flowStatementEClass, FLOW_STATEMENT__ARGUMENTS);

    flowStatement1EClass = createEClass(FLOW_STATEMENT1);
    createEAttribute(flowStatement1EClass, FLOW_STATEMENT1__NAME);
    createEReference(flowStatement1EClass, FLOW_STATEMENT1__OPERATOR);
    createEAttribute(flowStatement1EClass, FLOW_STATEMENT1__METHOD);

    flowStatement2EClass = createEClass(FLOW_STATEMENT2);
    createEReference(flowStatement2EClass, FLOW_STATEMENT2__NAME);

    operatorArgumentEClass = createEClass(OPERATOR_ARGUMENT);
    createEReference(operatorArgumentEClass, OPERATOR_ARGUMENT__IN);
    createEAttribute(operatorArgumentEClass, OPERATOR_ARGUMENT__NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    flowStatement1EClass.getESuperTypes().add(this.getFlowStatement());
    flowStatement2EClass.getESuperTypes().add(this.getFlowStatement());

    // Initialize classes and features; add operations and parameters
    initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getScript_Package(), this.getPackageDeclare(), null, "package", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScript_Imports(), this.getImportDeclare(), null, "imports", null, 0, -1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScript_Operators(), this.getOperatorDeclare(), null, "operators", null, 0, -1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScript_List(), this.getFlowDsl(), null, "list", null, 0, -1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageDeclareEClass, PackageDeclare.class, "PackageDeclare", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackageDeclare_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageDeclare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importDeclareEClass, ImportDeclare.class, "ImportDeclare", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportDeclare_Name(), ecorePackage.getEString(), "name", null, 0, 1, ImportDeclare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportDeclare_Wildcard(), ecorePackage.getEBoolean(), "wildcard", null, 0, 1, ImportDeclare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operatorDeclareEClass, OperatorDeclare.class, "OperatorDeclare", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperatorDeclare_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, OperatorDeclare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperatorDeclare_Name(), ecorePackage.getEString(), "name", null, 0, 1, OperatorDeclare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(flowDslEClass, FlowDsl.class, "FlowDsl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFlowDsl_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, FlowDsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFlowDsl_Name(), ecorePackage.getEString(), "name", null, 0, 1, FlowDsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFlowDsl_Params(), this.getFlowParameter(), null, "params", null, 0, -1, FlowDsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFlowDsl_Statements(), this.getFlowStatement(), null, "statements", null, 0, -1, FlowDsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(flowParameterEClass, FlowParameter.class, "FlowParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFlowParameter_In(), this.getFlowIn(), null, "in", null, 0, 1, FlowParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFlowParameter_Out(), this.getFlowOut(), null, "out", null, 0, 1, FlowParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(flowInEClass, FlowIn.class, "FlowIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFlowIn_Inout(), ecorePackage.getEString(), "inout", null, 0, 1, FlowIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFlowIn_Model(), ecorePackage.getEString(), "model", null, 0, 1, FlowIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFlowIn_Name(), ecorePackage.getEString(), "name", null, 0, 1, FlowIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFlowIn_ImporterDescription(), ecorePackage.getEString(), "importerDescription", null, 0, 1, FlowIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFlowIn_ImporterName(), ecorePackage.getEString(), "importerName", null, 0, 1, FlowIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(flowOutEClass, FlowOut.class, "FlowOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFlowOut_Inout(), ecorePackage.getEString(), "inout", null, 0, 1, FlowOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFlowOut_Model(), ecorePackage.getEString(), "model", null, 0, 1, FlowOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFlowOut_Name(), ecorePackage.getEString(), "name", null, 0, 1, FlowOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFlowOut_ExporterDescription(), ecorePackage.getEString(), "exporterDescription", null, 0, 1, FlowOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFlowOut_ExporterName(), ecorePackage.getEString(), "exporterName", null, 0, 1, FlowOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(flowStatementEClass, FlowStatement.class, "FlowStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFlowStatement_Arguments(), this.getOperatorArgument(), null, "arguments", null, 0, -1, FlowStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(flowStatement1EClass, FlowStatement1.class, "FlowStatement1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFlowStatement1_Name(), ecorePackage.getEString(), "name", null, 0, 1, FlowStatement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFlowStatement1_Operator(), this.getOperatorDeclare(), null, "operator", null, 0, 1, FlowStatement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFlowStatement1_Method(), ecorePackage.getEString(), "method", null, 0, 1, FlowStatement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(flowStatement2EClass, FlowStatement2.class, "FlowStatement2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFlowStatement2_Name(), this.getFlowOut(), null, "name", null, 0, 1, FlowStatement2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operatorArgumentEClass, OperatorArgument.class, "OperatorArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperatorArgument_In(), ecorePackage.getEObject(), null, "in", null, 0, 1, OperatorArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperatorArgument_Name(), ecorePackage.getEString(), "name", null, 0, 1, OperatorArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //FlowDslPackageImpl
