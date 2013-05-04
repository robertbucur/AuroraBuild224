package persistence.echipamentpersistence;

import java.util.List;


import persistence.Persistence;
import model.Echipament;

/**
 * Contine metode de modificare sau de primire de informatii a salilor din
 * persistenta.
 * 
 * @author Bucur Claudiu-Robert
 * @version 1.0, 11 aprilie 2013
 */



public class EchipamentPersistence extends Persistence{

	/**
	 * Singleton.
	 */
	private static EchipamentPersistence persistence;

	/**
	 * Constructorul persistentei pentru Echipamente
	 * 
	 * @since version 1.0
	 */
	private EchipamentPersistence() {
	}

	/**
	 * Metoda de acces la obiectul de peristenta pentru echipamente.
	 * 
	 * @return instanta a persistentei pentru echipamente
	 * @since version 1.0
	 */
	public static EchipamentPersistence instance() {
		if (persistence == null)
			persistence = new EchipamentPersistence();
		return persistence;
	}

	
	
	
	
	/**
	 * Metoda salveaza in persistenta un Echipament.
	 * 
	 * @param echipament
	 *            Echipamentul ce se doreste a fi salvat
	 * @since version 1.0
	 */
	
	public int save(Echipament echipament) {
		return EchipamentRepository.save(factory, echipament);
	}


	/**
	 * Metoda modifica in persistenta Echipamentul cu id-ul lui <code>echipament</code> setand
	 * atributele lui <code>echipament</code>.
	 * 
	 * @param echipament
	 *            Echipamentul ce se doreste a fi modificat
	 * @since version 1.0
	 */

	public boolean update(Echipament echipament) {
		int ok = EchipamentRepository.update(factory, echipament);

		return (ok == 0) ? false : true;
	}

	
	
	
	/**
	 * Metoda sterge din persistenta  Echipament cu id-ul lui
	 * <code>echipament</code>. Stergerea se face dupa id-ul din
	 * <code>echipament</code>.
	 * 
	 * @param echipament
	 *            Echipamentul ce se doreste a fi stears
	 * @since version 1.0
	 */
	public boolean delete(Echipament echipament) {
		int ok = EchipamentRepository.delete(factory, echipament);

		return (ok == 0) ? false : true;
	}
	
	
	/**
	 * Metoda intoarce toate echipamentele daca exista,
	 * altfel <code>null</code>.
	 * 
	 * @return
	 * @since version 1.0
	 */
	public List<Echipament> getAllEchipament() {
		return EchipamentFactory.getAllEchipament(factory);
	}

	/**
	 * Metoda intoarce Echipamentul cu id-ul <code>id</code> daca exista,
	 * altfel <code>null</code>.
	 * 
	 * @param id
	 * @return
	 * @since version 1.0
	 */
	public Echipament getEchipamentById(int id) {
		return EchipamentFactory.getEchipamentById(factory, id);
	}

	
	/**
	 * Metoda intoarce Echipamentele cu tipul <code>tipEchipament</code>
	 * daca exista, altfel <code>null</code>.
	 * 
	 * @param tipEchipament
	 * @return
	 * @since version 1.0
	 */
	public List<Echipament> getEchipamentByTipEchipament(String tipEchipament){
		return EchipamentFactory.getEchipamentByTip( factory, tipEchipament);
	}
	
	
	/**
	 * Metoda intoarce Echipamentele cu modelul <code>modelEchipament</code>
	 * daca exista, altfel <code>null</code>.
	 * 
	 * @param modelEchipament
	 * @return
	 * @since version 1.0
	 */
	public List<Echipament> getEchipamentByModelEchipament(String modelEchipament){
		return EchipamentFactory.getEchipamentByModel(factory, modelEchipament);
	}

}
