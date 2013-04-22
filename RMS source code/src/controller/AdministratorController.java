package controller;

import model.CadruDidactic;
import model.validators.CadruDidacticValidator;
import model.validators.Validator;
import persistence.cadrudidacticpersistence.CadruDidacticPersistence;

/**
 *
 * @author Alexandru
 */
public class AdministratorController extends CommonController {
    private CadruDidacticPersistence cadruDidacticPersistence;


    public AdministratorController() {
        cadruDidacticPersistence = CadruDidacticPersistence.instance();
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
    public int addCadruDidactic(String nume,
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

        Validator validator = new CadruDidacticValidator();
        if (validator.validate(cadruDidactic)) {
            return cadruDidacticPersistence.save(cadruDidactic);
        }

        return -1;
    }
}
