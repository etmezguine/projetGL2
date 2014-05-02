package model;

import java.io.Serializable;
import java.util.HashSet;

import controller.qcm.Qcm;

public class QuestionnaireFactory implements Serializable {

	private static final long serialVersionUID = -3540093676260813308L;
	
	public HashSet<Qcm> ensQcm;
	
	public QuestionnaireFactory (){
		this.ensQcm = new HashSet<>();
	}
	
	public HashSet<Qcm> getEnsQcm() {
		return ensQcm;
	} 
	
	public void ajouterEnsQcm(Qcm qcm) {
		ensQcm.add(qcm);
	}

}
