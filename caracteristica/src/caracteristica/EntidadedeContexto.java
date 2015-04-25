/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package caracteristica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entidadede Contexto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.EntidadedeContexto#getRaiz <em>Raiz</em>}</li>
 *   <li>{@link caracteristica.EntidadedeContexto#getInformacoesdeContexto <em>Informacoesde Contexto</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getEntidadedeContexto()
 * @model annotation="gmf.node label='nome' label.pattern='Entidade de Contexto {0}'"
 * @generated
 */
public interface EntidadedeContexto extends Elemento
{
  /**
   * Returns the value of the '<em><b>Raiz</b></em>' reference.
   * It is bidirectional and its opposite is '{@link caracteristica.RaizDeContexto#getEntidadesDeContexto <em>Entidades De Contexto</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Raiz</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Raiz</em>' reference.
   * @see #setRaiz(RaizDeContexto)
   * @see caracteristica.CaracteristicaPackage#getEntidadedeContexto_Raiz()
   * @see caracteristica.RaizDeContexto#getEntidadesDeContexto
   * @model opposite="entidadesDeContexto"
   * @generated
   */
  RaizDeContexto getRaiz();

  /**
   * Sets the value of the '{@link caracteristica.EntidadedeContexto#getRaiz <em>Raiz</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Raiz</em>' reference.
   * @see #getRaiz()
   * @generated
   */
  void setRaiz(RaizDeContexto value);

  /**
   * Returns the value of the '<em><b>Informacoesde Contexto</b></em>' reference list.
   * The list contents are of type {@link caracteristica.InformacaodeContexto}.
   * It is bidirectional and its opposite is '{@link caracteristica.InformacaodeContexto#getElementoPai <em>Elemento Pai</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Informacoesde Contexto</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Informacoesde Contexto</em>' reference list.
   * @see caracteristica.CaracteristicaPackage#getEntidadedeContexto_InformacoesdeContexto()
   * @see caracteristica.InformacaodeContexto#getElementoPai
   * @model opposite="elementoPai"
   *        annotation="gmf.link target.decoration='closedarrow' color='0,0,0' style='solid' width='3'"
   * @generated
   */
  EList<InformacaodeContexto> getInformacoesdeContexto();

} // EntidadedeContexto
