package persistence.echipamentpersistence;

import java.util.List;

import model.Echipament;

/**
 * Ofera metode pentru modificarea datelor din persistenta.
 * 
 * @author Bucur Claudiu-Robert
 * @version 1.0, 11 aprilie 2013
 */

public class EchipamentRepository {

	/**
	 * Metoda adauga un Echipament in persistenta.
	 * 
	 * @param echipament
	 *            Echipamentul care se doreste a fi adaugat
	 * @param list
	 *            lista unde se salveaza
	 * @since version 1.0
	 */
	static void save(Echipament echipament, List<Echipament> list) {
		list.add(echipament);
	}

	/**
	 * Metoda modifica un echipament in lista <code>list</code>. Cautarea inainte de
	 * modificare se face dupa id-ul lui<code>echipament</code>. Pentru fiecare Echipament
	 * din lista care are acelasi id cu <code>echipament</code> i se modifica valorile
	 * cu cele ale lui <code>echipament</code>.
	 * 
	 * @param echipament
	 *            Echipamentul care se doreste a fi modificat, identificat prin id
	 * @param list
	 *            lista unde se modifica
	 * @return cate astfel de obiecte au fost modificate
	 * @since version 1.0
	 */
	static int update(Echipament echipament, List<Echipament> list) {
		int count = 0;
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getId() == echipament.getId()) {
				list.get(i).setModelEchipament(echipament.getModelEchipament());
				list.get(i).setTipEchipament(echipament.getTipEchipament());
				count++;
			}
		return count;
	}

	
	
	/**
	 * Metoda sterge un Echipament din lista <code>list</code>. Cautarea inainte de
	 * stergere se face dupa id-ul lui <code>echipament</code>. Fiecare Echipament din lista
	 * care are acelasi id cu <code>echipament</code> se sterge din lista.
	 * 
	 * @param echipament
	 *            Echipamentul care se doreste a fi stears, identificat prin id
	 * @param list
	 *            lista unde se sterge
	 * @return cate astfel de obiecte au fost sterse
	 * @since version 1.0
	 */
	public static int delete(Echipament echipament, List<Echipament> list) {
		int count = 0;
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getId() == echipament.getId()) {
				list.remove(i);
				count++;
			}
		return count;
	}

}
