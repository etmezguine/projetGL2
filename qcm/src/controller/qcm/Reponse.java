package controller.qcm;

public class Reponse {
	
	private final String libelle;
	private final boolean bonneReponse;
	
	public Reponse(final String libelle, final boolean bonneReponse) {
		this.libelle = libelle;
		this.bonneReponse = bonneReponse;
	}

	public String getLibelle() {
		return libelle;
	}

	public boolean isBonneReponse() {
		return bonneReponse;
	}

}
