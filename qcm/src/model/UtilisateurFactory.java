package model;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

import controller.user.Admin;
import controller.user.Eleve;
import controller.user.Eleve.Promotion;
import controller.user.Prof;
import controller.user.Utilisateur;

public class UtilisateurFactory implements Serializable {
	
	private static final long serialVersionUID = 3268751206042514205L;
	private Map<String, Eleve> eleves;
	private Map<String, Prof> profs;
	private Map<String, Admin> admins;
	
	public UtilisateurFactory() {
		eleves = new TreeMap<>();
		profs = new TreeMap<>();
		admins = new TreeMap<>();
		admins.put("admin", new Admin("jean", "robert", "admin", "pass"));
		profs.put("prof", new Prof("dupont", "martin","prof","pass"));
		eleves.put("eleve", new Eleve("Julie", "larousse", "eleve", "pass", Promotion.CPI2));
	}
	
	public Utilisateur getUser(String login) {
		Utilisateur u = null;
		if (eleves.containsKey(login)) {
			u = eleves.get(login);
		} else if (profs.containsKey(login)) {
			u = profs.get(login);
		} else if (admins.containsKey(login)) {
			u = admins.get(login);
		}
		return u;
	}

}
