package geometricshape;
/**
 * 
 * @author Carfagna Lorenzo
 *
 */

public class Circle {
	
	private double xc;
	private double yc;
	private double r;
	
	/**
	 * 
	 * @param xc
	 * @param yc
	 * @param r
	 * inizializza l'istanza ai parametri formali
	 */
	public Circle(double xc, double yc, double r) {
		this.xc = xc;
		this.yc = yc;
		if(r<=0) throw new IllegalArgumentException("Il raggio deve essere maggiore di 0");
		else this.r = r;
	}
	
	/**
	 * restituisce la coordinata X del centro
	 * @return
	 */
	public double getXc() {
		return xc;
	}
	/**
	 * setta la coordinata X del centro
	 * @param xc
	 */
	public void setXc(double xc) {
		this.xc = xc;
	}
	/**
	 * restituisce la coordinata Y del centro
	 * @return
	 */
	public double getYc() {
		return yc;
	}
	/**
	 * setta la coordinata Y del centro
	 * @param yx
	 */
	public void setYc(double yx) {
		this.yc = yx;
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
	 * ritorna la coordinata X dell'angolo in basso a sinistra della bounding box
	 * @return
	 */
	public double getXmin(){
		return this.xc - this.r;
	}
	/**
	 * ritorna la coordinata Y dell'angolo in basso a sinistra della bounding box
	 * @return
	 */
	public double getYmin(){
		return this.yc - this.r;
	}
	/**
	 * ritorna la coordinata X dell'angolo in alto a destra della bounding box
	 * @return
	 */
	public double getXmax(){
		return this.xc + this.r;
	}
	/**
	 * ritorna la coordinata Y dell'angolo in alto a destra della bounding box
	 * @return
	 */
	public double getYmax(){
		
		return this.yc + this.r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(r);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xc);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(yc);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	/**
	 * Ritorna VERO se i campi dell'oggetto invocante e 
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
		if (Double.doubleToLongBits(xc) != Double.doubleToLongBits(other.xc))
			return false;
		if (Double.doubleToLongBits(yc) != Double.doubleToLongBits(other.yc))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Coordinate centro: ("+this.xc+","+this.yc+")  Raggio="+this.r;
	}
	/**
	 * Restituisce VERO se la bounding box dell'oggetto 
	 * invocante CONTIENE quella dell'oggetto ricevuto come parametro.
	 * @param cerchio
	 * @return
	 */
	public boolean contains (Circle cerchio){
		boolean ritorna=false;
		
		if((this.getXmin()<=cerchio.getXmin()&&this.getYmin()<=cerchio.getYmin())
		  &&(this.getXmax()>=cerchio.getXmax()&&this.getYmax()>=cerchio.getYmax()))
			ritorna=true;
		
		return ritorna;
	}
	
	
	

}