package test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import Dao.ExemplaireDao;
import Dao.UtilisateurDao;
import metier.BiblioException;
import metier.Exemplaire;
import metier.Utilisateur;

public class TestAdherentTroisEmprunts {

	public static void main(String[] args) {

		System.out.println("\n**************************");
		System.out.println("TestAdherentTroisEmprunt");
		System.out.println("************************");
		System.out.println("L'utilisateur 'Adhérent' suivant veut emprunter 4 livres");
		
		Utilisateur ad1=UtilisateurDao.findByKey(2); //Demande d'un utilisateur Adherent.
		Exemplaire ex1=ExemplaireDao.findByKey(7); //récupération d'un exemplaire dans la DAO(id=7)
		Exemplaire ex2=ExemplaireDao.findByKey(8); //récupération d'un exemplaire dans la DAO(id=8)
		Exemplaire ex3=ExemplaireDao.findByKey(9); //récupération d'un exemplaire dans la DAO(id=9)
		Exemplaire ex4=ExemplaireDao.findByKey(10); //récupération d'un exemplaire dans la DAO(id=10)
		
		try {
			ad1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,8).getTime(), ex1);
			ad1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,8).getTime(), ex2);
			ad1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,8).getTime(), ex3);
			ad1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,8).getTime(), ex4);
		} 
		catch (BiblioException e) {
			
			e.printStackTrace();
		}
		System.out.println(ad1); // affichage d'un employe (id=4)

	}

}
