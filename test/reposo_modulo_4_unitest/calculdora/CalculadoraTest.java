package reposo_modulo_4_unitest.calculdora;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import reposo_modulo_4_unitest.calculadora.Calculadora;

class CalculadoraTest {
	@BeforeAll
	static void antes() {
		System.out.println("Print BeforeAll");
	}
	
	@BeforeEach
	void setup() {
		System.out.println("Print BeforeEach");
	}
	
	@AfterEach
	void entrePrueba() {
		System.out.println("Print AfterEach");
	}
	@AfterAll
	static void despues() {
		System.out.println("Print AfterAll");
	}

	@Test
	@DisplayName("Prueba de metodo Sumar")
	void testSumar() {
		System.out.println("testSumar");
		Calculadora objCalculadora= new Calculadora();		
		int resultado=objCalculadora.sumar(2, 2);		
		assertEquals(4, resultado);
		
	}
	@Test
	@DisplayName("Prueba de metodo Restar")
	void testRestar() {
		System.out.println("testRestar");
		Calculadora objCalculadora= new Calculadora();
		
		int resultado=objCalculadora.restar(2, 2);
		
		assertEquals(0, resultado);
		
	}
	@Test
	@DisplayName("Prueba de metodo Dividir cuand el num2 sea mayor a cero")
	void testDividirCuandoNumMayorCero() {
		System.out.println("testDividirCuandoNumMayorCero");
		Calculadora objCalculadora= new Calculadora();
		
		int resultado=objCalculadora.dividir(4, 2);
		
		assertEquals(2, resultado);
		
	}
	@Test
	@DisplayName("Prueba de metodo Dividir cuand el num2 sea igual a cero")
	void testDividirCuandoNumIgualCero() {
		System.out.println("testDividirCuandoNumIgualCero");
		Calculadora objCalculadora= new Calculadora();
		
		int resultado=objCalculadora.dividir(4, 0);
		
		assertEquals(0, resultado);
	}
	@Test
	@DisplayName("Prueba de metodo multiplicar")
	void testMultiplicar() {
		System.out.println("testMultiplicar");
		Calculadora objCalculadora= new Calculadora();
		
		int resultado=objCalculadora.multiplicar(2, 2);
		
		assertEquals(4, resultado);
		
	}

	
}







