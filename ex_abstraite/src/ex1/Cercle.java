package ex1;

public class Cercle extends Forme {
private double rayon;

public Cercle(double rayon) {
	this.rayon = rayon;
}

@Override
public double calculeSurface() {
	// TODO Auto-generated method stub
	return Math.PI*rayon*rayon;
}

@Override
public double calculePerimetre() {
	// TODO Auto-generated method stub
	return 2*Math.PI*rayon;
}




}
