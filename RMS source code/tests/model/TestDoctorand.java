package model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: Florin Mihalache
 * Date: 15.04.2013
 * Time: 17:42
 */
public class TestDoctorand {
    @Test
    public void testDoctorand() {
        //testez constructorul
        Doctorand d = new Doctorand("Pop", "Mircea", "0723456555", "email@domain.com", "domeniu1; domeniu2", "1234");

        assertNotNull(d);

        assertEquals("Pop", d.getNume());
        assertEquals("0723456555", d.getNumarTelefon());
        assertTrue(d.getDomeniiInteres().contains("domeniu2"));

        //testez getteri/setteri
        d.setId(12);
        d.setSpecializare("Specializarea lui");

        assertEquals(12, d.getId());
        assertEquals("Specializarea lui", d.getSpecializare());
    }
}
