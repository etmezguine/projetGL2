package controller;

import java.io.IOException;

import javax.swing.text.BadLocationException;
import view.prof.AffichageProf;

public class ProfController {
	private AffichageProf loginViewProf;
	
	public ProfController() throws IOException, BadLocationException {
		loginViewProf = new AffichageProf();
		loginViewProf.setVisible(true);
	}

}
