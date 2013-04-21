package persistance.cadrudidacticpersistence;

import model.CadruDidactic;
import model.Norma;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import persistence.cadrudidacticpersistence.CadruDidacticPersistence;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CadruDidacticPersistenceTest {
	static CadruDidacticPersistence rep;
	
	@BeforeClass
	public static void onlyOnce(){
		rep = CadruDidacticPersistence.instance();
	}
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void save() {
		CadruDidactic cd1 = new CadruDidactic();
		cd1.setNume("Mihu");
		cd1.setPrenume("Cosmin");
		cd1.setEmail("cosmin@gmail.com");
		cd1.setParola("parola1");
		cd1.setDomeniiInteres("c++,java,c#,android,ios");
		cd1.setDirector(false);
		cd1.setPostDidactic("developer");
		cd1.setNorma(new Norma(5, 6, 8));
		
		int id = rep.save(cd1);
		

		CadruDidactic cd = rep.getCadruDidacticById(id);
		if (cd == null)
			fail("Salvare incorecta");
		else
			assertEquals("Salvare incorecta", id, cd.getId());
	}
	
	@Test
	public void delete() {
		CadruDidactic cd1 = new CadruDidactic();
		cd1.setNume("Mihu");
		cd1.setPrenume("Cosmin");
		cd1.setEmail("cosmin@gmail.com");
		cd1.setParola("parola1");
		cd1.setDomeniiInteres("c++,java,c#,android,ios");
		cd1.setDirector(false);
		cd1.setPostDidactic("developer");
		cd1.setNorma(new Norma(5, 6, 8));
		
		int id = rep.save(cd1);
		
		
		rep.delete(cd1);

		CadruDidactic cd = rep.getCadruDidacticById(id);
		if (cd != null)
			fail("Salvare incorecta");
		
	}
	
	@Test
	public void update() {
		CadruDidactic cd1 = new CadruDidactic();
		cd1.setNume("Mihu");
		cd1.setPrenume("Cristi");
		cd1.setEmail("cristi@gmail.com");
		cd1.setParola("parola2");
		cd1.setDomeniiInteres("facebook");
		cd1.setDirector(false);
		cd1.setPostDidactic("???");
		cd1.setNorma(new Norma(8, 7, 8));
		
		int idS = rep.save(cd1);
		
		
		cd1.setNume("andrei");
		boolean cat = rep.update(cd1);
		
		assertEquals("Update incorecta", true, cat);

		CadruDidactic cd = rep.getCadruDidacticById(idS);
		if (cd == null)
			fail("Update incorecta");
		else {
			assertEquals("Update incorecta", idS, cd.getId());
			assertEquals("Update incorecta", cd1.getNume(), cd.getNume());
			assertEquals("Update incorecta", cd1.getPrenume(), cd.getPrenume());
		}
	}
	
	
	@Test
	public void getAllCadreDidactice() {
		CadruDidactic cd1 = new CadruDidactic();
		cd1.setNume("Mihu");
		cd1.setPrenume("Cosmin");
		cd1.setEmail("cosmin@gmail.com");
		cd1.setParola("parola1");
		cd1.setDomeniiInteres("c++,java,c#,android,ios");
		cd1.setDirector(false);
		cd1.setPostDidactic("developer");
		cd1.setNorma(new Norma(5, 6, 8));
		
		int id1 = rep.save(cd1);
		
		
		CadruDidactic cd2 = new CadruDidactic();
		cd2.setNume("Mihu");
		cd2.setPrenume("Cristi");
		cd2.setEmail("cristi@gmail.com");
		cd2.setParola("parola2");
		cd2.setDomeniiInteres("facebook");
		cd2.setDirector(false);
		cd2.setPostDidactic("???");
		cd2.setNorma(new Norma(8, 7, 8));
		
		int id2 = rep.save(cd2);
		
		CadruDidactic cdA = rep.getCadruDidacticById(id1);
		CadruDidactic cdB = rep.getCadruDidacticById(id2);
		
		List<CadruDidactic> list = rep.getAllCadruDidactic();
		
		boolean ok1 = false;		
		for (int i = 0; i < list.size(); i++){
			if (list.get(i).getId() == cdA.getId())
				ok1 = true;
		}
		boolean ok2 = false;		
		for (int i = 0; i < list.size(); i++){
			if (list.get(i).getId() == cdB.getId())
				ok2 = true;
		}
		
		if (ok1 == false || ok2 == false)
			fail("getAllCadruDidactic error");
	}

}
