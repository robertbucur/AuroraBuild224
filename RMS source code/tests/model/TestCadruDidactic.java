package model;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Author: Florin Mihalache
 * Date: 03.04.2013
 * Time: 19:54
 */
public class TestCadruDidactic {
    @Test
    public void testCadruDidactic() {
        Set<String> domeniiInteres = new HashSet<String>();
        domeniiInteres.add("domeniu1");
        domeniiInteres.add("domeniu2");

        //testez constructorul
        CadruDidactic cd1 = new CadruDidactic("Pop", "Mircea", "0723456555", "email@domain.com", domeniiInteres);
        CadruDidactic cd2 = new CadruDidactic("Pop", "Andrei", "0735566982", "altmail@domain.com", null );

        assertNotNull(cd1);
        assertNotNull(cd2);

        assertEquals("Pop", cd1.getNume());
        assertEquals("0723456555", cd1.getNumarTelefon());
        assertTrue(cd1.getDomeniiInteres().contains("domeniu2"));

        assertNull(cd2.getDomeniiInteres());
        assertFalse(cd2.isDirector());

        //testez getteri/setteri
        cd1.setId(12);
        cd1.setDirector(true);
        cd1.setPostDidactic("Post Didactic");
        Norma n = new Norma(4, 6, 0);
        cd1.setNorma(n);

        assertEquals(12, cd1.getId());
        assertTrue(cd1.isDirector());
        assertEquals("Post Didactic", cd1.getPostDidactic());
        assertEquals(n, cd1.getNorma());
    }
}
