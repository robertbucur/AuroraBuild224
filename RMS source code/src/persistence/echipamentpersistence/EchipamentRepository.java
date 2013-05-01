package persistence.echipamentpersistence;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

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
	static int save(SessionFactory factory, Echipament echipament) {
		Integer id = -1;
		
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			id = (Integer) session.save(echipament);
			
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
	static int update(SessionFactory factory, Echipament echipament) {
		int ok = 0;
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.update(echipament);
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
	static int delete(SessionFactory factory, Echipament echipament) {
		int ok = 0;
		
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			Echipament e = (Echipament) session.get(Echipament.class, echipament.getId());
			if (e != null){
				session.delete(e);
				ok = 1;
			}
			
			tx.commit();			
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
