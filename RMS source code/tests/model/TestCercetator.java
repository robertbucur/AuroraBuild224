package model;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
* Author: Florin Mihalache
* Date: 15.04.2013
* Time: 17:37
*/
public class TestCercetator {
    @Test
    public void testCercetator() {
        Set<String> domeniiInteres = new HashSet<String>();
        domeniiInteres.add("domeniu1");
        domeniiInteres.add("domeniu2");

        //testez constructorul
        Cercetator c = new Cercetator("Pop", "Mircea", "0723456555", "email@domain.com", "domeniu1; domeniu2", "1234");

        assertNotNull(c);

        assertEquals("Pop", c.getNume());
        assertEquals("0723456555", c.getNumarTelefon());
        assertTrue(c.getDomeniiInteres().contains("domeniu2"));

        //testez getteri/setter
        c.setId(12);

        assertEquals(12, c.getId());
    }
}
