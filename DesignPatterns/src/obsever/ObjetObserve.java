package obsever;

import java.util.ArrayList;
import java.util.List;

// Cette objet sera observé par les different observateur
// Il devras donc implementer l'interface Observable ainsi que ses méthodes
public class ObjetObserve implements Observable{
	
	
	
	// *************  PATTERNS OBSERVER *********************************
	// Création d'une liste qui contiendra les Observateurs
	private List<Observateur> listeDesObservateurs = new ArrayList<>();

	@Override // Ajout d'un Observateur dans la liste "listeDesObservateurs"
	public void ajouterObserver(Observateur o) {
		listeDesObservateurs.add(o);
	}

	@Override // Suppression d'un Oservateur dans la liste "listeDesObservateurs"
	public void enleverObservateur(Observateur o) {	
		listeDesObservateurs.add(o);
	}

	@Override // On averti tout les observateurs que l'objet observé a changé
	public void avertirObservateurs() {
		for(Observateur o: listeDesObservateurs) {
			o.rafrechir(this);
		}
	}//******************************************************************
	
	
	
	// *****************  ILLUSTRATION *********************************
	/*
	 *  Pour ilustrer l'utilité du pattern nous imaginerons un forum
	 *  Cet objet sera le model on contiendra le nombre d'utilisateurs du forum et le nombres de post
	 * 
	 * Une vue affichera le nombre de post, une autre le nombre d'utilisateur, et une dernière affichera tout
	 * 
	*/
	
	// Variables
	int nbUtilisateur = 0, nbPost =0;

	// Renvoi le nombre d'utilisateur
	public int getNbUtilisateur() {
		return nbUtilisateur;
	}
	
	// Renvoi le nombre de post
	public int getNbPost() {
		return nbPost;
	}
	
	// ajoute une valeur au nombreD'utilisateur et de post
	public void ajouterUtilisateurEtPost(int utilisateurAjoute, int postAjoute) {
		this.nbUtilisateur += utilisateurAjoute;
		this.nbPost += postAjoute;
	}//******************************************************************
	
}
