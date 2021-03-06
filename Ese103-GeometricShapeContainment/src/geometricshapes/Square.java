package geometricshapes;

public class Square extends Rectangle
{	
	public Square(double xV, double yV, double l)
	{
		super(xV, yV, l, l);
	}

	public double getL()
	{
		return this.xSideLength;
	}
	
	public void setL(double l)
	{
		if(l <= 0)
			throw new IllegalArgumentException("Side > 0");
		this.xSideLength = l;
		this.ySideLength = l;
	}
	
	@Override public void setXSideLength(double l)
	{
		if(l <= 0)
			throw new IllegalArgumentException("Side > 0");
		this.xSideLength = l;
		this.ySideLength = l;
	}
	
	@Override public void setYSideLength(double l)
	{
		if(l <= 0)
			throw new IllegalArgumentException("Side > 0");
		this.xSideLength = l;
		this.ySideLength = l;
	}

	@Override public String toString()
	{
		return "Square [xV=" + xV + ", yV=" + yV + ", l="
						+ xSideLength + "]";
	}
}