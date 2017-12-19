import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class premierePage extends JFrame implements ActionListener{

	JTextField text1 = new JTextField();
	JButton bouton1 = new JButton("premiere");

	public premierePage() {



	}
	
	public void affichagePremiere() {
		
		this.setVisible(true); // pour afficher la fenetre
		this.setSize(300, 500); // pour la taille de la fenetre
		this.setLocationRelativeTo(null); // pour centrer

		/* Les positions */

		bouton1.setBounds(20, 250, 100, 50);
		text1.setBounds(150, 100, 100, 20);
		
		this.setLayout(null);
		
		this.add(bouton1);
		this.add(text1);

		bouton1.addActionListener(this); // espion sur le bouton

		bouton1.setEnabled(true);
		
	}

	public void actionPerformed(ActionEvent x) { // methode d'action du bouton "e" envoi le bouton qui appel la methode
		if (x.getSource() == bouton1) {

			deuxiemePage f= new deuxiemePage(); //appel de la fenetre 2
			f.affichageDeuxieme();
			f.text1.setText(this.text1.getText()); //envoi du texte vers fenetre 2
		}

	}
}
