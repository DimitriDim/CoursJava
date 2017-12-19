package Exo4;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Main {

	public static void main(String[] args) throws CodePostalException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		/**************** Ecriture d'un fichier ************************/
		/*
		try {
			BufferedWriter bw = null;
			bw = new BufferedWriter(new FileWriter(("monTest2.txt"), true));
			System.out.println("Combien de phrase voulez vous saisir?");
			int nbrPhrase = sc.nextInt();
			sc.nextLine();

			for (int i = 0; i < nbrPhrase; i++) {

				System.out.println("Ecrire la phrase n° " + i);
				String phrase = (sc.nextLine() + "\n");
				bw.write(phrase);
			}

			bw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}*/

		/*************************************************/

		/**************** Lecture d'un fichier ************************/
		/*
		try {
			BufferedReader br = null;
			String ligne;
			br = new BufferedReader(new FileReader("monTest2.txt"));

			while ((ligne = br.readLine()) != null) {
				System.out.println(ligne);
			}
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}*/

		/*************************************************/

		/*********
		 * appeler la methode EnregistrerAdresse() pour enregistrer des adresse
		 *********/
		/*
		 * String rueSaisie, villeSaisie, codePostalSaisie; int nbrAdresses = 0; Adresse
		 * nouvelleAdr = new Adresse(); // nouveau constructeur sans attribut en attente
		 * 
		 * System.out.println("Combien d'adresse voulez vous saisir?"); nbrAdresses =
		 * sc.nextInt(); sc.nextLine();
		 * 
		 * for (int i = 0; i < nbrAdresses; i++) {
		 * 
		 * System.out.println("Entrer la rue"); rueSaisie = sc.nextLine();
		 * 
		 * System.out.println("Entrer la ville"); villeSaisie = sc.nextLine();
		 * 
		 * System.out.println("Entrer le code postal"); codePostalSaisie =
		 * sc.nextLine();
		 * 
		 * nouvelleAdr.setRue(rueSaisie); nouvelleAdr.setVille(villeSaisie);
		 * nouvelleAdr.setCodePostal(codePostalSaisie);
		 * nouvelleAdr.EnregistrerAdresse();
		 * 
		 * }*
		 * 
		 * 
		 * /***********Recherche un code postal
		 **************/
		/*
		Adresse.ChercheCodePostal("26000"); // appel de la méthode STATIC
		Adresse a = Adresse.ChercheCodePostal("18000");// création de l'objet a qui contiendra l'adresse rue,ville et cp
														// du cp recherché
		 */
		/*************************************************/

		/*********** Test de l'exception si cp n'a pas 5 caractères **************/
		/*
		 * try { Adresse a = new Adresse("rue de paradis", "Marseille", "13000"); }
		 * 
		 * catch (CodePostalException icpe) { icpe.printStackTrace(); }
		 */
		/*************************************************/

		/*********** Tests divers exo 2 **************/
		/*
		 * Adresse tableauAdresse[]= new Adresse[2]; // tableau d'objet pour une adresse
		 * Personne monObjPersonne[]= new Personne[2]; // tableau d'objet pour une
		 * personne + son adresse System.out.println("test");
		 * 
		 * //création de l'objet adresses qui comporte la rue,ville et code postal
		 * Adresse adresses = new Adresse("rue du port","Valence","26000");
		 * tableauAdresse[0]=adresses; // mise de cette objet dans un tableau (position
		 * 0 ici)
		 * 
		 * //création de l'objet premierePersonne qui comporte le nom,sex et le tableau
		 * des objets adresses Personne premierePersonne = new
		 * Personne("Dimitri","M",tableauAdresse); monObjPersonne[0]=premierePersonne;
		 * // mise de cette objet dans un tableau (position 0 ici)
		 * 
		 * //création de l'objet tableauDePersonnes qui comportera les tableaux
		 * monObjPersonne[] ListePersonnes tableauDePersonnes = new
		 * ListePersonnes(monObjPersonne);
		 * 
		 * 
		 * System.out.println(premierePersonne.getSexe());
		 * System.out.println(premierePersonne.getNom());
		 * System.out.println(premierePersonne.getAdresses()[0].getRue());
		 * System.out.println(premierePersonne.getAdresses()[0].getCodePostal());
		 * System.out.println(premierePersonne.getAdresses()[0].getVille());
		 * 
		 * tableauDePersonnes.editPersonneNom("Dimitri","Steven");
		 * System.out.println(premierePersonne.getNom());
		 */

		//lire un fichier et renvoyer les infos via un objet
		/*
		Personne a = Personne.lirePersonne("client.txt");
		System.out.println(a.getNom());
		System.out.println(a.getSexe());*/
		
	}

}
