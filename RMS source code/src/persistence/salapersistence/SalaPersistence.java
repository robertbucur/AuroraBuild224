package persistence.salapersistence;

import java.util.List;

import model.Sala;

/**
 * Contine metode de modificare sau de primire de informatii a salilor din
 * persistenta.
 * 
 * @author Bucur Claudiu-Robert
 * @version 1.0, 10 aprilie 2013
 */
public class SalaPersistence {
	/**
	 * Lista care reprezinta persistenta.
	 */
	private List<Sala> list;

	/**
	 * Constructorul persistentei pentru Sali
	 * 
	 * @since version 1.0
	 */
	public SalaPersistence() {
	}

	/**
	 * Metoda salveaza in persistenta o Sala.
	 * 
	 * @param sala
	 *            Sala ce se doreste a fi salvat
	 * @since version 1.0
	 */
	public void save(Sala sala) {
		SalaRepository.save(sala, list);
	}

	/**
	 * Metoda modifica in persistenta Sala cu id-ul lui <code>sala</code> setand
	 * atributele lui <code>sala</code>.
	 * 
	 * @param sala
	 *            Sala ce se doreste a fi modificata
	 * @since version 1.0
	 */
	public void update(Sala sala) {
		SalaRepository.update(sala, list);
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
	public void delete(Sala sala) {
		SalaRepository.delete(sala, list);
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
		return SalaFactory.getSalaById(id, list);
	}

	
	/**
	 * Metoda intoarce Sala cu codul <code>codSala</code>
	 * daca exista, altfel <code>null</code>.
	 * 
	 * @param codSala
	 * @return
	 * @since version 1.0
	 */
	public Sala getSalaByCodSala(String codSala){
		return SalaFactory.getSalaByCodSala(codSala, list);
	}


}
