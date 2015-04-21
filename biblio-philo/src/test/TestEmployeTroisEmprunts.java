package test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import metier.BiblioException;
import metier.Exemplaire;
import metier.Utilisateur;
import Dao.ExemplaireDao;
import Dao.UtilisateurDao;

public class TestEmployeTroisEmprunts {

	public static void main(String[] args) {
		
		System.out.println("\n************************");
		System.out.println("TestEmployeTroisEmprunt");
		System.out.println("************************");
		System.out.println("L'utilisateur 'Employe' suivant veut emprunter 4 livres");
		
		Utilisateur em1=UtilisateurDao.findByKey(6); //Demande d'un utilisateur Employe.
		Exemplaire ex1=ExemplaireDao.findByKey(11); //récupération d'un exemplaire dans la DAO(id=11)
		Exemplaire ex2=ExemplaireDao.findByKey(12); //récupération d'un exemplaire dans la DAO(id=12)
		Exemplaire ex3=ExemplaireDao.findByKey(13); //récupération d'un exemplaire dans la DAO(id=13)
		Exemplaire ex4=ExemplaireDao.findByKey(14); //récupération d'un exemplaire dans la DAO(id=14)
		
		try {
			em1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,8).getTime(), ex1);
			em1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,8).getTime(), ex2);
			em1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,8).getTime(), ex3);
			em1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,8).getTime(), ex4);
		} 
		catch (BiblioException e) {
			
			e.printStackTrace();
		}
		System.out.println(em1); // affichage d'un employe (id=6)
		
	}

}
