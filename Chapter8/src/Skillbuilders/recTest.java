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
	}

}
