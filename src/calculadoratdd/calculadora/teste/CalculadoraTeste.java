package calculadoratdd.calculadora.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import calculadoratdd.calculadora.principal.Calculadora;

public class CalculadoraTeste {
	
	Calculadora calculadora = new Calculadora();
	
	@Test
	public void testarSomaDeDoisValores() {
		assertEquals(calculadora.somar(2.5, 2.5), 5);
	}
	
	@Test
	public void testarSubtracaoDeDoisValores() {
		assertEquals(calculadora.subtrair(2, 2), 0);
	}
	
	@Test
	public void testarMultiplicacaoDeDoisValores() {
		assertEquals(calculadora.multiplicar(2, 10), 20);
	}
	
	@Test
	public void testarDivisaoDeDoisValores() {
		assertEquals(calculadora.dividir(3, 2), 1.5);
	}
}