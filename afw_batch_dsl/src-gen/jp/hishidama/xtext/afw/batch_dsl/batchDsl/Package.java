/**
 */
package jp.hishidama.xtext.afw.batch_dsl.batchDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.Package#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDslPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute list.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDslPackage#getPackage_Name()
   * @model unique="false"
   * @generated
   */
  EList<String> getName();

} // Package
