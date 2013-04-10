package persistance.cadrudidacticpersistence;

import java.util.List;


import model.CadruDidactic;

/**
 * Contine metode de modificare sau de primire de informatii a cadrelor
 * didactice din persistenta. 
 *
 * @author Mihu Dumitru-Cosmin
 * @version 1.0, 10 aprolie 2013
 */
public class CadruDidacticPersistence {
	/**
	 * Lista care reprezinta persistenta.
	 */
	private List<CadruDidactic> list;
	
	/**
	 * Constructorul persistentei pentru cadre didactice
	 * 
	 * @since version 1.0
	 */
	public CadruDidacticPersistence(){
		
	}
	
	/**
	 * Metoda salveaza in persistenta un Cadru Didactic.
	 * 
	 * @param cadruDidactic Cadru Didactic ce se doreste a fi salvat
	 * @since version 1.0
	 */
	public void save(CadruDidactic cadruDidactic){
		CadruDidacticRepository.save(cadruDidactic, list);
	}
	
	/**
	 * Metoda modifica in persistenta Cadrul Didactic cu id-ul lui <code>cadruDidactic</code>
	 * setand atributele lui <code>cadruDidactic</code>.
	 * 
	 * @param cadruDidactic Cadru Didactic ce se doreste a fi modificat
	 * @since version 1.0
	 */
	public void update(CadruDidactic cadruDidactic){
		CadruDidacticRepository.update(cadruDidactic, list);
	}
	
	/**
	 * Metoda sterge din persistenta un Cadru Didactic cu id-ul lui <code>cadruDidactic</code>.
	 * Stergerea se face dupa id-ul din <code>cadruDidactic</code>.
	 * 
	 * @param cadruDidactic Cadru Didactic ce se doreste a fi sters
	 * @since version 1.0
	 */
	public void delete(CadruDidactic cadruDidactic){
		CadruDidacticRepository.delete(cadruDidactic, list);
	}
	
	
	
	/**
	 * Metoda intoarce Cadrul Didactic cu id-ul <code>id</code> daca exista, altfel <code>null</code>.
	 * 
	 * @param id
	 * @return
	 * @since version 1.0
	 */
	public CadruDidactic getCadruDidacticById(int id){
		return CadruDidacticFactory.getCadruDidacticById(id, list);
	}

	/**
	 * Metoda intoarce Cadrul Didactic cu numele <code>nume</code> si prenumele <code>prenume</code> daca exista, altfel <code>null</code>.
	 * 
	 * @param nume
	 * @param prenume
	 * @return
	 * @since version 1.0
	 */
	public CadruDidactic getCadruDidacticByNumeSiPrenume(String nume, String prenume){
		return CadruDidacticFactory.getCadruDidacticByNumeSiPrenume(nume, prenume, list);
	}

	/**
	 * Metoda intoarce Cadrul Didactic cu numarul de telefon <code>numarTelefon</code> daca exista, altfel <code>null</code>.
	 * 
	 * @param numarTelefon
	 * @return
	 * @since version 1.0
	 */
	public CadruDidactic getCadruDidacticByNumarTelefon(int numarTelefon){
			return CadruDidacticFactory.getCadruDidacticByNumarTelefon(numarTelefon, list);
	}

	/**
	 * Metoda intoarce Cadrul Didactic cu email-ul <code>email</code> daca exista, altfel <code>null</code>.
	 * 
	 * @param email
	 * @return
	 * @since version 1.0
	 */
	public CadruDidactic getCadruDidacticByEmail(String email) {
		return CadruDidacticFactory.getCadruDidacticByEmail(email, list);
	}

	/**
	 * Metoda intoarce lista Cadrelor Didactice care au ca si domeniu de interes <code>domeniuInteres</code>.	 
	 * 
	 * @param domeniuInteres
	 * @return
	 * @since version 1.0
	 */
	public List<CadruDidactic> getCadruDidacticByDomeniuInteres(String domeniuInteres){
			return CadruDidacticFactory.getCadruDidacticByDomeniuInteres(domeniuInteres, list);
	}
	
	
}
