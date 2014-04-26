package view.prof;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.BadLocationException;

import controller.LoginController;

import view.login.AffichageConnexion;

public class AffichageProf extends JFrame {
	private static final long serialVersionUID = 1L;
	ActionListener actionListener1 = new ActionListener() {
		@Override
		public void actionPerformed(final ActionEvent actionEvent) {
			AffichageProf.this.button1.setVisible(false);
			repaint();
		}
	};
	ActionListener actionListener2 = new ActionListener() {
		@Override
		public void actionPerformed(final ActionEvent actionEvent) {
			AffichageProf.this.button2.setVisible(false);
			repaint();
		}
	};
	ActionListener actionListener3 = new ActionListener() {
		@Override
		public void actionPerformed(final ActionEvent actionEvent) {
			dispose();
			JFrame win;
			try {
				win = new AffichageConnexion(loginController);
				win.setVisible(true);
			} catch (final IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (final BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	};

	JButton button1;

	JButton button2;

	JButton button3;

	JLabel label1;
	
	private LoginController loginController;

	public AffichageProf() throws IOException, BadLocationException {
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 700, 50));
		this.setSize(1600, 900);
		this.setTitle("Projet G�nie Logiciel 2");
		this.button1 = new JButton("G�rer QCM");
		this.button2 = new JButton("G�rer Session");
		this.button3 = new JButton("Se deconnecter");
		this.label1 = new JLabel("Menu de gestion Professeur");
		this.button1.setPreferredSize(new Dimension(300, 100));
		this.button2.setPreferredSize(new Dimension(300, 100));
		this.button3.setPreferredSize(new Dimension(300, 100));
		this.label1.setFont(new Font("Calibri", Font.PLAIN, 30));
		this.label1.setForeground(Color.BLUE);
		this.add(this.label1);
		this.add(this.button1);
		this.add(this.button2);
		this.add(this.button3);

		this.button1.addActionListener(this.actionListener1);
		this.button2.addActionListener(this.actionListener2);
		this.button3.addActionListener(this.actionListener3);

	}

}