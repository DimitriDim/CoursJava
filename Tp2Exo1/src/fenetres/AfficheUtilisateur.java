package fenetres;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entities.Utilisateur;

public class AfficheUtilisateur extends JFrame implements ActionListener, KeyListener {
	int i = 0;
	// boolean fAuthentification = true;
	private JTextField saisieNomUser = new JTextField();
	private JTextField saisieMdpUser = new JTextField();
	private JTextField saisieMdpNewUser = new JTextField();
	private JTextField saisieNomNewUser = new JTextField();
	private JTextField saisiePrenomNewUser = new JTextField();

	private JButton btnInscription = new JButton("S'inscrire");
	private JButton btnConnexion = new JButton("Se connecter");
	private JButton btnValidInscription = new JButton("Inscription");

	private JLabel nomUser = new JLabel("Nom Utilisateur : ");
	private JLabel mdpUser = new JLabel("Mot de passe : ");

	private JLabel nomNewUser = new JLabel("Nom : ");
	private JLabel mdpNewUser = new JLabel("Mot de passe : ");
	private JLabel prenomNewUser = new JLabel("Prenom : ");

	public void FenetreAuthentification() {
		setTitle(" Authentification ");
		/* Les positions */

		// textSexe.setPreferredSize(new Dimension(100, 20));
		btnInscription.setBounds(20, 150, 120, 20);
		btnConnexion.setBounds(150, 150, 120, 20);

		nomUser.setBounds(30, 20, 100, 20);
		mdpUser.setBounds(30, 80, 100, 20);

		saisieNomUser.setBounds(130, 20, 100, 20);
		saisieMdpUser.setBounds(130, 80, 100, 20);

		this.setLayout(null);

		this.add(saisieMdpUser);
		this.add(saisieNomUser);

		this.add(nomUser);
		this.add(mdpUser);

		this.add(btnInscription);
		this.add(btnConnexion);

		btnInscription.addActionListener(this); // espion sur le bouton
		btnConnexion.addActionListener(this);

		// btnInscription.setEnabled(false);

		this.setVisible(true); // pour afficher la fenetre
		this.setSize(300, 230); // pour la taille de la fenetre
		this.setLocationRelativeTo(null); // pour centrer
	}

	public void FenetreInscription() {
		setTitle(" Inscription ");
		/* Les positions */

		// textSexe.setPreferredSize(new Dimension(100, 20));
		btnValidInscription.setBounds(120, 120, 120, 20);

		nomNewUser.setBounds(30, 20, 100, 20);
		prenomNewUser.setBounds(30, 50, 100, 20);
		mdpNewUser.setBounds(30, 80, 100, 20);

		saisieNomNewUser.setBounds(130, 20, 100, 20);
		saisiePrenomNewUser.setBounds(130, 50, 100, 20);
		saisieMdpNewUser.setBounds(130, 80, 100, 20);

		this.setLayout(null);

		this.add(saisieMdpNewUser);
		this.add(saisieNomNewUser);
		this.add(saisiePrenomNewUser);

		this.add(nomNewUser);
		this.add(mdpNewUser);
		this.add(prenomNewUser);

		this.add(btnValidInscription);

		btnValidInscription.addActionListener(this); // espion sur le bouton
		// btnValidInscription.setEnabled(false);

		this.setVisible(true); // pour afficher la fenetre
		this.setSize(300, 190); // pour la taille de la fenetre
		this.setLocationRelativeTo(null); // pour centrer
	}

	@Override
	public void actionPerformed(ActionEvent x) {

		AfficheUtilisateur appel = new AfficheUtilisateur(); // création de l'objet pour changer de fenetre

		if (x.getSource() == btnValidInscription) {
			dispose();
			Utilisateur saveUser = new Utilisateur(this.saisieNomNewUser.getText(), this.saisiePrenomNewUser.getText(),
					this.saisieMdpNewUser.getText());
			saveUser.InscriptionUser();
			appel.FenetreAuthentification();
			dispose();
		}
		if (x.getSource() == btnInscription) {

			appel.FenetreInscription();
			dispose();

		}
		if (x.getSource() == btnConnexion) {

			boolean verifUser = Utilisateur.AuthentificationUser(this.saisieNomUser.getText(),
					this.saisieMdpUser.getText());
			if (verifUser == true) {

				AfficheEleve fenetreEleve = new AfficheEleve();
				fenetreEleve.FenetreGestionEleves();
				dispose();

			}

			if (i == 3) {
				System.out.println("c'est fini");
			}

			if (verifUser == false && i < 3) {
				i++;
				if (i == 1) {
					JOptionPane.showMessageDialog(null, i + " erreur /3");
				} else {
					JOptionPane.showMessageDialog(null, i + " erreurs /3");
				}

			}

		}

	}

	@Override
	public void keyPressed(KeyEvent x) {
		// TODO Auto-generated method stub
		if (saisieNomNewUser.getText().isEmpty() || saisiePrenomNewUser.getText().isEmpty()
				|| saisieMdpNewUser.getText().isEmpty()) {
			btnValidInscription.setEnabled(false); // désactive le bouton

		} else {
			btnValidInscription.setEnabled(true); // active le bouton

		}

	}

	@Override
	public void keyReleased(KeyEvent x) {
		// TODO Auto-generated method stub

		if (saisieNomNewUser.getText().isEmpty() || saisiePrenomNewUser.getText().isEmpty()
				|| saisieMdpNewUser.getText().isEmpty()) {
			btnValidInscription.setEnabled(false); // désactive le bouton

		} else {
			btnValidInscription.setEnabled(true); // active le bouton

		}
	}

	@Override
	public void keyTyped(KeyEvent x) {
		// TODO Auto-generated method stub
		if (saisieNomNewUser.getText().isEmpty() || saisiePrenomNewUser.getText().isEmpty()
				|| saisieMdpNewUser.getText().isEmpty()) {
			btnValidInscription.setEnabled(false); // désactive le bouton

		} else {
			btnValidInscription.setEnabled(true); // active le bouton

		}
	}

}
