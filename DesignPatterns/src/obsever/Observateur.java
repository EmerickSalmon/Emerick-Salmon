package obsever;

// Interface devans être implementé par les objet êtant observateur
public interface Observateur {
	
	// Méthode appelé a chaque changement de l'objet observé ( donc à l'appel de la méthode notify())
	public void rafrechir(Observable o);
}
