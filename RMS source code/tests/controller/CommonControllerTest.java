package controller;

import model.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import persistence.cadrudidacticpersistence.CadruDidacticPersistence;
import persistence.echipamentpersistence.EchipamentPersistence;
import persistence.salapersistence.SalaPersistence;

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
    private static EchipamentPersistence echipamentPersistence;
    private static SalaPersistence salaPersistence;
    private static CommonController commonController;
    private static CadruDidactic cd1;
    private static CadruDidactic cd2;
    private static Echipament ech1;
    private static Echipament ech2;
    private static Sala sala1;
    private static Sala sala2;

    @BeforeClass
    public static void initialize() {
        cadruDidacticPersistence = CadruDidacticPersistence.instance();
        echipamentPersistence = EchipamentPersistence.instance();
        commonController = new CommonController();

        /***************************************
             CadruDidactic
         **************************************/
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

        /***************************************
            Echipament
         **************************************/
        ech1 = new Echipament();
        ech1.setTip("Imprimanta");
        ech1.setModel("Epson 2");

        ech2 = new Echipament();
        ech2.setTip("Camera foto");
        ech2.setModel("Canon EOS 5D Mark III");

        id = echipamentPersistence.save(ech1);
        ech1.setId(id);
        id = echipamentPersistence.save(ech2);
        ech2.setId(id);

        /***************************************
             Sala
         **************************************/
        sala1 = new Sala();
        sala1.setCodSala("21");
        sala1.setNrLocuri(30);

        sala2 = new Sala();
        sala2.setCodSala("C4");
        sala2.setNrLocuri(1337);

        id = salaPersistence.save(sala1);
        sala1.setId(id);
        id = salaPersistence.save(sala2);
        sala2.setId(id);
    }

    @AfterClass
    public static void cleanUp() {
        cadruDidacticPersistence.delete(cd1);
        cadruDidacticPersistence.delete(cd2);
        echipamentPersistence.delete(ech1);
        echipamentPersistence.delete(ech2);
        salaPersistence.delete(sala1);
        salaPersistence.delete(sala2);
    }

    @Test
    public void getAllResursaUmana() {
        List<ResursaUmana> list = commonController.getAllResursaUmana();

        assertEquals("cosmin@gmail.com", list.get(list.size()-2).getEmail());
        assertEquals("cristi@gmail.com", list.get(list.size()-1).getEmail());
        assertTrue(list.get(0) instanceof CadruDidactic);
    }

    @Test
    public void getAllEchipament() {
        List<Echipament> list = commonController.getAllEchipament();

        assertEquals("Imprimanta", list.get(list.size()-2).getTip());
        assertEquals("Canon EOS 5D Mark III", list.get(list.size()-1).getModel());
    }

    @Test
    public void getAllSala() {
        List<Sala> list = commonController.getAllSala();

        assertEquals("21", list.get(list.size()-2).getCodSala());
        assertEquals(1337, list.get(list.size()-1).getNrLocuri());
    }
}
