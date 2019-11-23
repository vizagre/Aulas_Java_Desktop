package br.com.didata.pedido;

import br.com.didata.pedido.modelo.Cliente;
import br.com.didata.pedido.modelo.ItemPedido;
import br.com.didata.pedido.modelo.Pedido;
import br.com.didata.pedido.modelo.TipoPedido;

public class Principal {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(1L, 50.0, TipoPedido.VAREJO);
		
		Cliente cliente = new Cliente("Joao", "joao@email.com", "1234-1234");
		pedido.setCliente(cliente);
		
		ItemPedido geladeira = new ItemPedido(1, 1500.0, "Geladeira FrostFree");
		pedido.adicionarItem(geladeira);
		
		ItemPedido fogao = new ItemPedido(1, 800.0, "Fogao 6 bocas");
		pedido.adicionarItem(fogao);
		
		System.out.println(pedido);
		System.out.println("Total de itens no pedido: " + pedido.totalItens());
		System.out.println("Desconto para pedido: " + pedido.calcularDesconto());
	}
	
}
