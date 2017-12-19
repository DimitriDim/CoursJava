import java.util.Scanner;

import java.util.StringTokenizer;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		/***************
		 * recherche meme valeur entre deux fichiers
		 *********************/

		try {
			BufferedReader br1 = null;
			BufferedReader br2 = null;
			String lignebr1, lignebr2;
			br1 = new BufferedReader(new FileReader("file1.txt"));

			while ((lignebr1 = br1.readLine()) != null) {
				br2 = new BufferedReader(new FileReader("file2.txt"));

				while ((lignebr2 = br2.readLine()) != null) {

					if (lignebr1.equals(lignebr2)) {
						System.out.println("Le nombre suivant est dans les deux fichiers " + lignebr1);
					}
				}
			}
			br1.close();
			br2.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			BufferedReader br3 = null;
			String lignebr3;
			int nbrMots = 0, nbrLignes = 0;
			StringTokenizer s;

			br3 = new BufferedReader(new FileReader("file.txt"));

			while ((lignebr3 = br3.readLine()) != null) {

				s = new StringTokenizer(lignebr3);

				nbrMots = nbrMots + s.countTokens();
				nbrLignes++;

			}
			System.out.println("Nombre de lignes " + nbrLignes);
			System.out.println("Nombre de mots " + nbrMots);

			br3.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}