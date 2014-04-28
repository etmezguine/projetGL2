package view.prof;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

import controller.qcm.Qcm;
import controller.qcm.Question;


public class AffichageSaisieQuestion extends JFrame {

	private static final long serialVersionUID = 8037818976609600865L;
	
	
	ActionListener actionListener1 = new ActionListener() {
		@Override
		public void actionPerformed(final ActionEvent actionEvent) {
			if (!textfield1.getText().equals("")){
				nbQuestions++;
				//listeQuestions.add(new Question(textfield1.getText(),null,1));
				textfield1.setText("");
				label1.setText("Question " + nbQuestions);
				repaint();
			}
			
		}
	};

	ActionListener actionListener2 = new ActionListener() {
		@Override
		public void actionPerformed(final ActionEvent actionEvent) {
			nbQuestions--;
		}
	};
	
	ActionListener actionListener3 = new ActionListener() {
		@Override
		public void actionPerformed(final ActionEvent actionEvent) {
			System.exit(0);
		}
	};
	
	JButton button1;
	JButton button2;
	JButton button3;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel nouvelleLigne1;
	JLabel nouvelleLigne2;
	Qcm qcm1;
	ArrayList<Question> listeQuestions;

	JTextField textfield1;

	int verifExiste;
	int nbQuestions;



	public AffichageSaisieQuestion() throws IOException, BadLocationException {
		

		this.setSize(1600, 900);
		this.setTitle("Projet Genie Logiciel 2");
		this.setLayout(null);

		this.verifExiste = 0;
		this.nbQuestions = 1;

		this.button1 = new JButton("Suivant");
		this.button1.setBounds(800, 400, 300, 100);

		this.button2 = new JButton("Precedent");
		this.button2.setBounds(450, 400, 300, 100);
		
		this.button3 = new JButton("Retour");
		this.button3.setBounds(650, 600, 300, 100);



		this.label1 = new JLabel("Question " + this.nbQuestions);
		this.label1.setFont(new Font("Calibri", Font.PLAIN, 40));
		this.label1.setForeground(Color.BLUE);
		this.label1.setBounds(700, 50, 300, 100);

		this.label2 = new JLabel("Libelle :");
		this.label2.setFont(new Font("Calibri", Font.PLAIN, 25));
		this.label2.setBounds(500, 150, 300, 100);

		this.textfield1 = new JTextField();
		this.textfield1.setFont(new Font("Calibri", Font.PLAIN, 20));
		this.textfield1.setBounds(650, 185, 300, 30);


		
		this.add(this.label1);
		this.add(this.label2);
		//this.add(this.label3);
		this.add(this.textfield1);
		this.add(this.button1);
		this.add(this.button2);
		
		this.button1.addActionListener(this.actionListener1);
		this.button2.addActionListener(this.actionListener2);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public String getLogin() {
		return textfield1.getText();
	}
	



}

