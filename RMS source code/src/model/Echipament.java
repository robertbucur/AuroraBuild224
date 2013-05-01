package model;

/**
 * Reprezinta un echipament care este la dispozitia departamentului.
 *
 * @author Florin Mihalache
 * @version 1.0, 3 Aprilie 2013
 */
public class Echipament implements ResursaLogistica{
    private int id;
    private String tip;
    private String model;

    /**
     * Constructor pentru clasa <code>Echipament</code>.
     *
     * @param tipEchipament tipul echipamentului
     * @param modelEchipament modelul echipamentului
     */
    public Echipament(String tipEchipament, String modelEchipament) {
        this.model = modelEchipament;
        this.tip = tipEchipament;
    }

    public Echipament() {}

    public String getModelEchipament() {
        return model;
    }

    public void setModelEchipament(String modelEchipament) {
        this.model = modelEchipament;
    }

    public String getTipEchipament() {
        return tip;
    }

    public void setTipEchipament(String tipEchipament) {
        this.tip = tipEchipament;
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

        Echipament that = (Echipament) o;

        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
