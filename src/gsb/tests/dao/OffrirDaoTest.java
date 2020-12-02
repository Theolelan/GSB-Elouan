package gsb.tests.dao;

import gsb.modele.Stocker;
import gsb.modele.dao.StockerDao;
import gsb.modele.dao.OffrirDao;

public class OffrirDaoTest {

	public static void main(String[] args) {
		Stocker unStock = StockerDao.rechercher("a131", "3MYC7");
		System.out.println(unStock.getUnMatriculeVisiteur()+ " - " + unStock.getUnCodeMedicament()+ " - " + unStock.getQteStock());
		
		int result = OffrirDao.ajoutEchantillon("a131", "3MYC7", 5, "v0001");
		System.out.println(result);
		
		StockerDao.rechercher("a131", "3MYC7");
		System.out.println(unStock.getUnMatriculeVisiteur()+ " - " + unStock.getUnCodeMedicament()+ " - " + unStock.getQteStock());
		
	}
}
