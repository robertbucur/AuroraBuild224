package model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Author: Florin Mihalache
 * Date: 15.04.2013
 * Time: 17:50
 */
public class TestNorma {
    @Test
    public void testNorma() {
        //testez constructorul
        Norma n = new Norma(12, 4, 2);

        assertNotNull(n);
        assertEquals(12, n.getOreCurs());
        assertEquals(4, n.getOreSeminar());
        assertEquals(2, n.getOreLaborator());

        //testez getteri/setteri
        n.setId(15);
        n.setOreCurs(5);
        n.setOreLaborator(2);
        n.setOreSeminar(0);

        assertEquals(15, n.getId());
        assertEquals(5, n.getOreCurs());
        assertEquals(2, n.getOreLaborator());
        assertEquals(0, n.getOreSeminar());
    }
}
