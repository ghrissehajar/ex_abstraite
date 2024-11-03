package ex1;

public class Triangle extends Forme {
private double A;
private double B;
private double C;

public Triangle(double A,double B,double C) {
	this.A=A;
	this.B=B;
	this.B=B;
}

@Override
public double calculeSurface() {
	// TODO Auto-generated method stub
	double s=(A+B+C)/2;
	return Math.sqrt(s*(s-A)*(s-B)*(s-C));
}

@Override
public double calculePerimetre() {
	// TODO Auto-generated method stub
	return A+B+C;
}

}
