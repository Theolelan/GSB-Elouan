package gsb.tests;

import gsb.modele.Stocker;

public class StockerTest {
	public static void main(String[] args) {
		
		Stocker unStock = new Stocker("b17", "YORARIEN", 30);
		System.out.println(unStock.getUnCodeMedicament() + " - " + unStock.getUnMatriculeVisiteur() + " - " + unStock.getQteStock());
		unStock.setQteStock(25);
		unStock.setUnCodeMedicament("ENFETSI");
		unStock.setUnMatriculeVisiteur("f52");
		System.out.println(unStock.getUnCodeMedicament() + " - " + unStock.getUnMatriculeVisiteur() + " - " + unStock.getQteStock());
	}
}
