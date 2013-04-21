package model;

/**
 * Clasa abstracta ce reprezinta o resursa umana din cadrul departamentului.
 *
 * @author Florin Mihalache
 * @version 1.0, 3 Aprilie 2013
 */
public abstract class ResursaUmana implements Resursa {
    protected String nume;
    protected String prenume;
    protected String numarTelefon;
    protected String email;
    protected String domeniiInteres;
    protected String parola;

    /**
     * Constructor pentru clasa <code>ResursaUmana</code>.
     *
     * @param nume numele
     * @param prenume prenumele
     * @param numarTelefon numarul de telefon
     * @param email adresa de e-mail
     * @param domeniiInteres domeniile de interes
     * @param parola parola de login
     */
    public ResursaUmana(String nume, String prenume, String numarTelefon, String email, String domeniiInteres, String parola) {
        this.nume = nume;
        this.prenume = prenume;
        this.numarTelefon = numarTelefon;
        this.email = email;
        this.domeniiInteres = domeniiInteres;
        this.parola = parola;
    }

    public ResursaUmana() {}

    public String getDomeniiInteres() {
        return domeniiInteres;
    }

    public void setDomeniiInteres(String domeniiInteres) {
        this.domeniiInteres = domeniiInteres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResursaUmana that = (ResursaUmana) o;

        if (!email.equals(that.email)) return false;
        if (!nume.equals(that.nume)) return false;
        if (!prenume.equals(that.prenume)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nume.hashCode();
        result = 31 * result + prenume.hashCode();
        result = 31 * result + email.hashCode();
        return result;
    }
}
