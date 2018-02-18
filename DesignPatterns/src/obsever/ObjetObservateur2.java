package obsever;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

// Objet �tant observateur de l'objet observ�
// Il doit donc implement� l'interface Observateur
public class ObjetObservateur2 implements Observateur{
	int nombreDePost;
	
	
	// *************  PATTERNS OBSERVER *********************************
	
	@Override // M�thode appel� par la m�thode avertirObservateur de l'objetObserv�
	public void rafrechir(Observable o) {
		nombreDePost = ((ObjetObserve)o).getNbPost();
		this.etiquette.setText(this.nombreDePost + " Post");
	}//******************************************************************
	
	
	
	// *****************  ILLUSTRATION *********************************
	
	// Affichage relatif � l'objet observ� dans une fen�ttre simple
	private JFrame fenettre = new JFrame("Observeur 2");
	JLabel etiquette = new JLabel("  Post");
	public ObjetObservateur2() {
		fenettre.getContentPane().add(etiquette);
		fenettre.pack();
		fenettre.setVisible(true);
		fenettre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenettre.setSize(new Dimension(300,60));
		fenettre.setLocation(100, 180);
		etiquette.setHorizontalAlignment(JLabel.CENTER);
	}
	//******************************************************************
	
}
