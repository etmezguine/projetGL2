package controller;

import java.io.IOException;

import javax.swing.text.BadLocationException;

import view.prof.AffichageCreerQcm;

import model.Factory;

public class Main {

	public static void main(String[] args) throws IOException, BadLocationException {
		//Factory.init();
		//LoginController.getInstance();
		new AffichageCreerQcm();
	}

}
