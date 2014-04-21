package controller.user;

public class Admin extends Utilisateur {
	
	//serialisation des donnees
	// antho supprime cette ligne de commentaire une fois que tu as pull 
	
	private static final long serialVersionUID = 1555922979417139347L;

	public Admin(final String prenom, final String nom, final String login, final String pass) {
		super(prenom,nom,login,pass);
	}

}
