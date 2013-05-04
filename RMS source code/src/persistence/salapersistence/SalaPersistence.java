package persistence.salapersistence;

import java.util.List;

import persistence.Persistence;

import model.Sala;

/**
 * Contine metode de modificare sau de primire de informatii a salilor din
 * persistenta.
 * 
 * @author Bucur Claudiu-Robert
 * @version 1.0, 10 aprilie 2013
 */
public class SalaPersistence extends Persistence{
	/**
	 * Singleton.
	 */
	private static SalaPersistence persistence;
	
	
	/**
	 * Constructorul persistentei pentru Sali
	 * 
	 * @since version 1.0
	 */
	private SalaPersistence() {
	}
	
	
	/**
	 * Metoda de acces la obiectul de peristenta pentru sali.
	 * 
	 * @return instanta a persistentei pentru sali
	 * @since version 1.0
	 */
	public static SalaPersistence instance() {
		if (persistence == null)
			persistence = new SalaPersistence();
		return persistence;
	}


	/**
	 * Metoda salveaza in persistenta o Sala.
	 * 
	 * @param sala
	 *            Sala ce se doreste a fi salvat
	 * @since version 1.0
	 */
	public int save(Sala sala) {
		return SalaRepository.save(factory, sala);

	}


	/**
	 * Metoda modifica in persistenta Sala cu id-ul lui <code>sala</code> setand
	 * atributele lui <code>sala</code>.
	 * 
	 * @param sala
	 *            Sala ce se doreste a fi modificata
	 * @since version 1.0
	 */
	public boolean update(Sala sala) {
		int ok = SalaRepository.update(factory, sala);

		return (ok == 0) ? false : true;
	}

	
	
	/**
	 * Metoda sterge din persistenta  Sala cu id-ul lui
	 * <code>sala</code>. Stergerea se face dupa id-ul din
	 * <code>sala</code>.
	 * 
	 * @param sala
	 *            Sala ce se doreste a fi stearsa
	 * @since version 1.0
	 */
	public boolean delete(Sala sala) {
		int ok = SalaRepository.delete(factory, sala);

		return (ok == 0) ? false : true;
	}
	
	
	
	/**
	 * Metoda intoarce toate salile daca exista,
	 * altfel <code>null</code>.
	 * 
	 * @return
	 * @since version 1.0
	 */
	public List<Sala> getAllSali() {
		return SalaFactory.getAllSali(factory);
	}

	

	/**
	 * Metoda intoarce Sala cu id-ul <code>id</code> daca exista,
	 * altfel <code>null</code>.
	 * 
	 * @param id
	 * @return
	 * @since version 1.0
	 */
	public Sala getSalaById(int id) {
		return SalaFactory.getSalaById(factory, id);
	}

	
	/**
	 * Metoda intoarce Sala cu codul <code>codSala</code>
	 * daca exista, altfel <code>null</code>.
	 * 
	 * @param codSala
	 * @return
	 * @since version 1.0
	 */
	public Sala getSalaByCod(String codSala){
		return SalaFactory.getSalaByCod(factory, codSala);
	}
	
	
	/**
	 * Metoda intoarce Salile cu numar de locuri <code>nrLocuri</code>
	 * daca exista, altfel <code>null</code>.
	 * 
	 * @param nrLocuri
	 * @return
	 * @since version 1.0
	 */
	public List<Sala> getSalaByNrLocuri (int nrLocuri){
		return SalaFactory.getSalaByNrLocuri(factory, nrLocuri);
	}


}
