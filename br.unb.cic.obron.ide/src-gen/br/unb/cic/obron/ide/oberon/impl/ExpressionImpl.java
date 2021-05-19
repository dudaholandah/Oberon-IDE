/**
 * generated by Xtext 2.25.0
 */
package br.unb.cic.obron.ide.oberon.impl;

import br.unb.cic.obron.ide.oberon.Arguments;
import br.unb.cic.obron.ide.oberon.Expression;
import br.unb.cic.obron.ide.oberon.OberonPackage;
import br.unb.cic.obron.ide.oberon.Operation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.unb.cic.obron.ide.oberon.impl.ExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link br.unb.cic.obron.ide.oberon.impl.ExpressionImpl#getOpr <em>Opr</em>}</li>
 *   <li>{@link br.unb.cic.obron.ide.oberon.impl.ExpressionImpl#getRight <em>Right</em>}</li>
 *   <li>{@link br.unb.cic.obron.ide.oberon.impl.ExpressionImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link br.unb.cic.obron.ide.oberon.impl.ExpressionImpl#getIntvalue <em>Intvalue</em>}</li>
 *   <li>{@link br.unb.cic.obron.ide.oberon.impl.ExpressionImpl#getBoolvalue <em>Boolvalue</em>}</li>
 *   <li>{@link br.unb.cic.obron.ide.oberon.impl.ExpressionImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.unb.cic.obron.ide.oberon.impl.ExpressionImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link br.unb.cic.obron.ide.oberon.impl.ExpressionImpl#getAtribs <em>Atribs</em>}</li>
 *   <li>{@link br.unb.cic.obron.ide.oberon.impl.ExpressionImpl#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Expression left;

  /**
   * The cached value of the '{@link #getOpr() <em>Opr</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpr()
   * @generated
   * @ordered
   */
  protected EList<Operation> opr;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected EList<Expression> right;

  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected Expression exp;

  /**
   * The default value of the '{@link #getIntvalue() <em>Intvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntvalue()
   * @generated
   * @ordered
   */
  protected static final String INTVALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIntvalue() <em>Intvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntvalue()
   * @generated
   * @ordered
   */
  protected String intvalue = INTVALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getBoolvalue() <em>Boolvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolvalue()
   * @generated
   * @ordered
   */
  protected static final String BOOLVALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBoolvalue() <em>Boolvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolvalue()
   * @generated
   * @ordered
   */
  protected String boolvalue = BOOLVALUE_EDEFAULT;

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
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<Arguments> args;

  /**
   * The cached value of the '{@link #getAtribs() <em>Atribs</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtribs()
   * @generated
   * @ordered
   */
  protected EList<String> atribs;

  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected EList<Expression> index;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return OberonPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(Expression newLeft, NotificationChain msgs)
  {
    Expression oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OberonPackage.EXPRESSION__LEFT, oldLeft, newLeft);
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
  public void setLeft(Expression newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OberonPackage.EXPRESSION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OberonPackage.EXPRESSION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OberonPackage.EXPRESSION__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Operation> getOpr()
  {
    if (opr == null)
    {
      opr = new EObjectContainmentEList<Operation>(Operation.class, this, OberonPackage.EXPRESSION__OPR);
    }
    return opr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Expression> getRight()
  {
    if (right == null)
    {
      right = new EObjectContainmentEList<Expression>(Expression.class, this, OberonPackage.EXPRESSION__RIGHT);
    }
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp(Expression newExp, NotificationChain msgs)
  {
    Expression oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OberonPackage.EXPRESSION__EXP, oldExp, newExp);
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
  public void setExp(Expression newExp)
  {
    if (newExp != exp)
    {
      NotificationChain msgs = null;
      if (exp != null)
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OberonPackage.EXPRESSION__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OberonPackage.EXPRESSION__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OberonPackage.EXPRESSION__EXP, newExp, newExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getIntvalue()
  {
    return intvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIntvalue(String newIntvalue)
  {
    String oldIntvalue = intvalue;
    intvalue = newIntvalue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OberonPackage.EXPRESSION__INTVALUE, oldIntvalue, intvalue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBoolvalue()
  {
    return boolvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBoolvalue(String newBoolvalue)
  {
    String oldBoolvalue = boolvalue;
    boolvalue = newBoolvalue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OberonPackage.EXPRESSION__BOOLVALUE, oldBoolvalue, boolvalue));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OberonPackage.EXPRESSION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Arguments> getArgs()
  {
    if (args == null)
    {
      args = new EObjectContainmentEList<Arguments>(Arguments.class, this, OberonPackage.EXPRESSION__ARGS);
    }
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getAtribs()
  {
    if (atribs == null)
    {
      atribs = new EDataTypeEList<String>(String.class, this, OberonPackage.EXPRESSION__ATRIBS);
    }
    return atribs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Expression> getIndex()
  {
    if (index == null)
    {
      index = new EObjectContainmentEList<Expression>(Expression.class, this, OberonPackage.EXPRESSION__INDEX);
    }
    return index;
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
      case OberonPackage.EXPRESSION__LEFT:
        return basicSetLeft(null, msgs);
      case OberonPackage.EXPRESSION__OPR:
        return ((InternalEList<?>)getOpr()).basicRemove(otherEnd, msgs);
      case OberonPackage.EXPRESSION__RIGHT:
        return ((InternalEList<?>)getRight()).basicRemove(otherEnd, msgs);
      case OberonPackage.EXPRESSION__EXP:
        return basicSetExp(null, msgs);
      case OberonPackage.EXPRESSION__ARGS:
        return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
      case OberonPackage.EXPRESSION__INDEX:
        return ((InternalEList<?>)getIndex()).basicRemove(otherEnd, msgs);
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
      case OberonPackage.EXPRESSION__LEFT:
        return getLeft();
      case OberonPackage.EXPRESSION__OPR:
        return getOpr();
      case OberonPackage.EXPRESSION__RIGHT:
        return getRight();
      case OberonPackage.EXPRESSION__EXP:
        return getExp();
      case OberonPackage.EXPRESSION__INTVALUE:
        return getIntvalue();
      case OberonPackage.EXPRESSION__BOOLVALUE:
        return getBoolvalue();
      case OberonPackage.EXPRESSION__NAME:
        return getName();
      case OberonPackage.EXPRESSION__ARGS:
        return getArgs();
      case OberonPackage.EXPRESSION__ATRIBS:
        return getAtribs();
      case OberonPackage.EXPRESSION__INDEX:
        return getIndex();
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
      case OberonPackage.EXPRESSION__LEFT:
        setLeft((Expression)newValue);
        return;
      case OberonPackage.EXPRESSION__OPR:
        getOpr().clear();
        getOpr().addAll((Collection<? extends Operation>)newValue);
        return;
      case OberonPackage.EXPRESSION__RIGHT:
        getRight().clear();
        getRight().addAll((Collection<? extends Expression>)newValue);
        return;
      case OberonPackage.EXPRESSION__EXP:
        setExp((Expression)newValue);
        return;
      case OberonPackage.EXPRESSION__INTVALUE:
        setIntvalue((String)newValue);
        return;
      case OberonPackage.EXPRESSION__BOOLVALUE:
        setBoolvalue((String)newValue);
        return;
      case OberonPackage.EXPRESSION__NAME:
        setName((String)newValue);
        return;
      case OberonPackage.EXPRESSION__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends Arguments>)newValue);
        return;
      case OberonPackage.EXPRESSION__ATRIBS:
        getAtribs().clear();
        getAtribs().addAll((Collection<? extends String>)newValue);
        return;
      case OberonPackage.EXPRESSION__INDEX:
        getIndex().clear();
        getIndex().addAll((Collection<? extends Expression>)newValue);
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
      case OberonPackage.EXPRESSION__LEFT:
        setLeft((Expression)null);
        return;
      case OberonPackage.EXPRESSION__OPR:
        getOpr().clear();
        return;
      case OberonPackage.EXPRESSION__RIGHT:
        getRight().clear();
        return;
      case OberonPackage.EXPRESSION__EXP:
        setExp((Expression)null);
        return;
      case OberonPackage.EXPRESSION__INTVALUE:
        setIntvalue(INTVALUE_EDEFAULT);
        return;
      case OberonPackage.EXPRESSION__BOOLVALUE:
        setBoolvalue(BOOLVALUE_EDEFAULT);
        return;
      case OberonPackage.EXPRESSION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OberonPackage.EXPRESSION__ARGS:
        getArgs().clear();
        return;
      case OberonPackage.EXPRESSION__ATRIBS:
        getAtribs().clear();
        return;
      case OberonPackage.EXPRESSION__INDEX:
        getIndex().clear();
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
      case OberonPackage.EXPRESSION__LEFT:
        return left != null;
      case OberonPackage.EXPRESSION__OPR:
        return opr != null && !opr.isEmpty();
      case OberonPackage.EXPRESSION__RIGHT:
        return right != null && !right.isEmpty();
      case OberonPackage.EXPRESSION__EXP:
        return exp != null;
      case OberonPackage.EXPRESSION__INTVALUE:
        return INTVALUE_EDEFAULT == null ? intvalue != null : !INTVALUE_EDEFAULT.equals(intvalue);
      case OberonPackage.EXPRESSION__BOOLVALUE:
        return BOOLVALUE_EDEFAULT == null ? boolvalue != null : !BOOLVALUE_EDEFAULT.equals(boolvalue);
      case OberonPackage.EXPRESSION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OberonPackage.EXPRESSION__ARGS:
        return args != null && !args.isEmpty();
      case OberonPackage.EXPRESSION__ATRIBS:
        return atribs != null && !atribs.isEmpty();
      case OberonPackage.EXPRESSION__INDEX:
        return index != null && !index.isEmpty();
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
    result.append(" (intvalue: ");
    result.append(intvalue);
    result.append(", boolvalue: ");
    result.append(boolvalue);
    result.append(", name: ");
    result.append(name);
    result.append(", atribs: ");
    result.append(atribs);
    result.append(')');
    return result.toString();
  }

} //ExpressionImpl
