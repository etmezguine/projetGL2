package controller.user;

public class Eleve extends Utilisateur {

	private static final long serialVersionUID = -6544021192887816098L;
	// commitarace
	private final Promotion promo;

	public Eleve(final String prenom, final String nom, final String login, final String pass, final Promotion promo) {
		super(prenom,nom,login,pass);
		this.promo = promo;
	}

	public enum Promotion {
		CPI1,CPI2,ING1,ING2,ING3;
	}
	
	public Promotion getPromo() {
		return promo;
	}

}
