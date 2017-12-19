
public class TroisPoints {

	private Point premier;
	private Point deuxieme;
	private Point troisieme;

	public TroisPoints(Point premier, Point deuxieme, Point troisieme) {
		super();
		this.premier = premier;
		this.deuxieme = deuxieme;
		this.troisieme = troisieme;
	}

	public Point getPremier() {
		return premier;
	}

	public void setPremier(Point premier) {
		this.premier = premier;
	}

	public Point getDeuxieme() {
		return deuxieme;
	}

	public void setDeuxieme(Point deuxieme) {
		this.deuxieme = deuxieme;
	}

	public Point getTroisieme() {
		return troisieme;
	}

	public void setTroisieme(Point troisieme) {
		this.troisieme = troisieme;
	}

	public boolean testerAlignement() {

		if (premier.calculerDistance(deuxieme) == premier.calculerDistance(troisieme)
				+ premier.calculerDistance(deuxieme)
				|| premier.calculerDistance(troisieme) == premier.calculerDistance(deuxieme)
						+ deuxieme.calculerDistance(troisieme)
				|| deuxieme.calculerDistance(troisieme) == premier.calculerDistance(troisieme)
						+ premier.calculerDistance(deuxieme)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean TriangleEquilateral() {

		if (premier.calculerDistance(deuxieme) == premier.calculerDistance(troisieme)
				&& premier.calculerDistance(troisieme) == deuxieme.calculerDistance(troisieme)) {
			return true;
		} else {
			return false;
		}
	}

}
