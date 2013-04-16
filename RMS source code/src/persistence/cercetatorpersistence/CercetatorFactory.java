package persistence.cercetatorpersistence;

import java.util.ArrayList;
import java.util.List;

import model.Cercetator;

/**
 * @author Nagy Istvan
 * @version 1.0, 16 aprilie 2013
 *
 */

public class CercetatorFactory {

	/**
	 * Metoda intoarece un obiect de tip <code>Cercetator</code> din containerul
	 * <code>list</code> care are id-ul <code>id</code>. Daca nu exsita un astfel
	 * de obiect, metoda returneaza <code>null</code>. 
	 * 
	 * @param id id-ul cercetatorului cautat
	 * @param list containerul in care se cauta
	 * @return <code>Cercetator</code> cu id-ul <code>id</code> daca exista, altfel <code>null</code>
	 * @since version 1.0
	 */
	static Cercetator getCercetatorById(int id, List<Cercetator> list) {
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getId() == id) {
				return list.get(i);
			}
		return null;
	}

	/**
	 * Metoda intoarece un obiect de tip <code>Cercetator</code> din containerul
	 * <code>list</code> care are numele <code>nume</code> si prenumele <code>prenume</code>. 
	 * Daca nu exsita un astfel de obiect, metoda returneaza <code>null</code>. 
	 * 
	 * @param nume numele cercetatorului cautat
	 * @param prenume prenumele cercetatorului cautat
	 * @param list containerul in care se cauta
	 * @return <code>Cercetator</code> cu numele <code>nume</code> si prenumele <code>prenume</code> daca exista, altfel <code>null</code>
	 * @since version 1.0
	 */
	static Cercetator getCercetatorByNumeSiPrenume(String nume, String prenume,
			List<Cercetator> list) {
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getNume().equals(nume)
					&& list.get(i).getPrenume().equals(prenume)) {
				return list.get(i);
			}
		return null;
	}

	/**
	 * Metoda intoarece un obiect de tip <code>Cercetator</code> din containerul
	 * <code>list</code> care are numarul de telefon <code>numarTelefon</code>. Daca nu exsita un astfel
	 * de obiectul, metoda returneaza <code>null</code>. 
	 * 
	 * @param numarTelefon numarul de telefon al cercetatorului cautat
	 * @param list containerul in care se cauta
	 * @return <code>cercetatorul</code> cu id-ul  numarul de telefon <code>numarTelefon</code> daca exista, altfel <code>null</code>
	 * @since version 1.0
	 */
	static Cercetator getCercetatorByNumarTelefon(String numarTelefon,
			List<Cercetator> list) {
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getNumarTelefon().equals(numarTelefon)) {
				return list.get(i);
			}
		return null;
	}

	/**
	 * Metoda intoarece un obiect de tip <code>Cercetator</code> din containerul
	 * <code>list</code> care are email-ul <code>email</code>. Daca nu exsita un astfel
	 * de obiectul, metoda returneaza <code>null</code>. 
	 * 
	 * @param email email-ul cercetatorului cautat
	 * @param list containerul in care se cauta
	 * @return <code>cercetatorul</code> cu email-ul <code>email</code> daca exista, altfel <code>null</code>
	 * @since version 1.0
	 */	
	static Cercetator getCercetatorByEmail(String email, List<Cercetator> list) {
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getEmail().equals(email)) {
				return list.get(i);
			}
		return null;
	}

	/**
	 * Metoda intoarece o lista de obiecte de tip <code>Cercetator</code> din containerul
	 * <code>list</code> care au ca si domeniu de interes <code>domeniuInteres</code>. Daca nu exsita un astfel
	 * de obiectul, metoda returneaza o lista goala. 
	 * 
	 * @param <code>domeniuInteres</code> doemniul de interes pe baza caruia se cauta cercetatorii
	 * @param list containerul in care se cauta
	 * @return lista cu cercetatorii care au ca domeniu de interes <code>domeniuInteres</code>
	 * @since version 1.0
	 */	

	static List<Cercetator> getCercetatoriByDomeniuInteres(String domeniuInteres,
			List<Cercetator> list) {
		List<Cercetator> cercetatori = new ArrayList<Cercetator>();
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getDomeniiInteres().contains(domeniuInteres)) {
				cercetatori.add(list.get(i));
			}
		return cercetatori;
	}
	
}
