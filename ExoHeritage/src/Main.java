import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Personne tab[] = new Personne[5];
		// Personne p1=new Personne ("Heng", "Steven");
		// Personne p2=new Personne ("KINTZ", "Dimitri");

		// System.out.print(Personne.nbrPersonne);

		for (int i = 0; i < tab.length; i++) {

			System.out.println("Taper 0 pour Enseignant et 1 pour etudiant");
			int valeurSaisie = sc.nextInt();

			System.out.println("Entrer le nom ");
			String nom = sc.next();
			System.out.println("Entrer le prenom");
			String prenom = sc.next();

			if (valeurSaisie == 0) {

				System.out.println("Entrer son salaire");
				int enseiSalaire = sc.nextInt();
				Enseignants enseignant = new Enseignants(nom, prenom, enseiSalaire);
				tab[i] = enseignant;
			} else {

			}
			if (valeurSaisie == 1) {

				System.out.println("Entrer son niveau");
				String etudNiveau = sc.next();
				Etudiant etudiant = new Etudiant(nom, prenom, etudNiveau);
				tab[i] = etudiant;

			}

		}

	}

}
