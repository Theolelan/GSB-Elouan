package gsb.tests.dao;

import java.util.ArrayList;


import gsb.modele.Localite;
import gsb.modele.Stocker;
import gsb.modele.dao.LocaliteDao;
import gsb.modele.dao.StockerDao;
import gsb.utils.*;
public class StockerDaoTest {
	
	public static void main(String[] args) {
		//Stocker unStock = StockerDao.rechercher("a131");
		//System.out.println(unStock.getUnMatriculeVisiteur() + unStock.getUnCodeMedicament() + unStock.getQteStock());
		ArrayList<Stocker> lesStocks = new ArrayList<Stocker>();
		lesStocks = StockerDao.retournerCollectionDesStocks("a131");
		for(Stocker unStock : lesStocks) {
			AffichageModele.afficherStock(unStock);
		}
		
		
	}
}
