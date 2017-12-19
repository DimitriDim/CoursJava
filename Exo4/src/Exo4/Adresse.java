package Exo4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Adresse {

	private String rue, ville, codePostal;

	public Adresse(String rue, String ville, String codePostal) throws CodePostalException {
		super();

		if (codePostal.length() != 5) {
			throw new CodePostalException(codePostal);
		}

		for (int i = 0; i < codePostal.length(); i++) {
			char x = codePostal.charAt(i);
			if (x < '0' || x > '9') { // verification par le code ascii entre 0 et 9 (une lettre)
				throw new CodePostalException(codePostal);
			}
		}

		this.rue = rue;
		this.ville = ville;
		this.codePostal = codePostal;

	}

	public Adresse() {
		super();
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public void EnregistrerAdresse() {

		try {
			BufferedWriter bw = null;
			bw = new BufferedWriter(new FileWriter(("fichierAdresses.txt"), true));

			bw.write(this.rue + " " + this.ville + " " + this.codePostal + "\n");

			bw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static Adresse ChercheCodePostal(String cp) { // static car c'est une methode de classe qui n'utilise aucun
															// objet

		try {
			BufferedReader br1 = null;
			String lignebr1;
			StringTokenizer s;
			br1 = new BufferedReader(new FileReader("fichierAdresses.txt"));

			while ((lignebr1 = br1.readLine()) != null) {
				s = new StringTokenizer(lignebr1);

				String rue = s.nextToken(); // 1er mot
				String ville = s.nextToken(); // 2e mot

				if (cp.equals(s.nextToken())) { // vérifie si cp == au 3e mot de la ligne (3e s.nextToken())
					System.out.println("Le code postal " + cp + " est dans le fichier");
					br1.close();
					return new Adresse(rue, ville, cp); // création de l'objet retourné si OK
				}
			}

			br1.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CodePostalException e) {
			e.printStackTrace();
		}
		return null;

	}

}
