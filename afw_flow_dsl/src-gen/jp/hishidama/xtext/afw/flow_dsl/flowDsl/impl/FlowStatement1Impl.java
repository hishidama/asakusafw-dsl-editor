/**
 */
package jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl;

import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement1;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorDeclare;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Statement1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowStatement1Impl#getName <em>Name</em>}</li>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowStatement1Impl#getOperator <em>Operator</em>}</li>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowStatement1Impl#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowStatement1Impl extends FlowStatementImpl implements FlowStatement1
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected OperatorDeclare operator;

  /**
   * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected static final String METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected String method = METHOD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FlowStatement1Impl()
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
    return FlowDslPackage.Literals.FLOW_STATEMENT1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowDslPackage.FLOW_STATEMENT1__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorDeclare getOperator()
  {
    if (operator != null && operator.eIsProxy())
    {
      InternalEObject oldOperator = (InternalEObject)operator;
      operator = (OperatorDeclare)eResolveProxy(oldOperator);
      if (operator != oldOperator)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlowDslPackage.FLOW_STATEMENT1__OPERATOR, oldOperator, operator));
      }
    }
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorDeclare basicGetOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(OperatorDeclare newOperator)
  {
    OperatorDeclare oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowDslPackage.FLOW_STATEMENT1__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(String newMethod)
  {
    String oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowDslPackage.FLOW_STATEMENT1__METHOD, oldMethod, method));
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
      case FlowDslPackage.FLOW_STATEMENT1__NAME:
        return getName();
      case FlowDslPackage.FLOW_STATEMENT1__OPERATOR:
        if (resolve) return getOperator();
        return basicGetOperator();
      case FlowDslPackage.FLOW_STATEMENT1__METHOD:
        return getMethod();
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
      case FlowDslPackage.FLOW_STATEMENT1__NAME:
        setName((String)newValue);
        return;
      case FlowDslPackage.FLOW_STATEMENT1__OPERATOR:
        setOperator((OperatorDeclare)newValue);
        return;
      case FlowDslPackage.FLOW_STATEMENT1__METHOD:
        setMethod((String)newValue);
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
      case FlowDslPackage.FLOW_STATEMENT1__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FlowDslPackage.FLOW_STATEMENT1__OPERATOR:
        setOperator((OperatorDeclare)null);
        return;
      case FlowDslPackage.FLOW_STATEMENT1__METHOD:
        setMethod(METHOD_EDEFAULT);
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
      case FlowDslPackage.FLOW_STATEMENT1__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FlowDslPackage.FLOW_STATEMENT1__OPERATOR:
        return operator != null;
      case FlowDslPackage.FLOW_STATEMENT1__METHOD:
        return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", method: ");
    result.append(method);
    result.append(')');
    return result.toString();
  }

} //FlowStatement1Impl
