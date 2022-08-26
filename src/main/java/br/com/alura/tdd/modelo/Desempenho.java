package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 26/08/2022.
 */
public enum Desempenho{
    A_DESEJAR{
        @Override
        public BigDecimal percetualReajuste() {
            return new BigDecimal("0.03");
        }
    }, BOM {
        @Override
        public BigDecimal percetualReajuste() {
            return new BigDecimal("0.15");
        }
    }, OTIMO {
        @Override
        public BigDecimal percetualReajuste() {
            return new BigDecimal("0.20");
        }
    };

    public abstract BigDecimal percetualReajuste();

}
