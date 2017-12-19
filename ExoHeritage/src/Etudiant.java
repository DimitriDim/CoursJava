
public class Etudiant extends Personne {

		private String niveau;

		public Etudiant(String nom, String prenom, String niveau) {
			super(nom, prenom);
			this.niveau = niveau;
		}

		public String getNiveau() {
			return niveau;
		}

		public void setNiveau(String niveau) {
			this.niveau = niveau;
		}
		
		
	
	
}
