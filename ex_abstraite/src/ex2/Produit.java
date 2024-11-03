package ex2;

public interface Produit {
double valeurStock();
}
class main{
public static void main(String[] args) {
Produit ProduitAlimentaire=new ProduitAlimentaire("fruit",2.4,200);
Produit ProduitElectronique=new ProduitElectronique("phone",600,10,20);
	
if (ProduitAlimentaire instanceof ProduitAlimentaire) {
	((ProduitAlimentaire)ProduitAlimentaire).afficherInfos();
}
if (ProduitElectronique instanceof ProduitElectronique ) {
	((ProduitElectronique)ProduitElectronique).afficherInfos();
	
}
}}