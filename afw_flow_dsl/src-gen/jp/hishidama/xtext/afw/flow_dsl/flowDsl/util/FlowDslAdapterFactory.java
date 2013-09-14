/**
 */
package jp.hishidama.xtext.afw.flow_dsl.flowDsl.util;

import jp.hishidama.xtext.afw.flow_dsl.flowDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage
 * @generated
 */
public class FlowDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FlowDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FlowDslPackage.eINSTANCE;
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
  protected FlowDslSwitch<Adapter> modelSwitch =
    new FlowDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseScript(Script object)
      {
        return createScriptAdapter();
      }
      @Override
      public Adapter casePackageDeclare(PackageDeclare object)
      {
        return createPackageDeclareAdapter();
      }
      @Override
      public Adapter caseImportDeclare(ImportDeclare object)
      {
        return createImportDeclareAdapter();
      }
      @Override
      public Adapter caseOperatorDeclare(OperatorDeclare object)
      {
        return createOperatorDeclareAdapter();
      }
      @Override
      public Adapter caseFlowDsl(FlowDsl object)
      {
        return createFlowDslAdapter();
      }
      @Override
      public Adapter caseFlowParameter(FlowParameter object)
      {
        return createFlowParameterAdapter();
      }
      @Override
      public Adapter caseFlowIn(FlowIn object)
      {
        return createFlowInAdapter();
      }
      @Override
      public Adapter caseFlowOut(FlowOut object)
      {
        return createFlowOutAdapter();
      }
      @Override
      public Adapter caseFlowStatement(FlowStatement object)
      {
        return createFlowStatementAdapter();
      }
      @Override
      public Adapter caseFlowStatement1(FlowStatement1 object)
      {
        return createFlowStatement1Adapter();
      }
      @Override
      public Adapter caseFlowStatement2(FlowStatement2 object)
      {
        return createFlowStatement2Adapter();
      }
      @Override
      public Adapter caseOperatorArgument(OperatorArgument object)
      {
        return createOperatorArgumentAdapter();
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
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.Script
   * @generated
   */
  public Adapter createScriptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.PackageDeclare <em>Package Declare</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.PackageDeclare
   * @generated
   */
  public Adapter createPackageDeclareAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.ImportDeclare <em>Import Declare</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.ImportDeclare
   * @generated
   */
  public Adapter createImportDeclareAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorDeclare <em>Operator Declare</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorDeclare
   * @generated
   */
  public Adapter createOperatorDeclareAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDsl <em>Flow Dsl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDsl
   * @generated
   */
  public Adapter createFlowDslAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowParameter <em>Flow Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowParameter
   * @generated
   */
  public Adapter createFlowParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowIn <em>Flow In</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowIn
   * @generated
   */
  public Adapter createFlowInAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowOut <em>Flow Out</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowOut
   * @generated
   */
  public Adapter createFlowOutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement <em>Flow Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement
   * @generated
   */
  public Adapter createFlowStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement1 <em>Flow Statement1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement1
   * @generated
   */
  public Adapter createFlowStatement1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement2 <em>Flow Statement2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement2
   * @generated
   */
  public Adapter createFlowStatement2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorArgument <em>Operator Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorArgument
   * @generated
   */
  public Adapter createOperatorArgumentAdapter()
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

} //FlowDslAdapterFactory
