import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Personne {

	private String nom, prenom, sexe;

	public Personne(String nom, String prenom, String sexe) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public void SavePersonne() {

		try {

			BufferedWriter bw = null;
			bw = new BufferedWriter(new FileWriter(("fichierSavePersonne.txt"), true));

			bw.write(this.nom + " " + this.prenom + " " + this.sexe + "\n");

			bw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Personne SearchPersonne(String nomSearch) {

		try {
			BufferedReader br1 = null;
			String lignebr1;
			StringTokenizer s;

			String prenom = null, sexe = null;

			br1 = new BufferedReader(new FileReader("fichierSavePersonne.txt"));

			while ((lignebr1 = br1.readLine()) != null) {
				s = new StringTokenizer(lignebr1);
				String nom = s.nextToken();
				if (nomSearch.equals((nom))) {

					prenom = s.nextToken(); // 2e mot
					sexe = s.nextToken(); // 3e mot

					System.out.println("LE NOM TROUVE: " + nomSearch);
					System.out.println("LE prenom TROUVE: " + prenom);
					System.out.println("LE sexe TROUVE: " + sexe);
					return new Personne(nomSearch, prenom, sexe);
				}
				// System.out.println("LE NOM Pas trouvé : " + nomSearch);

			}
			br1.close();

			// return resultatSearch;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}

	public static Personne Modifier(String modifNom, String modifPrenom, String modifSexe) {

		try {
			BufferedReader br1 = null;
			BufferedWriter bw = null;
			String lignebr1;
			StringTokenizer s;

			String prenom = null, sexe = null;

			br1 = new BufferedReader(new FileReader("fichierSavePersonne.txt"));
			bw = new BufferedWriter(new FileWriter(("fichierSavePersonne.txt"), true));
			while ((lignebr1 = br1.readLine()) != null) {
				s = new StringTokenizer(lignebr1);
				
				if (modifNom.equals(s.nextToken())) {
					bw.write("ceci est un test\n");
					//sexe = s.nextToken(); // 3e mot

					return new Personne(modifNom, modifPrenom, modifSexe);

				}
				// System.out.println("LE NOM Pas trouvé : " + nomSearch);

			}
			br1.close();

			// return resultatSearch;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}

}
