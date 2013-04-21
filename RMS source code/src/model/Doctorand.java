package model;

/**
 * Reprezinta un doctorand din cadrul departamentului.
 *
 * @author Florin Mihalache
 * @version 1.0, 3 Aprilie 2013
 * @see ResursaUmana
 */
public class Doctorand extends ResursaUmana {
    private int id;
    private String specializare;

    /**
     * Constructor pentru clasa <code>ResursaUmana</code>.
     * Celelelte atribuite vor fi initializate prin intermediul setterilor.
     *
     * @param nume numele
     * @param prenume prenumele
     * @param numarTelefon numarul de telefon
     * @param email adresa de e-mail
     * @param domeniiInteres domeniile de interes
     * @param parola parola de login
     */
    public Doctorand(String nume, String prenume, String numarTelefon, String email, String domeniiInteres, String parola) {
        super(nume, prenume, numarTelefon, email, domeniiInteres, parola);
    }

    public Doctorand() {}

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

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

        Doctorand doctorand = (Doctorand) o;

        if (id != doctorand.id) return false;

        return true;
    }
}
