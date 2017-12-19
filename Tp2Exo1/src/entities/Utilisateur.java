package entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Utilisateur extends Personne {

	private String mdpUser;

	public Utilisateur(String nom, String prenom, String mdpUser) {
		super(nom, prenom);
		this.mdpUser = mdpUser;
	}

	public String getMdpUser() {
		return mdpUser;
	}

	public void setMdpUser(String mdpUser) {
		this.mdpUser = mdpUser;
	}

	public void InscriptionUser() {

		try {

			BufferedWriter bw = null;
			bw = new BufferedWriter(new FileWriter(("utilisateur.txt"), true));
			bw.write(this.nom + " " + this.prenom + " " + this.mdpUser + "\n");
			bw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static boolean AuthentificationUser(String nomRecu, String mdpRecu) {

		try {
			BufferedReader br1 = null;
			String lignebr1;
			StringTokenizer s;

			br1 = new BufferedReader(new FileReader("utilisateur.txt"));

			while ((lignebr1 = br1.readLine()) != null) {
				s = new StringTokenizer(lignebr1);
				if (nomRecu.equals((s.nextToken()))) {
					s.nextToken(); // 2e mot
					if (mdpRecu.equals((s.nextToken()))) {
						br1.close();
						return true;
					}
				}

			}
			br1.close();
			return false;
		} catch (

		FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
		// return null;

	}

}
