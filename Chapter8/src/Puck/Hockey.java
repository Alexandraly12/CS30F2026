package Puck;

public class Hockey {

	public static void main(String[] args) 
	{
		Puck puck = new Puck(4.0);
		
		System.out.println("Puck radius: " + puck.getRadius());
		System.out.println("Puck surface area: " + puck.area());
		System.out.println("Puck volume: " + puck.volume());
		System.out.println("Puck weight: " + puck.getWeight());
		
		System.out.println(puck.getDivision());
		
		Puck puck2 = new Puck(5.0);
		Puck puck3 = new Puck(5.4);
		
		if(puck2.equals(puck3))
		{
			System.out.println("Pucks are in the same division.");
		}
		else
		{
			System.out.println("Pucks are not in the same division.");
		}
		
		if(puck2.CompareTo(puck3) == 0)
		{
			System.out.println("Pucks are exactly the same.");
		}
		else if (puck2.CompareTo(puck3) < 0)
		{
			System.out.println("Puck 2 is smaller than puck 3.");
		}
		else
		{
			System.out.println("Puck 3 is smaller than puck 2.");
		}
		
		System.out.println(puck2);
		System.out.println(puck3);
	}

}
