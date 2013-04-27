package persistence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Interfata <code>Persistence</code> stabileste metodele comune
 * pentru orice clasa de persistenta din sistem. 
 *
 * @author Mihu Dumitru-Cosmin
 * @version 2.0, 22 aprilie 2013
 */
public abstract class Persistence {
	/**
	 * SessionFactory primit de la HIBERNATE
	 */
	@SuppressWarnings("deprecation")
	protected SessionFactory factory;
	
	public Persistence() {
		factory = new Configuration().configure()
				.buildSessionFactory();
	}
	
	
	
}
