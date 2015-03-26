package geometricshapes;

public class Rectangle extends GeometricShape {

	protected double xV;
	protected double yV;
	protected double xSideLength;
	protected double ySideLength;
	
	/**
	 * 
	 * @param xV
	 * @param yV
	 * @param xSideLenght
	 * @param ySideLenght
	 * Inizializza i campi dell'oggetto a xV,yV,xSideLenght e ySideLenght
	 */
	public Rectangle(double xV,double yV,double xSideLenght,double ySideLenght){
		this.xV=xV;
		this.yV=yV;
		if(xSideLenght<=0 || ySideLenght<=0){
			throw new IllegalArgumentException("I lati devono essere maggiori di 0");
		}
		else{
			this.xSideLength=xSideLenght;
			this.ySideLength=ySideLenght;
		}
		
	}
	/**
	 * Costruttore senza parametri, utilizzato in Square
	 */
	protected Rectangle(){}

	/**
	 * restituisce la coordinata x del vertice in basso a sinistra
	 * @return
	 */
	public double getXV() {
		return xV;
	}

	/**
	 * setta la coordinata x del vertice in basso a sinistra a xV
	 * @param xV
	 */
	public void setXV(double xV) {
		this.xV = xV;
	}

	/**
	 * restituisce la coordinata y del vertice in basso a sinistra
	 * @return
	 */
	public double getYV() {
		return yV;
	}

	/**
	 * setta la coordinata y del vertice in basso a sinistra a yV
	 * @param yV
	 */
	public void setYV(double yV) {
		this.yV = yV;
	}

	/**
	 * restituisce la lunghezza del lato parallelo all'asse delle ascisse
	 * @return
	 */
	public double getXSideLength() {
		return xSideLength;
	}

	/**
	 * setta la lunghezza del lato parallelo all'asse delle ascisse a xSideLenght ricevuto come parametro
	 * @param xSideLenght
	 */
	public void setXSideLength(double xSideLenght) {
		if(xSideLenght<=0)throw new IllegalArgumentException("I lato parallelo all'asse X deve essere maggiore di 0");
		else this.xSideLength = xSideLenght;
	}

	/**
	 * restituisce la lunghezza del lato parallelo all'asse delle ordinate
	 * @return
	 */
	public double getYSideLength() {
		return ySideLength;
	}

	/**
	 * setta la lunghezza del lato parallelo all'asse delle ordinate a ySideLenght ricevuto come parametro
	 * @param ySideLenght
	 */
	public void setYSideLength(double ySideLenght) {
		if(ySideLenght<=0)throw new IllegalArgumentException("I lato parallelo all'asse Y deve essere maggiore di 0");
		else this.ySideLength = ySideLenght;
	}
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(xSideLength);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xV);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(ySideLength);
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
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(xSideLength) != Double
				.doubleToLongBits(other.xSideLength))
			return false;
		if (Double.doubleToLongBits(xV) != Double.doubleToLongBits(other.xV))
			return false;
		if (Double.doubleToLongBits(ySideLength) != Double
				.doubleToLongBits(other.ySideLength))
			return false;
		if (Double.doubleToLongBits(yV) != Double.doubleToLongBits(other.yV))
			return false;
		return true;
	}

	/**
	 * restituisce una stringa formattata per i rettangoli
	 */
	@Override
	public String toString() {
		return "Rettangolo [xV=" + xV + ", yV=" + yV + ", xSideLenght="+ xSideLength + ", ySideLenght=" + ySideLength + "]";
	}

	/**
	 * restituisce la coordinata x del vertice in basso a sinistra della bounding box
	 */
	@Override
	double getXMin() {
		return xV;
	}

	/**
	 * restituisce la coordinata y del vertice in basso a sinistra della bounding box
	 */
	@Override
	double getYMin() {
		return yV;
	}

	/**
	 * restituisce la coordinata x del vertice in alto a destra della bounding box
	 */
	@Override
	double getXMax() {
		return xV+xSideLength;
	}

	/**
	 * restituisce la coordinata y del vertice in alto a destra della bounding box
	 */
	@Override
	double getYMax() {
		return yV+ySideLength;
	}
}

