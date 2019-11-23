package br.com.didata.equalsEhashCode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class CadastradorDeProdutos {

	public static void main(String[] args) {

		Collection<Produto> produtos = new ArrayList<>();

		System.out.println("### Cadastro de Produtos ###\n");

		try (Scanner entrada = new Scanner(System.in)) {
			String continuar = "s";

			while ("s".equalsIgnoreCase(continuar)) {

				System.out.println("SKU: ");
				String sku = entrada.nextLine();

				System.out.println("Nome: ");
				String nome = entrada.nextLine();

				Produto produto = new Produto(sku, nome);

				if (produtos.contains(produto)) {
					System.err.println("Esse produto já foi adicionado, utilizar outro SKU!");
					System.err.flush();
				} else {
					produtos.add(produto);
					System.out.println("Produto cadastrado!");
				}

				System.out.println("\nDeseja adicionar mais algum produto? (s/n) ");

				continuar = entrada.nextLine();
			}
		}
		
		//recurso exclusivo do java 8
		produtos.forEach(System.out::println);
		
		System.out.println("Fim");

	}
}
