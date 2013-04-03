package model;

import java.util.Set;

/**
 * Clasa <code>CadruDidactic</code> reprezinta un cadru didactic din cadrul departamentului.
 *
 * @author Florin Mihalache
 * @version 1.0, 3 Aprilie 2013
 * @see ResursaUmana, Norma
 */
public class CadruDidactic extends ResursaUmana{
    private String postDidactic;
    private Norma norma;
    private boolean director;

    /**
     * Constructor pentru clasa <code>CadruDidactic</code>.
     * Initial atributul <code>director</code> este <code>false</code>.
     * Celelelte atribuite vor fi initializate prin intermediul setterilor.
     *
     * @param nume numele
     * @param prenume prenumele
     * @param numarTelefon numarul de telefon
     * @param email adresa de e-mail
     * @param domeniiInteres domeniile de interes
     */
    public CadruDidactic(String nume, String prenume, int numarTelefon, String email, Set<String> domeniiInteres) {
        super(nume, prenume, numarTelefon, email, domeniiInteres);
        this.director = false;
    }

    public boolean isDirector() {
        return director;
    }

    public void setDirector(boolean director) {
        this.director = director;
    }

    public Norma getNorma() {
        return norma;
    }

    public void setNorma(Norma norma) {
        this.norma = norma;
    }

    public String getPostDidactic() {
        return postDidactic;
    }

    public void setPostDidactic(String postDidactic) {
        this.postDidactic = postDidactic;
    }
}
