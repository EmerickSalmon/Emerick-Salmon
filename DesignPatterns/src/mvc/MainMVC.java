package mvc;

public class MainMVC {

	public static void main(String[] args) {
		Vue vue = new Vue("Pattern MVC");
		Model model = new Model();
		Controleur controleur = new Controleur(model, vue);

	}

}
