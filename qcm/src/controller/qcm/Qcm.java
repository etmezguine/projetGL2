package controller.qcm;


import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;

public class Qcm {
	
	private final List<Question> listeQuestions;
	
	public List<Question> getListeQuestion() {
		return listeQuestions;
	}

	public Qcm (final List<Question> listeQuestions) {
		this.listeQuestions = listeQuestions;
	}
	
	public int verifAjoutQuestion(Question questionAjoutee){
		int verifAjout = 1;
		if (!questionAjoutee.getLibelle().equals("")){
			if (questionAjoutee.questionValide() == 0){
				this.listeQuestions.add(questionAjoutee);
				verifAjout = 0;
			}

		}
		
		return verifAjout;
		
	}
	
	public void removeQuestion(int index){
		this.listeQuestions.remove(index);
	}
		

}
