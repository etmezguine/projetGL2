package controller.user;

import java.io.Serializable;

public abstract class Utilisateur implements Serializable {
	
	private static final long serialVersionUID = -5934732439562702312L;
	
	private final String prenom;
	private final String nom;
	
	private final String login;
	private final String pass;
	
	
	protected Utilisateur(final String prenom, final String nom, final String login, final String pass) {
		this.prenom = prenom;
		this.nom = nom;
		this.login = login;
		this.pass = pass;
	}
	
	
	public String getPrenom() {
		return prenom;
	}
	public String getNom() {
		return nom;
	}
	public String getLogin() {
		return login;
	}
	public String getPass() {
		return pass;
	}

}
