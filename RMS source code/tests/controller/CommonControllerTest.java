package controller;

import model.CadruDidactic;
import model.Norma;
import model.ResursaUmana;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import persistence.cadrudidacticpersistence.CadruDidacticPersistence;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Author: Florin Mihalache
 * Date: 23.04.2013
 * Time: 21:51
 */
public class CommonControllerTest {
    private static CadruDidacticPersistence cadruDidacticPersistence;
    private static CommonController commonController;
    private static CadruDidactic cd1;
    private static CadruDidactic cd2;

    @BeforeClass
    public static void initialize() {
        cadruDidacticPersistence = CadruDidacticPersistence.instance();
        commonController = new CommonController();

        cd1 = new CadruDidactic();
        cd1.setNume("Mihu");
        cd1.setPrenume("Cosmin");
        cd1.setEmail("cosmin@gmail.com");
        cd1.setParola("parola1");
        cd1.setDomeniiInteres("c++,java,c#,android,ios");
        cd1.setDirector(false);
        cd1.setPostDidactic("developer");
        cd1.setNorma(new Norma(5, 6, 8));

        cd2 = new CadruDidactic();
        cd2.setNume("Mihu");
        cd2.setPrenume("Cristi");
        cd2.setEmail("cristi@gmail.com");
        cd2.setParola("parola2");
        cd2.setDomeniiInteres("facebook");
        cd2.setDirector(false);
        cd2.setPostDidactic("???");
        cd2.setNorma(new Norma(8, 7, 8));

        int id;
        id = cadruDidacticPersistence.save(cd1);
        cd1.setId(id);
        id = cadruDidacticPersistence.save(cd2);
        cd2.setId(id);
    }

    @AfterClass
    public static void cleanUp() {
        cadruDidacticPersistence.delete(cd1);
        cadruDidacticPersistence.delete(cd2);
    }

    @Test
    public void getAllResursaUmana() {
        List<ResursaUmana> list = commonController.getAllResursaUmana();

        assertEquals(2, list.size());
        assertEquals("cosmin@gmail.com", list.get(0).getEmail());
        assertEquals("cristi@gmail.com", list.get(1).getEmail());
        assertTrue(list.get(0) instanceof CadruDidactic);
    }
}
