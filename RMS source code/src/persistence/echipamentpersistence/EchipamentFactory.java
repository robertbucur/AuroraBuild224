package persistence.echipamentpersistence;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import model.Echipament;

/**
 * Ofera metode pentru interogarea persistentei, pentru cerere de informatii.
 * 
 * @author Bucur Claudiu-Robert
 * @version 1.0, 11 aprilie 2013
 */


public class EchipamentFactory {
	private static Session session;
	

	/**
	 * Metoda intoarece toate echipamentele. Daca nu exsita 
	 * niciun echipament in persistenta, metoda returneaza <code>null</code>.
	 * 
	 * @param factory
	 *            instanta primita de la HIBERNATE	 
	 * @return toate echipamentele daca exista, altfel
	 *         <code>null</code>
	 * @since version 1.0
	 */
	static List<Echipament> getAllEchipament(SessionFactory factory) {
		List<Echipament> result = null;

		try {
			session = factory.openSession();
			Criteria criteria = session.createCriteria(Echipament.class);

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
	 * Metoda intoarece un obiect de tip <code>Echipament</code> din containerul
	 * <code>list</code> care are id-ul <code>id</code>. Daca nu exsita un
	 * astfel de obiect, metoda returneaza <code>null</code>.
	 * 
	 * @param id
	 *            id-ul echipamentului cautat
	 * @param list
	 *            containerul in care se cauta
	 * @return sala cu id-ul <code>id</code> daca exista, altfel
	 *         <code>null</code>
	 * @since version 1.0
	 */

	static Echipament getEchipamentById(SessionFactory factory, int id) {
		List<Echipament> result = null;

		try {
			session = factory.openSession();
			Criteria criteria = session.createCriteria(Echipament.class);
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
	 * /** Metoda intoarece o lista cu elemente de tip <code>Echipament</code> din
	 * containerul <code>list</code> care au tipul <code>tipEchipament</code>.
	 * Daca nu exsita un astfel de obiect, metoda returneaza <code>null</code>.(lista vida)
	 * 
	 * @param tipEchipament
	 *           tipul echipamentului pe care il cautam
	 * @param list
	 *            containerul in care se cauta
	 * @return lista echipamentelor care au tipul <code>tipEchipament</code> daca exista,
	 *  altfel <code>null</code>
	 * @since version 1.0
	 */
	
	static List<Echipament> getEchipamentByTip(SessionFactory factory, String tip) {
		List<Echipament> result = null;

		try {
			session = factory.openSession();
			Criteria criteria = session.createCriteria(Echipament.class);
			criteria.add(Restrictions.eq("tip", tip));

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
	 * /** Metoda intoarece o lista cu elemente de tip <code>Echipament</code> din
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
	
	static List<Echipament> getEchipamentByModel(SessionFactory factory, String model) {
		List<Echipament> result = null;

		try {
			session = factory.openSession();
			Criteria criteria = session.createCriteria(Echipament.class);
			criteria.add(Restrictions.eq("model", model));

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
	 * Obtine Echipamente din BD primid un obiect <code>Session</code>, filtrate dupa
	 * <code>criteria</code>. (Metoda generala)
	 * 
	 * @param session sesiunea Hibernate
	 * @param criteria criteriile de filtrare
	 * @return
	 * @since version 2.0
	 */
	
	private static List<Echipament> factoryQuery(Session session,
			Criteria criteria) {
		List<Echipament> result = null;

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
