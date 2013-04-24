package controller;

import model.CadruDidactic;
import model.Norma;
import model.validator.CadruDidacticValidator;
import model.validator.Validator;
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
}
