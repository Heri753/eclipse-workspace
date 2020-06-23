import java.util.Scanner;
public class Employe2 {
	
	
	private String nom;
	private double salaireBrute;
	
	public Employe2 (String n, double sb) {
		
		this.nom = n;
		this.salaireBrute = sb;
		
	
	}
	
	public void affiche () {
		
		public double salaireNet (double salaireBrute) {
			
			double retenue = salaireBrute * 0.2;
			double salaireNet = salaireBrut - retenue;	
			
			return salaireNet;
		}
		
		public static void main(String[]args){
			Employe2 em = new Employe2 ("Thierry", 4000);
			em.affiche();	
	}
	
		double salaireNet = salaireNet(salaireBrut);
		System.out.println("Vous vous appelez " +nom+ " et votre salaire brut est " +salaireBrut);
		System.out.println("Votre salaire net est: " +em.salaireNet(5000));
}
}
