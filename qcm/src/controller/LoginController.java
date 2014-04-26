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
	
	public void connect() throws IOException, BadLocationException {
		// on recupere les ids
		String login = loginView.getLogin();
		String pass = loginView.getPass();
		// on recupere l'user
		Utilisateur u = Factory.getInstance().getUtilisateurFactory().getUser(login);
		if (u != null && u.getPass().equals(pass)) {
			// on libere la fenetre
			loginView.dispose();
			loginView = null;
			// On lance le controlleur correspondant a l'utilisateur
			if (u instanceof Eleve) {
				new EleveController();
			} else if (u instanceof Prof) {
				new ProfController();
			} else if (u instanceof Admin) {
				new AdminController();
			} else {
				// Ne devrait pas arriver, mais dans le doute
				System.exit(0);
			}
		} else {
			loginView.wrongIDS();
		}
	}
	
	
	
}
