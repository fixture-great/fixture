/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package caracteristica.impl;

import caracteristica.CaracteristicaPackage;
import caracteristica.EventoRelacional;
import caracteristica.InformacaodeContexto;
import caracteristica.OperadorRelacional;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evento Relacional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caracteristica.impl.EventoRelacionalImpl#getVariaveldeContexto <em>Variavelde Contexto</em>}</li>
 *   <li>{@link caracteristica.impl.EventoRelacionalImpl#getOperadorRelacional <em>Operador Relacional</em>}</li>
 *   <li>{@link caracteristica.impl.EventoRelacionalImpl#getValor <em>Valor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventoRelacionalImpl extends EventoImpl implements EventoRelacional
{
  /**
   * The cached value of the '{@link #getVariaveldeContexto() <em>Variavelde Contexto</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariaveldeContexto()
   * @generated
   * @ordered
   */
  protected InformacaodeContexto variaveldeContexto;

  /**
   * The default value of the '{@link #getOperadorRelacional() <em>Operador Relacional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperadorRelacional()
   * @generated
   * @ordered
   */
  protected static final OperadorRelacional OPERADOR_RELACIONAL_EDEFAULT = OperadorRelacional.MAIOR;

  /**
   * The cached value of the '{@link #getOperadorRelacional() <em>Operador Relacional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperadorRelacional()
   * @generated
   * @ordered
   */
  protected OperadorRelacional operadorRelacional = OPERADOR_RELACIONAL_EDEFAULT;

  /**
   * The default value of the '{@link #getValor() <em>Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValor()
   * @generated
   * @ordered
   */
  protected static final String VALOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValor() <em>Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValor()
   * @generated
   * @ordered
   */
  protected String valor = VALOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventoRelacionalImpl()
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
    return CaracteristicaPackage.Literals.EVENTO_RELACIONAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InformacaodeContexto getVariaveldeContexto()
  {
    if (variaveldeContexto != null && variaveldeContexto.eIsProxy())
    {
      InternalEObject oldVariaveldeContexto = (InternalEObject)variaveldeContexto;
      variaveldeContexto = (InformacaodeContexto)eResolveProxy(oldVariaveldeContexto);
      if (variaveldeContexto != oldVariaveldeContexto)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CaracteristicaPackage.EVENTO_RELACIONAL__VARIAVELDE_CONTEXTO, oldVariaveldeContexto, variaveldeContexto));
      }
    }
    return variaveldeContexto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InformacaodeContexto basicGetVariaveldeContexto()
  {
    return variaveldeContexto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariaveldeContexto(InformacaodeContexto newVariaveldeContexto)
  {
    InformacaodeContexto oldVariaveldeContexto = variaveldeContexto;
    variaveldeContexto = newVariaveldeContexto;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.EVENTO_RELACIONAL__VARIAVELDE_CONTEXTO, oldVariaveldeContexto, variaveldeContexto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperadorRelacional getOperadorRelacional()
  {
    return operadorRelacional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperadorRelacional(OperadorRelacional newOperadorRelacional)
  {
    OperadorRelacional oldOperadorRelacional = operadorRelacional;
    operadorRelacional = newOperadorRelacional == null ? OPERADOR_RELACIONAL_EDEFAULT : newOperadorRelacional;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.EVENTO_RELACIONAL__OPERADOR_RELACIONAL, oldOperadorRelacional, operadorRelacional));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValor()
  {
    return valor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValor(String newValor)
  {
    String oldValor = valor;
    valor = newValor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CaracteristicaPackage.EVENTO_RELACIONAL__VALOR, oldValor, valor));
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
      case CaracteristicaPackage.EVENTO_RELACIONAL__VARIAVELDE_CONTEXTO:
        if (resolve) return getVariaveldeContexto();
        return basicGetVariaveldeContexto();
      case CaracteristicaPackage.EVENTO_RELACIONAL__OPERADOR_RELACIONAL:
        return getOperadorRelacional();
      case CaracteristicaPackage.EVENTO_RELACIONAL__VALOR:
        return getValor();
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
      case CaracteristicaPackage.EVENTO_RELACIONAL__VARIAVELDE_CONTEXTO:
        setVariaveldeContexto((InformacaodeContexto)newValue);
        return;
      case CaracteristicaPackage.EVENTO_RELACIONAL__OPERADOR_RELACIONAL:
        setOperadorRelacional((OperadorRelacional)newValue);
        return;
      case CaracteristicaPackage.EVENTO_RELACIONAL__VALOR:
        setValor((String)newValue);
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
      case CaracteristicaPackage.EVENTO_RELACIONAL__VARIAVELDE_CONTEXTO:
        setVariaveldeContexto((InformacaodeContexto)null);
        return;
      case CaracteristicaPackage.EVENTO_RELACIONAL__OPERADOR_RELACIONAL:
        setOperadorRelacional(OPERADOR_RELACIONAL_EDEFAULT);
        return;
      case CaracteristicaPackage.EVENTO_RELACIONAL__VALOR:
        setValor(VALOR_EDEFAULT);
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
      case CaracteristicaPackage.EVENTO_RELACIONAL__VARIAVELDE_CONTEXTO:
        return variaveldeContexto != null;
      case CaracteristicaPackage.EVENTO_RELACIONAL__OPERADOR_RELACIONAL:
        return operadorRelacional != OPERADOR_RELACIONAL_EDEFAULT;
      case CaracteristicaPackage.EVENTO_RELACIONAL__VALOR:
        return VALOR_EDEFAULT == null ? valor != null : !VALOR_EDEFAULT.equals(valor);
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
    result.append(" (operadorRelacional: ");
    result.append(operadorRelacional);
    result.append(", valor: ");
    result.append(valor);
    result.append(')');
    return result.toString();
  }

} //EventoRelacionalImpl
