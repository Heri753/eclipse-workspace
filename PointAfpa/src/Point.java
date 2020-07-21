
public class Point { //class
	
	private double x, y ; 
	double r; //module;
	
	/*public double getAbsc()
	{return x;}
	
	public double getOrdo()
	{return y;}
	
	public void setAbsc(double a)
	{x = a;}
	
	public void setOrdo(double o)
	{y = o;}*/
	
	
	

	double norm() // methode 
	{
		return r = Math.sqrt(x*x +y*y) ; //module; //racine carree(abscisse² + ordonnee²)
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	// constructeur 
	public Point(double abs, double ord)
	{
		x= abs;
		y = ord;
	}
	

}






