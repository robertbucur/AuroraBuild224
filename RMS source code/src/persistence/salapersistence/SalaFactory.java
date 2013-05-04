package persistence.salapersistence;

import model.Sala;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * Ofera metode pentru interogarea persistentei, pentru cerere de informatii.
 * 
 * @author Bucur Claudiu-Robert
 * @version 1.0, 10 aprilie 2013
 */

public class SalaFactory {
	private static Session session;
	
	
	/**
	 * Metoda intoarece toate salile. Daca nu exsita 
	 * nicio sala in persistenta, metoda returneaza <code>null</code>.
	 * 
	 * @param factory
	 *            instanta primita de la HIBERNATE	 
	 * @return toate salile daca exista, altfel
	 *         <code>null</code>
	 * @since version 1.0
	 */
	static List<Sala> getAllSala(SessionFactory factory) {
		List<Sala> result = null;

		try {
			session = factory.openSession();
			Criteria criteria = session.createCriteria(Sala.class);

			result = factoryQuery(session, criteria);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}

		return result;
	}
	
	
	/**
	 * Metoda intoarece un obiect de tip <code>Sala</code> din containerul
	 * <code>list</code> care are id-ul <code>id</code>. Daca nu exsita un
	 * astfel de obiect, metoda returneaza <code>null</code>.
	 * 
	 * @param id
	 *            id-ul salii cautate
	 * @param list
	 *            containerul in care se cauta
	 * @return sala cu id-ul <code>id</code> daca exista, altfel
	 *         <code>null</code>
	 * @since version 1.0
	 */

	static Sala getSalaById(SessionFactory factory, int id) {
		List<Sala> result = null;

		try {
			session = factory.openSession();
			Criteria criteria = session.createCriteria(Sala.class);
			criteria.add(Restrictions.eq("id", id));

			result = factoryQuery(session, criteria);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}

		return (result == null || result.size() == 0) ? null : result.get(0);
	}
	
	
	

	/**
	 * /** Metoda intoarece un obiect de tip <code>Sala</code> din
	 * containerul <code>list</code> care are codul <code>codSala</code>.
	 * Daca nu exsita un astfel de obiect, metoda returneaza <code>null</code>.
	 * 
	 * @param codSala
	 *            codul salii pe care o cautam
	 * @param list
	 *            containerul in care se cauta
	 * @return sala cu codul <code>codSala</code> daca exista, altfel <code>null</code>
	 * @since version 1.0
	 */
	static Sala getSalaByCod(SessionFactory factory, String cod) {
		List<Sala> result = null;

		try {
			session = factory.openSession();
			Criteria criteria = session.createCriteria(Sala.class);
			criteria.add(Restrictions.eq("codSala", cod));

			result = factoryQuery(session, criteria);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}

		return (result == null || result.size() == 0) ? null : result.get(0);
	}
	
	
	/**
	 * /** Metoda intoarece o lista cu elemente de tip <code>Sala</code> din
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
	
	static List<Sala> getSalaByNrLocuri(SessionFactory factory, int nrLocuri) {
		List<Sala> result = null;

		try {
			session = factory.openSession();
			Criteria criteria = session.createCriteria(Sala.class);
			criteria.add(Restrictions.eq("nrLocuri", nrLocuri));

			result = factoryQuery(session, criteria);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}

		return result;
	}
	
	
	
	

	/**
	 * Obtine Salile din BD primid un obiect <code>Session</code>, filtrate dupa
	 * <code>criteria</code>. (Metoda generala)
	 * 
	 * @param session sesiunea Hibernate
	 * @param criteria criteriile de filtrare
	 * @return
	 * @since version 2.0
	 */
	
	
	private static List<Sala> factoryQuery(Session session,
			Criteria criteria) {
		List<Sala> result = null;

		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			result = criteria.list();

			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		

		return result;
	}
	
	
	

}
