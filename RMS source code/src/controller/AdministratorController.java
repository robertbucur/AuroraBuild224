package controller;

import model.*;
import model.validator.*;
import persistence.cadrudidacticpersistence.CadruDidacticPersistence;
import persistence.echipamentpersistence.EchipamentPersistence;
import persistence.personaladministrativpersistence.PersonalAdministrativPersistence;
import persistence.salapersistence.SalaPersistence;

import java.util.HashSet;

/**
 *
 * @author Alexandru
 */
public class AdministratorController extends CommonController {
    private CadruDidacticPersistence cadruDidacticPersistence;
    private PersonalAdministrativPersistence personalAdministrativPersistence;
    private SalaPersistence salaPersistence;
    private EchipamentPersistence echipamentPersistence;


    public AdministratorController() {
        cadruDidacticPersistence = CadruDidacticPersistence.instance();
        personalAdministrativPersistence = new PersonalAdministrativPersistence();
        salaPersistence = new SalaPersistence();
        echipamentPersistence = new EchipamentPersistence();
    }

    /**
     * Adaugarea unui cadru didactic
     * @param nume
     * @param prenume
     * @param numarTelefon
     * @param email
     * @param domeniiInteres
     * @param parola
     * @param postDidactic
     * @param director
     * @return id-ul cadrului didactic tocmai salvat in caz de succes, altfel -1
     */
    public CadruDidactic addCadruDidactic(String nume,
                                    String prenume,
                                    String numarTelefon,
                                    String email,
                                    String domeniiInteres,
                                    String parola,
                                    String postDidactic,
                                    boolean director) {

        CadruDidactic cadruDidactic = new CadruDidactic(nume, prenume, numarTelefon, email, domeniiInteres, parola);
        cadruDidactic.setPostDidactic(postDidactic);
        cadruDidactic.setDirector(director);
        cadruDidactic.setNorma(new Norma(0, 0, 0));  //norma va fi importata ulterior, initial e 0

        Validator validator = new CadruDidacticValidator();
        if (validator.validate(cadruDidactic)) {
            int result = cadruDidacticPersistence.save(cadruDidactic);
            if (result != -1)
                return cadruDidactic;
        }

        return null;
    }


    /**
     * Adauga unui personal administrativ
     * @param nume
     * @param prenume
     * @param numarTelefon
     * @param email
     * @param domeniiInteres
     * @param parola
     * @return id-ul personalului administrativ tocmai salvat in caz de succes, altfel null
     */
    public PersonalAdministrativ addPersonalAdministrativ (String nume, String prenume, String numarTelefon, String email, String domeniiInteres, String parola)
    {

        PersonalAdministrativ pa = new PersonalAdministrativ(nume, prenume, numarTelefon, email, domeniiInteres, parola);
        Validator validator = new PersonalAdministrativValidator();
        if (validator.validate(pa)) {
            personalAdministrativPersistence.save(pa);
            return pa;
        }
        return null;

    }

    /**
     * Adauga Sala Noua
     * @param codSala
     * @param numarLocuri
     * @return id-ul salii tocmai salvat in caz de succes, altfel null
     */
    public Sala addSala (String codSala, int numarLocuri)
    {

        Sala sala = new Sala(codSala, numarLocuri);
        Validator validator = new SalaValidator();
        if (validator.validate(sala)) {
            salaPersistence.save(sala);
            return sala;
        }
        return null;

    }

    /**
     * Adauga Echipament Nou
     * @param tipEchipament
     * @param modelEchipament
     * @return id-ul echipamentului tocmai salvat in caz de succes, altfel null
     */
    public Echipament addEchipament (String tipEchipament, String modelEchipament)
    {

        Echipament e = new Echipament(tipEchipament, modelEchipament);
        Validator validator = new EchipamentValidator();
        if (validator.validate(e)) {
            echipamentPersistence.save(e);
            return e;
        }
        return null;

    }

    /**
     * Modificarea unui cadru didactic
     * @param cadruDidactic
     */
    public CadruDidactic updateCadruDidactic (CadruDidactic cadruDidactic)
    {
        Validator validator = new CadruDidacticValidator();
        if (validator.validate(cadruDidactic)) {
            boolean ok = cadruDidacticPersistence.update(cadruDidactic);
            if (ok == true)
                return cadruDidactic;
        }
        return null;
    }
    /**
     * Modificarea unui personal administrativ
     * Trebuie modificat in persistenta in loc de void --> boolean
     * @param personalAdministrativ
     */
    public PersonalAdministrativ  updatePersonalAdministrativ (PersonalAdministrativ personalAdministrativ)
    {
        Validator validator = new PersonalAdministrativValidator();
        if (validator.validate(personalAdministrativ)){
           //boolean    ok = personalAdministrativPersistence.update(personalAdministrativ);
           // if (ok == true)
               // return personalAdministrativ;
        }
        return null;
        }
    /**
     * Modificarea unui echipament
     * @param echipament
     */
    public Echipament updateEchipament (Echipament echipament)
    {
        Validator validator = new EchipamentValidator();
        if(validator.validate(echipament)){
           // boolean ok = echipamentPersistence.update(echipament);
           //  if(ok == true)
                // return echipament;
        }
        return null;

    }
    /**
     * Modificarea unei sali
     * @param sala
     */
    public Sala updateSala (Sala sala)
    {
        Validator validator = new SalaValidator();
        if(validator.validate(sala)){
           // boolean ok = salaPersistence.update(sala);
           // if(ok == true)
               // return sala;
        }
        return null;
    }
}
