import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Fenetre extends JFrame implements ActionListener {

	JLabel label = new JLabel("message");
	JTextField text = new JTextField();
	JButton bouton = new JButton("Afficher");

	public Fenetre() throws HeadlessException {
		this.setVisible(true); // pour afficher la fenetre
		this.setSize(300, 200); // pour la taille de la fenetre
		this.setLocationRelativeTo(null); // pour centrer
		label.setBounds(20, 20, 100, 20);
		text.setBounds(150, 20, 100, 20);
		bouton.setBounds(150, 60, 100, 20);
		this.setLayout(null); // desacitve le mode layout de l'interface, ici permet de ne pas avoir le bouton
								// en gros
		this.add(label);
		this.add(text);
		this.add(bouton);

		bouton.addActionListener(this); // espion sur le bouton
	}

	@Override
	public void actionPerformed(ActionEvent arg0) { // methode d'action du bouton
		// TODO Auto-generated method stub
		JOptionPane job = new JOptionPane(); // création de l'objet pop up
		job.showMessageDialog(null, text.getText()); // afficher le text saisie dans text dans la nouvelle boite de
														// dialogue au clic

	}

	
	
}
