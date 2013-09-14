/**
 */
package jp.hishidama.xtext.afw.batch_dsl.batchDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Batch Dsl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDsl#getComment <em>Comment</em>}</li>
 *   <li>{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDsl#getParams <em>Params</em>}</li>
 *   <li>{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDsl#getName <em>Name</em>}</li>
 *   <li>{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDsl#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDslPackage#getBatchDsl()
 * @model
 * @generated
 */
public interface BatchDsl extends EObject
{
  /**
   * Returns the value of the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comment</em>' attribute.
   * @see #setComment(String)
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDslPackage#getBatchDsl_Comment()
   * @model
   * @generated
   */
  String getComment();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDsl#getComment <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment</em>' attribute.
   * @see #getComment()
   * @generated
   */
  void setComment(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDslPackage#getBatchDsl_Params()
   * @model containment="true"
   * @generated
   */
  EList<BatchParameter> getParams();

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
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDslPackage#getBatchDsl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDsl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDslPackage#getBatchDsl_Statements()
   * @model containment="true"
   * @generated
   */
  EList<BatchStatement> getStatements();

} // BatchDsl
