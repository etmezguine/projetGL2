package view.prof;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.*;

import javax.swing.*;

public class AffichageCreerQcm extends JFrame {

	private static final long serialVersionUID = 3423492212212508914L;
	
	private JPanel container = new JPanel();
	
	  private JFormattedTextField jtf = new JFormattedTextField(NumberFormat.getIntegerInstance());
	  private JLabel label = new JLabel("Saisir le nombre de questions du QCM : ");
	  private JButton b = new JButton ("OK");

	  public AffichageCreerQcm(){
		  
	    this.setTitle("Prof / Creer QCM");
	    this.setSize(1600, 900);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    container.setBackground(Color.white);
	    container.setLayout(new BorderLayout());
	    JPanel top = new JPanel();        
	    Font police = new Font("Arial", Font.BOLD, 14);
	    jtf.setFont(police);
	    jtf.setPreferredSize(new Dimension(150, 30));
	    jtf.setForeground(Color.BLUE);
	    b.addActionListener(new BoutonListener());
	    top.add(label);
	    top.add(jtf);
	    top.add(b);
	    this.setContentPane(top);
	    this.setVisible(true);    
	    
	  }       

	  class BoutonListener implements ActionListener{
		  
	    public void actionPerformed(ActionEvent e) {
	      System.out.println("TEXT : jtf " + jtf.getText());
	    }

	  }
	
}