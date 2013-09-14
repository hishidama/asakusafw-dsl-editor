/**
 */
package jp.hishidama.xtext.afw.batch_dsl.batchDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDslPackage
 * @generated
 */
public interface BatchDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BatchDslFactory eINSTANCE = jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchDslFactoryImpl.init();

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
   * Returns a new object of class '<em>Batch Dsl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Batch Dsl</em>'.
   * @generated
   */
  BatchDsl createBatchDsl();

  /**
   * Returns a new object of class '<em>Batch Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Batch Parameter</em>'.
   * @generated
   */
  BatchParameter createBatchParameter();

  /**
   * Returns a new object of class '<em>Batch Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Batch Statement</em>'.
   * @generated
   */
  BatchStatement createBatchStatement();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  BatchDslPackage getBatchDslPackage();

} //BatchDslFactory
