package obsever;

// Interface devans être implementée par l'objet étant observé
public interface Observable {
	
	// Methode permetant l'ajout d'observeur
	public void ajouterObserver(Observateur o);
	
	// Méthode permetant la suppression d'observeur
	public void enleverObservateur(Observateur o);
	
	// Méthode indiquant à l'observeur qu'il y a eu un changement sur le composant observé
	public void avertirObservateurs();
}
