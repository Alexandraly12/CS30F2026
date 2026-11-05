package Puck;

public class Puck extends Disk
{
	//sizes of pucks for adult/standard and youth
	//Instance variables
	double MIN_STD_W = 5;
	double MAX_STD_W = 5.5;
	double MIN_YTH_W = 4;
	double MAX_YTH_W = 4.5;
	
	private double weight;
	private boolean standard, youth;
	
	//Overload Constructor Method
	public Puck(double w)
	{
		super(1.5, 1);
		weight = w;
		
		if(weight >= MIN_STD_W && weight <= MAX_STD_W )
		{
			standard = true;
			youth = false;
		}
		else
		{
			standard = false;
			youth = true;
		}
	}//closes constructor
	
	//Accessor Method
	public double getWeight()
	{
		return weight;
	}
	
	//Modifier Method
	public void setWeight(double w)
	{
		weight = w;
	}
	
	//Get Division Method
	public String getDivision()
	{
		String div;
		if(standard)
		{
			div = "Puck is standard";
		}
		else
		{
			div = "Puck is youth";
		}
		
		return div;
	}
	
	//Equals
	public boolean equals(Object p)
	{
		Puck obP = (Puck)p;
		
		if(obP.getDivision() == getDivision())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Compare To
	public int CompareTo(Object p)
	{
		Puck obP = (Puck)p;
		
		if(weight < obP.getWeight())
		{
			return -1;
		}
		else if (weight == obP.getWeight())
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	
	public String toString() {
		String puckString;

		puckString = "The puck has radius " + super.getRadius() +
					 ", thickness " + super.getThickness() + " and weight " + weight + ".";
	 	return(puckString);
	}
}
