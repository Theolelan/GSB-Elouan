package gsb.tests.dao;

import gsb.modele.Localite;
import gsb.modele.dao.LocaliteDao;

public class LocaliteDaoTest {
	
	public static void main(String[] args) {
		
		Localite uneLocalite = LocaliteDao.rechercher("13012");
		System.out.println(uneLocalite.getCodePostal() + uneLocalite.getVille());
		
		/*Localite loca = new Localite("56550", "Locoal-Mendon");
		int resultat = LocaliteDao.creer(loca);
		System.out.println(resultat);*/
	}

}
