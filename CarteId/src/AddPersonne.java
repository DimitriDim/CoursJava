
//import java.awt.HeadlessException;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;


public class AddPersonne extends JFrame implements ActionListener, KeyListener {

	private JTextField textNom = new JTextField();
	private JTextField textPrenom = new JTextField();
	private JTextField textNomEdit = new JTextField();
	private JTextField textPrenomEdit = new JTextField();
	private JTextField textNomSearch = new JTextField();

	private JComboBox textSexe = new JComboBox();
	private JComboBox textSexeEdit = new JComboBox();

	private JButton bouton1 = new JButton("Enregistrer");
	private JButton boutonEditModif = new JButton("Modifier");
	private JButton boutonEditSuppr = new JButton("Supprimer");
	private JButton boutonRecherche = new JButton("Cherche !");
	private JLabel labelNom = new JLabel("Nom");
	private JLabel labelPrenom = new JLabel("Prenom");
	private JLabel labelSexe = new JLabel("Sexe");
	private JLabel labelNomEdit = new JLabel("NomEdit");
	private JLabel labelPrenomEdit = new JLabel("Prenom");
	private JLabel labelSexeEdit = new JLabel("Sexe");
	private JLabel labelTextOk = new JLabel("Enregistré");

	public AddPersonne() {

	}

	public JTextField getTextNomEdit() {
		return textNomEdit;
	}

	public void setTextNomEdit(JTextField textNomEdit) {
		this.textNomEdit = textNomEdit;
	}

	public JTextField getTextPrenomEdit() {
		return textPrenomEdit;
	}

	public void setTextPrenomEdit(JTextField textPrenomEdit) {
		this.textPrenomEdit = textPrenomEdit;
	}

	public JComboBox getTextSexeEdit() {
		return textSexeEdit;
	}

	public void setTextSexeEdit(JComboBox textSexeEdit) {
		this.textSexeEdit = textSexeEdit;
	}

	public void AfficherFenetre() {

		/* Les positions */

		// textSexe.setPreferredSize(new Dimension(100, 20));
		bouton1.setBounds(50, 250, 100, 50);
		textNom.setBounds(200, 100, 100, 20);
		textPrenom.setBounds(200, 150, 100, 20);
		textSexe.setBounds(200, 200, 100, 20);
		labelNom.setBounds(100, 100, 100, 20);
		labelPrenom.setBounds(100, 150, 100, 20);
		labelSexe.setBounds(100, 200, 100, 20);
		labelTextOk.setBounds(200, 250, 100, 50);

		textSexe.addItem("M");
		textSexe.addItem("F");

		this.setLayout(null);

		this.add(bouton1);
		this.add(textNom);
		this.add(textPrenom);
		this.add(textSexe);
		this.add(labelNom);
		this.add(labelPrenom);
		this.add(labelSexe);

		bouton1.addActionListener(this); // espion sur le bouton
		bouton1.setEnabled(true);

		this.setVisible(true); // pour afficher la fenetre
		this.setSize(500, 500); // pour la taille de la fenetre
		this.setLocationRelativeTo(null); // pour centrer
	}

	public void AfficherFenetreEditPersonne() {

		this.setVisible(true); // pour afficher la fenetre
		this.setSize(400, 400); // pour la taille de la fenetre
		this.setLocationRelativeTo(null); // pour centrer

		/* Les positions */

		// textSexe.setPreferredSize(new Dimension(100, 20));
		boutonEditModif.setBounds(50, 250, 100, 50);
		boutonEditSuppr.setBounds(200, 250, 100, 50);
		textNomEdit.setBounds(200, 100, 100, 20);
		textPrenomEdit.setBounds(200, 150, 100, 20);
		textSexeEdit.setBounds(200, 200, 100, 20);
		labelNomEdit.setBounds(100, 100, 100, 20);
		labelPrenomEdit.setBounds(100, 150, 100, 20);
		labelSexeEdit.setBounds(100, 200, 100, 20);

		this.setLayout(null);

		this.add(boutonEditModif);
		this.add(boutonEditSuppr);
		this.add(textNomEdit);
		this.add(textPrenomEdit);
		this.add(textSexeEdit);
		this.add(labelNomEdit);
		this.add(labelPrenomEdit);
		this.add(labelSexeEdit);

		boutonEditModif.addActionListener(this); // espion sur le bouton
		// bouton1.setEnabled(true);
	}

	public void FenetreSearch() {

		this.setVisible(true); // pour afficher la fenetre
		this.setSize(400, 400); // pour la taille de la fenetre
		this.setLocationRelativeTo(null); // pour centrer

		/* Les positions */
		textNomSearch.setBounds(200, 100, 100, 20);
		labelNom.setBounds(100, 100, 100, 20);
		boutonRecherche.setBounds(100, 250, 100, 50);

		this.setLayout(null);

		this.add(boutonRecherche);
		this.add(textNomSearch);
		this.add(labelNom);

		boutonRecherche.addActionListener(this); // espion sur le bouton
		// boutonSearch.setEnabled(true);
	}

	public void actionPerformed(ActionEvent x) {

		if (x.getSource() == bouton1) {

			Personne savePersonne = new Personne(this.textNom.getText(), this.textPrenom.getText(),
					this.textSexe.getSelectedItem().toString());
			this.add(labelTextOk);
			savePersonne.SavePersonne();

		}

		if (x.getSource() == boutonRecherche) {

			Personne chercheNom = Personne.SearchPersonne(this.textNomSearch.getText());

			this.textNomEdit.setText(chercheNom.getNom());
			this.textPrenomEdit.setText(chercheNom.getPrenom());
			this.textSexeEdit.addItem(chercheNom.getSexe());
			dispose();
			AfficherFenetreEditPersonne();

		}

		if (x.getSource() == boutonEditModif) {

			Personne modifierNom = Personne.Modifier(this.textNomEdit.getText(), this.textPrenomEdit.getText(),
					this.textSexeEdit.getSelectedItem().toString());

			dispose();
			AfficherFenetreEditPersonne();

		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (textNom.getText().isEmpty() || textPrenom.getText().isEmpty()) {
			bouton1.setEnabled(false); // désactive le bouton

		} else {
			bouton1.setEnabled(true); // active le bouton

		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

		if (textNom.getText().isEmpty() || textPrenom.getText().isEmpty()) {
			bouton1.setEnabled(false); // désactive le bouton

		} else {
			bouton1.setEnabled(true); // active le bouton

		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (textNom.getText().isEmpty() || textPrenom.getText().isEmpty()) {
			bouton1.setEnabled(false); // désactive le bouton

		} else {
			bouton1.setEnabled(true); // active le bouton

		}
	}

}
