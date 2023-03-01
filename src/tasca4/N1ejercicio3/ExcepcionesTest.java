package tasca4.N1ejercicio3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExcepcionesTest {

	Excepciones excepcion;
	
	@Before
	public void before() {
		excepcion = new Excepciones();
	}
	
	@Test
	public void sumarTest() {
		assertEquals(2,excepcion.sumar(1, 1) );
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void lanzarexcepcionTest() {
		excepcion.lanzarExcepcion();
	}

}
