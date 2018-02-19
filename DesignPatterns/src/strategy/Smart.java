package strategy;

// Voiture s'appelant Smart
public class Smart extends Voiture{

	@Override
	public void afficher() {
		System.out.println("Smart: " + toString());
		
	}

}
