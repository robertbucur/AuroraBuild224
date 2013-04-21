package persistence.cadrudidacticpersistence;

import model.CadruDidactic;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Contine metode de modificare sau de primire de informatii a cadrelor
 * didactice din persistenta.
 * 
 * @author Mihu Dumitru-Cosmin
 * @version 2.0, 14 aprilie 2013
 */
public class CadruDidacticPersistence {
	/**
	 * Singleton.
	 */
	private static CadruDidacticPersistence persistence;
	/**
	 * SessionFactory primit de la HIBERNATE
	 */
	private static SessionFactory factory = new Configuration().configure()
			.buildSessionFactory();

	/**
	 * Constructorul persistentei pentru cadre didactice
	 * 
	 * @since version 1.0
	 */
	private CadruDidacticPersistence() {

	}

	/**
	 * Metoda de acces la obiectul de peristenta pentru cadre didactice.
	 * 
	 * @return instanta a persistentei pentru cadre didactice
	 * @since version 1.0
	 */
	public static CadruDidacticPersistence instance() {
		if (persistence == null)
			persistence = new CadruDidacticPersistence();
		return persistence;
	}

	/**
	 * Metoda salveaza in persistenta un Cadru Didactic.
	 * 
	 * @param cadruDidactic
	 *            Cadru Didactic ce se doreste a fi salvat
	 * @return id-ul cadrului didactic tocmai salvat in caz de succes, altfel -1
	 * @since version 1.0
	 */
	public int save(CadruDidactic cadruDidactic) {
		// save norma
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			session.save(cadruDidactic.getNorma());

			tx.commit();

			// save cadrudidacic
			return CadruDidacticRepository.save(factory, cadruDidactic);

		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

		return -1;

	}

	/**
	 * Metoda modifica in persistenta Cadrul Didactic cu id-ul lui
	 * <code>cadruDidactic</code> setand atributele lui
	 * <code>cadruDidactic</code>.
	 * 
	 * @param cadruDidactic
	 *            Cadru Didactic ce se doreste a fi modificat
	 * @return true daca s-a efectuat modificare, false altfel
	 * @since version 1.0
	 */
	public boolean update(CadruDidactic cadruDidactic) {
		int ok = CadruDidacticRepository.update(factory, cadruDidactic);

		return (ok == 0) ? false : true;
	}

	/**
	 * Metoda sterge din persistenta un Cadru Didactic cu id-ul lui
	 * <code>cadruDidactic</code>. Stergerea se face dupa id-ul din
	 * <code>cadruDidactic</code>.
	 * 
	 * @param cadruDidactic
	 *            Cadru Didactic ce se doreste a fi sters
	 * @return true daca s-a efectuat stergerea, false altfel
	 * @since version 1.0
	 */
	public boolean delete(CadruDidactic cadruDidactic) {
		int ok = CadruDidacticRepository.delete(factory, cadruDidactic);

		return (ok == 0) ? false : true;
	}

	/**
	 * Metoda intoarce toate resursele umande de tip CadruDidactic daca exista,
	 * altfel <code>null</code>.
	 * 
	 * @return
	 * @since version 1.0
	 */
	public List<CadruDidactic> getAllCadruDidactic() {
		return CadruDidacticFactory.getAllCadruDidactic(factory);
	}

	/**
	 * Metoda intoarce Cadrul Didactic cu id-ul <code>id</code> daca exista,
	 * altfel <code>null</code>.
	 * 
	 * @param id
	 * @return
	 * @since version 1.0
	 */
	public CadruDidactic getCadruDidacticById(int id) {
		return CadruDidacticFactory.getCadruDidacticById(factory, id);
	}

	/**
	 * Metoda intoarce Cadrul Didactic cu numele <code>nume</code> si prenumele
	 * <code>prenume</code> daca exista, altfel <code>null</code>.
	 * 
	 * @param nume
	 * @param prenume
	 * @return
	 * @since version 1.0
	 */
	public CadruDidactic getCadruDidacticByNumeSiPrenume(String nume,
			String prenume) {
		return CadruDidacticFactory.getCadruDidacticByNumeSiPrenume(factory,
				nume, prenume);
	}

	/**
	 * Metoda intoarce Cadrul Didactic cu numarul de telefon
	 * <code>numarTelefon</code> daca exista, altfel <code>null</code>.
	 * 
	 * @param numarTelefon
	 * @return
	 * @since version 1.0
	 */
	public CadruDidactic getCadruDidacticByNumarTelefon(String numarTelefon) {
		return CadruDidacticFactory.getCadruDidacticByNumarTelefon(factory,
				numarTelefon);
	}

	/**
	 * Metoda intoarce Cadrul Didactic cu email-ul <code>email</code> daca
	 * exista, altfel <code>null</code>.
	 * 
	 * @param email
	 * @return
	 * @since version 1.0
	 */
	public CadruDidactic getCadruDidacticByEmail(String email) {
		return CadruDidacticFactory.getCadruDidacticByEmail(factory, email);
	}

	/**
	 * Metoda intoarce lista Cadrelor Didactice care au ca si domeniu de interes
	 * <code>domeniuInteres</code>.
	 * 
	 * @param domeniuInteres
	 * @return
	 * @since version 1.0
	 */
	public List<CadruDidactic> getCadruDidacticByDomeniuInteres(
			String domeniuInteres) {
		return CadruDidacticFactory.getCadruDidacticByDomeniuInteres(factory,
				domeniuInteres);
	}

}
