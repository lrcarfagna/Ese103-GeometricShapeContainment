package geometricshapes;

abstract public class GeometricShape {

	abstract double getXMin();
	abstract double getYMin();
	abstract double getXMax();
	abstract double getYMax();
	
	/**
	 * 
	 * @param figura
	 * @return true se la bounding box della figura invocante contiene 
	 * quella della figura ricevuta come parametro.
	 */
	public boolean contains(GeometricShape figura) {
		boolean ritorna = false;
		if ((this.getXMin() <= figura.getXMin() && this.getYMin() <= figura.getYMin())
			&&(this.getXMax() >= figura.getXMax() && this.getYMax() >= figura.getYMax()))
			
			
			ritorna = true;
		return ritorna;
	
	}
}

