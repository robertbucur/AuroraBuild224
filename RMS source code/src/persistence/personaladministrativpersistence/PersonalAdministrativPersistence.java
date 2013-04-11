package persistence.personaladministrativpersistence;
import java.util.List;


import model.PersonalAdministrativ;

/**
 * Contine metode de modificare sau de primire de informatii a personalelor
 * administrative din persistenta.
 *
 * User: Sindilar George
 */
public class PersonalAdministrativPersistence {
    /**
     * Lista care reprezinta persistenta.
     */
    private List<PersonalAdministrativ> list;

    /**
     * Constructorul persistentei pentru personale administrative
     *
     * @since version 1.0
     */
    public PersonalAdministrativPersistence(){

    }

    /**
     * Metoda salveaza in persistenta un Personal Administrativ.
     *
     * @param personalAdministrativ Personal administrativ ce se doreste a fi salvat
     * @since version 1.0
     */
    public void save(PersonalAdministrativ personalAdministrativ){
        PersonalAdministrativRepository.save(personalAdministrativ, list);
    }

    /**
     * Metoda modifica in persistenta Personalul Administrativ cu id-ul lui <code>personalAdministrativ</code>
     * setand atributele lui <code>personalAdministrativ</code>.
     *
     * @param personalAdministrativ Personal Administrativ ce se doreste a fi modificat
     * @since version 1.0
     */
    public void update(PersonalAdministrativ personalAdministrativ){
        PersonalAdministrativRepository.update(personalAdministrativ, list);
    }

    /**
     * Metoda sterge din persistenta un Personal Administrativ cu id-ul lui <code>personalAdministrativ</code>.
     * Stergerea se face dupa id-ul din <code>personalAdministrativ</code>.
     *
     * @param personalAdministrativ Personal Administrativ ce se doreste a fi sters
     * @since version 1.0
     */
    public void delete(PersonalAdministrativ personalAdministrativ){
        PersonalAdministrativRepository.delete(personalAdministrativ, list);
    }



    /**
     * Metoda intoarce Personalul Administrativ cu id-ul <code>id</code> daca exista, altfel <code>null</code>.
     *
     * @param id
     * @return
     * @since version 1.0
     */
    public PersonalAdministrativ getPersonalAdministrativById(int id){
        return PersonalAdministrativFactory.getPersonalAdministrativById(id, list);
    }

    /**
     * Metoda intoarce Personalul administrativ cu numele <code>nume</code> si prenumele <code>prenume</code> daca
     * exista, altfel <code>null</code>.
     *
     * @param nume
     * @param prenume
     * @return
     * @since version 1.0
     */
    public PersonalAdministrativ getPersonalAdministrativByNumeSiPrenume(String nume, String prenume){
        return PersonalAdministrativFactory.getPersonalAdministrativByNumeSiPrenume(nume, prenume, list);
    }

    /**
     * Metoda intoarce Personalul Administrativ cu numarul de telefon <code>numarTelefon</code> daca exista,
     * altfel <code>null</code>.
     *
     * @param numarTelefon
     * @return
     * @since version 1.0
     */
    public PersonalAdministrativ getPersonalAdministrativByNumarTelefon(String numarTelefon){
        return PersonalAdministrativFactory.getPersonalAdministrativByNumarTelefon(numarTelefon, list);
    }

    /**
     * Metoda intoarce Personalul Administrativ cu email-ul <code>email</code> daca exista, altfel <code>null</code>.
     *
     * @param email
     * @return
     * @since version 1.0
     */
    public PersonalAdministrativ getPersonalAdministrativByEmail(String email) {
        return PersonalAdministrativFactory.getPersonalAdministrativByEmail(email, list);
    }

    /**
     * Metoda intoarce lista Personalelor Administrative care au ca si domeniu de interes <code>domeniuInteres</code>.
     *
     * @param domeniuInteres
     * @return
     * @since version 1.0
     */
    public List<PersonalAdministrativ> getPersonalAdministrativByDomeniuInteres(String domeniuInteres){
        return PersonalAdministrativFactory.getPersonalAdministrativByDomeniuInteres(domeniuInteres, list);
    }



}
