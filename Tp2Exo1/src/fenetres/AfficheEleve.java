package fenetres;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import entities.Eleve;
import entities.Utilisateur;

public class AfficheEleve extends JFrame implements ActionListener, KeyListener {

	private JTextField saisieNumElv = new JTextField();
	private JTextField saisieNomElv = new JTextField();
	private JTextField saisiePrenomElv = new JTextField();
	private JTextField saisieNumSearchElv = new JTextField();
	private JTextField saisieNomSearchElv = new JTextField();
	private JTextField saisiePrenomSearchElv = new JTextField();
	private JTextField saisieNumEditElv = new JTextField();
	private JTextField saisieNomEditElv = new JTextField();
	private JTextField saisiePrenomEditElv = new JTextField();

	private JButton btnAjoutElev = new JButton("Ajouter");
	private JButton btnCherchElev = new JButton("Chercher");
	private JButton btnSaveElv = new JButton("Enregistrer");
	private JButton btnSearchElv = new JButton("Recherche");
	private JButton btnEffElv = new JButton("Effacer elv");
	private JButton btnquitter = new JButton("Quitter");
	private JButton btnEffChamps = new JButton("RAZ");
	private JButton btnModifElv = new JButton("Modifier");

	private JLabel numElv = new JLabel("Num de l'élève :");
	private JLabel nomElv = new JLabel("Nom de l'élève :");
	private JLabel prenomElv = new JLabel("Prénom de l'élève :");

	private JLabel numSearchElv = new JLabel("Num de l'élève :");
	private JLabel nomSearchElv = new JLabel("Nom de l'élève :");
	private JLabel prenomSearchElv = new JLabel("Prénom de l'élève :");

	private JLabel numEditElv = new JLabel("Num de l'élève :");
	private JLabel nomEditElv = new JLabel("Nom de l'élève :");
	private JLabel prenomEditElv = new JLabel("Prénom de l'élève :");

	ButtonGroup group = new ButtonGroup();
	JRadioButton sexM = new JRadioButton("M");
	JRadioButton sexF = new JRadioButton("F");

	public void FenetreGestionEleves() {
		setTitle(" Gestion des éléves ");
		/* Les positions */

		// textSexe.setPreferredSize(new Dimension(100, 20));

		btnAjoutElev.setBounds(20, 20, 120, 20);
		btnCherchElev.setBounds(150, 20, 120, 20);

		this.setLayout(null);

		this.add(btnAjoutElev);
		this.add(btnCherchElev);

		btnAjoutElev.addActionListener(this); // espion sur le bouton
		btnCherchElev.addActionListener(this);

		this.setVisible(true); // pour afficher la fenetre
		this.setSize(300, 100); // pour la taille de la fenetre
		this.setLocationRelativeTo(null); // pour centrer
	}

	public void FenetreAjouterEleve() {
		setTitle(" Ajouter un élève ");
		/* Les positions */

		// textSexe.setPreferredSize(new Dimension(100, 20));

		group.add(sexM);
		group.add(sexF);

		btnSaveElv.setBounds(20, 170, 120, 20);
		// btnEffElv.setBounds(150, 170, 120, 20);
		btnquitter.setBounds(150, 210, 120, 20);
		btnEffChamps.setBounds(20, 210, 120, 20);

		numElv.setBounds(20, 20, 100, 20);
		nomElv.setBounds(20, 60, 100, 20);
		prenomElv.setBounds(20, 100, 150, 20);

		saisieNumElv.setBounds(150, 20, 100, 20);
		saisieNomElv.setBounds(150, 60, 100, 20);
		saisiePrenomElv.setBounds(150, 100, 100, 20);
		sexM.setBounds(210, 120, 50, 50);
		sexF.setBounds(160, 120, 50, 50);

		this.setLayout(null);

		this.add(btnSaveElv);
		this.add(numElv);
		this.add(nomElv);
		this.add(prenomElv);
		this.add(saisieNumElv);
		this.add(saisieNomElv);
		this.add(saisiePrenomElv);
		// this.add(btnEffElv);
		this.add(btnquitter);
		this.add(btnEffChamps);

		group.add(sexF);
		group.add(sexM);
		this.add(sexF);
		this.add(sexM);
		sexF.setSelected(true);

		// this.add(sexF);

		btnSaveElv.addActionListener(this); // espion sur le bouton
		// btnEffElv.addActionListener(this);
		btnquitter.addActionListener(this);
		btnEffChamps.addActionListener(this);

		this.setVisible(true); // pour afficher la fenetre
		this.setSize(300, 300); // pour la taille de la fenetre
		this.setLocationRelativeTo(null); // pour centrer
	}

