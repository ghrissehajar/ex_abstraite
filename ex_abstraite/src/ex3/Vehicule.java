package ex3;

public abstract class  Vehicule {
protected String nom;
private String typeCarburant;

public Vehicule(String nom, String typeCarburant) {
	this.nom = nom;
	this.typeCarburant = typeCarburant;
}
public abstract void demarrer();
public abstract void arreter();

public void afficherInfos() {
	System.out.println("nom:"+nom+",type de carubrant:"+typeCarburant);
}

}
