import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList maListe = new ArrayList();

		maListe.add("0 pair");
		maListe.add("1er impair");
		maListe.add("2e pair");
		maListe.add("3e impair");
		maListe.add("4e pair");
		maListe.add("5e impair");
		maListe.add("6e pair");
		
		for (int i = 1; i < maListe.size(); i=i+2) {

			System.out.print(" " + maListe.get(i));
		}

	}

}
