package view.prof;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

import controller.ProfController;
import controller.qcm.Qcm;
import controller.qcm.Question;
import controller.qcm.Reponse;


public class AffichageSaisieQuestion extends JFrame {

	private static final long serialVersionUID = 8037818976609600865L;
	
	
	ActionListener actionListener1 = new ActionListener() {
		@Override
		public void actionPerformed(final ActionEvent actionEvent) {
				
				questionAjoutee.setLibelle(textfield1.getText());
				if (qcmSaisie.verifAjoutQuestion(questionAjoutee)==0){
					nbQuestions++;
					nbReponses = 1;
					listeReponses = new ArrayList<>();
					questionAjoutee = new Question("",listeReponses,1);
					textfield1.setText("");
					textfield2.setText("");
					label1.setText("Question " + nbQuestions);
					label3.setText("Reponse " + nbReponses);
					if (erreurSaisie == 1){
						remove(labelError);
					}
					if (erreurSaisie2 == 1){
						remove(labelError2);
					}
					erreurSaisie = 0;
					erreurSaisie2 = 0;
					repaint();
				}
				else if (erreurSaisie == 0) {
					erreurSaisie = 1;
					labelError = new JLabel("*La question doit avoir au moins 2 reponses dont une bonne reponse et doit avoir un libelle");
					labelError.setFont(new Font("Calibri", Font.PLAIN, 25));
					labelError.setForeground(Color.RED);
					labelError.setBounds(300, 200, 1000, 100);
					add(labelError);
					repaint();
				}
		}
			
	};

	ActionListener actionListener2 = new ActionListener() {
		@Override
		public void actionPerformed(final ActionEvent actionEvent) {
			if (nbQuestions > 1){
				nbQuestions--;
				qcmSaisie.removeQuestion(nbQuestions-1);
				label1.setText("Question " + nbQuestions);
				textfield1.setText("");
				repaint();
			}
		}
	};
	
