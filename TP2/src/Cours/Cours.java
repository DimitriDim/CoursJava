package Cours;

public class Cours {
	
	private int note1;
	private int note2;
	
	
	public int calculMoyenne() {
		
		return ((this.note1+this.note2)/2);
	}
	
	
	public void afficheNotes() {
		System.out.println(note1);
		System.out.println(note2);
	}


	public int getNote1() {
		return note1;
	}


	public void setNote1(int note1) {
		this.note1 = note1;
	}


	public int getNote2() {
		return note2;
	}


	public void setNote2(int note2) {
		this.note2 = note2;
	}

	public static void main(String[] args) { // methode main point entrée de mon projet
		Cours c = new Cours(10,20);
		//c.setNote1(10); // avant changement de constructeur
		//c.setNote2(20); // avant changement de constructeur
		
		int moyenne=c.calculMoyenne();
				System.out.println("moyenne "+moyenne);
	}
	
	public Cours (int n1, int n2) { //création du constructeur, il porte toujours le nom de la classe
		this.note1=n1;
		this.note2=n2;
		
	}
	
}
