package gsb.modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import gsb.modele.Localite;
import gsb.modele.Medecin;
import gsb.modele.Visiteur;

public class VisiteurDao {
	
	public static Visiteur rechercher(String matricule){
		Visiteur unVisiteur=null;
		Localite uneLocalite= null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from Visiteur where Matricule ='"+matricule+"'");
		try {
			if (reqSelection.next()) {
				uneLocalite = LocaliteDao.rechercher(reqSelection.getString(7));
				unVisiteur = new Visiteur(reqSelection.getString(1), reqSelection.getString(2), reqSelection.getString(3), reqSelection.getString(4), reqSelection.getString(5), reqSelection.getString(6), uneLocalite, reqSelection.getString(8), reqSelection.getString(9), reqSelection.getString(10));	
			}
		}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from Visiteur where Matricule ='"+matricule+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return unVisiteur;
	}
	
	public static ArrayList<Visiteur> retournerCollectionDesVisiteurs(){
		ArrayList<Visiteur> collectionDesVisiteurs = new ArrayList<Visiteur>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select MATRICULE from Visiteur");
		try{
		while (reqSelection.next()) {
			String matricule = reqSelection.getString(1);
			collectionDesVisiteurs.add(VisiteurDao.rechercher(matricule));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur collectionDesVisiteurs()");
		}
		return collectionDesVisiteurs;
	}

}
