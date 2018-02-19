package strategy;

public class MainStrategy {

	public static void main(String[] args) {
		// Création d'un objet smart de type voiture
		Voiture voiture = new Smart();
		// Par defaut lle type moteur est essence et le dtype de voiture est citadire ce qui convien bien a une Smart
		// Affichage des caracteristique de l'objet Smart
		voiture.afficher();
		System.out.println("-------------------------------------------------------------------------------");
		
		// On essai avec un camion
		Voiture camion = new Fourgon();
		// Que nous dit la fonction afficher?
		camion.afficher();
		// Citadine essence ?? Nous allons donc devoir modifier le code source pour chaque classes heritant de véhicule ?
		System.out.println("-------------------------------------------------------------------------------");
		
		// Non!! Comme nous avons encapsulé les different algorithmes il nous suffi de charger les bon.
		// Donc le type de vehicule pour un fourgon serai plutot camionette donc ...
		camion.setTypeVoiture(new TypeCamionette());
		// Et le type de moteur serai diesel donc ...
		camion.setTypeMoteur(new MoteurDiesel());
		// Voyons le resultat
		camion.afficher();
		// Voila grace a ce design pattern il est simple de modifier les algorithmes utilisé.
	}

}
