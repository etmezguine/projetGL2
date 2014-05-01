package controller.qcm;

import java.util.List;

public class Question {
	
	private String libelle;
	private final int points;
	private final List<Reponse> listeReponses;
	

	public Question(final String libelle, final List<Reponse> listeReponses, final int points) {
		this.points = points;
		this.libelle = libelle;
		this.listeReponses = listeReponses;
		
	}

	public String getLibelle() {
		return libelle;
	}
	
	public int getBareme(){
		return this.points;
	}
	
	public void setLibelle(String libelle){
		this.libelle = libelle;
	}

	public List<Reponse> getListeReponses() {
		return listeReponses;
	}
	
	public int questionValide(){
		int valideQuestion = 1;
		int valideQuestion2 = 1;
		int valideQuestionFinal = 1;
		if (listeReponses != null){
			int nbReponses = this.listeReponses.size();
			if (nbReponses>1){
				for (int i = 0; i < nbReponses; i++) {
					if (this.listeReponses.get(i).isBonneReponse() && (valideQuestion == 1)){
						valideQuestion = 0;
					}
					
					if (!this.listeReponses.get(i).isBonneReponse() && (valideQuestion2 == 1)){
						valideQuestion2 = 0;
					}
				}
				if ((valideQuestion == 0) && (valideQuestion2 == 0)){
					valideQuestionFinal = 0;
				}
			}
		}
		return valideQuestionFinal;
	}
	
	public int reponseValide(Reponse reponseAjoutee){
		int valideReponse = 1;
			if (!reponseAjoutee.getLibelle().equals("")){
				valideReponse = 0;
				this.listeReponses.add(reponseAjoutee);
			}
		return valideReponse;
	}
	
	public void removeReponse(int index){
		this.listeReponses.remove(index);
	}
	
	
}
