package geometricshapes;

public class Rectangle extends GeometricShape
{
	protected double xV;
	protected double yV;
	protected double xSideLength;
	protected double ySideLength;
	
	public Rectangle(double xV, double yV, double xSideLength, double ySideLength)
	{
		super();
		this.xV = xV;
		this.yV = yV;
		if(xSideLength <= 0)
			throw new IllegalArgumentException("xSideLength > 0");
		this.xSideLength = xSideLength;
		if(ySideLength <= 0)
			throw new IllegalArgumentException("ySideLength > 0");
		this.ySideLength = ySideLength;
	}
	
	public double getXV()
	{
		return xV;
	}
	
	public void setXV(double xV)
	{
		this.xV = xV;
	}
	
	public double getYV()
	{
		return yV;
	}
	
	public void setYV(double yV)
	{
		this.yV = yV;
	}
	
	public double getXSideLength()
	{
		return xSideLength;
	}
	
	public void setXSideLength(double xSideLength)
	{
		if(xSideLength <= 0)
			throw new IllegalArgumentException("xSideLength > 0");
		this.xSideLength = xSideLength;
	}
	
	public double getYSideLength()
	{
		return ySideLength;
	}
	
	public void setYSideLength(double ySideLength)
	{
		if(ySideLength <= 0)
			throw new IllegalArgumentException("ySideLength > 0");
		this.ySideLength = ySideLength;
	}

	@Override 
	public double getXMin()
	{
		return this.xV;
	}

	@Override
	public double getYMin()
	{
		return this.yV;
	}
	
	@Override
	public double getXMax()
	{
		return this.xV+this.xSideLength;
	}
	
	@Override 
	public double getYMax()
	{
		return this.yV+this.ySideLength;
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

	@Override
	public String toString() {
		return "Rectangle [xV=" + xV + ", yV=" + yV + ", xSideLength="
				+ xSideLength + ", ySideLength=" + ySideLength + "]";
	}	
}
