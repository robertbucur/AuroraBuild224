package controller;

import model.CadruDidactic;
import org.junit.BeforeClass;
import org.junit.Test;
import persistence.cadrudidacticpersistence.CadruDidacticPersistence;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Author: Florin Mihalache
 * Date: 22.04.2013
 * Time: 22:39
 */
public class AdministratorControllerTest {
    private static CadruDidacticPersistence persistence;
    private static AdministratorController controller;

    @BeforeClass
    public static void initialize() {
        persistence = CadruDidacticPersistence.instance();
        controller = new AdministratorController();
    }

    @Test
    public void addCadruDidactic() {
        CadruDidactic cd = controller.addCadruDidactic("Andrei", "Pop", "07222222", "email@cadru.cd",
                "informatica; altele", "as214sd", "post", false);

        CadruDidactic cdX = persistence.getCadruDidacticById(cd.getId());
        if (cdX == null)
            fail("Salvare incorecta");
        else
            assertEquals("Salvare incorecta", cd.getId(), cdX.getId());

        persistence.delete(cdX);
    }
}
