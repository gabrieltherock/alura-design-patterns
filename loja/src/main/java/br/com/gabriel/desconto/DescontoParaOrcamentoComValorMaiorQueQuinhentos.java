package br.com.gabriel.desconto;

import br.com.gabriel.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends AbstractDesconto {

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getValor().compareTo(new BigDecimal("500.0")) > 0)
            return orcamento.getValor().multiply(new BigDecimal("0.05"));

        return proximo.calcular(orcamento);
    }
}
