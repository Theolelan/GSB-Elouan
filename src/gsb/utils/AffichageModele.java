package gsb.utils;

import gsb.modele.Stocker;

public class AffichageModele {
	
	public static void afficherStock(Stocker unStock){
		System.out.println(unStock.getUnMatriculeVisiteur()+" - "+unStock.getUnCodeMedicament()+" "+unStock.getQteStock());

	}
}
