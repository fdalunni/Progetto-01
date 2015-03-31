package geometricshapes;


public class Circle extends GeometricShape 
{
	private double xC;
	private double yC;
	private double r;
	
	
	public Circle(double xC, double yC, double r)
	{
		this.xC = xC;
		this.yC = yC;
		if(r>0)
		{
			 this.r=r;
		}
		else
		{
			throw new IllegalArgumentException("The value of a must be biggest from 0.");
		}
	}
	
	public double getXC() 
	{
		return xC;
	}
	
	public void setXC(double xC) 
	{
		this.xC = xC;
	}
	
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(r);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(yC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(r) != Double.doubleToLongBits(other.r))
			return false;
		if (Double.doubleToLongBits(xC) != Double.doubleToLongBits(other.xC))
			return false;
		if (Double.doubleToLongBits(yC) != Double.doubleToLongBits(other.yC))
			return false;
		return true;
	}
	
	@Override
	public String toString()
	{
		return "circle [xc=" + xC + ", yc=" + yC + ", r=" + r + "]";
	}
	
	public double getYC()
	{
		return yC;
	}
	
	public void setYC(double yC) 
	{
		this.yC = yC;
	}
	
	public double getR() 
	{
		return r;
	}
	
	public void setR(double r) 
	{
		if(r>0)
		{
		   this.r = r;
		}
		else{
			throw new IllegalArgumentException("The value of a must be biggest from 0.");
		}
	}
	
	@Override
	public double getXMin()
	{
		return this.xC-r;
	}
	
	@Override
	public double getYMin()
	{
		return this.yC-r;
	}
	
	@Override
	public double getXMax()
	{
		return this.xC+r;
	}
	
	@Override
	public double getYMax()
	{
		return this.yC+r;
	}
	
	

}
