/**
 */
package jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl;

import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowIn;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowOut;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowParameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowParameterImpl#getIn <em>In</em>}</li>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowParameterImpl#getOut <em>Out</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowParameterImpl extends MinimalEObjectImpl.Container implements FlowParameter
{
  /**
   * The cached value of the '{@link #getIn() <em>In</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIn()
   * @generated
   * @ordered
   */
  protected FlowIn in;

  /**
   * The cached value of the '{@link #getOut() <em>Out</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOut()
   * @generated
   * @ordered
   */
  protected FlowOut out;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FlowParameterImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FlowDslPackage.Literals.FLOW_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowIn getIn()
  {
    return in;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIn(FlowIn newIn, NotificationChain msgs)
  {
    FlowIn oldIn = in;
    in = newIn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowDslPackage.FLOW_PARAMETER__IN, oldIn, newIn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIn(FlowIn newIn)
  {
    if (newIn != in)
    {
      NotificationChain msgs = null;
      if (in != null)
        msgs = ((InternalEObject)in).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowDslPackage.FLOW_PARAMETER__IN, null, msgs);
      if (newIn != null)
        msgs = ((InternalEObject)newIn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowDslPackage.FLOW_PARAMETER__IN, null, msgs);
      msgs = basicSetIn(newIn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowDslPackage.FLOW_PARAMETER__IN, newIn, newIn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowOut getOut()
  {
    return out;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOut(FlowOut newOut, NotificationChain msgs)
  {
    FlowOut oldOut = out;
    out = newOut;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowDslPackage.FLOW_PARAMETER__OUT, oldOut, newOut);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOut(FlowOut newOut)
  {
    if (newOut != out)
    {
      NotificationChain msgs = null;
      if (out != null)
        msgs = ((InternalEObject)out).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowDslPackage.FLOW_PARAMETER__OUT, null, msgs);
      if (newOut != null)
        msgs = ((InternalEObject)newOut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowDslPackage.FLOW_PARAMETER__OUT, null, msgs);
      msgs = basicSetOut(newOut, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowDslPackage.FLOW_PARAMETER__OUT, newOut, newOut));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FlowDslPackage.FLOW_PARAMETER__IN:
        return basicSetIn(null, msgs);
      case FlowDslPackage.FLOW_PARAMETER__OUT:
        return basicSetOut(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FlowDslPackage.FLOW_PARAMETER__IN:
        return getIn();
      case FlowDslPackage.FLOW_PARAMETER__OUT:
        return getOut();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FlowDslPackage.FLOW_PARAMETER__IN:
        setIn((FlowIn)newValue);
        return;
      case FlowDslPackage.FLOW_PARAMETER__OUT:
        setOut((FlowOut)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FlowDslPackage.FLOW_PARAMETER__IN:
        setIn((FlowIn)null);
        return;
      case FlowDslPackage.FLOW_PARAMETER__OUT:
        setOut((FlowOut)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FlowDslPackage.FLOW_PARAMETER__IN:
        return in != null;
      case FlowDslPackage.FLOW_PARAMETER__OUT:
        return out != null;
    }
    return super.eIsSet(featureID);
  }

} //FlowParameterImpl
