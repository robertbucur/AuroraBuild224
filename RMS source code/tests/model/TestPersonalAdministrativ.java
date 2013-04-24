package model;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Author: Florin Mihalache
 * Date: 15.04.2013
 * Time: 17:54
 */
public class TestPersonalAdministrativ {
    @Test
    public void testPersonalAdministrativ() {
        Set<String> domeniiInteres = new HashSet<String>();
        domeniiInteres.add("domeniu1");
        domeniiInteres.add("domeniu2");

        //testez constructorul
        PersonalAdministrativ pa = new PersonalAdministrativ("Pop", "Mircea", "0723456555", "email@domain.com", "domeniu1; domeniu2", "1234");

        assertNotNull(pa);

        assertEquals("Pop", pa.getNume());
        assertEquals("0723456555", pa.getNumarTelefon());
        assertTrue(pa.getDomeniiInteres().contains("domeniu2"));

        //testez getteri/setteri
        pa.setId(12);

        assertEquals(12, pa.getId());
    }
}
