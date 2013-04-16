/**
 * 
 */
package persistence.cercetatorpersistence;

import java.util.List;

import model.Cercetator;

/**
 * Contine metode de modificare sau de primire de informatii pentru cercetatorii din persistenta. 
 * 
 * @author Nagy Istvan
 * @version 1.0, 16 aprilie 2013
 *
 */
public class CercetatorPersistence {

	/**
	 * Lista care reprezinta persistenta.
	 */
	private List<Cercetator> list;
	
	/**
	 * Constructorul persistentei pentru cercetatori
	 * 
	 * @since version 1.0
	 */
	public CercetatorPersistence(){
		
	}
	
	/**
	 * Metoda salveaza in persistenta un Cercetator.
	 * 
	 * @param cercetator <code>Cercetator</code> ce se doreste a fi salvat
	 * @since version 1.0
	 */
	public void save(Cercetator cercetator){
		CercetatorRepository.save(cercetator, list);
	}
	
	/**
	 * Metoda modifica in persistenta Cercetatorul cu id-ul lui <code>cercetator</code>
	 * setand atributele lui <code>cercetator</code>.
	 * 
	 * @param cercetator <code>Cercetator</code> ce se doreste a fi modificat
	 * @since version 1.0
	 */
	public void update(Cercetator cercetator){
		CercetatorRepository.update(cercetator, list);
	}
	
	/**
	 * Metoda sterge din persistenta un cercetator cu id-ul lui <code>cercetator</code>.
	 * Stergerea se face dupa id-ul din <code>Cercetator</code>.
	 * 
	 * @param cercetator <code>Cercetator</code> ce se doreste a fi sters
	 * @since version 1.0
	 */
	public void delete(Cercetator cercetator){
		CercetatorRepository.delete(cercetator, list);
	}
	
	/**
	 * Metoda intoarce Cercetatorul cu id-ul <code>id</code> daca exista, altfel <code>null</code>.
	 * 
	 * @param id
	 * @return
	 * @since version 1.0
	 */
	public Cercetator getCercetatorById(int id){
		return CercetatorFactory.getCercetatorById(id, list);
	}

	/**
	 * Metoda intoarce Cercetator cu numele <code>nume</code> si prenumele <code>prenume</code> daca exista, altfel <code>null</code>.
	 * 
	 * @param nume
	 * @param prenume
	 * @return
	 * @since version 1.0
	 */
	public Cercetator getCercetatorByNumeSiPrenume(String nume, String prenume){
		return CercetatorFactory.getCercetatorByNumeSiPrenume(nume, prenume, list);
	}

	/**
	 * Metoda intoarce Cercetatorul cu numarul de telefon <code>numarTelefon</code> daca exista, altfel <code>null</code>.
	 * 
	 * @param numarTelefon
	 * @return
	 * @since version 1.0
	 */
	public Cercetator getCCercetatorByNumarTelefon(String numarTelefon){
			return CercetatorFactory.getCercetatorByNumarTelefon(numarTelefon, list);
	}

	/**
	 * Metoda intoarce Cercetatorul cu email-ul <code>email</code> daca exista, altfel <code>null</code>.
	 * 
	 * @param email
	 * @return
	 * @since version 1.0
	 */
	public Cercetator getCercetatorByEmail(String email) {
		return CercetatorFactory.getCercetatorByEmail(email, list);
	}

	/**
	 * Metoda intoarce lista Cercetatorilor care au ca si domeniu de interes <code>domeniuInteres</code>.	 
	 * 
	 * @param domeniuInteres
	 * @return
	 * @since version 1.0
	 */
	public List<Cercetator> getCercetatorByDomeniuInteres(String domeniuInteres){
			return CercetatorFactory.getCercetatoriByDomeniuInteres(domeniuInteres, list);
	}
	
	
	
}
