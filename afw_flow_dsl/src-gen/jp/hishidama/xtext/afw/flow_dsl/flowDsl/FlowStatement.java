/**
 */
package jp.hishidama.xtext.afw.flow_dsl.flowDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage#getFlowStatement()
 * @model
 * @generated
 */
public interface FlowStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorArgument}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage#getFlowStatement_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<OperatorArgument> getArguments();

} // FlowStatement
