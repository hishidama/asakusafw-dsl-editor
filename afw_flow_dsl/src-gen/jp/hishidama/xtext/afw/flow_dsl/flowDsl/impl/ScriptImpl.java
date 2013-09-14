/**
 */
package jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl;

import java.util.Collection;

import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDsl;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.ImportDeclare;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorDeclare;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.PackageDeclare;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.Script;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.ScriptImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.ScriptImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.ScriptImpl#getOperators <em>Operators</em>}</li>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.ScriptImpl#getList <em>List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScriptImpl extends MinimalEObjectImpl.Container implements Script
{
  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected PackageDeclare package_;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<ImportDeclare> imports;

  /**
   * The cached value of the '{@link #getOperators() <em>Operators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperators()
   * @generated
   * @ordered
   */
  protected EList<OperatorDeclare> operators;

  /**
   * The cached value of the '{@link #getList() <em>List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getList()
   * @generated
   * @ordered
   */
  protected EList<FlowDsl> list;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScriptImpl()
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
    return FlowDslPackage.Literals.SCRIPT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclare getPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPackage(PackageDeclare newPackage, NotificationChain msgs)
  {
    PackageDeclare oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowDslPackage.SCRIPT__PACKAGE, oldPackage, newPackage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackage(PackageDeclare newPackage)
  {
    if (newPackage != package_)
    {
      NotificationChain msgs = null;
      if (package_ != null)
        msgs = ((InternalEObject)package_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowDslPackage.SCRIPT__PACKAGE, null, msgs);
      if (newPackage != null)
        msgs = ((InternalEObject)newPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowDslPackage.SCRIPT__PACKAGE, null, msgs);
      msgs = basicSetPackage(newPackage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowDslPackage.SCRIPT__PACKAGE, newPackage, newPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImportDeclare> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<ImportDeclare>(ImportDeclare.class, this, FlowDslPackage.SCRIPT__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OperatorDeclare> getOperators()
  {
    if (operators == null)
    {
      operators = new EObjectContainmentEList<OperatorDeclare>(OperatorDeclare.class, this, FlowDslPackage.SCRIPT__OPERATORS);
    }
    return operators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FlowDsl> getList()
  {
    if (list == null)
    {
      list = new EObjectContainmentEList<FlowDsl>(FlowDsl.class, this, FlowDslPackage.SCRIPT__LIST);
    }
    return list;
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
      case FlowDslPackage.SCRIPT__PACKAGE:
        return basicSetPackage(null, msgs);
      case FlowDslPackage.SCRIPT__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case FlowDslPackage.SCRIPT__OPERATORS:
        return ((InternalEList<?>)getOperators()).basicRemove(otherEnd, msgs);
      case FlowDslPackage.SCRIPT__LIST:
        return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
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
      case FlowDslPackage.SCRIPT__PACKAGE:
        return getPackage();
      case FlowDslPackage.SCRIPT__IMPORTS:
        return getImports();
      case FlowDslPackage.SCRIPT__OPERATORS:
        return getOperators();
      case FlowDslPackage.SCRIPT__LIST:
        return getList();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FlowDslPackage.SCRIPT__PACKAGE:
        setPackage((PackageDeclare)newValue);
        return;
      case FlowDslPackage.SCRIPT__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends ImportDeclare>)newValue);
        return;
      case FlowDslPackage.SCRIPT__OPERATORS:
        getOperators().clear();
        getOperators().addAll((Collection<? extends OperatorDeclare>)newValue);
        return;
      case FlowDslPackage.SCRIPT__LIST:
        getList().clear();
        getList().addAll((Collection<? extends FlowDsl>)newValue);
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
      case FlowDslPackage.SCRIPT__PACKAGE:
        setPackage((PackageDeclare)null);
        return;
      case FlowDslPackage.SCRIPT__IMPORTS:
        getImports().clear();
        return;
      case FlowDslPackage.SCRIPT__OPERATORS:
        getOperators().clear();
        return;
      case FlowDslPackage.SCRIPT__LIST:
        getList().clear();
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
      case FlowDslPackage.SCRIPT__PACKAGE:
        return package_ != null;
      case FlowDslPackage.SCRIPT__IMPORTS:
        return imports != null && !imports.isEmpty();
      case FlowDslPackage.SCRIPT__OPERATORS:
        return operators != null && !operators.isEmpty();
      case FlowDslPackage.SCRIPT__LIST:
        return list != null && !list.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ScriptImpl
