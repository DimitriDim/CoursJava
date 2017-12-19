package entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Eleve extends Personne {

	String numEleve;
	String sexe;

	public Eleve(String nom, String prenom, String numEleve, String sexe) {
		super(nom, prenom);
		this.numEleve = numEleve;
		this.sexe = sexe;
	}

	public String getNumEleve() {
		return numEleve;
	}

	public void setNumEleve(String numEleve) {
		this.numEleve = numEleve;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public static boolean SaveEleve(String numElv, String nomElv, String prenomElv, String sexElv) {

		try {

			BufferedWriter bw = null;

			bw = new BufferedWriter(new FileWriter(("eleve.txt"), true));
			bw.write(numElv + " " + nomElv + " " + prenomElv + " " + sexElv + "\n");
			bw.close();
			return true;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;

	}

	public static boolean SearchEleve(String numElv) {

		try {
			BufferedReader br1 = null;
			String lignebr1;
			StringTokenizer s;

			br1 = new BufferedReader(new FileReader("eleve.txt"));
			while ((lignebr1 = br1.readLine()) != null) {
				s = new StringTokenizer(lignebr1);

				if (numElv.equals(s.nextToken())) {
					return false;
				}

			}
			br1.close();
			return true;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;

	}

	public static boolean EffEleve(String numElv) {

		try {
			BufferedReader br1 = null;
			BufferedWriter bw = null;
			String lignebr1, remplace;
			remplace = "";
			StringTokenizer s;

			String prenom = null, sexe = null;

			br1 = new BufferedReader(new FileReader("eleve.txt"));

			while ((lignebr1 = br1.readLine()) != null) {
				s = new StringTokenizer(lignebr1);

				if (numElv.equals((s.nextToken()))) {

					lignebr1 = br1.readLine();
					remplace += lignebr1 + "\n";

				} else {
					remplace += lignebr1 + "\n";

				}

			}
			br1.close();

			bw = new BufferedWriter(new FileWriter(("eleve.txt"), false));
			bw.write(remplace);

			bw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;

	}

	public static boolean Modifier(String modifNum, String modifNom, String modifPrenom, String modifSexe) {

		try {
			BufferedReader br1 = null;
			BufferedWriter bw = null;
			String lignebr1, remplace;
			remplace = "";
			StringTokenizer s;

			String prenom = null, sexe = null;

			br1 = new BufferedReader(new FileReader("eleve.txt"));

			while ((lignebr1 = br1.readLine()) != null) {
				s = new StringTokenizer(lignebr1);

				if (modifNum.equals((s.nextToken()))) {

					prenom = s.nextToken(); // 2e mot
					sexe = s.nextToken(); // 3e mot
					remplace += remplace = (modifNum + " " + modifNom + " " + modifPrenom + " " + modifSexe + "\n");
					System.out.println("ce qu'il remplace " + remplace);

				} else {
					remplace += lignebr1 + "\n";

				}

			}
			br1.close();

			bw = new BufferedWriter(new FileWriter(("eleve.txt"), false));
			bw.write(remplace);
			bw.close();
			return true;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;

	}

}
