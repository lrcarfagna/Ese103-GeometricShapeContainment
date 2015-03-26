package geometricshapes;

public class Rectangle extends GeometricShape {

	protected double xV;
	protected double yV;
	protected double xSideLenght;
	protected double ySideLenght;
	
	
	public Rectangle(double xV,double yV,double xSideLenght,double ySideLenght){
		this.xV=xV;
		this.yV=yV;
		if(xSideLenght<=0 || ySideLenght<=0){
			throw new IllegalArgumentException("I lati devono essere maggiori di 0");
		}
		else{
			this.xSideLenght=xSideLenght;
			this.ySideLenght=ySideLenght;
		}
		
	}
	
	protected Rectangle(){}


	public double getXV() {
		return xV;
	}


	public void setXV(double xV) {
		this.xV = xV;
	}


	public double getYV() {
		return yV;
	}


	public void setYV(double yV) {
		this.yV = yV;
	}


	public double getXSideLenght() {
		return xSideLenght;
	}


	public void setXSideLenght(double xSideLenght) {
		if(xSideLenght<=0)throw new IllegalArgumentException("I lato parallelo all'asse X deve essere maggiore di 0");
		else this.xSideLenght = xSideLenght;
	}


	public double getYSideLenght() {
		return ySideLenght;
	}


	public void setYSideLenght(double ySideLenght) {
		if(ySideLenght<=0)throw new IllegalArgumentException("I lato parallelo all'asse Y deve essere maggiore di 0");
		else this.ySideLenght = ySideLenght;
	}
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(xSideLenght);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xV);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(ySideLenght);
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
		if (Double.doubleToLongBits(xSideLenght) != Double
				.doubleToLongBits(other.xSideLenght))
			return false;
		if (Double.doubleToLongBits(xV) != Double.doubleToLongBits(other.xV))
			return false;
		if (Double.doubleToLongBits(ySideLenght) != Double
				.doubleToLongBits(other.ySideLenght))
			return false;
		if (Double.doubleToLongBits(yV) != Double.doubleToLongBits(other.yV))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Rettangolo [xV=" + xV + ", yV=" + yV + ", xSideLenght="+ xSideLenght + ", ySideLenght=" + ySideLenght + "]";
	}


	@Override
	double getXMin() {
		return this.xV;
	}


	@Override
	double getYMin() {
		return this.yV;
	}


	@Override
	double getXMax() {
		return xV+xSideLenght;
	}


	@Override
	double getYMax() {
		return yV+ySideLenght;
	}
}

