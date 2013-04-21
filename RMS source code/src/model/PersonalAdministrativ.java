package model;

/**
 * Reprezinta o persoana care face parte din personalul administrativ al departamentului.
 *
 * @author Florin Mihalache
 * @version 1.0, 3 Aprilie 2013
 * @see ResursaUmana
 */
public class PersonalAdministrativ extends ResursaUmana {
    private int id;

    /**
     * Constructor pentru clasa <code>PersonalAdministrativ</code>.
     * Celelelte atribuite vor fi initializate prin intermediul setterilor.
     * @param nume numele
     * @param prenume prenumele
     * @param numarTelefon numarul de telefon
     * @param email adresa de e-mail
     * @param domeniiInteres domeniile de interes
     * @param parola parola de login
     */
    public PersonalAdministrativ(String nume, String prenume, String numarTelefon, String email, String domeniiInteres, String parola) {
        super(nume, prenume, numarTelefon, email, domeniiInteres, parola);
    }

    public PersonalAdministrativ() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PersonalAdministrativ that = (PersonalAdministrativ) o;

        if (id != that.id) return false;

        return true;
    }
}
