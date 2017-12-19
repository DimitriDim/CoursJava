import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// création des objets Stagiaire

		Scanner sc = new Scanner(System.in);
		Stagiaire stag[] = new Stagiaire[2]; // création d'un tableau pour recevoir les 3 Stagaire (nom et
												// tableau de 3 notes)
		String nom;
		int x;

		/// *** Préparation du tableau de stagiaire ****/

		for (int i = 0; i < stag.length; i++) {

			System.out.println("entrer un nom de stagiaire");
			nom = sc.next();

			//stag[i] = new Stagiaire(nom, new int[3]); // création de l'objet de type stagiaire
			
			Stagiaire objSt = new Stagiaire(nom,new int[3]);
			stag[i]=objSt;

			for (int j = 0; j < stag[i].getNotes().length; j++) {

				System.out.println("Entrer sa note");
				x = sc.nextInt();
				stag[i].setNote(j, x);
			}

		}
		/*****************************************************/

		System.out.println("entrer nom formation");
		String intitule = sc.next();

		System.out.println("entrer nombre jour formation");
		int nbr = sc.nextInt();

		Formation f = new Formation(intitule, nbr, stag);

		/********************** TESTS ***************************/

		System.out.println("La moyenne stagiaire 1 " + stag[0].getNom());
		System.out.println("La moyenne stagiaire 1 " + stag[0].getNotes()[0]);
		//System.out.println("La moyenne stagiaire 1 " + stag[2].getNotes());
		//System.out.println("La moyenne stagiaire 1 " + stag[0].calculerMoyenne());
		//System.out.println("Le nomstagiaire 1 " + stag[0].getNom());

		//System.out.println("La moyenne des stagiaires " + f.calculerMoyenneFormation());

		sc.close();
		/*
		 * int tabNotes1[]= {10,12,14}; Stagiaire eleve1 = new
		 * Stagiaire("Matteo",tabNotes1); /*Stagiaire eleve1 = new
		 * Stagiaire("Matteo",new int [3]); eleve1.setNotes();
		 */
		/*
		 * int tabNotes2[]= {7,14,18}; Stagiaire eleve2 = new
		 * Stagiaire("Ethan",tabNotes2);
		 * 
		 * int tabNotes3[]= {14,17,20}; Stagiaire eleve3 = new
		 * Stagiaire("Steven",tabNotes3);
		 * 
		 */
		// création des objets Formation: Nom de la formation, durée, les objets
		// Stagiaires

		// Formation nomForm1 = new Formation ("Formation JAVA",30,)

		/*
		 * 
		 * //int [] tabEleve1 = {19, 1, 15} ; Stagiaire eleve1 = new
		 * Stagiaire("Matteo",(19, 1, 15)); System.out.println(eleve1.notes[0]);
		 * 
		 * int [] tabEleve2 = {14, 18, 9} ; Stagiaire eleve2 = new
		 * Stagiaire("Ethan",tabEleve2); System.out.println(eleve2.notes[0]);
		 * 
		 * int [] tabEleve3 = {7, 17, 15} ; Stagiaire eleve3 = new
		 * Stagiaire("Steven",tabEleve3); System.out.println(eleve3.notes[0]);
		 * 
		 * eleve1.calculerMoyenne(); System.out.println(eleve1.calculerMoyenne());
		 * eleve2.calculerMoyenne(); System.out.println(eleve2.calculerMoyenne());
		 * eleve3.calculerMoyenne(); System.out.println(eleve3.calculerMoyenne());
		 * 
		 * eleve1.trouverMin(); eleve1.trouverMax(); eleve2.trouverMin();
		 * eleve2.trouverMax(); eleve3.trouverMin(); eleve3.trouverMax();
		 * System.out.println(eleve1.trouverMin());
		 * System.out.println(eleve1.trouverMax());
		 * System.out.println(eleve2.trouverMin());
		 * System.out.println(eleve2.trouverMax());
		 * System.out.println(eleve3.trouverMin());
		 * System.out.println(eleve3.trouverMax());
		 * 
		 * Stagiaire tabForm1[] = eleve1 ; //Stagiaire cursus = new
		 * Stagiaire("Matteo",tabForm1); System.out.println(eleve1.notes[0]);
		 * 
		 * Formation cursus = new Formation("Java",30,tabForm1);
		 */
	}

}
