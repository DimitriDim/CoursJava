import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class deuxiemePage extends JFrame implements ActionListener {

	JTextField text1 = new JTextField();
	JButton bouton1 = new JButton("Quitter");

	public deuxiemePage() {

	}

	public void affichageDeuxieme() {

		this.setVisible(true); // pour afficher la fenetre
		this.setSize(300, 500); // pour la taille de la fenetre
		this.setLocationRelativeTo(null); // pour centrer

		/* Les positions */

		bouton1.setBounds(150, 250, 100, 50);
		text1.setBounds(50, 100, 100, 20);

		this.setLayout(null);
		this.add(bouton1);
		this.add(text1);

		bouton1.addActionListener(this); // espion sur le bouton

		bouton1.setEnabled(true);
	}

	// implémentation actionPerformed car ActionListener est une interface(abstraite) 
	public void actionPerformed(ActionEvent x) { // methode d'action du bouton "e" envoi le bouton qui appel la methode
		if (x.getSource() == bouton1) {

			System.exit(0);
		}

	}
}
