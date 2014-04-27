package controller.qcm;


import java.util.ArrayList;

public class Qcm {
	
	private final ArrayList<Question> listeQuestions;
	
	public ArrayList<Question> getListeQuestion() {
		return listeQuestions;
	}

	public Qcm (final ArrayList<Question> listeQuestions) {
		this.listeQuestions = listeQuestions;
	}
	
	public /*Qcm*/void CreerQcm (int nbQuestions) {
		//Declaration des variables
		//QCM
		Qcm qcmCreer;
		ArrayList<Question> listeQuestions;
		//Question
		String libelleQuestion;
		ArrayList<Reponse> listeReponses;
		//Reponse
		String libelleReponse;
		boolean bonneReponse;
		
		
		//Boucle de creation des questions
		for (int i=0; i < nbQuestions; ++i) {
			//Saisie libelleQuestion
			
			//Boucle de creation des reponses
			for (int j=0; j < 4; ++j) {
				//Saisie du libelleReponse
				
				//Saisie bonneReponse
				
				//Ajout de la reponse a la liste des reponses possibles
				//listeReponses.add(new Reponse(libelleReponse, bonneReponse));
			}
			
			//Ajout de la question a la liste des questions du QCM
			//listeQuestions.add(new Question(libelleQuestion, listeReponses));
		}
		
		//Creation du qcm par appel du constructeur
		//qcmCreer = new Qcm(listeQuestions);
		
		
		//return (qcmCreer);
	}

}
