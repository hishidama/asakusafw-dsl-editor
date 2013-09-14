/**
 */
package jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl;

import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowOut;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Out</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowOutImpl#getInout <em>Inout</em>}</li>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowOutImpl#getModel <em>Model</em>}</li>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowOutImpl#getName <em>Name</em>}</li>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowOutImpl#getExporterDescription <em>Exporter Description</em>}</li>
 *   <li>{@link jp.hishidama.xtext.afw.flow_dsl.flowDsl.impl.FlowOutImpl#getExporterName <em>Exporter Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowOutImpl extends MinimalEObjectImpl.Container implements FlowOut
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
   * The default value of the '{@link #getExporterDescription() <em>Exporter Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExporterDescription()
   * @generated
   * @ordered
   */
  protected static final String EXPORTER_DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExporterDescription() <em>Exporter Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExporterDescription()
   * @generated
   * @ordered
   */
  protected String exporterDescription = EXPORTER_DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getExporterName() <em>Exporter Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExporterName()
   * @generated
   * @ordered
   */
  protected static final String EXPORTER_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExporterName() <em>Exporter Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExporterName()
   * @generated
   * @ordered
   */
  protected String exporterName = EXPORTER_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FlowOutImpl()
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
    return FlowDslPackage.Literals.FLOW_OUT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, FlowDslPackage.FLOW_OUT__INOUT, oldInout, inout));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FlowDslPackage.FLOW_OUT__MODEL, oldModel, model));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FlowDslPackage.FLOW_OUT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExporterDescription()
  {
    return exporterDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExporterDescription(String newExporterDescription)
  {
    String oldExporterDescription = exporterDescription;
    exporterDescription = newExporterDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowDslPackage.FLOW_OUT__EXPORTER_DESCRIPTION, oldExporterDescription, exporterDescription));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExporterName()
  {
    return exporterName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExporterName(String newExporterName)
  {
    String oldExporterName = exporterName;
    exporterName = newExporterName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowDslPackage.FLOW_OUT__EXPORTER_NAME, oldExporterName, exporterName));
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
      case FlowDslPackage.FLOW_OUT__INOUT:
        return getInout();
      case FlowDslPackage.FLOW_OUT__MODEL:
        return getModel();
      case FlowDslPackage.FLOW_OUT__NAME:
        return getName();
      case FlowDslPackage.FLOW_OUT__EXPORTER_DESCRIPTION:
        return getExporterDescription();
      case FlowDslPackage.FLOW_OUT__EXPORTER_NAME:
        return getExporterName();
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
      case FlowDslPackage.FLOW_OUT__INOUT:
        setInout((String)newValue);
        return;
      case FlowDslPackage.FLOW_OUT__MODEL:
        setModel((String)newValue);
        return;
      case FlowDslPackage.FLOW_OUT__NAME:
        setName((String)newValue);
        return;
      case FlowDslPackage.FLOW_OUT__EXPORTER_DESCRIPTION:
        setExporterDescription((String)newValue);
        return;
      case FlowDslPackage.FLOW_OUT__EXPORTER_NAME:
        setExporterName((String)newValue);
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
      case FlowDslPackage.FLOW_OUT__INOUT:
        setInout(INOUT_EDEFAULT);
        return;
      case FlowDslPackage.FLOW_OUT__MODEL:
        setModel(MODEL_EDEFAULT);
        return;
      case FlowDslPackage.FLOW_OUT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FlowDslPackage.FLOW_OUT__EXPORTER_DESCRIPTION:
        setExporterDescription(EXPORTER_DESCRIPTION_EDEFAULT);
        return;
      case FlowDslPackage.FLOW_OUT__EXPORTER_NAME:
        setExporterName(EXPORTER_NAME_EDEFAULT);
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
      case FlowDslPackage.FLOW_OUT__INOUT:
        return INOUT_EDEFAULT == null ? inout != null : !INOUT_EDEFAULT.equals(inout);
      case FlowDslPackage.FLOW_OUT__MODEL:
        return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
      case FlowDslPackage.FLOW_OUT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FlowDslPackage.FLOW_OUT__EXPORTER_DESCRIPTION:
        return EXPORTER_DESCRIPTION_EDEFAULT == null ? exporterDescription != null : !EXPORTER_DESCRIPTION_EDEFAULT.equals(exporterDescription);
      case FlowDslPackage.FLOW_OUT__EXPORTER_NAME:
        return EXPORTER_NAME_EDEFAULT == null ? exporterName != null : !EXPORTER_NAME_EDEFAULT.equals(exporterName);
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
    result.append(", exporterDescription: ");
    result.append(exporterDescription);
    result.append(", exporterName: ");
    result.append(exporterName);
    result.append(')');
    return result.toString();
  }

} //FlowOutImpl
