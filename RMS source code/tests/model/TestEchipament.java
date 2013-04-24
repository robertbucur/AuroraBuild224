package model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Author: Florin Mihalache
 * Date: 15.04.2013
 * Time: 17:45
 */
public class TestEchipament {
    @Test
    public void testEchipament() {
        //testez constructorul
        Echipament e = new Echipament("Camera foto", "Canon EOS 5D");

        assertNotNull(e);
        assertEquals("Camera foto", e.getTipEchipament());
        assertEquals("Canon EOS 5D", e.getModelEchipament());

        //testez getteri/setteri
        e.setId(15);
        e.setModelEchipament("HP XYZ");
        e.setTipEchipament("Imprimanta");

        assertEquals(15, e.getId());
        assertEquals("Imprimanta", e.getTipEchipament());
        assertEquals("HP XYZ", e.getModelEchipament());
    }
}
