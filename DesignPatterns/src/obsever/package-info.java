/**
 * 
 */
/**
 * @author emeri
 * 
 * 
 * Obesrver  
 *
 */

/*
 * 	DESING PATTERN    OBSERVER
 * 
 * UTILITE: Permettre � plusieurs objet d'observer un autre objet de mani�re simple
 * 
 * Proc�d�:
 * 	
 * 	On cr�e deux interfaces
 * 	Une pour l'objet observ�. elle aportera les m�thodes permettant l'ajout, la suppression, la mise a jours d'observateurs
 * 	Une pour les objet observateurs. Elle ne contient que la m�thode appel� lors de la mis a jour demande par l'objet observ�
 * 
 * Pour cet exemple on prendra un forum avec un nombre d'utilisateur et post augmentant.
 * L'ojbet observ� contiendra les nombres d'utilisateur et de post.
 * Les objets observeurs afficheront chacun une valeur voir les deux
 * 
 * Les observateur sont des JFrame pour pouvoir �tre visualis� mais le type d'objet importe peux. 
 */
package obsever;