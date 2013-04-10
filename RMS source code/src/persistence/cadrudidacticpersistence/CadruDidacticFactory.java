package persistence.cadrudidacticpersistence;

import java.util.ArrayList;
import java.util.List;

import model.CadruDidactic;

/**
 * Ofera metode pentru interogarea persistentei, pentru cerere de informatii.
 *
 * @author Mihu Dumitru-Cosmin
 * @version 1.0, 10 aprilie 2013
 */
public class CadruDidacticFactory {

	/**
	 * Metoda intoarece un obiect de tip <code>CdruDidactic</code> din containerul
	 * <code>list</code> care are id-ul <code>id</code>. Daca nu exsita un astfel
	 * de obiectul, metoda returneaza <code>null</code>. 
	 * 
	 * @param id id-ul cadrului didactic cautat
	 * @param list containerul in care se cauta
	 * @return cadrul didactic cu id-ul <code>id</code> daca exista, altfel <code>null</code>
	 * @since version 1.0
	 */
	static CadruDidactic getCadruDidacticById(int id, List<CadruDidactic> list) {
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getId() == id) {
				return list.get(i);
			}
		return null;
	}

	/**
	 * /**
	 * Metoda intoarece un obiect de tip <code>CdruDidactic</code> din containerul
	 * <code>list</code> care are numele <code>nume</code> si prenumele <code>prenume</code>. 
	 * Daca nu exsita un astfel de obiectul, metoda returneaza <code>null</code>. 
	 * 
	 * @param nume numele cadrului didactic cautat
	 * @param prenume prenumele cadrului didactic cautat
	 * @param list containerul in care se cauta
	 * @return cadrul didactic cu numele <code>nume</code> si prenumele <code>prenume</code> daca exista, altfel <code>null</code>
	 * @since version 1.0
	 */
	static CadruDidactic getCadruDidacticByNumeSiPrenume(String nume, String prenume,
			List<CadruDidactic> list) {
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getNume().equals(nume)
					&& list.get(i).getPrenume().equals(prenume)) {
				return list.get(i);
			}
		return null;
	}

	/**
	 * Metoda intoarece un obiect de tip <code>CdruDidactic</code> din containerul
	 * <code>list</code> care are numarul de telefon <code>numarTelefon</code>. Daca nu exsita un astfel
	 * de obiectul, metoda returneaza <code>null</code>. 
	 * 
	 * @param numarTelefon numarul de telefon al cadrului didactic cautat
	 * @param list containerul in care se cauta
	 * @return cadrul didactic cu id-ul  numarul de telefon <code>numarTelefon</code> daca exista, altfel <code>null</code>
	 * @since version 1.0
	 */
	static CadruDidactic getCadruDidacticByNumarTelefon(String numarTelefon,
			List<CadruDidactic> list) {
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getNumarTelefon().equals(numarTelefon)) {
				return list.get(i);
			}
		return null;
	}

	/**
	 * Metoda intoarece un obiect de tip <code>CdruDidactic</code> din containerul
	 * <code>list</code> care are email-ul <code>email</code>. Daca nu exsita un astfel
	 * de obiectul, metoda returneaza <code>null</code>. 
	 * 
	 * @param email email-ul cadrului didactic cautat
	 * @param list containerul in care se cauta
	 * @return cadrul didactic cu email-ul <code>email</code> daca exista, altfel <code>null</code>
	 * @since version 1.0
	 */	
	static CadruDidactic getCadruDidacticByEmail(String email, List<CadruDidactic> list) {
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getEmail().equals(email)) {
				return list.get(i);
			}
		return null;
	}

	/**
	 * Metoda intoarece o lista de obiecte de tip <code>CdruDidactic</code> din containerul
	 * <code>list</code> care au ca si domeniu de interes <code>domeniuInteres</code>. Daca nu exsita un astfel
	 * de obiectul, metoda returneaza o lista goala. 
	 * 
	 * @param domeniuInteres doemniul de interes pe baza caruia se cauta cadele didactice 
	 * @param list containerul in care se cauta
	 * @return lista cu cadre didactice care au ca domeni de interes <code>domeniuInteres</code>
	 * @since version 1.0
	 */	
	/**
	 * 
	 * 
	 * @param domeniuInteres
	 * @param list
	 * @return
	 * @since version 1.0
	 */
	static List<CadruDidactic> getCadruDidacticByDomeniuInteres(String domeniuInteres,
			List<CadruDidactic> list) {
		List<CadruDidactic> cadreDidactice = new ArrayList<CadruDidactic>();
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getDomeniiInteres().contains(domeniuInteres)) {
				cadreDidactice.add(list.get(i));
			}
		return cadreDidactice;
	}

}
