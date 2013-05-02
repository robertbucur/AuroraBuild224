package persistence.salapersistence;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Echipament;
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
	
	static int save(SessionFactory factory, Sala sala) {
		Integer id = -1;
		
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			id = (Integer) session.save(sala);
			
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
	static int update(SessionFactory factory, Sala sala) {
		int ok = 0;
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.update(sala);
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
	static int delete(SessionFactory factory, Sala sala) {
		int ok = 0;
		
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			Sala s = (Sala) session.get(Sala.class, sala.getId());
			if (s != null){
				session.delete(s);
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
