package persistence.cadrudidacticpersistence;

import model.CadruDidactic;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Ofera metode pentru modificarea datelor din persistenta.
 *
 * @author Mihu Dumitru-Cosmin
 * @version 2.0, 14 aprilie 2013
 */
class CadruDidacticRepository {

	/**
	 * Metoda adauga un Cadru Didactic in persistenta.
	 * 
	 * @param factory instanta primita de la HIBERNATE
	 * @param cadruDidactic Cadrul Didactic care se doreste a fi adaugat
	 * @return id-ul cadrului didactic tocmai salvat in caz de succes, altfel -1
	 * @since version 1.0
	 */
	static int save(SessionFactory factory, CadruDidactic cadruDidactic) {
		Integer id = -1;
		
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			id = (Integer) session.save(cadruDidactic);
			
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		return id;
	}

	/**
	 * Metoda modifica un Cadru Didactic in peristenta. Cautarea
	 * inainte de modificare se face dupa id-ul lui <code>cadruDidactic</code>.
	 * Pentru fiecare Cadru Didactic din peristenta care are acelasi id cu
	 * <code>cadruDidactic</code> i se modifica valorile cu cele ale lui
	 * <code>cadruDidactic</code>.
	 * 
	 * @param factory instanta primita de la HIBERNATE
	 * @param cadruDidactic Cadrul Didactic care se doreste a fi moificat
	 * @return cate astfel de obiecte au fost modificate
	 * @since version 1.0
	 */
	static int update(SessionFactory factory, CadruDidactic cadruDidactic) {
		int ok = 0;
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.update(cadruDidactic);
			tx.commit();
			
			ok = 1;
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			ok = 0;
			e.printStackTrace();
		} finally {
			session.close();
		}
		return ok;
	}

	/**
	 * Metoda sterge un Cadru Didactic din peristenta. Cautarea
	 * inainte de stergere se face dupa id-ul lui <code>cadruDidactic</code>.
	 * Fiecare Cadru Didactic din peristenta care are acelasi id cu
	 * <code>cadruDidactic</code> se sterge din peristenta.
	 * 
	 * @param factory instanta primita de la HIBERNATE
	 * @param cadruDidactic Cadrul Didactic care se doreste a fi sters
	 * @return cate astfel de obiecte au fost sterse
	 * @since version 1.0
	 */
	public static int delete(SessionFactory factory,
			CadruDidactic cadruDidactic) {
		int ok = 0;
		
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			CadruDidactic c = (CadruDidactic) session.get(CadruDidactic.class, cadruDidactic.getId());
			session.delete(c);
			
			tx.commit();
			ok = 1;
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			ok = 0;
			e.printStackTrace();
		} finally {
			session.close();
		}
		return ok;
	}

}
