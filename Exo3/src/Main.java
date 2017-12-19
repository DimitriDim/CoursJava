
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int saisieAbsiP1, saisieOrdoP1, saisieAbsiP2, saisieOrdoP2, saisieAbsiP3, saisieOrdoP3;
		// saisie des 3 points par l'utilisateur
		System.out.println("Saisir abscise 1er point");
		saisieAbsiP1 = sc.nextInt();
		System.out.println("Saisir ordonnee 1er point");
		saisieOrdoP1 = sc.nextInt();

		System.out.println("Saisir abscise 2e point");
		saisieAbsiP2 = sc.nextInt();
		System.out.println("Saisir ordonnee 2e point");
		saisieOrdoP2 = sc.nextInt();

		System.out.println("Saisir abscise 3e point");
		saisieAbsiP3 = sc.nextInt();
		System.out.println("Saisir ordonnee 3e point");
		saisieOrdoP3 = sc.nextInt();

		// création des 3 objets de type Points (ils auront donc chacuns une abscice et
		// une ordonnée
		Point monPremierPoint = new Point(saisieAbsiP1, saisieOrdoP1);
		Point monDeuxiemePoint = new Point(saisieAbsiP2, saisieOrdoP2);
		Point monTroisiemePoint = new Point(saisieAbsiP3, saisieOrdoP3);

		// création de l'objet de type TroisPoints
		TroisPoints mesTroisPoints = new TroisPoints(monPremierPoint, monDeuxiemePoint, monTroisiemePoint);

		/* test du milieu */
		System.out.println(monPremierPoint.calculerMilieu(monDeuxiemePoint).getAbs());
		System.out.println(monPremierPoint.calculerMilieu(monDeuxiemePoint).getOrd());

		/* test du milieu */
		System.out.println(monPremierPoint.calculerDistance(monTroisiemePoint));

		/* test alignement */
		System.out.println(mesTroisPoints.testerAlignement());

		/* test traingle equilateral */
		System.out.println(mesTroisPoints.TriangleEquilateral());
	}

}