package model;

import java.util.Set;

/**
 * Reprezinta un doctorand din cadrul departamentului.
 *
 * @author Florin Mihalache
 * @version 1.0, 3 Aprilie 2013
 * @see ResursaUmana
 */
public class Doctorand extends ResursaUmana {
    private String specializare;

    /**
     * Constructor pentru clasa <code>ResursaUmana</code>.
     * Celelelte atribuite vor fi initializate prin intermediul setterilor.
     *
     * @param nume           numele
     * @param prenume        prenumele
     * @param numarTelefon   numarul de telefon
     * @param email          adresa de e-mail
     * @param domeniiInteres domeniile de interes
     */
    public Doctorand(String nume, String prenume, int numarTelefon, String email, Set<String> domeniiInteres) {
        super(nume, prenume, numarTelefon, email, domeniiInteres);
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }
}
