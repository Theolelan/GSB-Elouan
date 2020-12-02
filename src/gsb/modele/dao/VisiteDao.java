package gsb.modele.dao;

import java.sql.ResultSet;


import gsb.modele.Medecin;
import gsb.modele.Visite;
import gsb.modele.Visiteur;

public class VisiteDao {
	
	public static Visite rechercher(String reference){
		Visiteur unVisiteur=null;
		Visite uneVisite= null;
		Medecin unMedecin= null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from Visite where reference ='"+reference+"'");
		try {
			if (reqSelection.next()) {
				unVisiteur = VisiteurDao.rechercher(reqSelection.getString(4));
				unMedecin = MedecinDao.rechercher(reqSelection.getString(5));
				uneVisite = new Visite(reqSelection.getString(1), reqSelection.getString(2), reqSelection.getString(3), unVisiteur, unMedecin);	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from Visite where reference ='"+reference+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return uneVisite;
	}
	
	public static int creer(Visite uneVisite) {
		String requeteInsertion;
		String reference = uneVisite.getReference();
		String date = uneVisite.getDate();
		String commentaire = uneVisite.getCommentaire();
		Visiteur unVisiteur = uneVisite.getUnVisiteur();
		Medecin unMedecin = uneVisite.getUnMedecin();
		requeteInsertion ="insert into Formation values ('" + reference + "','" + date + "','" + commentaire + "','" + unVisiteur + "','" + unMedecin + "')";
		int result = ConnexionMySql.execReqMaj(requeteInsertion);
		ConnexionMySql.fermerConnexionBd();
		return result;
	}

}
