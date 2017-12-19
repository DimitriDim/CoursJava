import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calcul extends JFrame implements ActionListener, KeyListener {

	JLabel label1 = new JLabel("valeur 1");
	JLabel label2 = new JLabel("valeur 2");
	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();
	JButton bouton1 = new JButton("+");
	JButton bouton2 = new JButton("X");
	JButton bouton3 = new JButton("/");
	JButton bouton4 = new JButton("-");
	JButton bouton5 = new JButton("Exit");

	public Calcul() throws HeadlessException {
		this.setVisible(true); // pour afficher la fenetre
		this.setSize(500, 200); // pour la taille de la fenetre
		this.setLocationRelativeTo(null); // pour centrer

		/* Les positions */
		label1.setBounds(20, 20, 100, 20);
		label2.setBounds(260, 20, 100, 20);
		text1.setBounds(80, 20, 100, 20);
		text2.setBounds(320, 20, 100, 20);
		bouton1.setBounds(20, 60, 50, 50);
		bouton2.setBounds(120, 60, 50, 50);
		bouton3.setBounds(220, 60, 50, 50);
		bouton4.setBounds(320, 60, 50, 50);
		bouton5.setBounds(420, 100, 60, 50);

		this.setLayout(null); // desactive le mode layout de l'interface, ici permet de ne pas avoir le bouton
								// en gros
		this.add(label1);
		this.add(label2);
		this.add(text1);
		this.add(text2);
		this.add(bouton1);
		this.add(bouton2);
		this.add(bouton3);
		this.add(bouton4);
		this.add(bouton5);

		bouton1.addActionListener(this); // espion sur le bouton
		bouton2.addActionListener(this);
		bouton3.addActionListener(this);
		bouton4.addActionListener(this);
		bouton5.addActionListener(this);

		text1.addKeyListener(this); // espion sur les champs de text
		text2.addKeyListener(this);

		bouton5.setBackground(Color.red);
		bouton1.setBackground(Color.blue);
		bouton2.setBackground(Color.green);
		bouton3.setBackground(Color.yellow);
		bouton4.setBackground(Color.pink);

		bouton1.setEnabled(false);
		bouton2.setEnabled(false);
		bouton3.setEnabled(false);
		bouton4.setEnabled(false);

	}

	@Override
	public void actionPerformed(ActionEvent e) { // methode d'action du bouton "e" envoi le bouton qui appel la methode
		// TODO Auto-generated method stub
		JOptionPane job = new JOptionPane(); // pour le pop up
		int somme = 0, nbr1, nbr2;
		nbr1 = Integer.parseInt(text1.getText()); // convertie en entier la saisie
		nbr2 = Integer.parseInt(text2.getText()); // convertie en entier la saisie

		if (e.getSource() == bouton1) {
			somme = nbr1 + nbr2;
			job.showMessageDialog(null, somme); // afficher le text saisie dans text dans la nouvelle boite de
		} // dialogue au clic

		if (e.getSource() == bouton2) {
			somme = nbr1 * nbr2;
			job.showMessageDialog(null, somme);
		}

		if (e.getSource() == bouton3) {
			somme = nbr1 / nbr2;
			job.showMessageDialog(null, somme);
		}
		if (e.getSource() == bouton4) {
			somme = nbr1 - nbr2;
			job.showMessageDialog(null, somme);
		}
		if (e.getSource() == bouton5) {
			// System.exit(0);
			dispose();
		}

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (text1.getText().isEmpty() || text2.getText().isEmpty()) {
			bouton1.setEnabled(false); // désactive le bouton
			bouton2.setEnabled(false);
			bouton3.setEnabled(false);
			bouton4.setEnabled(false);
		} else {
			bouton1.setEnabled(true); // active le bouton
			bouton2.setEnabled(true);
			bouton3.setEnabled(true);
			bouton4.setEnabled(true);
		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

		if (text1.getText().isEmpty() || text2.getText().isEmpty()) {
			bouton1.setEnabled(false); // désactive le bouton
			bouton2.setEnabled(false);
			bouton3.setEnabled(false);
			bouton4.setEnabled(false);
		} else {
			bouton1.setEnabled(true); // active le bouton
			bouton2.setEnabled(true);
			bouton3.setEnabled(true);
			bouton4.setEnabled(true);
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (text1.getText().isEmpty() || text2.getText().isEmpty()) {
			bouton1.setEnabled(false); // désactive le bouton
			bouton2.setEnabled(false);
			bouton3.setEnabled(false);
			bouton4.setEnabled(false);
		} else {
			bouton1.setEnabled(true); // active le bouton
			bouton2.setEnabled(true);
			bouton3.setEnabled(true);
			bouton4.setEnabled(true);
		}
	}

}
