package persistence.echipamentpersistence;

import java.util.ArrayList;
import java.util.List;

import model.Echipament;

/**
 * Ofera metode pentru interogarea persistentei, pentru cerere de informatii.
 * 
 * @author Bucur Claudiu-Robert
 * @version 1.0, 11 aprilie 2013
 */


public class EchipamentFactory {

	/**
	 * Metoda intoarece un obiect de tip <code>Echipament</code> din containerul
	 * <code>list</code> care are id-ul <code>id</code>. Daca nu exsita un
	 * astfel de obiect, metoda returneaza <code>null</code>.
	 * 
	 * @param id
	 *            id-ul echipamentului cautat
	 * @param list
	 *            containerul in care se cauta
	 * @return sala cu id-ul <code>id</code> daca exista, altfel
	 *         <code>null</code>
	 * @since version 1.0
	 */
	static Echipament getEchipamentById(int id, List<Echipament> list) {
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getId() == id) {
				return list.get(i);
			}
		return null;
	}
	
	
	

	/**
	 * /** Metoda intoarece o lista cu elemente de tip <code>Echipament</code> din
	 * containerul <code>list</code> care au tipul <code>tipEchipament</code>.
	 * Daca nu exsita un astfel de obiect, metoda returneaza <code>null</code>.(lista vida)
	 * 
	 * @param tipEchipament
	 *           tipul echipamentului pe care il cautam
	 * @param list
	 *            containerul in care se cauta
	 * @return lista echipamentelor care au tipul <code>tipEchipament</code> daca exista,
	 *  altfel <code>null</code>
	 * @since version 1.0
	 */
	static List<Echipament> getEchipamentByTip(String tipEchipament, List<Echipament> list) {
		List<Echipament> listaRezultat = new ArrayList<Echipament>();
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getTipEchipament().equals(tipEchipament)) {
				listaRezultat.add(list.get(i));
			}
		return null;
	}
	
	
	/**
	 * /** Metoda intoarece o lista cu elemente de tip <code>Echipament</code> din
	 * containerul <code>list</code> care au modelul <code>modelEchipament</code>.
	 * Daca nu exsita un astfel de obiect, metoda returneaza <code>null</code>.(lista vida)
	 * 
	 * @param modelEchipament
	 *           modelul echipamentului pe care il cautam
	 * @param list
	 *            containerul in care se cauta
	 * @return lista echipamentelor care au tipul <code>tipEchipament</code> daca exista,
	 *  altfel <code>null</code>
	 * @since version 1.0
	 */
	static List<Echipament> getEchipamentByModel(String modelEchipament, List<Echipament> list) {
		List<Echipament> listaRezultat = new ArrayList<Echipament>();
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getModelEchipament().equals(modelEchipament)) {
				listaRezultat.add(list.get(i));
			}
		return null;
	}
	
	
}
