package metier;


import java.util.ArrayList;
import java.util.Date;


public class Utilisateur extends Personne{
	
/**************************************************Attributes*********************************************/
	private int idUtilisateur;
	private String pwd;
	private String pseudonyme;
	private int NbEmpruntsEnCours;
	private ArrayList<EmpruntEnCours> EmpruntEncours=new ArrayList<EmpruntEnCours>();
	

/*************************************************Constructors********************************************/
	public Utilisateur (){
		
	}
	
	public Utilisateur(String nom, String prenom, Date dateNaissance, String sexe,int idUtilisateur, String pwd, String pseudonyme) {
		super(nom,prenom,dateNaissance,sexe);
		this.idUtilisateur = idUtilisateur;
		this.pwd = pwd;
		this.pseudonyme = pseudonyme;
	}
/***************************************************Accesseurs***********************************************/
	public int getNbRetards(){
		return 0;
	}
	
	public boolean isConditionsPretAcceptees(){
		return true;
	}
	
	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	public String getPwd() {
		return pwd;
	}
	public String getPseudonyme() {
		return pseudonyme;
	}
	
	public int getNbEmpruntsEnCours() {
		return NbEmpruntsEnCours;
	}
	
/****************************************************Mutators*************************************************/
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setPseudonyme(String pseudonyme) {
		this.pseudonyme = pseudonyme;
	}
	
public void setNbEmpruntsEnCours() {
		NbEmpruntsEnCours=0;
	for(EmpruntEnCours e:this.EmpruntEncours)
		NbEmpruntsEnCours += 1;
	
	}

public void setRetourEmprunt(int idExemplaire){
	
	EmpruntEnCours emp2=new EmpruntEnCours();
	emp2.setRetourEmprunt(this, idExemplaire);
	
}

	public void setEmpruntEnCours(Date date,Exemplaire exemplaire) throws BiblioException {
	
			if(this.isConditionsPretAcceptees()){
			
			EmpruntEnCours emp=new EmpruntEnCours(date,exemplaire);
			EmpruntEncours.add(emp);
			this.setNbEmpruntsEnCours();
			emp.setListEmpruntEncours(this.idUtilisateur);
			
			}
			else
			{
				if(this.NbEmpruntsEnCours==3)
				throw new BiblioException("Cet Adherent ne peut plus emprunter.Il a déjà emprunter 3 exemplaires(s)");	
			
				if(this.getNbRetards()!=0)
				throw new BiblioException("Cet Adherent ne peut pas emprunter.Il a "+this.getNbRetards()+" exemplaires(s) en retard");
			}
	}
	
public ArrayList<EmpruntEnCours> getEmpruntEncours() {
		return EmpruntEncours;
	}



/**************************************************************************************************************/
	
	@Override
	public String toString() {
	return super.toString() + "\nidUtilisateur : " + idUtilisateur + "\nMot de passe : " + pwd + "\nPseudonyme : " + pseudonyme;
	}
	
/**************************************************************************************************************/


	
	
	
	
	
	
	
	
	
	
	

}
