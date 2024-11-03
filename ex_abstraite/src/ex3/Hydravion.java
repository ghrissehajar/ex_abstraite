package ex3;

public class Hydravion extends Vehicule implements Volant,  Flottant{

	public Hydravion(String nom, String typeCarburant) {
		super(nom, typeCarburant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void voler() {
		// TODO Auto-generated method stub
        System.out.println("L'hydravion " + nom + " vole.");

	}

	@Override
	public void demarrer() {
		// TODO Auto-generated method stub
        System.out.println("L'hydravion " + nom + " démarre.");

	}

	@Override
	public void arreter() {
		// TODO Auto-generated method stub
        System.out.println("L'hydravion " + nom + " s'arrête.");

	}

	@Override
	public void flotter() {
		// TODO Auto-generated method stub
        System.out.println("L'hydravion " + nom + " flotte.");

	} 

}
