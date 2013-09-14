/**
 */
package jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl;

import jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDsl;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDslFactory;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDslPackage;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchParameter;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchStatement;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.Import;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.Script;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BatchDslFactoryImpl extends EFactoryImpl implements BatchDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BatchDslFactory init()
  {
    try
    {
      BatchDslFactory theBatchDslFactory = (BatchDslFactory)EPackage.Registry.INSTANCE.getEFactory(BatchDslPackage.eNS_URI);
      if (theBatchDslFactory != null)
      {
        return theBatchDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BatchDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BatchDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BatchDslPackage.SCRIPT: return createScript();
      case BatchDslPackage.PACKAGE: return createPackage();
      case BatchDslPackage.IMPORT: return createImport();
      case BatchDslPackage.BATCH_DSL: return createBatchDsl();
      case BatchDslPackage.BATCH_PARAMETER: return createBatchParameter();
      case BatchDslPackage.BATCH_STATEMENT: return createBatchStatement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Script createScript()
  {
    ScriptImpl script = new ScriptImpl();
    return script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public jp.hishidama.xtext.afw.batch_dsl.batchDsl.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BatchDsl createBatchDsl()
  {
    BatchDslImpl batchDsl = new BatchDslImpl();
    return batchDsl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BatchParameter createBatchParameter()
  {
    BatchParameterImpl batchParameter = new BatchParameterImpl();
    return batchParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BatchStatement createBatchStatement()
  {
    BatchStatementImpl batchStatement = new BatchStatementImpl();
    return batchStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BatchDslPackage getBatchDslPackage()
  {
    return (BatchDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BatchDslPackage getPackage()
  {
    return BatchDslPackage.eINSTANCE;
  }

} //BatchDslFactoryImpl
