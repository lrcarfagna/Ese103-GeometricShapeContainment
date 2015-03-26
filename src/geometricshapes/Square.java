package geometricshapes;

public class Square extends Rectangle{

	public Square(double xV, double yV, double l){
		
		if(l<=0) throw new IllegalArgumentException("Il lato del quadrato deve essere maggiore di 0");
		this.xSideLenght=l;
		this.ySideLenght=l;
		this.xV=xV;
		this.yV=yV;
	}
	
	public void setL(double l){
		if(l<=0) throw new IllegalArgumentException("Il lato del quadrato deve essere maggiore di 0");
		this.xSideLenght=l;
		this.ySideLenght=l;
	}
	
	public double getL(){
		return this.ySideLenght;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
