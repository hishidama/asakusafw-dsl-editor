/**
 */
package jp.hishidama.xtext.afw.flow_dsl.flowDsl.util;

import jp.hishidama.xtext.afw.flow_dsl.flowDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage
 * @generated
 */
public class FlowDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FlowDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = FlowDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case FlowDslPackage.SCRIPT:
      {
        Script script = (Script)theEObject;
        T result = caseScript(script);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowDslPackage.PACKAGE_DECLARE:
      {
        PackageDeclare packageDeclare = (PackageDeclare)theEObject;
        T result = casePackageDeclare(packageDeclare);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowDslPackage.IMPORT_DECLARE:
      {
        ImportDeclare importDeclare = (ImportDeclare)theEObject;
        T result = caseImportDeclare(importDeclare);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowDslPackage.OPERATOR_DECLARE:
      {
        OperatorDeclare operatorDeclare = (OperatorDeclare)theEObject;
        T result = caseOperatorDeclare(operatorDeclare);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowDslPackage.FLOW_DSL:
      {
        FlowDsl flowDsl = (FlowDsl)theEObject;
        T result = caseFlowDsl(flowDsl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowDslPackage.FLOW_PARAMETER:
      {
        FlowParameter flowParameter = (FlowParameter)theEObject;
        T result = caseFlowParameter(flowParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowDslPackage.FLOW_IN:
      {
        FlowIn flowIn = (FlowIn)theEObject;
        T result = caseFlowIn(flowIn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowDslPackage.FLOW_OUT:
      {
        FlowOut flowOut = (FlowOut)theEObject;
        T result = caseFlowOut(flowOut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowDslPackage.FLOW_STATEMENT:
      {
        FlowStatement flowStatement = (FlowStatement)theEObject;
        T result = caseFlowStatement(flowStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowDslPackage.FLOW_STATEMENT1:
      {
        FlowStatement1 flowStatement1 = (FlowStatement1)theEObject;
        T result = caseFlowStatement1(flowStatement1);
        if (result == null) result = caseFlowStatement(flowStatement1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowDslPackage.FLOW_STATEMENT2:
      {
        FlowStatement2 flowStatement2 = (FlowStatement2)theEObject;
        T result = caseFlowStatement2(flowStatement2);
        if (result == null) result = caseFlowStatement(flowStatement2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowDslPackage.OPERATOR_ARGUMENT:
      {
        OperatorArgument operatorArgument = (OperatorArgument)theEObject;
        T result = caseOperatorArgument(operatorArgument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Script</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScript(Script object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Declare</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Declare</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageDeclare(PackageDeclare object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import Declare</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import Declare</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportDeclare(ImportDeclare object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator Declare</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator Declare</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperatorDeclare(OperatorDeclare object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Flow Dsl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flow Dsl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlowDsl(FlowDsl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Flow Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flow Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlowParameter(FlowParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Flow In</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flow In</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlowIn(FlowIn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Flow Out</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flow Out</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlowOut(FlowOut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Flow Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flow Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlowStatement(FlowStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Flow Statement1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flow Statement1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlowStatement1(FlowStatement1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Flow Statement2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flow Statement2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlowStatement2(FlowStatement2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator Argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator Argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperatorArgument(OperatorArgument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //FlowDslSwitch
