package test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import metier.BiblioException;
import metier.Exemplaire;
import metier.Utilisateur;
import Dao.ExemplaireDao;
import Dao.UtilisateurDao;

public class TestEmployeEnRetard {

	public static void main(String[] args) {
	
		System.out.println("\n********************");
		System.out.println("TestEmployeEnRetard");
		System.out.println("********************");
		System.out.println("L'utilisateur 'Employé' suivant à emprunter un exemplaire le 21 Fevrier 2015,puis il tente de faire un autre Emprunt le 8 avril 2015");
		
		Utilisateur em1=UtilisateurDao.findByKey(5); //Demande d'un utilisateur Employe.
		Exemplaire ex1=ExemplaireDao.findByKey(5); //récupération d'un exemplaire dans la DAO(id=5)
		Exemplaire ex2=ExemplaireDao.findByKey(6); //récupération d'un exemplaire dans la DAO(id=6)
		
		try {
			em1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.FEBRUARY,21).getTime(), ex1);
			em1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,8).getTime(), ex2);
		} 
		catch (BiblioException e) {
			
			e.printStackTrace();
		}
		System.out.println(em1); // affichage d'un employe (id=5)

	}

}
