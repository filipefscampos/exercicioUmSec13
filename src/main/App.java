package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Cliente;
import entidades.ItemDaOrdem;
import entidades.Ordem;
import entidades.Produto;
import entidades.enums.StatusPedido;

public class App {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Cliente cliente = new Cliente("Filipe", "felipetwo@gmail.com", sdf.parse("18/02/1988"));
		Ordem ordem = new Ordem(new Date(), StatusPedido.PROCESSANDO, cliente);
		Produto produto;
		ItemDaOrdem itens;

		System.out.println("Quantos itens terá o pedido?!");
		int qtdItens = sc.nextInt();

		for (int i = 0; i < qtdItens; i++) {
			System.out.println("Dados do produto: " + i);
			String nomeProduto = sc.next();
			double precoProduto = sc.nextDouble();
			int quantidade = sc.nextInt();

			produto = new Produto(nomeProduto, precoProduto);
			itens = new ItemDaOrdem(quantidade, precoProduto, produto);
			ordem.addItemDaOrdem(itens);
		}

		System.out.println(cliente);
		System.out.println(ordem);

		sc.close();

	}

}
