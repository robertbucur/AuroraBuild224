package persistence.normapersistence;

import java.util.List;
import model.Norma;

/**
 * Ofera metode pentru modificarea datelor din persistenta.
 * 
 * @author Bucur Claudiu-Robert
 * @version 1.0, 11 aprilie 2013
 */

class NormaRepository {

	
	
	/**
	 * Metoda adauga o Norma in persistenta.
	 * 
	 * @param norma
	 *            Norma care se doreste a fi adaugat
	 * @param list
	 *            lista unde se salveaza
	 * @since version 1.0
	 */
	static void save(Norma norma, List<Norma> list) {
		list.add(norma);
	}

	/**
	 * Metoda modifica o Norma in lista <code>list</code>. Cautarea inainte de
	 * modificare se face dupa id-ul lui<code>norma</code>. Pentru fiecare Norma
	 * din lista care are acelasi id cu <code>norma</code> i se modifica valorile
	 * cu cele ale lui <code>norma</code>.
	 * 
	 * @param norma
	 *            Norma care se doreste a fi modificata, identificata prin id
	 * @param list
	 *            lista unde se modifica
	 * @return cate astfel de obiecte au fost modificate
	 * @since version 1.0
	 */
	static int update(Norma norma, List<Norma> list) {
		int count = 0;
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getId() == norma.getId()) {
				list.get(i).setOreCurs(norma.getOreCurs());
				list.get(i).setOreSeminar(norma.getOreSeminar());
				list.get(i).setOreLaborator(norma.getOreLaborator());
				count++;
			}
		return count;
	}

	
	
	/**
	 * Metoda sterge o Norma din lista <code>list</code>. Cautarea inainte de
	 * stergere se face dupa id-ul lui <code>norma</code>. Fiecare Norma din lista
	 * care are acelasi id cu <code>norma</code> se sterge din lista.
	 * 
	 * @param norma
	 *            Norma care se doreste a fi stearsa, identificata prin id
	 * @param list
	 *            lista unde se sterge
	 * @return cate astfel de obiecte au fost sterse
	 * @since version 1.0
	 */
	public static int delete(Norma norma, List<Norma> list) {
		int count = 0;
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getId() == norma.getId()) {
				list.remove(i);
				count++;
			}
		return count;
	}
	
	
}
