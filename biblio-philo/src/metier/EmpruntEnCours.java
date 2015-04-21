package metier;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EmpruntEnCours {
	
	private Date dateEmprunt;
	private Date dateRestitutionEff=null;
	private Exemplaire exemplaire;
	private EnumStatusExemplaire status;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	private static ArrayList<EmpruntEnCours> emp1=new ArrayList<EmpruntEnCours>();
	private int idUtilisateur;
	EmpruntArchive empruntarch;

	public EmpruntEnCours(){

		}
	
	public EmpruntEnCours(Date dateEmprunt,Exemplaire exemplaire){

		this.dateEmprunt=dateEmprunt;
		this.dateRestitutionEff=null;
		exemplaire.setStatus(EnumStatusExemplaire.PRETE);
		this.exemplaire=exemplaire;
		
		}
	
	public void setRetourEmprunt(Utilisateur utilisateur,int idExemplaire){
		
		for(EmpruntEnCours e:utilisateur.getEmpruntEncours())
		{
			if(e.getExemplaire().getIdExemplaire()==idExemplaire){
				
				e.getExemplaire().setStatus(EnumStatusExemplaire.DISPONIBLE); // Modification du status (l'exemplaire est rendu disponible)
					
					
				utilisateur.getEmpruntEncours().remove(e); // l'exemplaire est supprimÃ© de la liste des emprunt de l'utilisateur
				utilisateur.setNbEmpruntsEnCours();
				
				empruntarch=new EmpruntArchive(e,utilisateur.getIdUtilisateur()); 
				empruntarch.setEmpruntArchive();
				
				e=null; // Emprunt en cours est Garbage collecté;
			
			}
		}			
	}
	
	
	public EnumStatusExemplaire getStatus() {
		return status;
	}
	
	public ArrayList<EmpruntEnCours> getListEmpruntEncours(){
			
			return emp1;
		}
		
	public Exemplaire getExemplaire() {
		return exemplaire;
	}	
	
	public Date getDateEmprunt() {
		return dateEmprunt;
	}

	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	
	public void setListEmpruntEncours(int idUtilisateur){
	
		this.idUtilisateur=idUtilisateur;
		emp1.add(this);

	}
	public void setStatus(EnumStatusExemplaire status) {
		this.status = status;
	}

	public void setExemplaire(Exemplaire exemplaire) {
			this.exemplaire = exemplaire;
		}
	
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public Date getDateRestitutionEff() {
		return dateRestitutionEff;
	}

	
	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
		
	}

	public void setDateRestitutionEff(Date dateRestitutionEff) {
			this.dateRestitutionEff = dateRestitutionEff;
		}

	@Override
	public String toString() {
		
	
		return  "\tdate de l'emprunt:" + sdf.format(dateEmprunt)+ " --- "+this.exemplaire+"\n";
		
	}

}
