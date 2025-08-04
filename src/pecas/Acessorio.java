package pecas;

import java.util.Scanner;

import interfac.Item;
import excecao.EstoqueInsuficienteException;

public class Acessorio extends Peca implements Item {

	public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
	}

	Scanner sc = new Scanner(System.in);

	public void venda() {
		System.out.print("Informe a quantidade de vendas do acessorio: ");
		int quantidade = sc.nextInt();
		if (quantidade >= 1 && quantidade <= getQuantidade()) {
			setQuantidade(getQuantidade() - quantidade);
			System.out.println("Venda realizada! | Estoque de " + getDescricao() + ": " + getQuantidade());
		} else if (quantidade > getQuantidade()) {
			throw new EstoqueInsuficienteException("Estoque isuficiente.");
		} else {
			System.out.println("Número de vendas inválido!");
		}
	}

	public void reposicaoDeEstoque() {
		if (getQuantidade() < getEstoqueMinimo()) {
			setQuantidade(getEstoqueMaximo());
			System.out.println("Estoque resposto! | Novo estoque de " + getDescricao() + ": " + getQuantidade());
		} else {
			System.out.println("Estoque acima do minimo. Nao e necessario reposicao");
			System.out.println("Estoque de: " + getDescricao() + ": " + getQuantidade());
		}
	}

	public void estoqueFinal() {
		System.out.println("Estoque de " + getDescricao() + ": " + getQuantidade());
	}

}