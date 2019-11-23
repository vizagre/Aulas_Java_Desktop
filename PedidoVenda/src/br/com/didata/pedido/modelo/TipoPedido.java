package br.com.didata.pedido.modelo;

import br.com.didata.pedido.desconto.CalculadoraDesconto;
import br.com.didata.pedido.desconto.CalculadoraDescontoAtacado;
import br.com.didata.pedido.desconto.CalculadoraDescontoVarejo;

public enum TipoPedido {

	ATACADO {
		@Override
		public CalculadoraDesconto calculadora() {
			return new CalculadoraDescontoAtacado();
		}
	},
	VAREJO {
		@Override
		public CalculadoraDesconto calculadora() {
			return new CalculadoraDescontoVarejo();
		}
	},
	ATACADO_PESSOA_JURIDICA {

		@Override
		public CalculadoraDesconto calculadora() {
			return null;
		}
		
	}
	;
	
	public abstract CalculadoraDesconto calculadora();
	
}
