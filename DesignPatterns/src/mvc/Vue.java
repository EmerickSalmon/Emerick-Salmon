package mvc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// Cet objet comporetara deux �l�ments un JLabel pour afficher le resultat du calcul, un JTextField pour entrer du text et un JButton pour valider
public class Vue extends JFrame{
	 
	// Variables
	private JLabel etiquette = new JLabel("Entrer du texte puis cliquer sur convertir");
	private JTextField champDeSaisie = new JTextField(20);
	private JButton bouton = new JButton("Convertir");
	
	
	/*
	 * - La fenetre ne connait pas le controlleur !!
	 * - Donc, comment comunique-t-il?
	 * - C'est grace � un listener !
	 * - Nous alons cr�er une classe impl�mentant l'interface actionListener dans le controler et nous ajouterons ce listener au bouton de la vue.
	 * - Donc, lorsque nous cliquerons sur le bouton c'est le listener contenue dans la classe controleur qui sera avertit, il demandera au model de faire son travail,
	 * 		 recuperera le resultat de ce travail puis l'affichera sur la vue en passant par la m�thode setTextAAfficher
	 */
	
	//********************* Partern MVC *************************************
	
	// On ajoute le listener (ecouteur) contenue dans le controleur au bouton de cette mani�re lorsque le bouton sera utilis� le controle en sera averti
	public void ajouteEcouteurDeBouton(ActionListener ecouteur) {
		this.bouton.addActionListener(ecouteur);
	}//***********************************************************************
	
	
	
	
	//********************* ILUSTRATION *************************************
	//Constructor
	public Vue(String titre) {
		
		super(titre);
		
		// Cr�ation de la mise en forme (layout) et ajout des �l�ment � la fen�ttre
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(etiquette, BorderLayout.NORTH);
		this.getContentPane().add(champDeSaisie, BorderLayout.CENTER);
		this.getContentPane().add(bouton, BorderLayout.SOUTH);
		
		// Configuration des propri�t�s de la fen�ttre
		this.setSize(new Dimension(300,110));
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.etiquette.setForeground(Color.BLUE);
		this.etiquette.setHorizontalAlignment(JLabel.CENTER);
	}
	
	// Renvoi la valeur saisi dnas le champ de saisi
	public String getValeurSaisie() {
		return this.champDeSaisie.getText();
	}
	
	// Vide le champ de saisi
	public void videLeChampDeSaisie() {
		this.champDeSaisie.setText("");
	}
	
	// Change la valeur affich� dans l'�tiquette (JLabel)
	public void setContenueEtiquette(String texte) {
		this.etiquette.setText(texte);
	}
// ************************************************************************
	
	
	
	
}
