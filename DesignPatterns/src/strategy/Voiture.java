package strategy;


// Voiture est notre super classe on i trouvera la composition ainsi que les fonctions principal
public abstract class Voiture {
	// Les deux variable de cette classe
	// Le type de voiture Citadine ou Camionette
	private TypeVoiture typeVoiture;
	// Le type de moteur Essence ou Diesel
	private TypeMoteur typeMoteur;
	
	public Voiture() {
		// Nous allons charger un type par defaut comme ce type est dinamique il poura être changé a tous moment
		// Type de voiture = Citadine
		typeVoiture = new TypeCitadine();
		// Type de moteur = Essence
		typeMoteur = new MoteurEssence();
	}
	
	// Fonction fesant appel au la description des objet typeVoiture et typeMoteur
	public String toString() {
		return("Je suis un véhicule de type " + this.typeVoiture.ToString() + " avec une motorisation " + this.typeMoteur.ToString());
	}
	
	// La fonction abstraite qui devrai donc être redefini pour chaque classe fille de cette classe.
	// On l'utilisera pour afficher le nom du véhicule
	public abstract void afficher();

	// Changer le typeVoiture
	public void setTypeVoiture(TypeVoiture typeVoiture) {
		this.typeVoiture = typeVoiture;
	}

	// Changer le typeMoteur
	public void setTypeMoteur(TypeMoteur typeMoteur) {
		this.typeMoteur = typeMoteur;
	}
	
	
}
