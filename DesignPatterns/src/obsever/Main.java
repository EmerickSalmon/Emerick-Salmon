package obsever;

// PAS DE RAPPORT AVEC LE PATTERNS OBSERVER
// Active les diferents composent du projet
public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		// On créer l'objet observé
		ObjetObserve observe = new ObjetObserve();
		// On créer les objets observateurs
		ObjetObservateur1 observateur1 = new ObjetObservateur1();
		ObjetObservateur2 observateur2 = new ObjetObservateur2();
		ObjetObservateur3 observateur3 = new ObjetObservateur3();
		
		// On ajoute les objets obvervateurs à la liste des observateurs
		observe.ajouterObserver(observateur1);
		observe.ajouterObserver(observateur2);
		observe.ajouterObserver(observateur3);
		
		// Incrementation de valeur pour changer l'etat de l'objet observé
		for(int i =1; i <= 500; i++) {
			// Modification de l'etat de l'objet observé
			observe.ajouterUtilisateurEtPost(i*3, i);
			// Appel a la fonction notify  ET TOUS LES OBSERVATEURS VONT RECUPERER L'INFO QUI LES INTERESSE
			observe.avertirObservateurs();
			
			// Une petite pose et on recommence
			Thread.sleep(500);
		}

	}

}
