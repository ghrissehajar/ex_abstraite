package ex1;

public class Rectangle extends Forme {
private double longueur;
private double largeur;

public Rectangle(double longueur, double largeur) {
	this.longueur=longueur;
	this.largeur=largeur;
}

@Override
public double calculeSurface() {
	// TODO Auto-generated method stub
	return longueur*largeur;
}

@Override
public double calculePerimetre() {
	// TODO Auto-generated method stub
	return 2*(longueur*largeur);
}

}
