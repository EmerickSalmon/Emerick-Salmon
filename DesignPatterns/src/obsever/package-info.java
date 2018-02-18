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
 * UTILITE: Permettre à plusieurs objet d'observer un autre objet de manière simple
 * 
 * Procédé:
 * 	
 * 	On crée deux interfaces
 * 	Une pour l'objet observé. elle aportera les méthodes permettant l'ajout, la suppression, la mise a jours d'observateurs
 * 	Une pour les objet observateurs. Elle ne contient que la méthode appelé lors de la mis a jour demande par l'objet observé
 * 
 * Pour cet exemple on prendra un forum avec un nombre d'utilisateur et post augmentant.
 * L'ojbet observé contiendra les nombres d'utilisateur et de post.
 * Les objets observeurs afficheront chacun une valeur voir les deux
 * 
 * Les observateur sont des JFrame pour pouvoir être visualisé mais le type d'objet importe peux. 
 */
package obsever;