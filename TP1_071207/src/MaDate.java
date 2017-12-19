
public class MaDate {
	
	private int jour;
	private int mois;
	private int annee;

	
	public String toString() {
		return this.jour+"/"+this.mois+"/"+this.annee;
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	
	public MaDate(int jour, int mois, int annee) {
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}
	
	
	public void ajouterUnJour() {
		if (this.mois==1|| this.mois==3 || this.mois==5 || this.mois==7 || this.mois==8|| this.mois==10 || this.mois==12) {
		
			if(this.jour<31) {
				 this.setJour(getJour()+1);
							}
							else{
								this.setJour(1);
									if(this.mois<12) {
										this.setMois(getMois()+1);
									}else {this.setMois(1);}
								}	
		}
		
		else if (this.mois==4|| this.mois==6 || this.mois==9 || this.mois==11) {
			
			if(this.jour<30) {
				this.setJour(getJour()+1);
							}
							else{
								this.setJour(1);
								if(this.mois<12) {
									this.setMois(getMois()+1);
								}else {this.setMois(1);}
								}
		}
			
		else if(this.mois==02) {
			
			if((this.annee%4)==0) {
				if(this.jour<29) {
				this.setJour(getJour()+1);
				}else{
				this.setJour(1);
					if(this.mois<12) {
					this.setMois(getMois()+1);
					}else {this.setMois(1);}
				}
								}
			
			if((this.annee%4)!=0) {
				if(this.jour<28) {
				this.setJour(getJour()+1);
				}else{
				this.setJour(1);
					if(this.mois<12) {
					this.setMois(getMois()+1);
					}else {this.setMois(1);}
				}
							  	}
		
	}
		
		if(this.mois==01 && this.jour==01) {
				this.setAnnee(getAnnee()+1);
		}
	
	}
	public void ajouterPlusieursJours(int n) {
		
		for(int i=0;i<n;i++) {
		ajouterUnJour();
		}
	}
	public void ajouterUnMois(int n) {
		for(int i=0;i<n;i++) {
		if(this.mois<12) {
			this.setMois(getMois()+1);
		}else {this.setMois(1);
		}
		}
	}
	public void ajouterUnAn(int n) {
		for(int i=0;i<n;i++) {
		this.setAnnee(getAnnee()+1);
		}
	}
}
