 

//declaration classe
public class FicheDePaie {
	
	private  String nom;
	private double salaireBrut; 
	
	
	// Constructeur
	public FicheDePaie( String n, double sb) {
		this.nom = n;
		this.salaireBrut = sb;
	} 
	
	//Methode

	public double salaireNet (double salaireBrut) {
		double retenue = salaireBrut*0.2;
		double salairNet = salaireBrut - retenue;
		return salaireNet;
	}
	
	//Affichage
	public void afficher() { // void satria tsy misy calcul eto fa juste manambara fotsiny hoe affichena
	
		salaireNet = salaireNet(salaireBrut);
		System.out.println("Votre nom est " +nom + " et votre salaire net est " +salaireNet );
	}
	
	//Calcul
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FicheDePaie f1 = new FicheDePaie ( "Anouchka ", 2000);
		FichedePaie f2 = new FichedePaie ("laurent ", 1000);

	}

}
