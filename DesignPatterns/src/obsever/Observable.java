package obsever;

// Interface devans �tre implement�e par l'objet �tant observ�
public interface Observable {
	
	// Methode permetant l'ajout d'observeur
	public void ajouterObserver(Observateur o);
	
	// M�thode permetant la suppression d'observeur
	public void enleverObservateur(Observateur o);
	
	// M�thode indiquant � l'observeur qu'il y a eu un changement sur le composant observ�
	public void avertirObservateurs();
}
