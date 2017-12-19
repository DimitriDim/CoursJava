
public class Point {

	private float abs,ord;

	public Point(float abs, float ord) {
		super();
		this.abs = abs;
		this.ord = ord;
	}

	public float getAbs() {
		return abs;
	}

	public void setAbs(float abs) {
		this.abs = abs;
	}

	public float getOrd() {
		return ord;
	}

	public void setOrd(float ord) {
		this.ord = ord;
	}
	
	public double calculerDistance(Point p) {
// Point p sera le futur objet p de la classe Point (il aura donc ses propres abs et ord)
// this.abs est l'abscise de l'objet courant (c'est a dire l'abscise de l'objet qui appelera cette méthode) et p.abs est l'abscise de l'objet passé en paramétre
// this.ord est l'ordonnée de l'objet courant (c'est a dire l'ordonné de l'objet qui appelera cette méthode) et p.ord est l'ordonnée de l'objet passé en paramétre
		return Math.sqrt((this.abs-p.abs)*(this.abs-p.abs)+(this.ord-p.ord)*(this.ord-p.ord));
	}
	
	public Point calculerMilieu(Point p) {
		
		float milieuAbs;
		float milieuOrd;
		milieuAbs = (this.abs+p.abs)/2;
		milieuOrd = (this.ord+p.ord)/2;
		
//milieuP sera l'objet (nouvellement créé) qui retournera ses attributs abs et coordonnées vanant du calcul ci dessus
		Point milieuP = new Point(milieuAbs,milieuOrd);
		
		return milieuP;
	}
	

}