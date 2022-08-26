package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 26/08/2022.
 */
public class ReajusteService {

    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        BigDecimal percetualReajuste = desempenho.percetualReajuste();
        BigDecimal reajuste = funcionario.getSalario().multiply(percetualReajuste);
        funcionario.reajustarSalario(reajuste);

        /* o código acima é uma refatoração para o pattern Strategy com muitos If's
        if(desempenho == Desempenho.A_DESEJAR){
            reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
        } else if (desempenho == Desempenho.BOM) {
            reajuste = funcionario.getSalario().multiply(new BigDecimal("0.15"));
        }else{
            reajuste = funcionario.getSalario().multiply(new BigDecimal("0.20"));
        }
        funcionario.reajustarSalario(reajuste);*/

    }
}
