package persistence.salapersistence;

import java.util.List;

import model.Sala;

/**
 * Ofera metode pentru modificarea datelor din persistenta.
 * 
 * @author Bucur Claudiu-Robert
 * @version 1.0, 10 aprilie 2013
 */

public class SalaRepository {

	/**
	 * Metoda adauga o Sala in persistenta.
	 * 
	 * @param sala
	 *            Sala care se doreste a fi adaugata
	 * @param list
	 *            lista unde se salveaza
	 * @since version 1.0
	 */
	static void save(Sala sala, List<Sala> list) {
		list.add(sala);
	}

	/**
	 * Metoda modifica o Sala in lista <code>list</code>. Cautarea inainte de
	 * modificare se face dupa id-ul lui<code>sala</code>. Pentru fiecare Sala
	 * din lista care are acelasi id cu <code>sala</code> i se modifica valorile
	 * cu cele ale lui <code>sala</code>.
	 * 
	 * @param sala
	 *            Sala care se doreste a fi modificata, identificata prin id
	 * @param list
	 *            lista unde se modifica
	 * @return cate astfel de obiecte au fost modificate
	 * @since version 1.0
	 */
	static int update(Sala sala, List<Sala> list) {
		int count = 0;
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getId() == sala.getId()) {
				list.get(i).setCodSala(sala.getCodSala());
				list.get(i).setNrLocuri(sala.getNrLocuri());
				count++;
			}
		return count;
	}

	/**
	 * Metoda sterge o Sala din lista <code>list</code>. Cautarea inainte de
	 * stergere se face dupa id-ul lui <code>sala</code>. Fiecare Sala din lista
	 * care are acelasi id cu <code>sala</code> se sterge din lista.
	 * 
	 * @param sala
	 *            Sala care se doreste a fi stearsa, identificata prin id
	 * @param list
	 *            lista unde se sterge
	 * @return cate astfel de obiecte au fost sterse
	 * @since version 1.0
	 */
	public static int delete(Sala sala, List<Sala> list) {
		int count = 0;
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getId() == sala.getId()) {
				list.remove(i);
				count++;
			}
		return count;
	}

}
