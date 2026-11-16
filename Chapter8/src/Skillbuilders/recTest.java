package Skillbuilders;

public class recTest 
{

	public static void main(String[] args) 
	{
		Rectangle rec = new Rectangle(4, 6);
		
		System.out.println("Rectangle length: " + rec.getLength()
						+ "\nRectangle width: " + rec.getWidth()
						+ "\nRectangle area: " + rec.area()
						+ "\nRectangle perimeter: " + rec.perimeter());
		
		Rectangle rec2 = new Rectangle(5, 9);
		Rectangle rec3 = new Rectangle(3, 7);
		
		if(rec2.equals(rec3))
		{
			System.out.println("The rectangles are equal.");
		}
		else
		{
			System.out.println("The rectangles are not equal.");
		}
		
		if(rec2.compareTo(rec3) == 0)
		{
			System.out.println("Rectangles are exactly the same.");
		}
		else if(rec2.compareTo(rec3) < 0)
		{
			System.out.println("Rectangle's 1 side is smaller than Rectangle 2.");
		}
		else
		{
			System.out.println("Rectangle's 2 side is smaller than Rectangle 1.");
		}
		
		System.out.println("Rectangle 1 " + rec2 + " Rectangle 2 " + rec3);
	}

}
