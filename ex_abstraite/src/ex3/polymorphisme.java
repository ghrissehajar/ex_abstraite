package ex3;

public class polymorphisme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vehicule[] vehicules = new Vehicule[] {
		            new Voiture("Voiture", "Essence"),
		            new Bateau("Bateau", "Diesel"),
		            new Hydravion("Hydravion", "Kérosène")
		        };
		 for(Vehicule vehicule : vehicules) {
			 vehicule.afficherInfos();
			 vehicule.demarrer();
			 vehicule.arreter();
		 }
		 for(Vehicule vehicule : vehicules) {
	            if (vehicule instanceof Roulant) {
	                ((Roulant) vehicule).rouler();
	            }
	            if (vehicule instanceof Flottant) {
	                ((Flottant) vehicule).flotter();
	            }
	            if (vehicule instanceof Volant) {
	                ((Volant) vehicule).voler();
	            }
	            System.out.println();
	        }
	}

}
