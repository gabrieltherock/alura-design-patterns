package br.com.gabriel;

import br.com.gabriel.pedido.GeraPedido;
import br.com.gabriel.pedido.GeraPedidoHandler;

import java.math.BigDecimal;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);

        GeraPedidoHandler handler = new GeraPedidoHandler();
        handler.execute(geraPedido);
    }
}
