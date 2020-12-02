package gsb.tests.dao;

import gsb.modele.Medicament;
import gsb.modele.Stocker;
import gsb.modele.dao.MedicamentDao;
import gsb.modele.dao.StockerDao;

public class MedicamentDaoTest {
	
	public static void main(String[] args) {
		
		Medicament unMedicament = MedicamentDao.rechercher("TRIMYCINE");
		System.out.println(unMedicament.getCodeFamille() + unMedicament.getContreIndication()+unMedicament.getEffets());
	
	}

}
