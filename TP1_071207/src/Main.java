import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	  Scanner sc = new Scanner (System.in);
	
	   System.out.println("entrer un jour");
		int jour = sc.nextInt();
		
		System.out.println("entrer un mois");
		int mois = sc.nextInt();
		
		System.out.println("entrer une année");
		int annee = sc.nextInt();
		
		MaDate a = new MaDate(jour,mois,annee);
		
		
		System.out.println(a.toString());
		
		System.out.println("combien de jours a ajouter");
		int nbJour = sc.nextInt();
		a.ajouterPlusieursJours(nbJour);
		System.out.println(a.toString());
		
		System.out.println("combien de mois à ajouter");
		int nbMois = sc.nextInt();
		a.ajouterUnMois(nbMois);
		System.out.println(a.toString());
		
		System.out.println("combien d'année a ajouter");
		int nAnnee = sc.nextInt();
		a.ajouterUnAn(nAnnee);
		System.out.println(a.toString());
		
	}

}
