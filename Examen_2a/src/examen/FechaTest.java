package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FechaTest {
	Fecha fecha1= new Fecha();
	
	
	@Test
	void testC1() {
		assertEquals(fecha1.validarFecha(2018, 7, 31), true);
	}
	@Test
	void testC2() {
		assertEquals(fecha1.validarFecha(2018, 8, 30), true);
	}
	@Test
	void testC3() {
		assertEquals(fecha1.validarFecha(2018, 2, 28), true);
	}
	@Test
	void testC4() {
		assertEquals(fecha1.validarFecha(2018, 4, 32), false);
	}

}
