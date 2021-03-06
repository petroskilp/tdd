package com.github.petroskilp.tddexemplo;

import java.util.HashMap;
import java.util.Map;

/**
 * Esta classe e uma classe de exemplo para o entendimento sobre TDD - Test Driven Development
 * 
 * Este exemplo foi retirado do livro "TDD - Test Driven Development. Teste e Design no Mundo Real"
 * do autor Mauricio Aniche pela editora Casa do Codigo (http://casadocodigo.com.br)
 * 
 *
 */
public class ConversorDeRomanosAula {

    @SuppressWarnings("serial")
    private static Map<Character, Integer> tabela = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};
    
    public int converte(String numeroRomano) {
        int acumulador = 0;
        
        for (int i = 0; i < numeroRomano.length(); i++) {
            acumulador += tabela.get(numeroRomano.charAt(i));
        }
        
        return acumulador;
    }
}
