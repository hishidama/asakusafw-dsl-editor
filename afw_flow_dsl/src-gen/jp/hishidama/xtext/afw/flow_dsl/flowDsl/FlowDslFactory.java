/**
 */
package jp.hishidama.xtext.afw.flow_dsl.flowDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage
 * @generated
 */
public interface FlowDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FlowDslFactory eINSTANCE = jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Script</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Script</em>'.
   * @generated
   */
  Script createScript();

  /**
   * Returns a new object of class '<em>Package Declare</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Declare</em>'.
   * @generated
   */
  PackageDeclare createPackageDeclare();

  /**
   * Returns a new object of class '<em>Import Declare</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Declare</em>'.
   * @generated
   */
  ImportDeclare createImportDeclare();

  /**
   * Returns a new object of class '<em>Operator Declare</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operator Declare</em>'.
   * @generated
   */
  OperatorDeclare createOperatorDeclare();

  /**
   * Returns a new object of class '<em>Flow Dsl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Flow Dsl</em>'.
   * @generated
   */
  FlowDsl createFlowDsl();

  /**
   * Returns a new object of class '<em>Flow Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Flow Parameter</em>'.
   * @generated
   */
  FlowParameter createFlowParameter();

  /**
   * Returns a new object of class '<em>Flow In</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Flow In</em>'.
   * @generated
   */
  FlowIn createFlowIn();

  /**
   * Returns a new object of class '<em>Flow Out</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Flow Out</em>'.
   * @generated
   */
  FlowOut createFlowOut();

  /**
   * Returns a new object of class '<em>Flow Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Flow Statement</em>'.
   * @generated
   */
  FlowStatement createFlowStatement();

  /**
   * Returns a new object of class '<em>Flow Statement1</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Flow Statement1</em>'.
   * @generated
   */
  FlowStatement1 createFlowStatement1();

  /**
   * Returns a new object of class '<em>Flow Statement2</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Flow Statement2</em>'.
   * @generated
   */
  FlowStatement2 createFlowStatement2();

  /**
   * Returns a new object of class '<em>Operator Argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operator Argument</em>'.
   * @generated
   */
  OperatorArgument createOperatorArgument();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  FlowDslPackage getFlowDslPackage();

} //FlowDslFactory
