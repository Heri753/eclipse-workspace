
public class Application {
	
	public static void main (String[]args)
	//fonction operation
	{
		Point norm = new Point(15,2);
		
		norm.setAbsc (6);
		norm.setOrdo (2);
		norm.norm();
		
		System.out.println("Donner l'abscisse: " +norm.getAbsc());
		System.out.println("Donner l'ordonnee: " +norm.getOrdo());
		System.out.println("La norme du point (1,2) est : " +norm.norm());
		
		
	}

}

