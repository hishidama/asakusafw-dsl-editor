/**
 */
package jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl;

import jp.hishidama.xtext.afw.batch_dsl.batchDsl.*;

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
      case BatchDslPackage.PACKAGE_DECLARE: return createPackageDeclare();
      case BatchDslPackage.IMPORT_DECLARE: return createImportDeclare();
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
  public PackageDeclare createPackageDeclare()
  {
    PackageDeclareImpl packageDeclare = new PackageDeclareImpl();
    return packageDeclare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportDeclare createImportDeclare()
  {
    ImportDeclareImpl importDeclare = new ImportDeclareImpl();
    return importDeclare;
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
