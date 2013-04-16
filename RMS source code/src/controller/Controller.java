package controller;

import model.CadruDidactic;
import model.Norma;
import persistence.cadrudidacticpersistence.CadruDidacticPersistence;
import persistence.personaladministrativpersistence.PersonalAdministrativPersistence;

import java.util.HashSet;
import java.util.Set;

public class Controller {
    private CadruDidacticPersistence cadruDidacticPersistence;
    private PersonalAdministrativPersistence personalAdministrativPersistence;

    /**
     * Contructorul clasei Controller, primeste ca parametrii
     * @param cdr - Persistence Cadru Didactic
     * @param pap - Persistence Personal Administrativ
     */
    public Controller (CadruDidacticPersistence cdr , PersonalAdministrativPersistence pap){
        this.cadruDidacticPersistence = cdr;
        this.personalAdministrativPersistence = pap;
    }

    /**
     * Adauga Cadru Didactic Nou
     * @param nume
     * @param prenume
     * @param numarTelefon
     * @param email
     * @param domeniiInteres
     */
    public boolean addCadruDidactic (String nume,
            String prenume,
            String numarTelefon,
            String email,
            String domeniiInteres)
    {
        // La inceput un cadru didactic va avea norma neinitializata, aceasta fiind preluata ulterior din statele de functii

        Norma normaInitiala = new Norma (0,0,0);

        if ((nume.length() != 0) && (prenume.length()!=0) && (numarTelefon.length()!= 0) && (email.length() != 0) && (domeniiInteres.length() != 0))
        {
            // aici separ domeniile de interes dupa caracterul ";" si le pun intr-un vector de String
            String[] domeniiSeparate = domeniiInteres.split(";");
            // creez Set-ul de domenii de Interes pentru CadruDidactic
            // Initializat domeniiInteresAdd
            Set<String> domeniiInteresAdd = new HashSet<String>();
            for (int i = 0 ; i < domeniiSeparate.length; i++)
            {
                domeniiInteresAdd.add(domeniiSeparate[i]);
            }
            CadruDidactic cd = new CadruDidactic(nume, prenume, numarTelefon, email, domeniiInteresAdd);
            cadruDidacticPersistence.save(cd);
            return true;
        }else
        {
            return false;
        }
    }


}
