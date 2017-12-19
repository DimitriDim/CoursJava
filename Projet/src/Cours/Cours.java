package Cours;

public class Cours {
	
	//attributes
	private int note1;
	private int note2;
	
	//methodes
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

	
	//constructeur
	public Cours (int n1, int n2) { //création du constructeur, il porte toujours le nom de la classe
		this.note1=n1;
		this.note2=n2;
		
	}
	
	public String toString() {
		return "note1 "+note1+" note2 "+note2;
	}
	
}
