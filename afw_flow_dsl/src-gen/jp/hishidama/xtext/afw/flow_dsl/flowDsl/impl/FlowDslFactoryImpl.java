/**
 */
package jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl;

import jp.hishidama.xtext.afw.flow_dsl.flowDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowDslFactoryImpl extends EFactoryImpl implements FlowDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FlowDslFactory init()
  {
    try
    {
      FlowDslFactory theFlowDslFactory = (FlowDslFactory)EPackage.Registry.INSTANCE.getEFactory(FlowDslPackage.eNS_URI);
      if (theFlowDslFactory != null)
      {
        return theFlowDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FlowDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FlowDslPackage.SCRIPT: return createScript();
      case FlowDslPackage.PACKAGE_DECLARE: return createPackageDeclare();
      case FlowDslPackage.IMPORT_DECLARE: return createImportDeclare();
      case FlowDslPackage.OPERATOR_DECLARE: return createOperatorDeclare();
      case FlowDslPackage.FLOW_DSL: return createFlowDsl();
      case FlowDslPackage.FLOW_PARAMETER: return createFlowParameter();
      case FlowDslPackage.FLOW_IN: return createFlowIn();
      case FlowDslPackage.FLOW_OUT: return createFlowOut();
      case FlowDslPackage.FLOW_STATEMENT: return createFlowStatement();
      case FlowDslPackage.FLOW_STATEMENT1: return createFlowStatement1();
      case FlowDslPackage.FLOW_STATEMENT2: return createFlowStatement2();
      case FlowDslPackage.OPERATOR_ARGUMENT: return createOperatorArgument();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Script createScript()
  {
    ScriptImpl script = new ScriptImpl();
    return script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclare createPackageDeclare()
  {
    PackageDeclareImpl packageDeclare = new PackageDeclareImpl();
    return packageDeclare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportDeclare createImportDeclare()
  {
    ImportDeclareImpl importDeclare = new ImportDeclareImpl();
    return importDeclare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorDeclare createOperatorDeclare()
  {
    OperatorDeclareImpl operatorDeclare = new OperatorDeclareImpl();
    return operatorDeclare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowDsl createFlowDsl()
  {
    FlowDslImpl flowDsl = new FlowDslImpl();
    return flowDsl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowParameter createFlowParameter()
  {
    FlowParameterImpl flowParameter = new FlowParameterImpl();
    return flowParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowIn createFlowIn()
  {
    FlowInImpl flowIn = new FlowInImpl();
    return flowIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowOut createFlowOut()
  {
    FlowOutImpl flowOut = new FlowOutImpl();
    return flowOut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowStatement createFlowStatement()
  {
    FlowStatementImpl flowStatement = new FlowStatementImpl();
    return flowStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowStatement1 createFlowStatement1()
  {
    FlowStatement1Impl flowStatement1 = new FlowStatement1Impl();
    return flowStatement1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowStatement2 createFlowStatement2()
  {
    FlowStatement2Impl flowStatement2 = new FlowStatement2Impl();
    return flowStatement2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorArgument createOperatorArgument()
  {
    OperatorArgumentImpl operatorArgument = new OperatorArgumentImpl();
    return operatorArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowDslPackage getFlowDslPackage()
  {
    return (FlowDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FlowDslPackage getPackage()
  {
    return FlowDslPackage.eINSTANCE;
  }

} //FlowDslFactoryImpl
