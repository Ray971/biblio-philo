package Dao;

import java.util.Calendar;
import java.util.GregorianCalendar;

import metier.EnumStatusExemplaire;
import metier.Exemplaire;


public class ExemplaireDao {

	private static Exemplaire [] ExemplaireDB=
		{
			new Exemplaire(1,new GregorianCalendar(1990,Calendar.APRIL,27).getTime(),"isbn",EnumStatusExemplaire.DISPONIBLE),
			new Exemplaire(2,new GregorianCalendar(1990,Calendar.MAY,5).getTime(),"isbn2",EnumStatusExemplaire.DISPONIBLE),
			new Exemplaire(3,new GregorianCalendar(1990,Calendar.MAY,5).getTime(),"isbn3",EnumStatusExemplaire.DISPONIBLE),
			new Exemplaire(4,new GregorianCalendar(1990,Calendar.MAY,5).getTime(),"isbn4",EnumStatusExemplaire.DISPONIBLE),
			new Exemplaire(5,new GregorianCalendar(1964,Calendar.JUNE,10).getTime(),"isbn5",EnumStatusExemplaire.DISPONIBLE),
			new Exemplaire(6,new GregorianCalendar(1990,Calendar.JUNE,10).getTime(),"isbn6",EnumStatusExemplaire.DISPONIBLE),
			new Exemplaire(7,new GregorianCalendar(1990,Calendar.JUNE,10).getTime(),"isbn7",EnumStatusExemplaire.DISPONIBLE),
			new Exemplaire(8,new GregorianCalendar(2005,Calendar.JUNE,10).getTime(),"isbn8",EnumStatusExemplaire.DISPONIBLE),
			new Exemplaire(9,new GregorianCalendar(1990,Calendar.JUNE,10).getTime(),"isbn9",EnumStatusExemplaire.DISPONIBLE),
			new Exemplaire(10,new GregorianCalendar(1975,Calendar.OCTOBER,15).getTime(),"isbn10",EnumStatusExemplaire.DISPONIBLE),
			new Exemplaire(11,new GregorianCalendar(1990,Calendar.DECEMBER,1).getTime(),"isbn11",EnumStatusExemplaire.DISPONIBLE),
			new Exemplaire(12,new GregorianCalendar(1986,Calendar.MARCH,7).getTime(),"isbn12",EnumStatusExemplaire.DISPONIBLE),
			new Exemplaire(13,new GregorianCalendar(1984,Calendar.DECEMBER,1).getTime(),"isbn13",EnumStatusExemplaire.DISPONIBLE),
			new Exemplaire(14,new GregorianCalendar(2010,Calendar.MARCH,7).getTime(),"isbn14",EnumStatusExemplaire.DISPONIBLE)
		};
	
	
	public static Exemplaire findByKey(int id) {
		
		for(Exemplaire exemplaire:ExemplaireDB)
			if((exemplaire.getIdExemplaire()==id)) return exemplaire;
					
			return null;
		}
	
	
}
