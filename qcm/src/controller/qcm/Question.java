package controller.qcm;

import java.util.ArrayList;

public class Question {
	
	private final String libelle;
	private final int points;
	private final ArrayList<Reponse> listeReponses;
	

	public Question(final String libelle, final ArrayList<Reponse> listeReponses, final int points) {
		this.points = points;
		this.libelle = libelle;
		this.listeReponses = listeReponses;
		
	}

	public String getLibelle() {
		return libelle;
	}

	public ArrayList<Reponse> getListeReponses() {
		return listeReponses;
	}
	
}
