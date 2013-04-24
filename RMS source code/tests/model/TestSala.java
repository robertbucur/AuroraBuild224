package model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Author: Florin Mihalache
 * Date: 15.04.2013
 * Time: 18:03
 */
public class TestSala {
    @Test
    public void testSala() {
        //testez constructorul
        Sala s = new Sala("A3", 5);

        assertNotNull(s);
        assertEquals("A3", s.getCodSala());
        assertEquals(5, s.getNrLocuri());

        //testez getteri/setteri
        s.setId(22);
        s.setCodSala("44/2");
        s.setNrLocuri(200);

        assertEquals(22, s.getId());
        assertEquals("44/2", s.getCodSala());
        assertEquals(200, s.getNrLocuri());

    }
}
