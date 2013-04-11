package persistence.personaladministrativpersistence;

import java.util.ArrayList;
import java.util.List;

import model.PersonalAdministrativ;

/**
 * Created with IntelliJ IDEA.
 * User: grasu
 * Date: 4/11/13
 * Time: 4:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class PersonalAdministrativFactory {

    /**
     *  Metoda intoarece un obiect de tip <code>PersonalAdministrativ</code> din containerul
     * <code>list</code> care are id-ul <code>id</code>. Daca nu exsita un astfel
     * de obiect, metoda returneaza <code>null</code>.
     *
     * @param id id-ul personalului administrativ cautat
     * @param list containerul in care se cauta
     * @return personaul administrativ cu id-ul <code>id</code> daca exista, altfel <code>null</code>
     */

    static PersonalAdministrativ getPersonalAdministrativById(int id, List<PersonalAdministrativ> list) {
        for(int i = 0; i < list.size(); i++)
            if (list.get(i).getId() == id) {
                return list.get(i);
            }
        return null;

    }

    /**
     *
     * Metoda intoarece un obiect de tip <code>PersonalAdministrativ</code> din containerul
     * <code>list</code> care are numele <code>nume</code> si prenumele <code>prenume</code>.
     * Daca nu exsita un astfel de obiect, metoda returneaza <code>null</code>.
     *
     * @param nume numele personalului administrativ cautat
     * @param prenume prenumele personalului administrativ cautat
     * @param list containerul in care se cauta
     * @return personalul administrativ cu numele <code>nume</code> si prenumele <code>prenume</code> daca exista,
     * altfel <code>null</code>
     * @since version 1.0
     */
    static PersonalAdministrativ getPersonalAdministrativByNumeSiPrenume(String nume, String prenume,
                                                         List<PersonalAdministrativ> list) {
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).getNume().equals(nume)
                    && list.get(i).getPrenume().equals(prenume)) {
                return list.get(i);
            }
        return null;
    }

    /**
     * Metoda intoarece un obiect de tip <code>PersonalAdministrativ</code> din containerul
     * <code>list</code> care are numarul de telefon <code>numarTelefon</code>. Daca nu exsita un astfel
     * de obiect, metoda returneaza <code>null</code>.
     *
     * @param numarTelefon numarul de telefon al personalului administrativ cautat
     * @param list containerul in care se cauta
     * @return personalul administrativ cu id-ul  numarul de telefon <code>numarTelefon</code> daca exista,
     * altfel <code>null</code>
     * @since version 1.0
     */
    static PersonalAdministrativ getPersonalAdministrativByNumarTelefon(String numarTelefon,
                                                        List<PersonalAdministrativ> list) {
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).getNumarTelefon().equals(numarTelefon)) {
                return list.get(i);
            }
        return null;
    }

    /**
     * Metoda intoarece un obiect de tip <code>PersonalAdministrativ</code> din containerul
     * <code>list</code> care are email-ul <code>email</code>. Daca nu exsita un astfel
     * de obiect, metoda returneaza <code>null</code>.
     *
     * @param email email-ul personalului administrativ cautat
     * @param list containerul in care se cauta
     * @return personalul administrativ cu email-ul <code>email</code> daca exista, altfel <code>null</code>
     * @since version 1.0
     */
    static PersonalAdministrativ getPersonalAdministrativByEmail(String email, List<PersonalAdministrativ> list) {
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).getEmail().equals(email)) {
                return list.get(i);
            }
        return null;
    }

    /**
     * Metoda intoarece o lista de obiecte de tip <code>PersonalAdministrativ</code> din containerul
     * <code>list</code> care au ca si domeniu de interes <code>domeniuInteres</code>. Daca nu exsita un astfel
     * de obiect, metoda returneaza o lista goala.
     *
     * @param domeniuInteres doemniul de interes pe baza caruia se cauta personalele administrative
     * @param list containerul in care se cauta
     * @return lista cu personale administrative care au ca domeniu de interes <code>domeniuInteres</code>
     * @since version 1.0
     */

    static List<PersonalAdministrativ> getPersonalAdministrativByDomeniuInteres(String domeniuInteres,
                                                                List<PersonalAdministrativ> list) {
        List<PersonalAdministrativ> personalAdministrativ = new ArrayList<PersonalAdministrativ>();
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).getDomeniiInteres().contains(domeniuInteres)) {
                personalAdministrativ.add(list.get(i));
            }
        return personalAdministrativ;
    }

}
