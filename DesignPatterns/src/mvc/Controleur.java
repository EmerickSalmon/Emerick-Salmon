package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.text.View;

public class Controleur {
	
	// Variables
	private Model model;
	private Vue vue;
	
	/*
	 * Lorsque l'on clique sur le bouton de la vue le listener de cette classe est activé
	 * Le listener fait appel a la fonction calculDemande()
	 * Cette fonction demande au model de faire quelquechose puis en recupère le resultat, puis elle fait appel à la vue en lui demandant de changé son affichage
	 * 
	 * le CONTROLEUR sert donc d'intermediaire ne le MODEL et la VUE        ModelVueControleur MVC
	 */
	
	//********************* Partern MVC *************************************
	private void calculDemande() {
		String texteTemporaire;
		texteTemporaire = this.model.convertiEnMajuscule(this.vue.getValeurSaisie());
		this.vue.setContenueEtiquette(texteTemporaire);
	}//**********************************************************************
	
	
	
	//********************* ILUSTRATION *************************************
	// Constructeur 
	// obligation de renseigner les model et vue car cet objet servira d'intermediaire entre les deux
	// ajout du listener de cette classe a la vue
	public Controleur(Model model, Vue vue) {
		this.model = model;
		this.vue = vue;
		this.vue.ajouteEcouteurDeBouton(new Ecouteur());
	}//**********************************************************************
	
	
	
	//********************* LISTENER ****************************************
	class Ecouteur implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			calculDemande();
		}
	}//**********************************************************************
	
	
}
