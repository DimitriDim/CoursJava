package test;

import java.util.Scanner; // utilisation de l'api java pour lire les entrées clavier

public class Test{
		
	public static void main ( String [] argv)
		{
	
					
	Scanner sc = new Scanner (System.in); //création de l'objet sc de type Scanner
		
		// double d = sc.nextDouble();
		// long l = sc.nextLong();
		// String b = sc.nextLine();
		
	/*	
	 	System.out.println("Entrer premiere note");
		double i = sc.nextDouble();
		
		System.out.println("Entrer deuxieme note");
		double x = sc.nextDouble();
		
		System.out.println("Entrer troisieme note");
		double y = sc.nextDouble();
		
		System.out.println("La moyenne moyenne:");
		System.out.println((i+x+y)/3);
		double z = ((i+x+y)/3);
		

		if (z>=10) {
			System.out.println("ADMIS");
		} else if (x>8 && y>8 && x>8) {
			System.out.println("ADMIS");
		} else {System.out.println("NON ADMIS");
		
		}
	*/
		
	/*
	System.out.println("La somme:");
	System.out.println(x+y);
	System.out.println("Leur différence:");
	System.out.println(x-y);
	System.out.println("Le produit:");
	System.out.println(x*y);
	System.out.println("Le quotient:");
	System.out.println(x/y);
	System.out.println("Le reste:");
	System.out.println(x%y);
	sc.close();*/
	
	/* 
		System.out.println("Entrer nombre 1");
		double nbr1 = sc.nextDouble();
		
		System.out.println("Entrer nombre 2");
		double nbr2 = sc.nextDouble();
		
		if (nbr1<0 ^ nbr2<0) 	{ // OU exclusif
			System.out.println("Produit négatif");
								} 
		else{System.out.println("Produit positif");
		
	*/
	
	/*	
	//TEST SWITCH CASE	
	System.out.println("Entrer un nombre 1");
	int i = sc.nextInt();
	
	System.out.println("Entrer un nombre 2");
	int x = sc.nextInt();
	
	System.out.println("Entrer le calcul a faire");
	String op = sc.next();
	
	switch (op) {
		
		case "+":
		System.out.println(i+x);
		break;
		
		case "-":
		System.out.println(i-x);
		break;
		
		case "*":
		System.out.println(i*x);
		break;
		
		case "/":
		System.out.println(i/x);
		break;
		
		default:
		System.out.println("Erreur");
			
	}*/
	
	/*
	// SI l'entree est négatif ça sort sinon ca continue et calculera la moyenne
	int i = 0;
	int som =0;
	int nbr = 1;
	
	while (nbr>0) {

		System.out.println("Entrer un nombre");
		nbr = sc.nextInt();
			
			if (nbr>0) {
			som = som + nbr;
			i++;
					}

	}
	
	System.out.println("La moyenne:");
	System.out.println(som/i);
	
	*/
	
	
	/*
	 	int delta=0;
	
	System.out.println("Entrer un nombre a");
	int a = sc.nextInt();
	
	System.out.println("Entrer un nombre b");
	int b = sc.nextInt();
	
	System.out.println("Entrer un nombre c");
	int c = sc.nextInt();
	
	delta=((b*b)-(4*a*c));
	System.out.println("Le delta est");
	System.out.println(delta);
	
	if (delta<0) {
		System.out.println("Pas de solution");
		
	}else if (delta==0) {
		System.out.println("Le résultat est");
		System.out.println((-b/(2*a)));
		

		System.out.println("Le résultat est"+ ((-b/(2*a))) );
		System.out.println((-b/(2*a)));

	}else  {
		System.out.println("Il y a 2 solutions, soit"); 
		System.out.println((-b-(Math.sqrt(delta)))/(2*a));
		System.out.println("Ou soit");
		System.out.println((-b+(Math.sqrt(delta)))/(2*a));

		}
	 
	 */

		// compter le nombre de positif et negatif saisie tant que la saisie n'est pas 0
		//Moi
	/*
	int i=1;
	int nbrNegatif=0;
	int nbrPositif=0;
	

	while (i!=0) {
		
		System.out.println("entrer un nombre");
		i = sc.nextInt();
		
			if(i<0){
				nbrNegatif++;
			}else if(i>0) {
				nbrPositif++;
			}
		
	}
	
	System.out.println("Nombre de positif saisie:");
	System.out.println(nbrNegatif);
	System.out.println("Nombre de négatif saisie:");
	System.out.println(nbrNegatif);
	*/
	
	/*
		//correction
	int saisie;
	int nbneg=0, nbpos =0;
	
	System.out.println("entrer un nombre");
	saisie= sc.nextInt();
	
	while (0!=saisie) {
		
		if (saisie <0) {
			nbneg++;
		}
		else {
			nbpos++;
		}
		
	saisie= sc.nextInt();	
		
	}
	System.out.println("Nombre de positif saisie:");
	System.out.println(nbpos);
	System.out.println("Nombre de négatif saisie:");
	System.out.println(nbneg);
	*/
	
	/*
	// IDEM avec le do while 
	
	int i;
	int nbrNegatif=0;
	int nbrPositif=0; 
	
	do {
		System.out.println("entrer un nombre");
		i = sc.nextInt();
		if (i<0) {
			nbrNegatif++;
		}
		if (i>0) {
			nbrPositif++;
		}
	}
	
	while (i!=0); 

	
	System.out.println("Nombre de positif saisie:");
	System.out.println(nbrNegatif);
	System.out.println("Nombre de négatif saisie:");
	System.out.println(nbrPositif);
	*/
	
	/*
	// entrer 10 nombres et afficher le plus qui à été rentré (attention aux négatifs)
	int saisie;

	System.out.println("Saisir nombre ");
	int max = sc.nextInt();
	
	for (int i=0;i<9;i++) {
		
		System.out.println("Saisir nombre ");
		saisie = sc.nextInt();
		
		if(saisie>max) {
				max = saisie;
					}
	
	}
	System.out.println("Le plus grand nombre saisie");
	System.out.println(max);
	 */
	
	/*
	//saisir nombre + caluler moyenne, afficher le max et le min

	int tab[]= new int[5];
	
	//remplissage du tableau
	for (int i=0;i<5;i++) {
		
		System.out.println("saisir le nombre suivant");
		tab[i] = sc.nextInt();	
	}
	
	int max=tab[0];
	int min=tab[0];
	double somme=tab[0];
	
	for (int i=1;i<5;i++) {	
		
		somme += tab[i]; // calcul de la somme du tableau
		
		if(tab[i]<min) {
			min = tab[i];
				}
		if(tab[i]>max) {
			max = tab[i];
				}
			
	}
	System.out.println("Le nombre max est:");
	System.out.println(max);
	System.out.println("Le nombre min est:");
	System.out.println(min);
	System.out.println("La moyenne:");
	System.out.println(somme/5);

	// affichage du tableau
	for (int elt: tab) {
		System.out.println("elt"+ "=" + elt);
	}
	
	*/
	
	
	
	}
	
		
}


