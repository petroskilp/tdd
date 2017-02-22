package com.github.petroskilp.triangulo.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.github.petroskilp.tddexemplo.ConversorDeRomanosAula;
import com.github.petroskilp.triangulo.Triangulo;

public class TrianguloTeste {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testarEquilatero() {
		Triangulo triangulo = new Triangulo();
	       int tipo = triangulo.tipoTriangulo(10.0, 10.0, 10.0);
	       
	       assertNotEquals(2, tipo);
	}

}
