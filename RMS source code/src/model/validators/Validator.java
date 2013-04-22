package model.validators;

/**
 * Interfata <code>Validator</code> stabileste metodele comune
 * pentru orice clasa de tip validator.
 *
 * @author Florin Mihalache
 * @version 1.0, 22 aprilie 2013
 */
public interface Validator {
    /**
     * Valideaza un obiect din model
     * @param o obiectul validat
     * @return true daca obiectul este valid, false altfel
     */
    public boolean validate(Object o);
}
