package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 26/08/2022.
 */
public class ReajusteServiceTest {
    ReajusteService service;
    Funcionario funcionario;

    @BeforeEach
    public void inicializar(){
        service = new ReajusteService();
        funcionario = new Funcionario("Ana", LocalDate.now(),new BigDecimal("1000"));
    }

    /*Outras anotações @AfterEach, @BeforeAll, @AfterAll*/

    @Test
    public void reajusteDesempenhoaDesejar(){
        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);

        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDesempenhoaBom(){
        service.concederReajuste(funcionario, Desempenho.BOM);

        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDesempenhoaOtimo(){
        service.concederReajuste(funcionario, Desempenho.OTIMO);

        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
