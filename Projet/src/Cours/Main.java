package Cours;

import java.util.Scanner;

public class Main {



public static void main(String[] args) { // methode main point entrée de mon projet
		//Cours c = new Cours(10,20);
		//c.setNote1(10); // avant changement de constructeur
		//c.setNote2(20); // avant changement de constructeur
		
		/*int moyenne=c.calculMoyenne();
				System.out.println("moyenne "+moyenne);
				System.out.println(c.toString());*/
				
		Personne tab[]= new Personne[3]; //création tableau de l'objet type personne	
		Scanner sc = new Scanner (System.in); //création de l'objet sc de type Scanner
		
		for(int i=0; i<tab.length;i++) {
			System.out.println("Entrer nom ");
			String nom = sc.nextLine();
			System.out.println("Entrer prenom ");
			String prenom = sc.nextLine();
			tab[i] = new Personne(nom,prenom);
		}
		
		
			System.out.println("Entrer un prenom ");
			String recherchePrenom = sc.nextLine();
			int ok=0;
			for(int i=0; i<tab.length;i++) {
				
				if(recherchePrenom.equals(tab[i].getPrenom())) {
					System.out.println("Voila le nom :"+ tab[i].getNom());
					ok=1;
				}
			}
			
			if (ok==0) {
				System.out.println("Inexistant dans le tableau ") ;
			}
		
		sc.close();
	}
}