	public void FenetreChercherEleve() {
		setTitle(" Cherche un élève ");
		/* Les positions */
		group.add(sexM);
		group.add(sexF);

		btnSearchElv.setBounds(20, 170, 120, 20);

		numSearchElv.setBounds(20, 20, 100, 20);

		saisieNumSearchElv.setBounds(150, 20, 100, 20);

		this.setLayout(null);

		this.add(btnSearchElv);
		this.add(numSearchElv);
		this.add(saisieNumSearchElv);

		btnSearchElv.addActionListener(this);

		this.setVisible(true); // pour afficher la fenetre
		this.setSize(300, 300); // pour la taille de la fenetre
		this.setLocationRelativeTo(null); // pour centrer
	}

	public void FenetreEditEleve() {

		setTitle(" Edition élève ");
		group.add(sexM);
		group.add(sexF);

		btnModifElv.setBounds(20, 170, 120, 20);
		btnEffElv.setBounds(150, 170, 120, 20);

		numEditElv.setBounds(20, 20, 100, 20);
		nomEditElv.setBounds(20, 60, 100, 20);
		prenomEditElv.setBounds(20, 100, 150, 20);

		saisieNumEditElv.setBounds(150, 20, 100, 20);
		saisieNomEditElv.setBounds(150, 60, 100, 20);
		saisiePrenomEditElv.setBounds(150, 100, 100, 20);
		sexM.setBounds(210, 120, 50, 50);
		sexF.setBounds(160, 120, 50, 50);

		this.setLayout(null);

		this.add(numEditElv);
		this.add(nomEditElv);
		this.add(prenomEditElv);
		this.add(saisieNumEditElv);
		this.add(saisieNomEditElv);
		this.add(saisiePrenomEditElv);
		this.add(btnModifElv);
		this.add(btnEffElv);

		group.add(sexF);
		group.add(sexM);
		this.add(sexF);
		this.add(sexM);
		sexF.setSelected(true);

		// this.add(sexF);

		btnModifElv.addActionListener(this); // espion sur le bouton
		btnEffElv.addActionListener(this);

		this.setVisible(true); // pour afficher la fenetre
		this.setSize(300, 300); // pour la taille de la fenetre
		this.setLocationRelativeTo(null); // pour centrer
	}

	public void actionPerformed(ActionEvent x) {
		// TODO Auto-generated method stub
		String sexSelect = null;
		Eleve Elv = new Eleve(this.saisieNumElv.getText(), this.saisieNomElv.getText(), this.saisieNomElv.getText(),
				sexSelect);
		AfficheEleve appel = new AfficheEleve(); // création de l'objet pour changer
		// de fenetre

		if (x.getSource() == btnSaveElv) {

			if (this.sexF.isSelected() == true) {
				sexSelect = "F";
			}
			if (this.sexM.isSelected() == true) {
				sexSelect = "M";
			}

			if (Elv.SearchEleve(this.saisieNumElv.getText()) == true) {
				Elv.SaveEleve(this.saisieNumElv.getText(), this.saisieNomElv.getText(), this.saisiePrenomElv.getText(),
						sexSelect);
				this.saisieNomElv.setText("");
				this.saisieNumElv.setText("");
				this.saisiePrenomElv.setText("");
				this.sexF.setSelected(true);
			} else {
				JOptionPane.showMessageDialog(null, " Erreur, l'élève existe déja");
				this.saisieNomElv.setText("");
				this.saisieNumElv.setText("");
				this.saisiePrenomElv.setText("");
				this.sexF.setSelected(true);
			}

			// dispose();

		}
		if (x.getSource() == btnquitter) {
			System.exit(0);
		}

		if (x.getSource() == btnEffElv) {
			Elv.EffEleve(this.numEditElv.getText());
		}
		if (x.getSource() == btnEffChamps) {
			this.saisieNomElv.setText("");
			this.saisieNumElv.setText("");
			this.saisiePrenomElv.setText("");
			this.sexF.setSelected(true);
		}

		if (x.getSource() == btnSearchElv) {
			if (Elv.SearchEleve(this.saisieNumElv.getText()) == true) {

				appel.FenetreEditEleve();
				dispose();

			}
		}

		if (x.getSource() == btnModifElv) {

			if (this.sexF.isSelected() == true) {
				sexSelect = "F";
			}
			if (this.sexM.isSelected() == true) {
				sexSelect = "M";
			}

			Eleve modifierNom = new Eleve(this.saisieNumEditElv.getText(), this.saisieNomEditElv.getText(),
					this.saisiePrenomEditElv.getText(), sexSelect);
			modifierNom.Modifier(this.saisieNumEditElv.getText(), this.saisieNomEditElv.getText(),
					this.saisiePrenomEditElv.getText(), sexSelect);

		}
		if (x.getSource() == btnAjoutElev) {

			appel.FenetreAjouterEleve();
			dispose();

		}

		if (x.getSource() == btnCherchElev) {
			appel.FenetreChercherEleve();
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
