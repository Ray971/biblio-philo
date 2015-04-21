package test;


import java.util.Calendar;
import java.util.GregorianCalendar;

import metier.BiblioException;
import metier.Exemplaire;
import metier.Utilisateur;
import Dao.ExemplaireDao;
import Dao.UtilisateurDao;

public class TestDeBase {

	public static void main(String[] args) {
		
		//Instanciation de ExemplaireDao
		ExemplaireDao Dexemp=new ExemplaireDao();
		UtilisateurDao utilisateur=new UtilisateurDao(); 
		
		
		System.out.println("\n**********************************************");
		System.out.println("Demande de deux exemplaires par leur id aux Dao:");
		System.out.println("************************************************");
		
		Exemplaire ex1=ExemplaireDao.findByKey(1); //récupération d'un exemplaire dans la DAO(id=3)
		Exemplaire ex2=ExemplaireDao.findByKey(2); //récupération d'un exemplaire dans la DAO(id=7)
		System.out.println(ex1); // affichage d'un exemplaire 
		System.out.println(ex2); // affichage du deuxieme exemplaire 
		
		System.out.println("\n****************************************");
		System.out.println("Demande d'un adhérent par leur id aux Dao:");
		System.out.println("******************************************");
		
		Utilisateur ad1 = UtilisateurDao.findByKey(1);
		System.out.println(ad1); // affichage d'un adhérent (id=1)
		
		System.out.println("\n*****************************************");
		System.out.println("Demande d'un employé par leur id aux Dao:");
		System.out.println("*****************************************");
		
		Utilisateur em2=utilisateur.findByKey(4);
		System.out.println(em2); // affichage d'un employé (id=4)
		
		System.out.println("\n************************************************");
		System.out.println("Creation d'un emprunt en cours pour un Adherent:");
		System.out.println("************************************************");
		
		try {
			ad1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,10).getTime(), ex1); // Enregistrement d'un emprunt
		} 
		catch (BiblioException e2) {
			e2.printStackTrace();
		}
		
		System.out.println("\n*************************************************************");
		System.out.println("Affichage de l'utilisateur Adherent avec un emprunt en cours:");
		System.out.println("*************************************************************");
		
		System.out.println(ad1); //Affichage adherent id=1
		
		System.out.println("\n***********************************************");
		System.out.println("Creation d'un emprunt en cours pour un Employe:");
		System.out.println("***********************************************");
		
		try {
			em2.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,7).getTime(), ex2); // Enregistrement d'un emprunt
		} 
		catch (BiblioException e1) {
			
			e1.printStackTrace();
		}
		
		System.out.println("\n************************************************************");
		System.out.println("Affichage de l'utilisateur Employe avec un emprunt en cours:");
		System.out.println("************************************************************");
		
		System.out.println(em2); // Affichage employé id=4
		
		
	}

}
