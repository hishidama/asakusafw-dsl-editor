/**
 */
package jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl;

import java.util.Collection;

import jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDslPackage;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchStatement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Batch Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchStatementImpl#getName <em>Name</em>}</li>
 *   <li>{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchStatementImpl#getJobName <em>Job Name</em>}</li>
 *   <li>{@link jp.hishidama.xtext.afw.batch_dsl.batchDsl.impl.BatchStatementImpl#getAfter <em>After</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BatchStatementImpl extends MinimalEObjectImpl.Container implements BatchStatement
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
   * The default value of the '{@link #getJobName() <em>Job Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJobName()
   * @generated
   * @ordered
   */
  protected static final String JOB_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJobName() <em>Job Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJobName()
   * @generated
   * @ordered
   */
  protected String jobName = JOB_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAfter() <em>After</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAfter()
   * @generated
   * @ordered
   */
  protected EList<BatchStatement> after;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BatchStatementImpl()
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
    return BatchDslPackage.Literals.BATCH_STATEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, BatchDslPackage.BATCH_STATEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getJobName()
  {
    return jobName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJobName(String newJobName)
  {
    String oldJobName = jobName;
    jobName = newJobName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BatchDslPackage.BATCH_STATEMENT__JOB_NAME, oldJobName, jobName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BatchStatement> getAfter()
  {
    if (after == null)
    {
      after = new EObjectResolvingEList<BatchStatement>(BatchStatement.class, this, BatchDslPackage.BATCH_STATEMENT__AFTER);
    }
    return after;
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
      case BatchDslPackage.BATCH_STATEMENT__NAME:
        return getName();
      case BatchDslPackage.BATCH_STATEMENT__JOB_NAME:
        return getJobName();
      case BatchDslPackage.BATCH_STATEMENT__AFTER:
        return getAfter();
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
      case BatchDslPackage.BATCH_STATEMENT__NAME:
        setName((String)newValue);
        return;
      case BatchDslPackage.BATCH_STATEMENT__JOB_NAME:
        setJobName((String)newValue);
        return;
      case BatchDslPackage.BATCH_STATEMENT__AFTER:
        getAfter().clear();
        getAfter().addAll((Collection<? extends BatchStatement>)newValue);
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
      case BatchDslPackage.BATCH_STATEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BatchDslPackage.BATCH_STATEMENT__JOB_NAME:
        setJobName(JOB_NAME_EDEFAULT);
        return;
      case BatchDslPackage.BATCH_STATEMENT__AFTER:
        getAfter().clear();
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
      case BatchDslPackage.BATCH_STATEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BatchDslPackage.BATCH_STATEMENT__JOB_NAME:
        return JOB_NAME_EDEFAULT == null ? jobName != null : !JOB_NAME_EDEFAULT.equals(jobName);
      case BatchDslPackage.BATCH_STATEMENT__AFTER:
        return after != null && !after.isEmpty();
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
    result.append(", jobName: ");
    result.append(jobName);
    result.append(')');
    return result.toString();
  }

} //BatchStatementImpl
