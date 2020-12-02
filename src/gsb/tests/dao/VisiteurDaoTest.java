package gsb.tests.dao;

import gsb.modele.Stocker;
import gsb.modele.Visiteur;
import gsb.modele.dao.StockerDao;
import gsb.modele.dao.VisiteurDao;

public class VisiteurDaoTest {
	
	public static void main(String[] args) {
		Visiteur unVisiteur = VisiteurDao.rechercher("a131");
		System.out.println(unVisiteur.getLogin() + " " + unVisiteur.getNom()+ " " + unVisiteur.getPrenom());
	}
}
