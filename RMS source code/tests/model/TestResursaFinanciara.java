package model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Author: Florin Mihalache
 * Date: 15.04.2013
 * Time: 17:57
 */
public class TestResursaFinanciara {
    @Test
    public void testResursaFinanciara() {
        //testez constructorul
        ResursaFinanciara rf = new ResursaFinanciara("O mare companie", 30000, "Euro");

        assertNotNull(rf);
        assertEquals("O mare companie", rf.getSursaFonduri());
        assertEquals(30000, rf.getCuantumFonduri());
        assertEquals("Euro", rf.getMoneda());

        //testez setteri/getteri
        rf.setId(11);
        rf.setSursaFonduri("Alta companie");
        rf.setCuantumFonduri(2000);
        rf.setMoneda("Lei");

        assertEquals(11, rf.getId());
        assertEquals("Alta companie", rf.getSursaFonduri());
        assertEquals(2000, rf.getCuantumFonduri());
        assertEquals("Lei", rf.getMoneda());
    }
}
