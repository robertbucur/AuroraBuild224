package persistence.salapersistence;

import java.util.List;

import model.Sala;

/**
 * Ofera metode pentru interogarea persistentei, pentru cerere de informatii.
 * 
 * @author Bucur Claudiu-Robert
 * @version 1.0, 10 aprilie 2013
 */

public class SalaFactory {

	/**
	 * Metoda intoarece un obiect de tip <code>Sala</code> din containerul
	 * <code>list</code> care are id-ul <code>id</code>. Daca nu exsita un
	 * astfel de obiect, metoda returneaza <code>null</code>.
	 * 
	 * @param id
	 *            id-ul salii cautate
	 * @param list
	 *            containerul in care se cauta
	 * @return sala cu id-ul <code>id</code> daca exista, altfel
	 *         <code>null</code>
	 * @since version 1.0
	 */
	static Sala getSalaById(int id, List<Sala> list) {
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getId() == id) {
				return list.get(i);
			}
		return null;
	}
	
	
	

	/**
	 * /** Metoda intoarece un obiect de tip <code>Sala</code> din
	 * containerul <code>list</code> care are codul <code>codSala</code>.
	 * Daca nu exsita un astfel de obiect, metoda returneaza <code>null</code>.
	 * 
	 * @param codSala
	 *           codul salii pe care o cautam
	 * @param list
	 *            containerul in care se cauta
	 * @return sala cu codul <code>codSala</code> daca exista, altfel <code>null</code>
	 * @since version 1.0
	 */
	static Sala getSalaByCodSala(String codSala, List<Sala> list) {
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getCodSala().equals(codSala)) {
				return list.get(i);
			}
		return null;
	}
	
	
	
	

}
