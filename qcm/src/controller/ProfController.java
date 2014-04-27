package controller;

import java.io.IOException;

import javax.swing.text.BadLocationException;

import view.prof.AffichageProf;

public class ProfController {
	private AffichageProf loginViewProf;
	
	public ProfController() throws IOException, BadLocationException {
		loginViewProf = new AffichageProf(this);
		loginViewProf.setVisible(true);
	}

	public void disconnect() {
		loginViewProf.dispose();
		try {
			LoginController.getInstance().login();
		} catch (final IOException e) {
			e.printStackTrace();
		} catch (final BadLocationException e) {
			e.printStackTrace();
		}
	}

}
