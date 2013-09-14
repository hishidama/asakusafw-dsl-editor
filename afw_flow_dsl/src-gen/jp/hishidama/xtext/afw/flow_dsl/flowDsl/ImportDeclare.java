/**
 */
package jp.hishidama.xtext.afw.flow_dsl.flowDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Declare</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.ImportDeclare#getName <em>Name</em>}</li>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.ImportDeclare#isWildcard <em>Wildcard</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage#getImportDeclare()
 * @model
 * @generated
 */
public interface ImportDeclare extends EObject
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
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage#getImportDeclare_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.ImportDeclare#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wildcard</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wildcard</em>' attribute.
   * @see #setWildcard(boolean)
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage#getImportDeclare_Wildcard()
   * @model
   * @generated
   */
  boolean isWildcard();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.ImportDeclare#isWildcard <em>Wildcard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wildcard</em>' attribute.
   * @see #isWildcard()
   * @generated
   */
  void setWildcard(boolean value);

} // ImportDeclare
