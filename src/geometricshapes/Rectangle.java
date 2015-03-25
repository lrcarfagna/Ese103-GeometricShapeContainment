package geometricshapes;

public class Rectangle {

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
}

