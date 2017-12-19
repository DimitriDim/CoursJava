import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test extends JFrame {

	JLabel label = new JLabel("valeur");
	JTextField text = new JTextField();
	JButton bouton = new JButton("bouton");
	JPanel conteneur = new JPanel();

	public void afficherFenetre() {

		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);

		this.setContentPane(conteneur);

		conteneur.add(label);
		conteneur.add(text);
		conteneur.add(bouton);

		text.setPreferredSize(new Dimension(100, 20));
		bouton.setPreferredSize(new Dimension(100, 20));

		GridLayout gl = new GridLayout(3, 3); // interface en 3 lignes et 2 colonnes
		//this.setLayout(gl); // placera les élements dans les cases auto de haut gauche

	}

}
