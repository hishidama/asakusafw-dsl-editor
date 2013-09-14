/**
 */
package jp.hishidama.xtext.afw.flow_dsl.flowDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Statement1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement1#getName <em>Name</em>}</li>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement1#getOperator <em>Operator</em>}</li>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement1#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage#getFlowStatement1()
 * @model
 * @generated
 */
public interface FlowStatement1 extends FlowStatement
{
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
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage#getFlowStatement1_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement1#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' reference.
   * @see #setOperator(OperatorDeclare)
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage#getFlowStatement1_Operator()
   * @model
   * @generated
   */
  OperatorDeclare getOperator();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement1#getOperator <em>Operator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' reference.
   * @see #getOperator()
   * @generated
   */
  void setOperator(OperatorDeclare value);

  /**
   * Returns the value of the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' attribute.
   * @see #setMethod(String)
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage#getFlowStatement1_Method()
   * @model
   * @generated
   */
  String getMethod();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement1#getMethod <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' attribute.
   * @see #getMethod()
   * @generated
   */
  void setMethod(String value);

} // FlowStatement1
