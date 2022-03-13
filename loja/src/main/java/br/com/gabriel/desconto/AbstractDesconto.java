package br.com.gabriel.desconto;

import br.com.gabriel.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class AbstractDesconto {

    protected AbstractDesconto proximo;

    public AbstractDesconto setProximo(AbstractDesconto proximo) {
        this.proximo= proximo;
        return proximo;
    }

    public abstract BigDecimal calcular(Orcamento orcamento);
}
