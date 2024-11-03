package ex3;

public class Bateau extends Vehicule implements Flottant{

	public Bateau(String nom, String typeCarburant) {
		super(nom, typeCarburant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void demarrer() {
		// TODO Auto-generated method stub
		System.out.println("le bateau est démarre");

	}

	@Override
	public void arreter() {
		// TODO Auto-generated method stub
		System.out.println("la bateau est arrete");

	}
	public void flotter() {
		System.out.println("la bateau est flotte");

	}
	public interface Flottant {
		public void flotter();
		}
}
