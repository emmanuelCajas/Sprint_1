package tasca4.N1ejercicio1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class MesesTest {

	private Meses mes;
	
	@Before
	public void before() {
		mes = new Meses();
	}
	
	@Test
	public void suma() {
		assertEquals(2, 1+1);
	}
	
	@Test
	public void testCargarArray(){		
		
		assertEquals(12,mes.cargarArray().size());
		
		assertNotNull(mes.cargarArray().isEmpty());	
		
		assertEquals("Agosto", mes.cargarArray().get(7));
		
		
	}
	
	

}
