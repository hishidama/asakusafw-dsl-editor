/**
 */
package jp.hishidama.xtext.afw.flow_dsl.flowDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator Declare</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorDeclare#getOperator <em>Operator</em>}</li>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorDeclare#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage#getOperatorDeclare()
 * @model
 * @generated
 */
public interface OperatorDeclare extends EObject
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage#getOperatorDeclare_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorDeclare#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage#getOperatorDeclare_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorDeclare#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // OperatorDeclare
