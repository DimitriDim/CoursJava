public class Formation {

	private String intitule;
	private int nbrJours;
	private Stagiaire stagiaires[] = new Stagiaire[3]; // création du tableau de type Stagiaire qui contiendra les
														// objets Stagiaires

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public int getNbrJours() {
		return nbrJours;
	}

	public void setNbrJours(int nbrJours) {
		this.nbrJours = nbrJours;
	}

	public Stagiaire[] getStagiaires() {
		return stagiaires;
	}

	public void setStagiaires(Stagiaire[] stagiaires) {
		this.stagiaires = stagiaires;
	}

	public Formation(String intitule, int nbrJours, Stagiaire[] stagiaires) {
		this.intitule = intitule;
		this.nbrJours = nbrJours;
		this.stagiaires = stagiaires;
	}

	public float calculerMoyenneFormation() {

		float somme = 0;

		for (int i = 0; i < stagiaires.length; i++) {
			somme = stagiaires[i].calculerMoyenne(); // appel de la moyenne de chaques stagiaires
		}
		return (somme / stagiaires.length);

	}

	public String afficherNomMax() {

		float max;
		String nom = stagiaires[0].getNom(); // on part du nom du premier stagiaire
		max = stagiaires[0].calculerMoyenne(); // on part de la moyenne du premier stagiaire
		for (int i = 1; i < 3; i++) {
			if (stagiaires[i].calculerMoyenne() > max) {
				max = stagiaires[i].calculerMoyenne();
				nom = stagiaires[i].getNom();
			}
		}
		return nom;

	}

	public int afficherMinMax() {

		float max;
		int noteMin = stagiaires[0].trouverMin(); // on part de note min du premier stagiaire et pas mettre 0 au cas
													// ou...
													// ... il ne fait pas la boucle
		max = stagiaires[0].calculerMoyenne(); // on part de la moyenne du premier stagiaire

		for (int i = 1; i < 3; i++) {
			if (stagiaires[i].calculerMoyenne() > max) {
				max = stagiaires[i].calculerMoyenne();
				noteMin = stagiaires[i].trouverMin();
			}
		}
		return noteMin;

	}

	public float trouverMoyenneParNom(String Nom) {

		float moyenne = 0;
		for (int i = 0; i < stagiaires.length; i++) {
			if (Nom == stagiaires[i].getNom()) {
				moyenne = stagiaires[i].calculerMoyenne();

			}
		}
		return moyenne;
	}
}
