package br.com.gabriel.desconto;

import br.com.gabriel.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends AbstractDesconto {

    public BigDecimal calcular(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
