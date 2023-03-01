package tasca4.N1ejercicio2;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(value = Parameterized.class)
public class DniTest {
	
	@Parameters
	public static Iterable<Object[]> datosPrueba() {
		return Arrays.asList(new Object[][]{
			{"12345678Z",12345678},
			{"87654321X",87654321},
			{"12345671F",12345671},
			{"76543214L",76543214},
			{"34251612N",34251612},
			{"39875673K",39875673},
			{"95647842L",95647842},
			{"83645123B",83645123},
			{"12365412Z",12365412},
			{"12354312T",12354312}
		});
	}
	
	CalculoDNI calculo;
	private String dniEsperado;
	private Integer numeroPrueba;
		
	public DniTest(String dniEsperado, Integer numeroPrueba) {
		
		this.dniEsperado = dniEsperado;
		this.numeroPrueba = numeroPrueba;
	}
	

	@Before
	public void before() {
		calculo = new CalculoDNI();
	}
	
	@Test
	public void testCalculoDNI() {
		String result = calculo.calcularLetra(numeroPrueba);
		assertEquals(dniEsperado,result);
	}
	
}
