package strategy;

public class MainStrategy {

	public static void main(String[] args) {
		Voiture voiture = new Smart();
		voiture.afficher();
		System.out.println("-------------------------------------------------------------------------------");
		Voiture camion = new Fourgon();
		camion.afficher();
		System.out.println("-------------------------------------------------------------------------------");
		camion.setTypeVoiture(new TypeCamionette());
		camion.setTypeMoteur(new MoteurDiesel());
		camion.afficher();
	}

}
