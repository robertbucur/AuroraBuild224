package persistence.cadrudidacticpersistence;

import java.util.List;

import model.CadruDidactic;

/**
 * Ofera metode pentru modificarea datelor din persistenta.
 *
 * @author Mihu Dumitru-Cosmin
 * @version 1.0, 10 aprilie 2013
 */
class CadruDidacticRepository {

	/**
	 * Metoda adauga un Cadru Didactic in persistenta.
	 * 
	 * @param cadruDidactic
	 *            Cadrul Didactic care se doreste a fi adaugat
	 * @param list
	 *            lista unde se salveaza
	 * @since version 1.0
	 */
	static void save(CadruDidactic cadruDidactic, List<CadruDidactic> list) {
		list.add(cadruDidactic);
	}

	/**
	 * Metoda modifica un Cadru Didactic in lista <code>list</code>. Cautarea
	 * inainte de modificare se face dupa id-ul lui <code>cadruDidactic</code>.
	 * Pentru fiecare Cadru Didactic din lista care are acelasi id cu
	 * <code>cadruDidactic</code> i se modifica valorile cu cele ale lui
	 * <code>cadruDidactic</code>.
	 * 
	 * @param cadruDidactic
	 *            Cadrul Didactic care se doreste a fi modificat, identificat prin id
	 * @param list
	 *            lista unde se modifica
	 * @return cate astfel de obiecte au fost modificate
	 * @since version 1.0
	 */
	static int update(CadruDidactic cadruDidactic, List<CadruDidactic> list) {
		int count = 0;
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getId() == cadruDidactic.getId()) {
				list.get(i).setNume(cadruDidactic.getNume());
				list.get(i).setPrenume(cadruDidactic.getPrenume());
				list.get(i).setEmail(cadruDidactic.getEmail());
				list.get(i).setPostDidactic(cadruDidactic.getPostDidactic());
				list.get(i)
						.setDomeniiInteres(cadruDidactic.getDomeniiInteres());
				list.get(i).setNumarTelefon(cadruDidactic.getNumarTelefon());
				list.get(i).setNorma(cadruDidactic.getNorma());
				count++;
			}
		return count;
	}

	/**
	 * Metoda sterge un Cadru Didactic din lista <code>list</code>. Cautarea
	 * inainte de stergere se face dupa id-ul lui <code>cadruDidactic</code>.
	 * Fiecare Cadru Didactic din lista care are acelasi id cu
	 * <code>cadruDidactic</code> se sterge din lista.
	 * 
	 * @param cadruDidactic
	 *            Cadrul Didactic care se doreste a fi sters, identificat prin id
	 * @param list
	 *            lista unde se sterge
	 * @return cate astfel de obiecte au fost sterse
	 * @since version 1.0
	 */
	public static int delete(CadruDidactic cadruDidactic,
			List<CadruDidactic> list) {
		int count = 0;
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getId() == cadruDidactic.getId()) {
				list.remove(i);
				count++;
			}
		return count;
	}

}
