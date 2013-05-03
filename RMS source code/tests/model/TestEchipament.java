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
        assertEquals("Camera foto", e.getTip());
        assertEquals("Canon EOS 5D", e.getModel());

        //testez getteri/setteri
        e.setId(15);
        e.setModel("HP XYZ");
        e.setTip("Imprimanta");

        assertEquals(15, e.getId());
        assertEquals("Imprimanta", e.getTip());
        assertEquals("HP XYZ", e.getModel());
    }
}
