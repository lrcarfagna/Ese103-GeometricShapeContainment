package geometricshapes;

public class Square extends Rectangle{

	/**
	 * Inizializza i campi della padre a xV,yV,l,l
	 * @param xV
	 * @param yV
	 * @param l
	 */
	public Square(double xV, double yV, double l){
		
		if(l<=0) throw new IllegalArgumentException("Il lato del quadrato deve essere maggiore di 0");
		else{
				this.xSideLength=l;
				this.ySideLength=l;
				this.xV=xV;
				this.yV=yV;
		}
		
	}
	/**
	 * Setta la lunghezza del lato a l
	 * @param l
	 */
	public void setL(double l){
		if(l<=0) throw new IllegalArgumentException("Il lato del quadrato deve essere maggiore di 0");
		
		else{
				//richiamo il metodo ridefinito per il quadrato
				this.setXSideLength(l);
		}
		
	}
	/**
	 * restituisce la lunghezza del lato
	 * @return
	 */
	public double getL(){
		return this.ySideLength;
	}
	
	/**
	 * stringa preformattata per il quadrato
	 */
	@Override
	public String toString() {
		return "Quadrato [xV=" + xV + ", yV=" + yV + ", l="+ xSideLength+"]";
	}
	
	/**
	 * Setta la lunghezza dei due lati a l
	 */
	@Override 
	public void setXSideLength(double l){
		/*
		 * TUTTI E DUE I LATI ASSUMONO IL VALORE DI l PER  MANTENERE LA COERENZA DELLO STATO
		 */
		if(l <= 0)
			throw new IllegalArgumentException("The length of the side must be positive");
			else {
				this.xSideLength = l;
				this.ySideLength = l;
			}
	}
	
	/**
	 * Setta la lunghezza dei due lati a l
	 */
	@Override 
	public void setYSideLength(double l){
		/*
		 * TUTTI E DUE I LATI ASSUMONO IL VALORE DI l PER  MANTENERE LA COERENZA DELLO STATO
		 */
		if(l <= 0)
			throw new IllegalArgumentException("The length of the side must be positive");
			else {
				this.xSideLength = l;
				this.ySideLength = l;
			}
	}
	
}
