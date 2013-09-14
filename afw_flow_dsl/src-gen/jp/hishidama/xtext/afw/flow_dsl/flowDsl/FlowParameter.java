/**
 */
package jp.hishidama.xtext.afw.flow_dsl.flowDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowParameter#getIn <em>In</em>}</li>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowParameter#getOut <em>Out</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage#getFlowParameter()
 * @model
 * @generated
 */
public interface FlowParameter extends EObject
{
  /**
   * Returns the value of the '<em><b>In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In</em>' containment reference.
   * @see #setIn(FlowIn)
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage#getFlowParameter_In()
   * @model containment="true"
   * @generated
   */
  FlowIn getIn();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowParameter#getIn <em>In</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In</em>' containment reference.
   * @see #getIn()
   * @generated
   */
  void setIn(FlowIn value);

  /**
   * Returns the value of the '<em><b>Out</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out</em>' containment reference.
   * @see #setOut(FlowOut)
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage#getFlowParameter_Out()
   * @model containment="true"
   * @generated
   */
  FlowOut getOut();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowParameter#getOut <em>Out</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out</em>' containment reference.
   * @see #getOut()
   * @generated
   */
  void setOut(FlowOut value);

} // FlowParameter
