package persistance.cadrudidacticpersistence;

import model.CadruDidactic;
import model.Norma;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import persistence.cadrudidacticpersistence.CadruDidacticPersistence;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CadruDidacticPersistenceTest {
	static CadruDidacticPersistence rep;
	static CadruDidactic cd1;
	static CadruDidactic cd2;
	static CadruDidactic cd3;
	static CadruDidactic cd4;
	static CadruDidactic cd5;
	static CadruDidactic cd6;
	static CadruDidactic cd7;
	
	@BeforeClass
	public static void onlyOnce(){
		rep = CadruDidacticPersistence.instance();
		
		cd1 = new CadruDidactic();
		cd1.setNume("Mihu");
		cd1.setPrenume("Cosmin");
		cd1.setEmail("cosmin@gmail.com");
		cd1.setParola("parola1");
		cd1.setDomeniiInteres("c++,java,c#,android,ios");
		cd1.setDirector(false);
		cd1.setPostDidactic("developer");
		cd1.setNorma(new Norma(5, 6, 8));
		
		cd2 = new CadruDidactic();
		cd2.setNume("Mihu");
		cd2.setPrenume("Cristi");
		cd2.setEmail("cristi@gmail.com");
		cd2.setParola("parola2");
		cd2.setDomeniiInteres("facebook");
		cd2.setDirector(false);
		cd2.setPostDidactic("???");
		cd2.setNorma(new Norma(8, 7, 8));
		
		cd3 = new CadruDidactic();
		cd3.setNume("Marga");
		cd3.setPrenume("Andrei");
		cd3.setEmail("cosmin@gmail.com");
		cd3.setParola("parola1");
		cd3.setDomeniiInteres("c++,java,c#,android,ios");
		cd3.setDirector(false);
		cd3.setPostDidactic("developer");
		cd3.setNorma(new Norma(5, 6, 8));
		
		cd4 = new CadruDidactic();
		cd4.setNume("Rebreanu");
		cd4.setPrenume("Liviu");
		cd4.setEmail("cosmin@gmail.com");
		cd4.setParola("parola1");
		cd4.setDomeniiInteres("c++,java,c#,android,ios");
		cd4.setDirector(false);
		cd4.setPostDidactic("developer");
		cd4.setNorma(new Norma(5, 6, 8));
		
		cd5 = new CadruDidactic();
		cd5.setNume("Muresanu");
		cd5.setPrenume("Andrei");
		cd5.setEmail("cosmin@gmail.com");
		cd5.setParola("parola1");
		cd5.setDomeniiInteres("c++,java,c#,android,ios");
		cd5.setDirector(false);
		cd5.setPostDidactic("developer");
		cd5.setNorma(new Norma(5, 6, 8));
		
		cd6 = new CadruDidactic();
		cd6.setNume("Sb");
		cd6.setPrenume("AB");
		cd6.setEmail("cosmin@gmail.com");
		cd6.setParola("parola1");
		cd6.setDomeniiInteres("c++,java,c#,android,ios");
		cd6.setDirector(false);
		cd6.setPostDidactic("developer");
		cd6.setNorma(new Norma(5, 6, 8));
		
		cd7 = new CadruDidactic();
		cd7.setNume("Hapciu");
		cd7.setPrenume("Nicolae");
		cd7.setEmail("cosmin@gmail.com");
		cd7.setParola("parola1");
		cd7.setDomeniiInteres("c++,java,c#,android,ios");
		cd7.setDirector(false);
		cd7.setPostDidactic("developer");
		cd7.setNorma(new Norma(9, 9, 9));
	}
	
	@AfterClass
	public static void onlyOneAfter(){
		rep.delete(cd1);
		rep.delete(cd2);
		rep.delete(cd3);
		rep.delete(cd4);
		rep.delete(cd5);
		rep.delete(cd6);
		rep.delete(cd7);
	}

	@Test
	public void save() {
		int id = rep.save(cd1);

		CadruDidactic cd = rep.getCadruDidacticById(id);
		if (cd == null)
			fail("Salvare incorecta");
		else
			assertEquals("Salvare incorecta", id, cd.getId());
		
		
		//try re-save
		int id1 = rep.save(cd1);

		CadruDidactic cd1 = rep.getCadruDidacticById(id1);
		if (cd1 != null)
			fail("(re)Salvare incorecta");		
		
	}
	
	@Test
	public void delete() {
		int id = rep.save(cd2);
		
		rep.delete(cd2);

		CadruDidactic cd = rep.getCadruDidacticById(id);
		if (cd != null)
			fail("Salvare incorecta");
		
	}
	
	@Test
	public void update() {
		int idS = rep.save(cd3);
		
		cd3.setNume("andrei");
		boolean cat = rep.update(cd3);
		
		assertEquals("Update incorecta", true, cat);

		CadruDidactic cd = rep.getCadruDidacticById(idS);
		if (cd == null)
			fail("Update incorecta");
		else {
			assertEquals("Update incorecta", idS, cd.getId());
			assertEquals("Update incorecta", cd3.getNume(), cd.getNume());
			assertEquals("Update incorecta", cd3.getPrenume(), cd.getPrenume());
		}
	}
	
	
	@Test
	public void getAllCadreDidactice() {
		int id1 = rep.save(cd4);
		int id2 = rep.save(cd5);
		
		CadruDidactic cd4 = rep.getCadruDidacticById(id1);
		CadruDidactic cd5 = rep.getCadruDidacticById(id2);
		
		List<CadruDidactic> list = rep.getAllCadruDidactic();
		
		boolean ok1 = false;		
		for (int i = 0; i < list.size(); i++){
			if (list.get(i).getId() == cd4.getId())
				ok1 = true;
		}
		boolean ok2 = false;		
		for (int i = 0; i < list.size(); i++){
			if (list.get(i).getId() == cd5.getId())
				ok2 = true;
		}
		
		if (ok1 == false || ok2 == false)
			fail("getAllCadruDidactic error");
	}
	
	
	@Test
	public void testLogin(){
		rep.save(cd6);
		String username = cd6.getNume() + "." + cd6.getPrenume();
		String password = cd6.getParola();
		
		CadruDidactic c1 = rep.login(username, password);
		if (c1 == null)
			fail("login incorect");
		
		CadruDidactic c2 = rep.login(username, password + "error");
		if (c2 != null)
			fail("login incorect");
		
		
		
		
		
	}
	
	
	
	@Test
	public void test(){
		
	}

}
