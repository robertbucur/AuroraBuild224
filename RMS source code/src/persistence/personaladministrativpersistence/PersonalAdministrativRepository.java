package persistence.personaladministrativpersistence;

import java.util.List;

import model.PersonalAdministrativ;

/**
 * Created with IntelliJ IDEA.
 * User: grasu
 * Date: 4/11/13
 * Time: 4:52 AM
 */


class PersonalAdministrativRepository {

    /**
     * Metoda adauga un personal administrativ in persistenta.
     *
     * @param personalAdministrativ personalul administrativ care se doreste a fi adaugat
     * @param list lista unde se salveaza
     */
    static void save(PersonalAdministrativ personalAdministrativ, List<PersonalAdministrativ> list) {
        list.add(personalAdministrativ);
    }

    /**
     * Metoda modifica un Personal Administrativ in lista <code>list</code>. Cautarea
     * inainte de modificare se face dupa id-ul lui <code>perAdm</code>.
     * Pentru fiecare Personal Administrativ din lista care are acelasi id cu
     * <code>perAdm</code> i se modifica valorile cu cele ale lui
     * <code>perAdm</code>.
     *
     * @param personalAdministrativ
     *            Personalul Administrativ care se doreste a fi modificat, identificat prin id
     * @param list
     *            lista unde se modifica
     * @return cate astfel de obiecte au fost modificate
     * @since version 1.0
     */
    static int update(PersonalAdministrativ personalAdministrativ, List<PersonalAdministrativ> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).getId() == personalAdministrativ.getId()) {
                list.get(i).setNume(personalAdministrativ.getNume());
                list.get(i).setPrenume(personalAdministrativ.getPrenume());
                list.get(i).setEmail(personalAdministrativ.getEmail());
                list.get(i).setDomeniiInteres(personalAdministrativ.getDomeniiInteres());
                list.get(i).setNumarTelefon(personalAdministrativ.getNumarTelefon());
                count++;
            }
        return count;
    }

    /**
     * Metoda sterge un Personal Administrativ din lista <code>list</code>. Cautarea
     * inainte de stergere se face dupa id-ul lui <code>personalAdministrativ</code>.
     * Fiecare Personal Administrativ din lista care are acelasi id cu
     * <code>personalAdministrativ</code> se sterge din lista.
     *
     * @param personalAdministrativ
     *            Personalul Administrativ care se doreste a fi sters, identificat prin id
     * @param list
     *            lista unde se sterge
     * @return cate astfel de obiecte au fost sterse
     * @since version 1.0
     */
    public static int delete(PersonalAdministrativ personalAdministrativ,
                             List<PersonalAdministrativ> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).getId() == personalAdministrativ.getId()) {
                list.remove(i);
                count++;
            }
        return count;
    }

}
