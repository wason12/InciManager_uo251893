package tests;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import inciManager.incidenceController.RestUtil;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= { RestUtil.class })
public class IncidenceControllerTests {

	@Test
	public void test() {
		assertTrue(true);
		//Se probarán con selenium y cucumber
	}

}
