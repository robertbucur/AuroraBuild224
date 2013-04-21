package model;

/**
 * Reprezinta un cercetator din cadrul departamentului.
 *
 * @author Florin Mihalache
 * @version 1.0, 3 Aprilie 2013
 * @see ResursaUmana
 */
public class Cercetator extends ResursaUmana {
    private int id;

    /**
     * Constructor pentru clasa <code>Cercetator</code>.
     * Celelelte atribuite vor fi initializate prin intermediul setterilor.
     *
     * @param nume numele
     * @param prenume prenumele
     * @param numarTelefon numarul de telefon
     * @param email adresa de e-mail
     * @param domeniiInteres domeniile de interes
     * @param parola parola de login
     */
    public Cercetator(String nume, String prenume, String numarTelefon, String email, String domeniiInteres, String parola) {
        super(nume, prenume, numarTelefon, email, domeniiInteres, parola);
    }

    public Cercetator() {}

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

        Cercetator that = (Cercetator) o;

        if (id != that.id) return false;

        return true;
    }
}
