package obsever;

// Interface devans �tre implement� par les objet �tant observateur
public interface Observateur {
	
	// M�thode appel� a chaque changement de l'objet observ� ( donc � l'appel de la m�thode notify())
	public void rafrechir(Observable o);
}
