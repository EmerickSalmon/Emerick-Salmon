package obsever;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

// Objet étant observateur de l'objet observé
// Il doit donc implementé l'interface Observateur
public class ObjetObservateur3 implements Observateur{
	int nombreUtilisateur, nombreDePost;
	
	
	// *************  PATTERNS OBSERVER *********************************
	
	@Override // Méthode appelé par la méthode avertirObservateur de l'objetObservé
	public void rafrechir(Observable o) {
			nombreUtilisateur = ((ObjetObserve)o).getNbUtilisateur();
			nombreDePost = ((ObjetObserve)o).getNbPost();

			this.etiquette.setText(this.nombreUtilisateur + " Utilisateur || " + this.nombreDePost + " Post");
	}//******************************************************************
	
	
	
	// *****************  ILLUSTRATION *********************************
	
	// Affichage relatif à l'objet observé dans une fenêttre simple
	private JFrame fenettre = new JFrame("Observeur 3");
	JLabel etiquette = new JLabel("  Utilisateurs  Posts");
	public ObjetObservateur3() {
		fenettre.getContentPane().add(etiquette);
		fenettre.pack();
		fenettre.setVisible(true);
		fenettre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenettre.setSize(new Dimension(300,60));
		fenettre.setLocation(100, 260);
		etiquette.setHorizontalAlignment(JLabel.CENTER);
	}
	//******************************************************************
	
}
