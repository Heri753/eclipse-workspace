
public class MainExemple {
	
	public static void main (String[]args)
	{
		Rectangle r1 = new Rectangle();
		//r1.x1= 1;
		r1.setX1(19);
		r1.setX2(54);
		
		System.out.println("Surface: " +r1.surface());
	
		Rectangle r2 = new Rectangle();
		//r2.x1 = 3;
		r2.setX1(3);
		r2.setX2(4);
		
		System.out.println("Superficie: " +r2.superficie());
	}

}
