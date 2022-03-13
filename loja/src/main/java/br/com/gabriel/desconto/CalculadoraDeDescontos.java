package br.com.gabriel.desconto;

import br.com.gabriel.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        AbstractDesconto abstractDesconto = new DescontoParaOrcamentoComMaisDeCincoItens();

        abstractDesconto.setProximo(new DescontoParaOrcamentoComValorMaiorQueQuinhentos())
                .setProximo(new SemDesconto());

        return abstractDesconto.calcular(orcamento);
    }
}
