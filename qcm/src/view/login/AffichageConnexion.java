package view.login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

import controller.LoginController;

public class AffichageConnexion extends JFrame {

	private static final long serialVersionUID = 8037818976609600865L;
	
	ActionListener actionListener1 = new ActionListener() {
		@Override
		public void actionPerformed(final ActionEvent actionEvent) {
			loginController.connect();
		}
	};
	
	ActionListener actionListener2 = new ActionListener() {
		@Override
		public void actionPerformed(final ActionEvent actionEvent) {
			System.exit(0);
		}
	};
	
	JButton button1;
	JButton button2;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel nouvelleLigne1;
	JLabel nouvelleLigne2;
	JPasswordField password1;

	JTextField textfield1;

	int verifExiste;

	private LoginController loginController;

	public AffichageConnexion(LoginController lc) throws IOException, BadLocationException {
		
		this.loginController = lc;
		this.setSize(1600, 900);
		this.setTitle("Projet Genie Logiciel 2");
		this.setLayout(null);

		this.verifExiste = 0;

		this.button1 = new JButton("Se connecter");
		this.button1.setBounds(650, 400, 300, 100);

		this.button2 = new JButton("Quitter ");
		this.button2.setBounds(650, 600, 300, 100);

		this.button1.addActionListener(this.actionListener1);
		this.button2.addActionListener(this.actionListener2);

		this.label1 = new JLabel("Connexion");
		this.label1.setFont(new Font("Calibri", Font.PLAIN, 40));
		this.label1.setForeground(Color.BLUE);
		this.label1.setBounds(700, 50, 300, 100);

		this.label2 = new JLabel("Identifiant :");
		this.label2.setFont(new Font("Calibri", Font.PLAIN, 25));
		this.label2.setBounds(500, 150, 300, 100);

		this.label3 = new JLabel("Mot de passe :");
		this.label3.setFont(new Font("Calibri", Font.PLAIN, 25));
		this.label3.setBounds(465, 250, 300, 100);

		this.textfield1 = new JTextField();
		this.textfield1.setFont(new Font("Calibri", Font.PLAIN, 20));
		this.textfield1.setBounds(650, 185, 300, 30);

		this.password1 = new JPasswordField();
		this.password1.setFont(new Font("Calibri", Font.PLAIN, 20));
		this.password1.setBounds(650, 285, 300, 30);
		
		this.add(this.label1);
		this.add(this.label2);
		this.add(this.label3);
		this.add(this.textfield1);
		this.add(this.password1);
		this.add(this.button1);
		this.add(this.button2);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public String getLogin() {
		return textfield1.getText();
	}
	
	public String getPass() {
		return new String(password1.getPassword());
	}

	public void wrongIDS() {
		if (this.verifExiste == 0) {
			JLabel labelError;
			labelError = new JLabel("*Login ou mot de passe incorrect");
			labelError.setFont(new Font("Calibri", Font.PLAIN, 25));
			labelError.setForeground(Color.RED);
			labelError.setBounds(950, 200, 500, 100);
			add(labelError);
			repaint();
			AffichageConnexion.this.verifExiste = 1;
		}
	}
}
