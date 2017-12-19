public class Stagiaire {

    private String nom;
    private int notes[] = new int[3];



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int[] getNotes() {
        return notes;
    }

    public void setNotes(int[] notes) {
        this.notes = notes;
    }

    public void setNote(int j, int x) {
        this.notes[j] = x;
    }


    public Stagiaire(String pnom, int pnotes[]) {

        this.nom = pnom;
        this.notes = pnotes;
    }

    public float calculerMoyenne() {
        int somme = 0;

        for (int i = 0; i < 3; i++) {
            somme = this.notes[i] + somme;
        }
        return (somme / 3);
    }

    public int trouverMax() {
        int max;
        max = notes[0];
        for (int i = 1; i < 3; i++) {
            if (notes[i] > max) {
                max = notes[i];
            }
        }
        return max;
    }
    public int trouverMin() {
        int min;
        min = notes[0];
        for (int i = 1; i < 3; i++) {
            if (notes[i] < min) {
                min = notes[i];
            }
        }
        return min;
    }

}
