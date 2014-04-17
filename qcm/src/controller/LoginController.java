package controller;

import java.io.IOException;

import javax.swing.text.BadLocationException;

import controller.user.Admin;
import controller.user.Eleve;
import controller.user.Prof;
import controller.user.Utilisateur;

import model.Factory;

import view.login.AffichageConnexion;

public class LoginController {
	
	private AffichageConnexion loginView;
	
	public LoginController() throws IOException, BadLocationException {
		loginView = new AffichageConnexion(this);
		loginView.setVisible(true);
	}
	
	public void connect() {
		String login = loginView.getLogin();
		String pass = loginView.getPass();
		Utilisateur u = Factory.getInstance().getUtilisateurFactory().getUser(login);
		if (u != null && u.getPass().equals(pass)) {
			loginView.dispose();
			if (u instanceof Eleve) {
				new EleveController();
			} else if (u instanceof Prof) {
				new ProfController();
			} else if (u instanceof Admin) {
				new AdminController();
			} else {
				System.exit(0);
			}
		} else {
			loginView.wrongIDS();
		}
	}
	
	
	
}
