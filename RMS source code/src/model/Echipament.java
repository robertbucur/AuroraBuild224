package model;

/**
 * Reprezinta un echipament care este la dispozitia departamentului.
 *
 * @author Florin Mihalache
 * @version 1.0, 3 Aprilie 2013
 */
public class Echipament implements ResursaLogistica{
    private String tipEchipament;
    private String modelEchipament;

    /**
     * Constructor pentru clasa <code>Echipament</code>.
     *
     * @param tipEchipament tipul echipamentului
     * @param modelEchipament modelul echipamentului
     */
    public Echipament(String tipEchipament, String modelEchipament) {
        this.modelEchipament = modelEchipament;
        this.tipEchipament = tipEchipament;
    }

    public String getModelEchipament() {
        return modelEchipament;
    }

    public void setModelEchipament(String modelEchipament) {
        this.modelEchipament = modelEchipament;
    }

    public String getTipEchipament() {
        return tipEchipament;
    }

    public void setTipEchipament(String tipEchipament) {
        this.tipEchipament = tipEchipament;
    }
}
