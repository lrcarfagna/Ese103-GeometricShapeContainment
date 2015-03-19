package geometricshape;

public class Triangle {
	
	private double xv;
	private double yv;
	private double sideLenght;
	
	
	
	public double getXv() {
		return xv;
	}
	
	public void setXv(double xv) {
		this.xv = xv;
	}
	
	public double getYv() {
		return yv;
	}
	
	public void setYv(double yv) {
		this.yv = yv;
	}
	
	public double getSideLenght() {
		return sideLenght;
	}
	
	public void setSideLenght(double sideLenght) {
		if(sideLenght<=0) throw new IllegalArgumentException("Il lato deve essere maggiore di 0");
		this.sideLenght = sideLenght;
	}

}

