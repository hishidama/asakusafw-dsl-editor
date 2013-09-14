/**
 */
package jp.hishidama.xtext.afw.batch_dsl.batchDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Batch Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchStatement#getName <em>Name</em>}</li>
 *   <li>{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchStatement#getJobName <em>Job Name</em>}</li>
 *   <li>{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchStatement#getAfter <em>After</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDslPackage#getBatchStatement()
 * @model
 * @generated
 */
public interface BatchStatement extends EObject
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
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDslPackage#getBatchStatement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchStatement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Job Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Job Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Job Name</em>' attribute.
   * @see #setJobName(String)
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDslPackage#getBatchStatement_JobName()
   * @model
   * @generated
   */
  String getJobName();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchStatement#getJobName <em>Job Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Job Name</em>' attribute.
   * @see #getJobName()
   * @generated
   */
  void setJobName(String value);

  /**
   * Returns the value of the '<em><b>After</b></em>' reference list.
   * The list contents are of type {@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>After</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>After</em>' reference list.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDslPackage#getBatchStatement_After()
   * @model
   * @generated
   */
  EList<BatchStatement> getAfter();

} // BatchStatement
