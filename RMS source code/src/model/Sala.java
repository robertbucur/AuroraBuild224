package model;

/**
 * Reprezinta o sala care este la dispozitia departamentului.
 *
 * @author Florin Mihalache
 * @version 1.0, 3 Aprilie 2013
 */
public class Sala implements ResursaLogistica {
    private String codSala;
    private int nrLocuri;

    /**
     * Constructor pentru clasa <code>Sala</code>.
     *
     * @param codSala codul salii
     * @param nrLocuri numarul de locuri din sala
     */
    public Sala(String codSala, int nrLocuri) {
        this.codSala = codSala;
        this.nrLocuri = nrLocuri;
    }

    public String getCodSala() {
        return codSala;
    }

    public void setCodSala(String codSala) {
        this.codSala = codSala;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }
}
