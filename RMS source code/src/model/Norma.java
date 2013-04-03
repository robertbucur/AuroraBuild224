package model;

/**
 * Reprezinta norma unui cadru didactic din cadrul departamentului.
 *
 * @author Florin Mihalache
 * @version 1.0, 3 Aprilie 2013
 * @see CadruDidactic
 */
public class Norma {
    private int oreCurs;
    private int oreSeminar;
    private int oreLaborator;

    /**
     * Constructor pentru clasa <code>Norma</code>.
     *
     * @param oreCurs numarul orelor de curs
     * @param oreSeminar numarul orelor de seminar
     * @param oreLaborator numarul orelor de laborator
     */
    public Norma(int oreCurs, int oreSeminar, int oreLaborator) {
        this.oreCurs = oreCurs;
        this.oreLaborator = oreLaborator;
        this.oreSeminar = oreSeminar;
    }

    public int getOreCurs() {
        return oreCurs;
    }

    public void setOreCurs(int oreCurs) {
        this.oreCurs = oreCurs;
    }

    public int getOreLaborator() {
        return oreLaborator;
    }

    public void setOreLaborator(int oreLaborator) {
        this.oreLaborator = oreLaborator;
    }

    public int getOreSeminar() {
        return oreSeminar;
    }

    public void setOreSeminar(int oreSeminar) {
        this.oreSeminar = oreSeminar;
    }
}
