package geometricshapes;

abstract public class GeometricShape {

	abstract double getXMin();
	abstract double getYMin();
	abstract double getXMax();
	abstract double getYMax();
	
	public boolean contains(GeometricShape s) {
		boolean contain = false;
		if(this.getXMin() <= s.getXMin() && this.getYMin() <= s.getYMin())
		if(this.getXMax() >= s.getXMax() && this.getYMax() >= s.getYMax())
					
			contain = true;
		return contain;
	
	}
}

