package ex2;

public class ProduitAlimentaire implements Produit {
private String nom;
private double prix;
private int qnt;

public ProduitAlimentaire(String nom, double prix, int qnt) {
	this.nom = nom;
	this.prix = prix;
	this.qnt = qnt;
}

@Override
public double valeurStock() {
	// TODO Auto-generated method stub
	return prix*qnt;
}
public void afficherInfos() {
	System.out.println("Produit Alimentaire-nom:"+nom+", Prix Unitaire:"+prix+",Quantité en Stock:"+qnt+",Valeur du Stock: "+valeurStock());
}
}
