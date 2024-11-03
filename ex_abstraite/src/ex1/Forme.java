package ex1;

public abstract class Forme {
	public abstract double calculeSurface();
	public abstract double calculePerimetre();



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Forme cercle = new Cercle(5);
        Forme rectangle = new Rectangle(4, 6);
        Forme triangle = new Triangle(3, 4, 5);
	System.out.println("Cercle:surface="+cercle.calculeSurface()+",perimetre="+cercle.calculePerimetre());
System.out.println("rectangme:surface="+rectangle.calculeSurface()+",perimetre="+rectangle.calculePerimetre());
System.out.println("triangle-surface="+triangle.calculeSurface()+",triangle="+triangle.calculePerimetre());
	}}