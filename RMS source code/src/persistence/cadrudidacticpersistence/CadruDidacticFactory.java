package persistence.cadrudidacticpersistence;

import model.CadruDidactic;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * Ofera metode pentru interogarea persistentei, pentru cerere de informatii.
 * 
 * @author Mihu Dumitru-Cosmin
 * @version 1.0, 10 aprilie 2013
 */
public class CadruDidacticFactory {
	private static Session session;

	/**
	 * Metoda intoarece toate cadrele didactice peristenta. Daca nu exsita 
	 * niciun cadru didactic in persistenta, metoda returneaza <code>null</code>.
	 * 
	 * @param factory
	 *            instanta primita de la HIBERNATE	 
	 * @return toate cadrele didactice daca exista, altfel
	 *         <code>null</code>
	 * @since version 1.0
	 */
	static List<CadruDidactic> getAllCadruDidactic(SessionFactory factory) {
		List<CadruDidactic> result = null;

		try {
			session = factory.openSession();
			Criteria criteria = session.createCriteria(CadruDidactic.class);

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
	 * Metoda intoarece un obiect de tip <code>CdruDidactic</code> din
	 * peristenta care are id-ul <code>id</code>. Daca nu exsita un astfel de
	 * obiectul, metoda returneaza <code>null</code>.
	 * 
	 * @param factory
	 *            instanta primita de la HIBERNATE
	 * @param id
	 *            cadrului didactic care se cauta
	 * @return cadrul didactic cu id-ul <code>id</code> daca exista, altfel
	 *         <code>null</code>
	 * @since version 1.0
	 */
	static CadruDidactic getCadruDidacticById(SessionFactory factory, int id) {
		List<CadruDidactic> result = null;

		try {
			session = factory.openSession();
			Criteria criteria = session.createCriteria(CadruDidactic.class);
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
	 * /** Metoda intoarece un obiect de tip <code>CadruDidactic</code> din
	 * persistenta care are numele <code>nume</code> si prenumele
	 * <code>prenume</code>. Daca nu exsita un astfel de obiectul, metoda
	 * returneaza <code>null</code>.
	 * 
	 * @param factory
	 *            numele cadrului didactic cautat
	 * @param prenume
	 *            prenumele cadrului didactic cautat
	 * @param prenume2
	 *            containerul in care se cauta
	 * @return cadrul didactic cu numele <code>nume</code> si prenumele
	 *         <code>prenume</code> daca exista, altfel <code>null</code>
	 * @since version 1.0
	 */
	static CadruDidactic getCadruDidacticByNumeSiPrenume(
			SessionFactory factory, String nume, String prenume) {
		List<CadruDidactic> result = null;

		try {
			session = factory.openSession();
			Criteria criteria = session.createCriteria(CadruDidactic.class);
			criteria.add(Restrictions.ilike("nume", nume));
			criteria.add(Restrictions.ilike("prenume", prenume));

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
	 * Metoda intoarece un obiect de tip <code>CdruDidactic</code> din
	 * persistenta care are numarul de telefon <code>numarTelefon</code>. Daca
	 * nu exsita un astfel de obiectul, metoda returneaza <code>null</code>.
	 * 
	 * @param factory
	 *            numarul de telefon al cadrului didactic cautat
	 * @param numarTelefon
	 *            containerul in care se cauta
	 * @return cadrul didactic cu id-ul numarul de telefon
	 *         <code>numarTelefon</code> daca exista, altfel <code>null</code>
	 * @since version 1.0
	 */
	static CadruDidactic getCadruDidacticByNumarTelefon(SessionFactory factory,
			String numarTelefon) {
		List<CadruDidactic> result = null;

		try {
			session = factory.openSession();
			Criteria criteria = session.createCriteria(CadruDidactic.class);
			criteria.add(Restrictions.ilike("numarTelefon", numarTelefon));

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
	 * Metoda intoarece un obiect de tip <code>CdruDidactic</code> din
	 * persistenta care are email-ul <code>email</code>. Daca nu exsita un
	 * astfel de obiectul, metoda returneaza <code>null</code>.
	 * 
	 * @param factory
	 *            email-ul cadrului didactic cautat
	 * @param email
	 *            containerul in care se cauta
	 * @return cadrul didactic cu email-ul <code>email</code> daca exista,
	 *         altfel <code>null</code>
	 * @since version 1.0
	 */
	static CadruDidactic getCadruDidacticByEmail(SessionFactory factory,
			String email) {
		List<CadruDidactic> result = null;

		try {
			session = factory.openSession();
			Criteria criteria = session.createCriteria(CadruDidactic.class);
			criteria.add(Restrictions.ilike("email", email));

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
	 * Metoda intoarece o lista de obiecte de tip <code>CdruDidactic</code> din
	 * containerul <code>list</code> care au ca si domeniu de interes
	 * <code>domeniuInteres</code>. Daca nu exsita un astfel de obiectul, metoda
	 * returneaza o lista goala.
	 * 
	 * @param factory
	 *            doemniul de interes pe baza caruia se cauta cadele didactice
	 * @param domeniuInteres
	 *            containerul in care se cauta
	 * @return lista cu cadre didactice care au ca domeni de interes
	 *         <code>domeniuInteres</code>
	 * @since version 1.0
	 */
	static List<CadruDidactic> getCadruDidacticByDomeniuInteres(
			SessionFactory factory, String domeniuInteres) {
		return null;
	}

	
	/**
	 * Obtine CadreDidactice din BD primid un obiect <code>Session</code>, filtrate dupa
	 * <code>criteria</code>. (Metoda generala)
	 * 
	 * @param session sesiunea Hibernate
	 * @param criteria criteriile de filtrare
	 * @return
	 * @since version 2.0
	 */
	private static List<CadruDidactic> factoryQuery(Session session,
			Criteria criteria) {
		List<CadruDidactic> result = null;

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
