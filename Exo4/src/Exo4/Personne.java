package Exo4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Personne {

	String nom, sexe;
	private Adresse adresses[] = new Adresse[2];
	ArrayList<String> arrayAdresse = new ArrayList<String>();

	public Personne(String nom, String sexe, Adresse[] adresses) {
		super();
		this.nom = nom;
		this.sexe = sexe;
		this.adresses = adresses;
	}

	public Personne(String nom, String sexe, ArrayList<String> arrayAdresse) {
		super();
		this.nom = nom;
		this.sexe = sexe;
		this.arrayAdresse = arrayAdresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public Adresse[] getAdresses() {
		return adresses;
	}

	public void setAdresses(Adresse[] adresses) {
		this.adresses = adresses;
	}

	/*public static Personne lirePersonne(String fichier) {

		try {
			BufferedReader br1 = null;
			String lignebr1;
			StringTokenizer s;
			ArrayList<String> tabAdresse = new ArrayList<String>();
			br1 = new BufferedReader(new FileReader(fichier));

			lignebr1 = br1.readLine();
			s = new StringTokenizer(lignebr1);

			String nom = s.nextToken();

			lignebr1 = br1.readLine();
			String sex = s.nextToken();

			while ((lignebr1 = br1.readLine()) != null) {
				String adresseRue1 = s.nextToken();
				String adresseVille1 = s.nextToken();
				String adresseCp1 = s.nextToken();
				tabAdresse.add(adresseRue1);
				tabAdresse.add(adresseVille1);
				tabAdresse.add(adresseCp1);
			}
			
			while ((lignebr1 = br1.readLine()) != null) {
				String adresseRue2 = s.nextToken();
				String adresseVille2 = s.nextToken();
				String adresseCp2 = s.nextToken();
				tabAdresse.add(adresseRue2);
				tabAdresse.add(adresseVille2);
				tabAdresse.add(adresseCp2);
			}
			
			br1.close();
			return new Personne(nom, sex, tabAdresse); // création de l'objet avec ArrayList


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}*/

}
