package test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import Dao.ExemplaireDao;
import metier.Adherent;
import metier.BiblioException;
import metier.Employe;
import metier.EmpruntEnCours;
import metier.EmpruntArchive;
import metier.EnumcategorieEmploye;
import metier.Exemplaire;
import metier.Utilisateur;
		
		
public class TestBiblioMe {
		
				public static void main(String[]args) {
				
			/*	Utilisateur util1=new Utilisateur(007,"permis de tuer","James BOND");
				System.out.println("Creation du user :"+util1);
				ExemplaireDao Dexemp=new ExemplaireDao();
							
				EmpruntEnCours ea1=new EmpruntEnCours((new GregorianCalendar(2015,Calendar.APRIL,27).getTime()),null,util1);
				ea1.setEmp1(Dexemp.findByKey(3));
				ea1.setEmp1(Dexemp.findByKey(4));
				ea1.setEmp1(Dexemp.findByKey(7));
			
				System.out.println(ea1);
				
				EmpruntArchive empa=new EmpruntArchive(ea1);
								
				System.out.println(empa);*/
				
				Adherent a1 = new Adherent("edf","jlde",(new GregorianCalendar(2015,Calendar.APRIL,27).getTime()),"tfs","06106525241",12,"hdsh","kshkj");
				Adherent a2 = new Adherent("edf","jlde",(new GregorianCalendar(2015,Calendar.APRIL,27).getTime()),"tfs","06106525241",12,"hdsh","kshkj");
				Adherent a3 = new Adherent ("edf","jlde",(new GregorianCalendar(2015,Calendar.APRIL,27).getTime()),"tfs",null,12,"hdsh","kshkj");
				Adherent a4 = new Adherent ("edf","jlde",(new GregorianCalendar(2015,Calendar.APRIL,27).getTime()),"tfs",null,115,"hdsh","kshkj");
				
				System.out.println("<<Adherent>>\n" + a1);
				
				
				Utilisateur U1 = new Utilisateur ("aaa","jlde",(new GregorianCalendar(2015,Calendar.APRIL,27).getTime()),"tfs",12,"hdsh","kshkj");
				
				Employe E1 = new Employe ("edf","jlde",(new GregorianCalendar(2015,Calendar.APRIL,27).getTime()),"tfs",12,"hdsh","kshkj","fsedf",EnumcategorieEmploye.BIBLIOTHECAIRE);
				Employe E2 = new Employe ("edf","jlde",(new GregorianCalendar(2015,Calendar.APRIL,27).getTime()),"tfs",12,"hdsh","kshkj","fsedf",EnumcategorieEmploye.BIBLIOTHECAIRE);
				
				System.out.println("<<Employé>>\n" + E1);
				System.out.println("<<Utilisateur>>\n" + U1);
				
				ExemplaireDao Dexemp=new ExemplaireDao();
				Exemplaire exemplaire3=Dexemp.findByKey(8);
				
			
				
				try {
					a1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,4).getTime(), exemplaire3);
					a1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,4).getTime(), exemplaire3);
					a1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,4).getTime(), exemplaire3);
					a1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,4).getTime(), exemplaire3);
					a1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,4).getTime(), exemplaire3);
					
				} catch (BiblioException e) {
					
					e.printStackTrace();
				}
				
				
				try {
				E1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.MARCH,4).getTime(), exemplaire3);
				E1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,4).getTime(), exemplaire3);
				E1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,4).getTime(), exemplaire3);
				E1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,4).getTime(), exemplaire3);
				
				} catch (BiblioException e) {
					
					e.printStackTrace();
				}
				
				
				System.out.println("test :" + a1.getNbRetards());
				System.out.println("<<Utilisateur>>\n" + a1);
				System.out.println("<<Employé e1>> \n" + E1);
				
				try {
					a2.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.MARCH,27).getTime(), exemplaire3);
					//a2.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,4).getTime(), exemplaire3);
					//a2.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,4).getTime(), exemplaire3);
					//a2.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,4).getTime(), exemplaire3);
					//a2.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,4).getTime(), exemplaire3);
				} catch (BiblioException e) {
				
					e.printStackTrace();
				}
				
				System.out.println("\nretard pour a2 : " + a2.getNbRetards());
				//System.out.println("retard pour a2 : " + a2.);
		
			
				System.out.println("\ncondition Adherent 2 : " + a2.isConditionsPretAcceptees());
				System.out.println("\ncondition Adherent 3 : " + a3.isConditionsPretAcceptees());
				
				System.out.println(a2);
				System.out.println("\n" + a4);
				
				System.out.println("condition de pret pour a4 : " + a4.isConditionsPretAcceptees());
				
				System.out.println(E1);
				
			

	}

}