package br.com.gabriel.desconto;

import br.com.gabriel.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDeCincoItens extends AbstractDesconto {

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeItens() > 5)
            return orcamento.getValor().multiply(new BigDecimal("0.1"));

        return proximo.calcular(orcamento);
    }
}
