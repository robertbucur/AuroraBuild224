package persistence.cercetatorpersistence;

import java.util.List;

import model.Cercetator;

/**
 * @author Nagy Istvan
 * @version 1.0, 16 aprilie 2013
 *
 */
class CercetatorRepository {

	/**
	 * Metoda adauga un obiect de tip <code>Cercetator</code> in persistenta.
	 * 
	 * @param cercetator
	 *            cercetatorul care urmeaza sa fie adaugat
	 * @param list
	 *            lista unde se salveaza
	 * @since version 1.0
	 */
	static void save(Cercetator cercetator, List<Cercetator> list) {
		list.add(cercetator);
	}

	/**
	 * Metoda modifica unu sau mai multe obiecte de tip <code>Cercetator</code> in lista <code>list</code>. 
	 * Cautarea inainte de modificare se face dupa id-ul lui <code>Cercetator</code>.
	 * Pentru fiecare Cercetator din lista care are acelasi id cu
	 * <code>cercetator</code> i se modifica valorile cu cele ale lui
	 * <code>cercetator</code>.
	 * 
	 * @param cercetator
	 *            Cercetator care se doreste a fi modificat, identificat prin id
	 * @param list
	 *            lista in care se vor face modificarile
	 * @return cate astfel de obiecte au fost modificate
	 * @since version 1.0
	 */
	static int update(Cercetator cercetator, List<Cercetator> list) {
		int count = 0;
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getId() == cercetator.getId()) {
				list.get(i).setNume(cercetator.getNume());
				list.get(i).setPrenume(cercetator.getPrenume());
				list.get(i).setNumarTelefon(cercetator.getNumarTelefon());
				list.get(i).setEmail(cercetator.getEmail());
				list.get(i)
						.setDomeniiInteres(cercetator.getDomeniiInteres());
				count++;
			}
		return count;
	}

	/**
	 * Metoda sterge unu sau mai multe obiecte de tip <code>Cercetator</code> din lista <code>list</code>.
	 * Cautarea inainte de stergere se face dupa id-ul lui <code>cercetator</code>.
	 * Fiecare Cercetator din lista care are acelasi id cu
	 * <code>cercetator</code> se sterge din lista.
	 * 
	 * @param cercetator
	 *            Cercetator care se doreste a fi sters, identificat prin id
	 * @param list
	 *            lista de unde se sterge
	 * @return cate astfel de obiecte au fost sterse
	 * @since version 1.0
	 */
	public static int delete(Cercetator  cercetator ,
			List<Cercetator> list) {
		int count = 0;
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getId() == cercetator.getId()) {
				list.remove(i);
				count++;
			}
		return count;
	}
}
