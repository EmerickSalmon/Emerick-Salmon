package strategy;

public abstract class Voiture {
	private TypeVoiture typeVoiture;
	private TypeMoteur typeMoteur;
	
	public Voiture() {
		typeVoiture = new TypeCitadine();
		typeMoteur = new MoteurEssence();
	}
	
	public String toString() {
		return("Je suis un véhicule de type " + this.typeVoiture.ToString() + " avec une motorisation " + this.typeMoteur.ToString());
	}
	
	public abstract void afficher();

	public void setTypeVoiture(TypeVoiture typeVoiture) {
		this.typeVoiture = typeVoiture;
	}

	public void setTypeMoteur(TypeMoteur typeMoteur) {
		this.typeMoteur = typeMoteur;
	}
	
	
}
