import java.util.Scanner;
public class Voiture {
	
	
	 private String marque, modele, couleur;
	 private int vitesse;
	 
	 /*debut constructeur*/
	 
	 public Voiture (int v, String marque, String modele, String couleur) {
		 this.vitesse = v;
		 this.marque = marque;
		 this.modele = modele;
		 this.couleur = couleur;
	 }
	  
	 //fin constructeur
	 
	 //methode
	 
	 public double tempsMIS( int distance){ /* fonction */
		
		 double tempsMis/*variable*/ = distance / vitesse; 
		 
		 return tempsMis;
	 
	 }
	 
	 //fin methode
	
	 //debut affichage
	 
	 public void afficher() {
		 
		 
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("La marque de la voiture est " +this.marque);
		 System.out.println("Son modele est " +this.modele);
		 System.out.println("De couleur "+this.couleur);
		 
	 
		 
			
			System.out.println("Entrée la vitesse de la voiture " );
			double vitesse = sc.nextInt();
			
			System.out.println("Entrée la distance parcourue " );
				int distance = sc.nextInt(); 
			
				double tempsMis = distance/vitesse; 
			System.out.println("Le temps sur la distance donnée" +tempsMis+"h");
						
		}
	 
	//fin affichage
	 
	 //debut main

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Voiture v1 = new Voiture(10, "Peugeot", "306", "rouge");

	v1.afficher();
}

}
