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

public class ajoutAdresse extends JFrame implements ActionListener, KeyListener {

	JLabel label1 = new JLabel("Rue : ");
	JLabel label2 = new JLabel("Ville :");
	JLabel label3 = new JLabel("Code postal :");
	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();
	JTextField text3 = new JTextField();
	JButton bouton1 = new JButton("Quitter");
	JButton bouton2 = new JButton("Ajouter");
	JButton bouton3 = new JButton("Chercher");

	public ajoutAdresse() throws HeadlessException {
		this.setVisible(true); // pour afficher la fenetre
		this.setSize(300, 500); // pour la taille de la fenetre
		this.setLocationRelativeTo(null); // pour centrer

		/* Les positions */
		label1.setBounds(50, 100, 100, 20);
		label2.setBounds(50, 150, 100, 20);
		label3.setBounds(50, 200, 100, 20);
		text1.setBounds(150, 100, 100, 20);
		text2.setBounds(150, 150, 100, 20);
		text3.setBounds(150, 200, 100, 20);
		bouton1.setBounds(20, 250, 100, 50);
		bouton2.setBounds(170, 250, 100, 50);
		bouton3.setBounds(170, 350, 100, 50);

		this.setLayout(null); // desactive le mode layout de l'interface, ici permet de ne pas avoir le bouton
								// en gros
		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.add(text1);
		this.add(text2);
		this.add(text3);
		this.add(bouton1);
		this.add(bouton2);
		this.add(bouton3);

		bouton1.addActionListener(this); // espion sur le bouton
		bouton2.addActionListener(this);
		bouton3.addActionListener(this);

		text1.addKeyListener(this); // espion sur les champs de text
		text2.addKeyListener(this);
		text3.addKeyListener(this);
		
		bouton1.setBackground(Color.red);
		bouton2.setBackground(Color.green);

		bouton1.setEnabled(true);
		bouton2.setEnabled(true);
		bouton3.setEnabled(true);

	}

	@Override
	// implémentation actionPerformed car ActionListener est une interface(abstraite) 
	public void actionPerformed(ActionEvent x) { // methode d'action du bouton "e" envoi le bouton qui appel la methode
		if (x.getSource() == bouton1) {

			dispose();
		}

		if (x.getSource() == bouton2) {

			Adresse a;
			try {
				a = new Adresse(text1.getText(), text2.getText(), text3.getText());
				a.EnregistrerAdresse();
			} catch (CodePostalException e) {
				e.printStackTrace();
			}
		}
		if (x.getSource() == bouton3) {
			JOptionPane job = new JOptionPane();
			
			if(Adresse.ChercheCodePostal(text3.getText())==true) {
				JOptionPane.showMessageDialog(null,"Trouvé");
			}else {
				job.showMessageDialog(null,"Pas trouvé");
			}
			
		}
	}

	
	// implémentation keyPressed car KeyListener est une interface(abstraite) 
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (text1.getText().isEmpty() || text2.getText().isEmpty()) {
			bouton1.setEnabled(false); // désactive le bouton
			bouton2.setEnabled(false);

		} else {
			bouton1.setEnabled(true); // active le bouton
			bouton2.setEnabled(true);

		}

	}

	// implémentation keyReleased car KeyListener est une interface(abstraite) 
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

		if (text1.getText().isEmpty() || text2.getText().isEmpty() || text3.getText().isEmpty()) {
			bouton1.setEnabled(false); // désactive le bouton
			bouton2.setEnabled(false);

		} else {
			bouton1.setEnabled(true); // active le bouton
			bouton2.setEnabled(true);

		}
	}

	// implémentation keyTyped car KeyListener est une interface(abstraite) 
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (text1.getText().isEmpty() || text2.getText().isEmpty() || text3.getText().isEmpty()) {
			bouton1.setEnabled(false); // désactive le bouton
			bouton2.setEnabled(false);

		} else {
			bouton1.setEnabled(true); // active le bouton
			bouton2.setEnabled(true);

		}
	}

}
