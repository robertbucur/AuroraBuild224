package model;

/**
 * Reprezinta o resursa financiara din cadrul departamentului.
 *
 * @author Florin Mihalache
 * @version 1.0, 3 Aprilie 2013
 */
public  class ResursaFinanciara implements Resursa {
    private int id;
    private String sursaFonduri;
    private int cuantumFonduri;
    private String moneda;

    /**
     * Constructor pentru clasa <code>ResursaFinanciara</code>.
     *
     * @param sursaFonduri sursa fondurilor
     * @param cuantumFonduri suma primita de departament
     * @param moneda moneda in care sunt primite fondurile
     */
    public ResursaFinanciara(String sursaFonduri, int cuantumFonduri, String moneda) {
        this.cuantumFonduri = cuantumFonduri;
        this.moneda = moneda;
        this.sursaFonduri = sursaFonduri;
    }

    public int getCuantumFonduri() {
        return cuantumFonduri;
    }

    public void setCuantumFonduri(int cuantumFonduri) {
        this.cuantumFonduri = cuantumFonduri;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getSursaFonduri() {
        return sursaFonduri;
    }

    public void setSursaFonduri(String sursaFonduri) {
        this.sursaFonduri = sursaFonduri;
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

        ResursaFinanciara that = (ResursaFinanciara) o;

        if (id != that.id) return false;

        return true;
    }
}
