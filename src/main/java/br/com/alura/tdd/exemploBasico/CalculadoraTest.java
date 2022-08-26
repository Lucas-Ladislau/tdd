package br.com.alura.tdd.exemploBasico;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 24/08/2022.
 */
public class CalculadoraTest {

    @Test
    public void somarDoisNumerosPositivos(){
        Calculadora calc = new Calculadora();
        int soma = calc.soma(6,3);

        Assert.assertEquals(9, soma);
    }

    @Test
    public void somarDoisNumerosNegativos(){
        Calculadora calc = new Calculadora();
        int soma = calc.soma(-2,-4);

        Assert.assertEquals(-6, soma);
    }

    @Test
    public void somarDoisNegativoPositivo(){
        Calculadora calc = new Calculadora();
        int soma = calc.soma(-2,4);

        Assert.assertEquals(2, soma);
    }
}
