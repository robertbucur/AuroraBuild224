package persistence.normapersistence;

import java.util.List;
import model.Norma;

/**
 * Contine metode de modificare sau de primire de informatii a salilor din
 * persistenta.
 * 
 * @author Bucur Claudiu-Robert
 * @version 1.0, 11 aprilie 2013
 */

public class NormaPersistence {

	
	/**
	 * Lista care reprezinta persistenta.
	 */
	private List<Norma> list;

	/**
	 * Constructorul persistentei pentru Norme
	 * 
	 * @since version 1.0
	 */
	public NormaPersistence() {
	}

	/**
	 * Metoda salveaza in persistenta o Norma.
	 * 
	 * @param norma
	 *            Norma ce se doreste a fi salvata
	 * @since version 1.0
	 */
	public void save(Norma norma) {
		NormaRepository.save(norma, list);
	}

	/**
	 * Metoda modifica in persistenta Norma cu id-ul lui <code>norma</code> setand
	 * atributele lui <code>norma</code>.
	 * 
	 * @param norma
	 *            Norma ce se doreste a fi modificata
	 * @since version 1.0
	 */
	public void update(Norma norma) {
		NormaRepository.update(norma, list);
	}

	
	
	
	/**
	 * Metoda sterge din persistenta Norma cu id-ul lui
	 * <code>norma</code>. Stergerea se face dupa id-ul din
	 * <code>norma</code>.
	 * 
	 * @param norma
	 *            Norma ce se doreste a fi stearsa
	 * @since version 1.0
	 */
	public void delete(Norma norma) {
		NormaRepository.delete(norma, list);
	}
	
	

	/**
	 * Metoda intoarce Norma cu id-ul <code>id</code> daca exista,
	 * altfel <code>null</code>.
	 * 
	 * @param id
	 * @return
	 * @since version 1.0
	 */
	public Norma getNormaById(int id) {
		return NormaFactory.getNormaById(id, list);
	}

	
	/**
	 * Metoda intoarce Normele cu numarul de ore de curs <code>oreCurs</code>
	 * daca exista, altfel <code>null</code>.
	 * 
	 * @param oreCurs
	 * @return
	 * @since version 1.0
	 */
	public List<Norma> getNormaByOreCurs(int oreCurs){
		return NormaFactory.getNormaByOreCurs(oreCurs, list);
	}
	
	
	/**
	 * Metoda intoarce Normele cu numarul de ore de seminat <code>oreSeminar</code>
	 * daca exista, altfel <code>null</code>.
	 * 
	 * @param oreSeminar
	 * @return
	 * @since version 1.0
	 */
	public List<Norma> getNormaByOreSeminar(int oreSeminar){
		return NormaFactory.getNormaByOreSeminar(oreSeminar, list);
	}
	
	/**
	 * Metoda intoarce Normele cu numarul de ore de laborator <code>oreLaborator</code>
	 * daca exista, altfel <code>null</code>.
	 * 
	 * @param oreLaborator
	 * @return
	 * @since version 1.0
	 */
	public List<Norma> getNormaByOreLaborator(int oreLaborator){
		return NormaFactory.getNormaByOreLaborator(oreLaborator, list);
	}
	

}
