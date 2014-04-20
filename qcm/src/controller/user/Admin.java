package controller.user;

public class Admin extends Utilisateur {
	
	//serialisation des donnees, test pull pour johan
	
	private static final long serialVersionUID = 1555922979417139347L;

	public Admin(final String prenom, final String nom, final String login, final String pass) {
		super(prenom,nom,login,pass);
	}

}
