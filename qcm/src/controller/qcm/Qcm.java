package controller.qcm;


import java.util.ArrayList;

public class Qcm {
	
	private final ArrayList<Question >listeQuestion;
	
	public ArrayList<Question> getListeQuestion() {
		return listeQuestion;
	}

	public Qcm (final ArrayList<Question> listeQuestion){
		this.listeQuestion = listeQuestion;
	}

}
