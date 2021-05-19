/**
 * generated by Xtext 2.25.0
 */
package br.unb.cic.obron.ide.oberon.impl;

import br.unb.cic.obron.ide.oberon.OberonPackage;
import br.unb.cic.obron.ide.oberon.OberonType;

import java.lang.Integer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.unb.cic.obron.ide.oberon.impl.OberonTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.unb.cic.obron.ide.oberon.impl.OberonTypeImpl#getNumElement <em>Num Element</em>}</li>
 *   <li>{@link br.unb.cic.obron.ide.oberon.impl.OberonTypeImpl#getNameType <em>Name Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OberonTypeImpl extends MinimalEObjectImpl.Container implements OberonType
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
   * The default value of the '{@link #getNumElement() <em>Num Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumElement()
   * @generated
   * @ordered
   */
  protected static final int NUM_ELEMENT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumElement() <em>Num Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumElement()
   * @generated
   * @ordered
   */
  protected int numElement = NUM_ELEMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getNameType() <em>Name Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameType()
   * @generated
   * @ordered
   */
  protected OberonType nameType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OberonTypeImpl()
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
    return OberonPackage.Literals.OBERON_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OberonPackage.OBERON_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getNumElement()
  {
    return numElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNumElement(int newNumElement)
  {
    int oldNumElement = numElement;
    numElement = newNumElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OberonPackage.OBERON_TYPE__NUM_ELEMENT, oldNumElement, numElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OberonType getNameType()
  {
    return nameType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNameType(OberonType newNameType, NotificationChain msgs)
  {
    OberonType oldNameType = nameType;
    nameType = newNameType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OberonPackage.OBERON_TYPE__NAME_TYPE, oldNameType, newNameType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNameType(OberonType newNameType)
  {
    if (newNameType != nameType)
    {
      NotificationChain msgs = null;
      if (nameType != null)
        msgs = ((InternalEObject)nameType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OberonPackage.OBERON_TYPE__NAME_TYPE, null, msgs);
      if (newNameType != null)
        msgs = ((InternalEObject)newNameType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OberonPackage.OBERON_TYPE__NAME_TYPE, null, msgs);
      msgs = basicSetNameType(newNameType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OberonPackage.OBERON_TYPE__NAME_TYPE, newNameType, newNameType));
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
      case OberonPackage.OBERON_TYPE__NAME_TYPE:
        return basicSetNameType(null, msgs);
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
      case OberonPackage.OBERON_TYPE__NAME:
        return getName();
      case OberonPackage.OBERON_TYPE__NUM_ELEMENT:
        return getNumElement();
      case OberonPackage.OBERON_TYPE__NAME_TYPE:
        return getNameType();
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
      case OberonPackage.OBERON_TYPE__NAME:
        setName((String)newValue);
        return;
      case OberonPackage.OBERON_TYPE__NUM_ELEMENT:
        setNumElement((Integer)newValue);
        return;
      case OberonPackage.OBERON_TYPE__NAME_TYPE:
        setNameType((OberonType)newValue);
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
      case OberonPackage.OBERON_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OberonPackage.OBERON_TYPE__NUM_ELEMENT:
        setNumElement(NUM_ELEMENT_EDEFAULT);
        return;
      case OberonPackage.OBERON_TYPE__NAME_TYPE:
        setNameType((OberonType)null);
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
      case OberonPackage.OBERON_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OberonPackage.OBERON_TYPE__NUM_ELEMENT:
        return numElement != NUM_ELEMENT_EDEFAULT;
      case OberonPackage.OBERON_TYPE__NAME_TYPE:
        return nameType != null;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", numElement: ");
    result.append(numElement);
    result.append(')');
    return result.toString();
  }

} //OberonTypeImpl
