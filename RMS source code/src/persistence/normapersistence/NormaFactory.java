package persistence.normapersistence;

import java.util.ArrayList;
import java.util.List;
import model.Norma;

public class NormaFactory {
	
	/**
	 * Metoda intoarece un obiect de tip <code>Norma</code> din containerul
	 * <code>list</code> care are id-ul <code>id</code>. Daca nu exsita un astfel
	 * de obiectul, metoda returneaza <code>null</code>. 
	 * 
	 * @param id id-ul normei cautate cautat
	 * @param list containerul in care se cauta
	 * @return norma cu id-ul <code>id</code> daca exista, altfel <code>null</code>
	 * @since version 1.0
	 */
	static Norma getNormaById(int id, List<Norma> list) {
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getId() == id) {
				return list.get(i);
			}
		return null;
	}
	
	
	
	 /** Metoda intoarece o lista cu elemente de tip <code>Norma</code> din
	 * containerul <code>list</code> care au numarul de ore curs<code>oreCurs</code>.
	 * Daca nu exsita un astfel de obiect, metoda returneaza <code>null</code>.(lista vida)
	 * 
	 * @param oreCurs
	 *           cate ore de curs sa aiba norma pe care o cautam
	 * @param list
	 *            containerul in care se cauta
	 * @return lista normelor care au numearul de ore de curs <code>oreCurs</code> daca exista,
	 *  altfel <code>null</code>
	 * @since version 1.0
	 */
	static List<Norma> getNormaByOreCurs(int oreCurs, List<Norma> list) {
		List<Norma> listaRezultat = new ArrayList<Norma>();
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getOreCurs() == oreCurs) {
				listaRezultat.add(list.get(i));
			}
		return null;
	}
	
	
	/** Metoda intoarece o lista cu elemente de tip <code>Norma</code> din
	 * containerul <code>list</code> care au numarul de ore seminar<code>oreSeminar</code>.
	 * Daca nu exsita un astfel de obiect, metoda returneaza <code>null</code>.(lista vida)
	 * 
	 * @param oreSemina
	 *           cate ore de seminar sa aiba norma pe care o cautam
	 * @param list
	 *            containerul in care se cauta
	 * @return lista normelor care au numarul de ore de seminar <code>oreSeminar</code> daca exista,
	 *  altfel <code>null</code>
	 * @since version 1.0
	 */
	static List<Norma> getNormaByOreSeminar(int oreSeminar, List<Norma> list) {
		List<Norma> listaRezultat = new ArrayList<Norma>();
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getOreSeminar() == oreSeminar) {
				listaRezultat.add(list.get(i));
			}
		return null;
	}
	
	
	 /** Metoda intoarece o lista cu elemente de tip <code>Norma</code> din
	 * containerul <code>list</code> care au numarul de ore laborator<code>oreLaborator</code>.
	 * Daca nu exsita un astfel de obiect, metoda returneaza <code>null</code>.(lista vida)
	 * 
	 * @param oreLaborator
	 *           cate ore de laborator sa aiba norma pe care o cautam
	 * @param list
	 *            containerul in care se cauta
	 * @return lista normelor care au numarul de ore de laborator <code>oreLaborator</code>
	 * daca exista, altfel <code>null</code>
	 * @since version 1.0
	 */
	static List<Norma> getNormaByOreLaborator(int oreLaborator, List<Norma> list) {
		List<Norma> listaRezultat = new ArrayList<Norma>();
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getOreLaborator() == oreLaborator) {
				listaRezultat.add(list.get(i));
			}
		return null;
	}
}
