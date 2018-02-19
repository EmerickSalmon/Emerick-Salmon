package strategy;

//Voiture s'appelant fourgon
public class Fourgon extends Voiture{
	
	@Override
	public void afficher() {
		System.out.println("Camionette :" +toString());
		
	}

}
