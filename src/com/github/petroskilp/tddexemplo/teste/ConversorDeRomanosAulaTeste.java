package com.github.petroskilp.tddexemplo.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.petroskilp.tddexemplo.ConversorDeRomanosAula;

/**
 * Esta classe e uma classe de exemplo para o entendimento sobre TDD - Test Driven Development
 * 
 * Este exemplo foi retirado do livro "TDD - Test Driven Development. Teste e Design no Mundo Real"
 * do autor Mauricio Aniche pela editora Casa do Codigo (http://casadocodigo.com.br)
 * 
 *
 */
public class ConversorDeRomanosAulaTeste {

    @Test
    public void converterOSimboloI() {
       ConversorDeRomanosAula conversor = new ConversorDeRomanosAula();
       int resultadoObtido = conversor.converte("I");
       
       assertEquals(1, resultadoObtido);
    }

    @Test
    public void converterOSimboloV() {
       ConversorDeRomanosAula conversor = new ConversorDeRomanosAula();
       int resultadoObtido = conversor.converte("V");
       
       assertEquals(5, resultadoObtido);
    }
    
    @Test
    public void converterOSimboloC() {
       ConversorDeRomanosAula conversor = new ConversorDeRomanosAula();
       int resultadoObtido = conversor.converte("C");
       
       assertEquals(100, resultadoObtido);
    }
    
    @Test
    public void converterOSimboloII() {
       ConversorDeRomanosAula conversor = new ConversorDeRomanosAula();
       int resultadoObtido = conversor.converte("II");
       
       assertEquals(2, resultadoObtido);
    }
    
    @Test
    public void converterOSimboloVI() {
       ConversorDeRomanosAula conversor = new ConversorDeRomanosAula();
       int resultadoObtido = conversor.converte("VI");
       
       assertEquals(6, resultadoObtido);
    }
    
    @Test
    public void converterOSimboloIX() {
       ConversorDeRomanosAula conversor = new ConversorDeRomanosAula();
       int resultadoObtido = conversor.converte("IX");
       
       assertEquals(9, resultadoObtido);
    }

    @Test
    public void converterOSimboloXXIV() {
       ConversorDeRomanosAula conversor = new ConversorDeRomanosAula();
       int resultadoObtido = conversor.converte("XXIV");
       
       assertEquals(24, resultadoObtido);
    }
    
}
