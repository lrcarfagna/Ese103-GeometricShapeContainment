package geometricshapes;

public class Triangle {

	private double xV;
	private double yV;
	private double l;

	/**
	 * inizializza l'istanza ai parametri xV,yV,l
	 * 
	 * @param xV
	 * @param yV
	 * @param l
	 */
	public Triangle(double xV, double yV, double l) {

		this.xV = xV;
		this.yV = yV;

		if (l <= 0)
			throw new IllegalArgumentException("Il lato deve essere maggiore di 0");

		this.l = l;
	}
	
	/**
	 * Restituisce VERO se la bounding box dell'oggetto Triangle invocante CONTIENE
	 * quella dell'oggetto Triangle ricevuto come parametro.
	 * @param triangolo
	 * @return
	 */
	public boolean contains(Triangle triangolo) {
		boolean ritorna = false;
		if ((this.getXMin() <= triangolo.getXMin() && this.getYMin() <= triangolo.getYMin())
			&& (this.getXMax() >= triangolo.getXMax() && this.getYMax() >= triangolo.getYMax()))
			ritorna = true;
		return ritorna;
		}
	
	/**
	 * Restituisce VERO se la bounding box dell'oggetto Triangle invocante CONTIENE
	 * quella dell'oggetto Circle ricevuto come parametro.
	 * @param cerchio
	 * @return
	 */
	public boolean contains(Circle cerchio) {
		boolean ritorna = false;
		if ((this.getXMin() <= cerchio.getXMin() && this.getYMin() <= cerchio.getYMin())
			&& (this.getXMax() >= cerchio.getXMax() && this.getYMax() >= cerchio.getYMax()))
			ritorna = true;
		return ritorna;
		}

	/**
	 * Resituisce la coordinata X del vertice in basso a sinistra del triangolo
	 * equilatero
	 * 
	 * @return
	 */
	public double getXV() {
		return xV;
	}

	/**
	 * Setta xv come coordinata X del vertice in basso a sinistra del triangolo
	 * equilatero
	 * 
	 * @param xv
	 */
	public void setXV(double xv) {
		this.xV = xv;
	}

	/**
	 * Resituisce la coordinata Y del vertice in basso a sinistra del triangolo
	 * equilatero
	 * 
	 * @return
	 */
	public double getYV() {
		return yV;
	}

	/**
	 * Setta xy come coordinata Y del vertice in basso a sinistra del triangolo
	 * equilatero
	 * 
	 * @param yv
	 */
	public void setYV(double yv) {
		this.yV = yv;
	}

	/**
	 * Restituisce il valore del lato del triangolo equilatero
	 * 
	 * @return
	 */
	public double getL() {
		return l;
	}

	/**
	 * Setta l come valore del lato del triangolo equilatero
	 * 
	 * @param l
	 */
	public void setL(double l) {

		if (l <= 0)
			throw new IllegalArgumentException("Il lato deve essere maggiore di 0");

		this.l = l;
	}

	/**
	 * Restituisce la coordinata X del vertice in basso a sinistra della
	 * bounding box
	 * 
	 * @return
	 */
	public double getXMin() {

		return this.xV;

	}

	/**
	 * Restituisce la coordinata X del vertice in alto a destra della bounding
	 * box
	 * 
	 * @return
	 */
	public double getXMax() {

		return this.xV + this.l;

	}

	/**
	 * Restituisce la coordinata Y del vertice in basso a sinistra della
	 * bounding box
	 * 
	 * @return
	 */
	public double getYMin() {

		return this.yV;

	}

	/**
	 * Restituisce la coordinata Y del vertice in alto a destra della bounding
	 * box
	 * 
	 * @return
	 */
	public double getYMax() {

		return this.yV + this.l * Math.sqrt(3) / 2;

	}

	@Override
	public String toString() {
		return "Triangolo [xV=" + xV + ", yV=" + yV + ", l=" + l + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(l);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xV);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(yV);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(l) != Double.doubleToLongBits(other.l))
			return false;
		if (Double.doubleToLongBits(xV) != Double.doubleToLongBits(other.xV))
			return false;
		if (Double.doubleToLongBits(yV) != Double.doubleToLongBits(other.yV))
			return false;
		return true;
	}

}
