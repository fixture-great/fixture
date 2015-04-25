/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package caracteristica;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elementode Produto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caracteristica.ElementodeProduto#getNome <em>Nome</em>}</li>
 *   <li>{@link caracteristica.ElementodeProduto#getElementoOriginal <em>Elemento Original</em>}</li>
 * </ul>
 * </p>
 *
 * @see caracteristica.CaracteristicaPackage#getElementodeProduto()
 * @model
 * @generated
 */
public interface ElementodeProduto extends EObject
{
  /**
   * Returns the value of the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome</em>' attribute.
   * @see #setNome(String)
   * @see caracteristica.CaracteristicaPackage#getElementodeProduto_Nome()
   * @model
   * @generated
   */
  String getNome();

  /**
   * Sets the value of the '{@link caracteristica.ElementodeProduto#getNome <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome</em>' attribute.
   * @see #getNome()
   * @generated
   */
  void setNome(String value);

  /**
   * Returns the value of the '<em><b>Elemento Original</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elemento Original</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elemento Original</em>' reference.
   * @see #setElementoOriginal(Elemento)
   * @see caracteristica.CaracteristicaPackage#getElementodeProduto_ElementoOriginal()
   * @model
   * @generated
   */
  Elemento getElementoOriginal();

  /**
   * Sets the value of the '{@link caracteristica.ElementodeProduto#getElementoOriginal <em>Elemento Original</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elemento Original</em>' reference.
   * @see #getElementoOriginal()
   * @generated
   */
  void setElementoOriginal(Elemento value);

} // ElementodeProduto
