/**
 */
package jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl;

import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowIn;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowInImpl#getInout <em>Inout</em>}</li>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowInImpl#getModel <em>Model</em>}</li>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowInImpl#getName <em>Name</em>}</li>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowInImpl#getImporterDescription <em>Importer Description</em>}</li>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowInImpl#getImporterName <em>Importer Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowInImpl extends MinimalEObjectImpl.Container implements FlowIn
{
  /**
   * The default value of the '{@link #getInout() <em>Inout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInout()
   * @generated
   * @ordered
   */
  protected static final String INOUT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInout() <em>Inout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInout()
   * @generated
   * @ordered
   */
  protected String inout = INOUT_EDEFAULT;

  /**
   * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModel()
   * @generated
   * @ordered
   */
  protected static final String MODEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModel()
   * @generated
   * @ordered
   */
  protected String model = MODEL_EDEFAULT;

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
   * The default value of the '{@link #getImporterDescription() <em>Importer Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImporterDescription()
   * @generated
   * @ordered
   */
  protected static final String IMPORTER_DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImporterDescription() <em>Importer Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImporterDescription()
   * @generated
   * @ordered
   */
  protected String importerDescription = IMPORTER_DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getImporterName() <em>Importer Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImporterName()
   * @generated
   * @ordered
   */
  protected static final String IMPORTER_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImporterName() <em>Importer Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImporterName()
   * @generated
   * @ordered
   */
  protected String importerName = IMPORTER_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FlowInImpl()
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
    return FlowDslPackage.Literals.FLOW_IN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInout()
  {
    return inout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInout(String newInout)
  {
    String oldInout = inout;
    inout = newInout;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowDslPackage.FLOW_IN__INOUT, oldInout, inout));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModel()
  {
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModel(String newModel)
  {
    String oldModel = model;
    model = newModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowDslPackage.FLOW_IN__MODEL, oldModel, model));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FlowDslPackage.FLOW_IN__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImporterDescription()
  {
    return importerDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImporterDescription(String newImporterDescription)
  {
    String oldImporterDescription = importerDescription;
    importerDescription = newImporterDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowDslPackage.FLOW_IN__IMPORTER_DESCRIPTION, oldImporterDescription, importerDescription));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImporterName()
  {
    return importerName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImporterName(String newImporterName)
  {
    String oldImporterName = importerName;
    importerName = newImporterName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowDslPackage.FLOW_IN__IMPORTER_NAME, oldImporterName, importerName));
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
      case FlowDslPackage.FLOW_IN__INOUT:
        return getInout();
      case FlowDslPackage.FLOW_IN__MODEL:
        return getModel();
      case FlowDslPackage.FLOW_IN__NAME:
        return getName();
      case FlowDslPackage.FLOW_IN__IMPORTER_DESCRIPTION:
        return getImporterDescription();
      case FlowDslPackage.FLOW_IN__IMPORTER_NAME:
        return getImporterName();
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
      case FlowDslPackage.FLOW_IN__INOUT:
        setInout((String)newValue);
        return;
      case FlowDslPackage.FLOW_IN__MODEL:
        setModel((String)newValue);
        return;
      case FlowDslPackage.FLOW_IN__NAME:
        setName((String)newValue);
        return;
      case FlowDslPackage.FLOW_IN__IMPORTER_DESCRIPTION:
        setImporterDescription((String)newValue);
        return;
      case FlowDslPackage.FLOW_IN__IMPORTER_NAME:
        setImporterName((String)newValue);
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
      case FlowDslPackage.FLOW_IN__INOUT:
        setInout(INOUT_EDEFAULT);
        return;
      case FlowDslPackage.FLOW_IN__MODEL:
        setModel(MODEL_EDEFAULT);
        return;
      case FlowDslPackage.FLOW_IN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FlowDslPackage.FLOW_IN__IMPORTER_DESCRIPTION:
        setImporterDescription(IMPORTER_DESCRIPTION_EDEFAULT);
        return;
      case FlowDslPackage.FLOW_IN__IMPORTER_NAME:
        setImporterName(IMPORTER_NAME_EDEFAULT);
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
      case FlowDslPackage.FLOW_IN__INOUT:
        return INOUT_EDEFAULT == null ? inout != null : !INOUT_EDEFAULT.equals(inout);
      case FlowDslPackage.FLOW_IN__MODEL:
        return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
      case FlowDslPackage.FLOW_IN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FlowDslPackage.FLOW_IN__IMPORTER_DESCRIPTION:
        return IMPORTER_DESCRIPTION_EDEFAULT == null ? importerDescription != null : !IMPORTER_DESCRIPTION_EDEFAULT.equals(importerDescription);
      case FlowDslPackage.FLOW_IN__IMPORTER_NAME:
        return IMPORTER_NAME_EDEFAULT == null ? importerName != null : !IMPORTER_NAME_EDEFAULT.equals(importerName);
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
    result.append(" (inout: ");
    result.append(inout);
    result.append(", model: ");
    result.append(model);
    result.append(", name: ");
    result.append(name);
    result.append(", importerDescription: ");
    result.append(importerDescription);
    result.append(", importerName: ");
    result.append(importerName);
    result.append(')');
    return result.toString();
  }

} //FlowInImpl
