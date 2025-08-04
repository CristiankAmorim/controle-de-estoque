package aplicacao;

import java.util.Scanner;

import pecas.Acessorio;
import excecao.EstoqueInsuficienteException;
import interfac.Item;
import pecas.RoupaPMG;
import pecas.RoupaTamanhoUnico;

public class Aplicacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Item[] novoItem = new Item[5];

		novoItem[0] = new Acessorio("Relogio", 0, 1, 5);
		novoItem[1] = new RoupaPMG("Camisa", 0, 0, 0, 1, 5);
		novoItem[2] = new RoupaTamanhoUnico("Boné", 0, 1, 5);
		novoItem[3] = new Acessorio("Pulseira", 0, 1, 5);
		novoItem[4] = new RoupaPMG("Casaco", 0, 0, 0, 1, 5);

		int opcao;
		do {

			System.out.println("---OPCOES DE COMPRA---");
			System.out.println("0- Relogio\n" + "1- Camisa\n" + "2- Boné\n" + "3- Pulseira\n" + "4- Casaco\n"
					+ "5- Repor estoques\n" + "6- Sair do sistema");
			System.out.print("Digite a opcao: ");
			opcao = sc.nextInt();
			System.out.println();

			switch (opcao) {
			case 0:
				try {
					novoItem[0].venda();
				} catch (EstoqueInsuficienteException e) {
					System.out.println(e.getMessage());
				}
				System.out.println();
				break;
			case 1:
				try {
					novoItem[1].venda();
				} catch (EstoqueInsuficienteException e) {
					System.out.println(e.getMessage());
				}
				System.out.println();
				break;
			case 2:
				try {
					novoItem[2].venda();
				} catch (EstoqueInsuficienteException e) {
					System.out.println(e.getMessage());
				}
				System.out.println();
				break;
			case 3:
				try {
					novoItem[3].venda();
				} catch (EstoqueInsuficienteException e) {
					System.out.println(e.getMessage());
				}
				System.out.println();
				break;
			case 4:
				try {
					novoItem[4].venda();
				} catch (EstoqueInsuficienteException e) {
					System.out.println(e.getMessage());
				}
				System.out.println();
				break;
			case 5:
				for (int i = 0; i < novoItem.length; i++) {
					novoItem[i].reposicaoDeEstoque();
					System.out.println();
				}
				System.out.println();
				break;
			case 6:
				System.out.println("---ESTOQUE FINAL DOS ITENS---");
				for (int i = 0; i < novoItem.length; i++) {
					novoItem[i].estoqueFinal();
				}
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opcao invalida! Tente novamente.");
				System.out.println();
				break;
			}

		} while (opcao != 6);
		sc.close();
	}

}
