package geometricshape;
/**
 * 
 * @author Carfagna Lorenzo
 *
 */

public class Circle {
	
	private double xC;
	private double yC;
	private double r;
	
	/**
	 * 
	 * @param xc
	 * @param yc
	 * @param r
	 * inizializza l'istanza ai parametri xc,yc,r
	 */
	public Circle(double xc, double yc, double r) {
		this.xC = xc;
		this.yC = yc;
		if(r<=0) throw new IllegalArgumentException("Il raggio deve essere maggiore di 0");
		else this.r = r;
	}
	
	/**
	 * restituisce la coordinata X del centro
	 * @return
	 */
	public double getXC() {
		return xC;
	}
	/**
	 * setta la coordinata X del centro
	 * @param xc
	 */
	public void setXC(double xc) {
		this.xC = xc;
	}
	/**
	 * restituisce la coordinata Y del centro
	 * @return
	 */
	public double getYC() {
		return yC;
	}
	/**
	 * setta la coordinata Y del centro
	 * @param yx
	 */
	public void setYC(double yx) {
		this.yC = yx;
	}
	/**
	 * restituisce il valore del raggio
	 * @return
	 */
	public double getR() {
		return r;
	}
	/**
	 * setta il valore del raggio
	 * @param r
	 */
	public void setR(double r) {
		if(r<=0) throw new IllegalArgumentException("Il raggio deve essere maggiore di 0");
		this.r = r;
	}
	/**
	 * restituisce la coordinata X dell'angolo in basso a sinistra della bounding box
	 * @return
	 */
	public double getXMin(){
		return this.xC - this.r;
	}
	/**
	 * restituisce la coordinata Y dell'angolo in basso a sinistra della bounding box
	 * @return
	 */
	public double getYMin(){
		return this.yC - this.r;
	}
	/**
	 * restituisce la coordinata X dell'angolo in alto a destra della bounding box
	 * @return
	 */
	public double getXMax(){
		return this.xC + this.r;
	}
	/**
	 * restituisce la coordinata Y dell'angolo in alto a destra della bounding box
	 * @return
	 */
	public double getYMax(){
		
		return this.yC + this.r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(r);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(yC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	/**
	 * restituisce VERO se i campi dell'oggetto invocante e 
	 * di quello ricevuto come parametro sono uguali
	 * altrimenti FALSO
	 * @return
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(r) != Double.doubleToLongBits(other.r))
			return false;
		if (Double.doubleToLongBits(xC) != Double.doubleToLongBits(other.xC))
			return false;
		if (Double.doubleToLongBits(yC) != Double.doubleToLongBits(other.yC))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Coordinate centro: ("+this.xC+","+this.yC+") e raggio="+this.r;
	}
	/**
	 * Restituisce VERO se la bounding box dell'oggetto 
	 * invocante CONTIENE quella dell'oggetto ricevuto come parametro.
	 * @param cerchio
	 * @return
	 */
	public boolean contains (Circle cerchio){
		boolean ritorna=false;
		
		if((this.getXMin()<=cerchio.getXMin()&&this.getYMin()<=cerchio.getYMin())
		  &&(this.getXMax()>=cerchio.getXMax()&&this.getYMax()>=cerchio.getYMax()))
			ritorna=true;
		
		return ritorna;
	}
	
	
	

}