package metier;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public class EmpruntArchive {

	private Date dateEmprunt;
	private Date dateRestitutionEff;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	private Exemplaire exemplaire;
	private int idUtilisateur;
	private static ArrayList<EmpruntArchive> Archive;
	
	
	public EmpruntArchive(){
		
	}
	
	public EmpruntArchive(EmpruntEnCours emprunt,int idUtilisateur) {
		
		this.idUtilisateur=idUtilisateur;
		this.dateEmprunt=emprunt.getDateEmprunt();
		this.exemplaire=emprunt.getExemplaire();
		this.dateRestitutionEff=new GregorianCalendar().getTime();
	}
	
	public void setEmpruntArchive() {
		
		Archive=new ArrayList<EmpruntArchive>();
		Archive.add(this);
			
	}

	public Date getDateEmprunt() {
		return dateEmprunt;
	}

	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	public static ArrayList<EmpruntArchive> getArchive() {
		return Archive;
	}

	public static void setArchive(ArrayList<EmpruntArchive> archive) {
		Archive = archive;
	}

	@Override
	public String toString() {
		
		return "Id de l'emprunteur: "+idUtilisateur +", Date d'emprunt:"+sdf.format(dateEmprunt)+", Id de l'exemplaire: "+exemplaire.getIdExemplaire()+ ", ISBN:"+exemplaire.getIsbn() +", Date de restitution effective:"+sdf.format(this.dateRestitutionEff)+"\n";
	}

	
	
}
