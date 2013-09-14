/**
 */
package jp.hishidama.xtext.afw.batch_dsl.batchDsl.util;

import jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDsl;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDslPackage;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchParameter;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchStatement;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.Import;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.Script;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDslPackage
 * @generated
 */
public class BatchDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BatchDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BatchDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = BatchDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BatchDslSwitch<Adapter> modelSwitch =
    new BatchDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseScript(Script object)
      {
        return createScriptAdapter();
      }
      @Override
      public Adapter casePackage(jp.hishidama.xtext.afw.batch_dsl.batchDsl.Package object)
      {
        return createPackageAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseBatchDsl(BatchDsl object)
      {
        return createBatchDslAdapter();
      }
      @Override
      public Adapter caseBatchParameter(BatchParameter object)
      {
        return createBatchParameterAdapter();
      }
      @Override
      public Adapter caseBatchStatement(BatchStatement object)
      {
        return createBatchStatementAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.Script
   * @generated
   */
  public Adapter createScriptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.Package
   * @generated
   */
  public Adapter createPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDsl <em>Batch Dsl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDsl
   * @generated
   */
  public Adapter createBatchDslAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchParameter <em>Batch Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchParameter
   * @generated
   */
  public Adapter createBatchParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchStatement <em>Batch Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchStatement
   * @generated
   */
  public Adapter createBatchStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //BatchDslAdapterFactory
