package gsb.modele;

public class Stocker {

	protected int qteStock;
	public String unMatriculeVisiteur;
	public String unCodeMedicament;
	
	public Stocker(String unMatriculeVisiteur, String unCodeMedicament,int qteStock) {
		super();
		this.unMatriculeVisiteur = unMatriculeVisiteur;
		this.unCodeMedicament = unCodeMedicament;
		this.qteStock = qteStock;
	}

	public int getQteStock() {
		return qteStock;
	}

	public void setQteStock(int qteStock) {
		this.qteStock = qteStock;
	}

	public String getUnMatriculeVisiteur() {
		return unMatriculeVisiteur;
	}

	public void setUnMatriculeVisiteur(String unMatriculeVisiteur) {
		this.unMatriculeVisiteur = unMatriculeVisiteur;
	}

	public String getUnCodeMedicament() {
		return unCodeMedicament;
	}

	public void setUnCodeMedicament(String unCodeMedicament) {
		this.unCodeMedicament = unCodeMedicament;
	}
	

	
}
