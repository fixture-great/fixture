/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package caracteristica.impl;

import caracteristica.CaracteristicaPackage;
import caracteristica.CardinalidadeMaxima;
import caracteristica.VariacaoDois;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variacao Dois</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caracteristica.impl.VariacaoDoisImpl#getCardinalidadeMaxima <em>Cardinalidade Maxima</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariacaoDoisImpl extends CaracteristicaImpl implements VariacaoDois
{
  /**
   * The default value of the '{@link #getCardinalidadeMaxima() <em>Cardinalidade Maxima</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardinalidadeMaxima()
   * @generated
   * @ordered
   */
  protected static final CardinalidadeMaxima CARDINALIDADE_MAXIMA_EDEFAULT = CardinalidadeMaxima.OR;

  /**
   * The cached value of the '{@link #getCardinalidadeMaxima() <em>Cardinalidade Maxima</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardinalidadeMaxima()
   * @generated
   * @ordered
   */
  protected CardinalidadeMaxima cardinalidadeMaxima = CARDINALIDADE_MAXIMA_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariacaoDoisImpl()
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
    return CaracteristicaPackage.Literals.VARIACAO_DOIS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CardinalidadeMaxima getCardinalidadeMaxima()
  {
    return cardinalidadeMaxima;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCardinalidadeMaxima(CardinalidadeMaxima newCardinalidadeMaxima)
  {
    CardinalidadeMaxima oldCardinalidadeMaxima = cardinalidadeMaxima;
    cardinalidadeMaxima = newCardinalidadeMaxima == null ? CARDINALIDADE_MAXIMA_EDEFAULT : newCardinalidadeMaxima;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.VARIACAO_DOIS__CARDINALIDADE_MAXIMA, oldCardinalidadeMaxima, cardinalidadeMaxima));
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
      case CaracteristicaPackage.VARIACAO_DOIS__CARDINALIDADE_MAXIMA:
        return getCardinalidadeMaxima();
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
      case CaracteristicaPackage.VARIACAO_DOIS__CARDINALIDADE_MAXIMA:
        setCardinalidadeMaxima((CardinalidadeMaxima)newValue);
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
      case CaracteristicaPackage.VARIACAO_DOIS__CARDINALIDADE_MAXIMA:
        setCardinalidadeMaxima(CARDINALIDADE_MAXIMA_EDEFAULT);
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
      case CaracteristicaPackage.VARIACAO_DOIS__CARDINALIDADE_MAXIMA:
        return cardinalidadeMaxima != CARDINALIDADE_MAXIMA_EDEFAULT;
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
    result.append(" (cardinalidadeMaxima: ");
    result.append(cardinalidadeMaxima);
    result.append(')');
    return result.toString();
  }

} //VariacaoDoisImpl
