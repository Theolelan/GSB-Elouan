package gsb.modele.dao;

import java.sql.ResultSet;

import gsb.modele.Localite;
import gsb.modele.Medecin;
import gsb.modele.Stocker;
import gsb.modele.Visite;
import gsb.modele.Visiteur;
import gsb.modele.dao.StockerDao;

public class OffrirDao {

	public static int ajoutEchantillon(String unMatriculeVisiteur, String unMedicament, int qteStock, String referenceVisite){
		int qteOffrir = qteStock;
		Stocker unStock= StockerDao.rechercher(unMatriculeVisiteur, unMedicament);
		qteStock = unStock.getQteStock() - qteStock;
		String requeteUpdate = ("UPDATE stocker SET QTE = " + qteStock + " WHERE visiteur ='"+unMatriculeVisiteur+"' AND medicament='"+unMedicament+"'");
		int result = ConnexionMySql.execReqMaj(requeteUpdate);
		
		
		String requeteInsertion ="insert into Offrir values('" + referenceVisite + "','" + qteOffrir + "','" + unMedicament + "')";
		result = ConnexionMySql.execReqMaj(requeteInsertion);
		ConnexionMySql.fermerConnexionBd();
		return result;
	}
	
}