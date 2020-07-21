
public class SpeedConverter2 {
	
	public static long toMilesproHour (double kilometersPerHour) {
		
		if( kilometersPerHour <0) return -1 ; //error		
		else {
			long result = (long) (kilometersPerHour/1.6);
			long arrondie = Math.round(result);
			return arrondie;
		}
		
		
				
	}
	
	public static void printConversion (double kilometersPerHour) {
		
		if( kilometersPerHour <0) {
			System.out.println("valeur invalide " );
			
		}
		
		else {
			double milesproHour = (kilometersPerHour)/1.6; 
			System.out.println("Kilometers per hour " +toMilesproHour (kilometersPerHour)+ "m/ph");
			
		}
			
	}
	
	public static void main String([] args);
	System.out.println("Vitesse en M/ph " +toMilesproHour(-2) );
	print
	
	
	}
	

}
