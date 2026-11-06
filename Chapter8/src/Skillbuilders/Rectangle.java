package Skillbuilders;

public class Rectangle 
{
	private double length, width;
	
	public Rectangle()
	{
		length = 1;
		width = 1;
	}
	
	public Rectangle(double l, double w)
	{
		length = l;
		width = w;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double area()
	{
		double recArea;
		
		recArea = length * width;
		return(recArea);
	}
	
	public double perimeter()
	{
		double recPerimeter;
		
		recPerimeter = 2 * length + 2 * width;
		return(recPerimeter);
	}
	
	public static void displayAreaFormula()
	{
		System.out.println("The formula for the area of a rectangle is a = 2 * l + 2 * w ");
	}
	
	public boolean equals(Object r)
	{
		Rectangle obR = (Rectangle)r;
		
		if(obR.getLength() == length && obR.getWidth() == width)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int compareWAndL(Object r)
	{
		Rectangle obR = (Rectangle)r;
		
		if(length < obR.getLength())
		{
			return -1;
		}
		else if(width < obR.getWidth())
		{
			return -1;
		}
		else if (length == obR.getLength() && width == obR.getWidth())
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	
	public int compareArea(Object r)
	{
		
	}
	
	public String toString()
	{
		String recString;
		
		recString = "Rectangle has a length of " + length + " and a width of " + width + "." ;
		return(recString);
	}

}
