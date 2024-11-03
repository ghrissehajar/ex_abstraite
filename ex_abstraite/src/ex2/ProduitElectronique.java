package ex2;

public class ProduitElectronique implements  Produit{
private String nom;
private double prix;
private int qnt;
private int garantie;

public ProduitElectronique(String nom, double prix, int qnt, int garantie) {
	this.nom = nom;
	this.prix = prix;
	this.qnt = qnt;
	this.garantie = garantie;
}

@Override
public double valeurStock() {
	// TODO Auto-generated method stub
	return prix*qnt;
}
public void afficherInfos() {
	System.out.println("Produit Electronique - Nom: " + nom + ", Prix Unitaire: " + prix +
            ", Quantité en Stock: " + qnt + ", Garantie: " + garantie +
            " mois, Valeur du Stock: " + valeurStock());
}

}
