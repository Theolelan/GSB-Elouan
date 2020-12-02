package gsb.modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import gsb.modele.Localite;
import gsb.modele.Medecin;
import gsb.modele.Medicament;
import gsb.modele.Stocker;
import gsb.modele.Visiteur;
import gsb.modele.dao.MedicamentDao;
public class StockerDao {

	public static Stocker rechercher(String unMatriculeVisiteur, String unCodeMedicament){
		Stocker unStock=null;

		
		try {
			ResultSet reqSelection = ConnexionMySql.execReqSelection("SELECT * FROM stocker WHERE visiteur ='"+unMatriculeVisiteur+"' AND medicament='"+unCodeMedicament+"'");
			if (reqSelection.next()) {
				unStock = new Stocker(reqSelection.getString(1), reqSelection.getString(2), reqSelection.getInt(3));	
			}
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from stocker where Visiteur ='"+unMatriculeVisiteur+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return unStock;
	}
	
	public static ArrayList<Stocker> retournerCollectionDesStocks(String unMatriculeVisiteur){
		ArrayList<Stocker> collectionDesStocks = new ArrayList<Stocker>();
		Stocker unStock=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from stocker where visiteur = '"+ unMatriculeVisiteur +"'");
		try{
		while (reqSelection.next()) {
			unStock = new Stocker(reqSelection.getString(1), reqSelection.getString(2), reqSelection.getInt(3));	
			collectionDesStocks.add(unStock);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerCollectionDesStocks()");
		}
		return collectionDesStocks;
	}
}



