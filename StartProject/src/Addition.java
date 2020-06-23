import java.util.Scanner;
public class Addition {
	
	private String nom; //attribut nom
	private float salaireNet; //nos attributs sont de même type float

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Premiere nombre");
		
		double nombre1 = sc.nextInt();
		
		
		
		System.out.println("Deuxieme nombre");
		double nombre2 = sc.nextInt();
		
		
		System.out.println("Troisieme nombre");
		double nombre3 = nombre1/nombre2;
		
		
		
		
		
		
	
		
		double resultat =  (nombre1 + nombre2)/nombre3;
		
		System.out.println("La resultat =   " +  resultat);
		
		
	
		
		
		
		
	

}
	
}