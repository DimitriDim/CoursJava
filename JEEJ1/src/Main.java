import beans.Personne;
import database.MaBase;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MaBase.LoadDatabase();
		//Personne perso = new Personne();
		//perso.AddPersonne();
		Personne p = new Personne();
		p.setNom("Mr tst");
		p.setPrenom("Le test");
		p.setSexe('H');
		p.AddPersonne();
		
	}

}
