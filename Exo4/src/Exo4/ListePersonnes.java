package Exo4;

public class ListePersonnes {

	private Personne personnes[] = new Personne[2];

	public ListePersonnes(Personne[] personnes) {
		super();
		this.personnes = personnes;
	}

	public Personne[] getPersonnes() {
		return personnes;
	}

	public void setPersonnes(Personne[] personnes) {
		this.personnes = personnes;
	}

	public Personne findByNom(String s) {

		for (int i = 0; i < personnes.length; i++) {
			if (s.equals(personnes[i].getNom())) {
			//	Personne personneCherche = new Personne(personnes[i].getNom(), personnes[i].getSexe(),
			//			personnes[i].getAdresses());
			//	return personneCherche;	
				return personnes[i];
			} 

		}return null;
		
	}

	public boolean findByCodePostal(String cp) {

		for (int i = 0; i < personnes.length; i++) {
			for (int j = 0; j < personnes[i].getAdresses().length; j++) {

				if (cp.equals(personnes[i].getAdresses()[j].getCodePostal())) {
					return true;
				}
			}
		}return false;
		

	}

	public int countPersonneVille(String ville) {
		int compteurPersonnes = 0;
		boolean trouvee;
		for (int i = 0; i < personnes.length; i++) {
			trouvee=false;
			for (int j = 0; j < personnes[i].getAdresses().length; j++) {

				if (ville.equals(personnes[i].getAdresses()[j].getVille()) &&! trouvee) {
					trouvee = true;
					compteurPersonnes++;
				}
			}
		}return compteurPersonnes;
		
	}

	public void editPersonneNom(String oldNom, String newNom) {

		for (int i = 0; i < personnes.length; i++) {
			if (personnes[i].getNom().equals(oldNom)) {
				personnes[i].setNom(newNom);
			}
		}
	}

	public void editPersonneVille(String nom, String newVille) {

		for (int i = 0; i < personnes.length; i++) {
			if (nom.equals(personnes[i].getNom())) {
				for (int j = 0; j < personnes[i].getAdresses().length; j++) {
					personnes[i].getAdresses()[j].setVille(newVille);
				}
			}
		}
	}
	
	
}
