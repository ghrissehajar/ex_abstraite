package ex3;

public class Voiture extends Vehicule implements Roulant{

	public Voiture(String nom, String typeCarburant) {
		super(nom, typeCarburant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void demarrer() {
		// TODO Auto-generated method stub
		System.out.println("la vouture est démarre");
	}

	@Override
	public void arreter() {
		// TODO Auto-generated method stub
		System.out.println("la vouture est arrete");
	}
public void rouler() {
	System.out.println("la vouture est roule");

}
public interface Roulant  {
	public void rouler();

}
}