	ActionListener actionListener3 = new ActionListener() {
		@Override
		public void actionPerformed(final ActionEvent actionEvent) {
			dispose();
			try {
				@SuppressWarnings("unused")
				ProfController retourMenuProf = new ProfController();
			} catch (IOException | BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	};
	
	ActionListener actionListener4 = new ActionListener() {
		@Override
		public void actionPerformed(final ActionEvent actionEvent) {
				Reponse reponseAjoutee = new Reponse(textfield2.getText(),radiobutton1.isSelected());
				if ((questionAjoutee.reponseValide(reponseAjoutee)==0) && (nbReponses <= 4)){
					nbReponses++;
					textfield2.setText("");
					label3.setText("Reponse " + nbReponses);
					if (erreurSaisie2 == 1){
						remove(labelError2);
					}
					erreurSaisie2 = 0;
					repaint();
				}
				else if ((erreurSaisie2 == 0) && (nbReponses <= 4)) {
					erreurSaisie2 = 1;
					labelError2 = new JLabel("*La reponse doit avoir un libelle");
					labelError2.setFont(new Font("Calibri", Font.PLAIN, 25));
					labelError2.setForeground(Color.RED);
					labelError2.setBounds(400, 575, 500, 50);
					add(labelError2);
					repaint();
				}
				else if ((erreurSaisie2 == 0) && (nbReponses > 4)) {
					erreurSaisie2 = 1;
					labelError2 = new JLabel("*Nombre maximum de reponses atteint");
					labelError2.setFont(new Font("Calibri", Font.PLAIN, 25));
					labelError2.setForeground(Color.RED);
					labelError2.setBounds(400, 575, 500, 50);
					add(labelError2);
					repaint();
				}
		}
			
	};
	
	ActionListener actionListener5 = new ActionListener() {
		@Override
		public void actionPerformed(final ActionEvent actionEvent) {
			if (nbReponses > 1){
				nbReponses--;
				questionAjoutee.removeReponse(nbReponses-1);
				label3.setText("Reponse " + nbReponses);
				textfield2.setText("");
				repaint();
			}
		}
	};
	
	ActionListener actionListener6 = new ActionListener() {
		@Override
		public void actionPerformed(final ActionEvent actionEvent) {
			if (qcmSaisie.getListeQuestion().size() > 0){
				//ajouter le qcm a factory 
				dispose();
				try {
					@SuppressWarnings("unused")
					ProfController retourMenuProf = new ProfController();
				} catch (IOException | BadLocationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		  }
	};
	
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JRadioButton radiobutton1;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel nouvelleLigne1;
	JLabel nouvelleLigne2;
	JLabel labelError;
	JLabel labelError2;
	Qcm qcmSaisie;
	Question questionAjoutee;
	List<Question> listeQuestions;
	List<Reponse> listeReponses;

	JTextField textfield1;
	JTextField textfield2;

	int verifExiste;
	int nbQuestions;
	int nbReponses;
	int erreurSaisie;
	int erreurSaisie2;



	public AffichageSaisieQuestion() throws IOException, BadLocationException {
		

		this.setSize(1600, 900);
		this.setTitle("Projet Genie Logiciel 2");
		this.setLayout(null);

		this.verifExiste = 0;
		this.nbQuestions = 1;
		this.nbReponses = 1;
		this.erreurSaisie = 0;
		this.erreurSaisie2 = 0;
		listeQuestions = new ArrayList<>();
		listeReponses = new ArrayList<>();
		
		this.questionAjoutee = new Question("",listeReponses,1);
		this.qcmSaisie = new Qcm(listeQuestions);
		
		// Elements questions
		this.label1 = new JLabel("Question " + this.nbQuestions);
		this.label1.setFont(new Font("Calibri", Font.PLAIN, 40));
		this.label1.setForeground(Color.BLUE);
		this.label1.setBounds(600, 50, 300, 100);
		
		this.label2 = new JLabel("Libelle :");
		this.label2.setFont(new Font("Calibri", Font.PLAIN, 25));
		this.label2.setBounds(400, 150, 300, 100);
		
		this.textfield1 = new JTextField();
		this.textfield1.setFont(new Font("Calibri", Font.PLAIN, 20));
		this.textfield1.setBounds(525, 185, 600, 30);
		
		this.button3 = new JButton("<--");
		this.button3.setFont(new Font("Calibri", Font.PLAIN, 50));
		this.button3.setBounds(1200, 170, 150, 50);
		
		this.button4 = new JButton("-->");
		this.button4.setFont(new Font("Calibri", Font.PLAIN, 50));
		this.button4.setBounds(1400, 170, 150, 50);
		
		
		//Elements réponses
		this.label3 = new JLabel("Reponse " + this.nbReponses);
		this.label3.setFont(new Font("Calibri", Font.PLAIN, 40));
		this.label3.setForeground(Color.BLUE);
		this.label3.setBounds(600, 300, 300, 100);

		this.label4 = new JLabel("Libelle :");
		this.label4.setFont(new Font("Calibri", Font.PLAIN, 25));
		this.label4.setBounds(400, 400, 300, 100);

		this.textfield2 = new JTextField();
		this.textfield2.setFont(new Font("Calibri", Font.PLAIN, 20));
		this.textfield2.setBounds(525, 435, 600, 30);
		
		this.button5 = new JButton("<--");
		this.button5.setFont(new Font("Calibri", Font.PLAIN, 50));
		this.button5.setBounds(1200, 425, 150, 50);
		
		this.button6 = new JButton("-->");
		this.button6.setFont(new Font("Calibri", Font.PLAIN, 50));
		this.button6.setBounds(1400, 425, 150, 50);
		
		this.radiobutton1 = new JRadioButton("Bonne reponse");
		this.radiobutton1.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.radiobutton1.setBounds(400, 475, 500, 50);
		
		// Boutons bas de page

		this.button2 = new JButton("Annuler");
		this.button2.setBounds(450, 700, 300, 100);
		
		this.button1 = new JButton("Valider");
		this.button1.setBounds(800, 700, 300, 100);


		
		this.add(this.label1);
		this.add(this.label2);
		this.add(this.label3);
		this.add(this.label4);
		this.add(this.textfield1);
		this.add(this.textfield2);
		this.add(this.button1);
		this.add(this.button2);
		this.add(this.button3);
		this.add(this.button4);
		this.add(this.button5);
		this.add(this.button6);
		this.add(this.radiobutton1);
		
		this.button4.addActionListener(this.actionListener1);
		this.button3.addActionListener(this.actionListener2);
		this.button2.addActionListener(this.actionListener3);
		this.button6.addActionListener(this.actionListener4);
		this.button5.addActionListener(this.actionListener5);
		this.button1.addActionListener(this.actionListener6);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	



}

