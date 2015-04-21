package test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import Dao.ExemplaireDao;
import Dao.UtilisateurDao;
import metier.BiblioException;
import metier.Exemplaire;
import metier.Utilisateur;

public class TestAdherentEnRetard {

	public static void main(String[] args) {
		
		System.out.println("\n********************");
		System.out.println("TestAdherentEnRetard");
		System.out.println("********************");
		System.out.println("L'utilisateur 'Adherent' suivant à emprunter un exemplaire le 20 Fevrier 2015,puis il tente de faire un autre Emprunt le 9 avril 2015");
		
		Utilisateur ad1=UtilisateurDao.findByKey(3);
		Exemplaire ex1=ExemplaireDao.findByKey(3); //récupération d'un exemplaire dans la DAO(id=3)
		Exemplaire ex2=ExemplaireDao.findByKey(4); //récupération d'un exemplaire dans la DAO(id=4)
		
		try {
			ad1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.FEBRUARY,20).getTime(), ex1);
			ad1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,9).getTime(), ex2);
		} 
		catch (BiblioException e) {
			
			e.printStackTrace();
		}
		System.out.println(ad1); // affichage de l'adhérent (id=3)
		
		

	}

}
