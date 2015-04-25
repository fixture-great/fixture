/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package caracteristica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variacao Dois</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.VariacaoDois#getCardinalidadeMaxima <em>Cardinalidade Maxima</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getVariacaoDois()
 * @model annotation="gmf.node label='nome,cardinalidadeMaxima' label.pattern='Variation {0} : {1} ' figure='utils.DiamondFigure'"
 * @generated
 */
public interface VariacaoDois extends Caracteristica, ElementoCaracteristico
{
  /**
   * Returns the value of the '<em><b>Cardinalidade Maxima</b></em>' attribute.
   * The literals are from the enumeration {@link caracteristica.CardinalidadeMaxima}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cardinalidade Maxima</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinalidade Maxima</em>' attribute.
   * @see caracteristica.CardinalidadeMaxima
   * @see #setCardinalidadeMaxima(CardinalidadeMaxima)
   * @see caracteristica.CaracteristicaPackage#getVariacaoDois_CardinalidadeMaxima()
   * @model
   * @generated
   */
  CardinalidadeMaxima getCardinalidadeMaxima();

  /**
   * Sets the value of the '{@link caracteristica.VariacaoDois#getCardinalidadeMaxima <em>Cardinalidade Maxima</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinalidade Maxima</em>' attribute.
   * @see caracteristica.CardinalidadeMaxima
   * @see #getCardinalidadeMaxima()
   * @generated
   */
  void setCardinalidadeMaxima(CardinalidadeMaxima value);

} // VariacaoDois
