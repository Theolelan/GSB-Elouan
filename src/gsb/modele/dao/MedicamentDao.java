package gsb.modele.dao;

import java.sql.ResultSet;


import gsb.modele.Medicament;


public class MedicamentDao {
	public static Medicament rechercher(String nomCommercial){
		Medicament unMedicament=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from MEDICAMENT where MED_NOMCOMMERCIAL ='"+nomCommercial+"'");
		try {
			if (reqSelection.next()) {
				unMedicament = new Medicament(reqSelection.getString(1), reqSelection.getString(2), reqSelection.getString(3), reqSelection.getString(4),reqSelection.getString(5),reqSelection.getFloat(6), reqSelection.getString(7), reqSelection.getString(8));	
			};
		}
	catch(Exception e) {
		System.out.println("erreur reqSelection.next() pour la requête - select * from MEDECIN where MED_NOMCOMMERCIAL ='"+nomCommercial+"'");
		e.printStackTrace();
		}
	ConnexionMySql.fermerConnexionBd();
	return unMedicament;
}


public static void creer(Medicament unMedicament) {
	String requeteInsertion;
	String depoLegal = unMedicament.getDepotLegal();
	String nomCommercial = unMedicament.getNomCommercial();
	String composition = unMedicament.getComposition();
	String effets = unMedicament.getEffets();
	String contreIndications = unMedicament.getContreIndication();
	float prixEchantillon = unMedicament.getPrixEchantillon();
	String codeFamille = unMedicament.getCodeFamille();
	String libelleFamille = unMedicament.getLibellefamille();
	
	try {
		requeteInsertion ="insert into Formation values ('" + depoLegal + "','" + nomCommercial + "','" + composition + "','" + effets + "','" + contreIndications + "','"+ prixEchantillon +"','" + codeFamille  + "','" + libelleFamille +"')";
	}
	
	catch(Exception e) {
		e.printStackTrace();
		System.out.println("ERREUR REQUETE : insert into Formation values ('\" + depoLegal + \"','\" + nomCommercial + \"','\" + composition + \"','\" + effets + \"','\" + contreIndications + \"','\"+ prixEchantillon +\"','\" + codeFamille  + \"','\" + libelleFamille +\"')\"; ");
		
	}
	ConnexionMySql.fermerConnexionBd();

}
}