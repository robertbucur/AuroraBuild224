package persistence.echipamentpersistence;

import java.util.List;

import model.Echipament;

/**
 * Contine metode de modificare sau de primire de informatii a salilor din
 * persistenta.
 * 
 * @author Bucur Claudiu-Robert
 * @version 1.0, 11 aprilie 2013
 */



public class EchipamentPersistence {

	/**
	 * Lista care reprezinta persistenta.
	 */
	private List<Echipament> list;

	/**
	 * Constructorul persistentei pentru Echipamente
	 * 
	 * @since version 1.0
	 */
	public EchipamentPersistence() {
	}

	/**
	 * Metoda salveaza in persistenta un Echipament.
	 * 
	 * @param echipament
	 *            Echipamentul ce se doreste a fi salvat
	 * @since version 1.0
	 */
	public void save(Echipament echipament) {
		EchipamentRepository.save(echipament, list);
	}

	/**
	 * Metoda modifica in persistenta Echipamentul cu id-ul lui <code>echipament</code> setand
	 * atributele lui <code>echipament</code>.
	 * 
	 * @param echipament
	 *            Echipamentul ce se doreste a fi modificat
	 * @since version 1.0
	 */
	public void update(Echipament echipament) {
		EchipamentRepository.update(echipament, list);
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
	public void delete(Echipament echipament) {
		EchipamentRepository.delete(echipament, list);
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
		return EchipamentFactory.getEchipamentById(id, list);
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
		return EchipamentFactory.getEchipamentByTip(tipEchipament, list);
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
		return EchipamentFactory.getEchipamentByModel(modelEchipament, list);
	}

}
