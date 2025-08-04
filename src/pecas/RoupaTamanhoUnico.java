package pecas;

import java.util.Scanner;

import excecao.EstoqueInsuficienteException;
import interfac.Item;

public class RoupaTamanhoUnico extends Peca implements Item {

	public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
	}
	
	Scanner sc = new Scanner(System.in);
	public void venda() {
		System.out.print("Informe a quantidade de vendas: ");
		int quantidade = sc.nextInt();
		
		if(quantidade >= 1 && quantidade <= getQuantidade()) {
			setQuantidade(getQuantidade() - quantidade);
			System.out.println("Venda realizada! Estoque de " + getDescricao() + ": " + getQuantidade());
		}else if(quantidade > getQuantidade()) {
			throw new EstoqueInsuficienteException("Estoque insuficiente!");
		}else {
			System.out.println("Número de vendas inválido!");
		}
		
	}
	
	public void reposicaoDeEstoque() {
		if(getQuantidade() < getEstoqueMinimo()) {
			setQuantidade(getEstoqueMaximo());
			System.out.println("Estoque reposto! | Novo estoque de " + getDescricao() + ": " + getQuantidade());
		}else {
			System.out.println("Estoque acima do minimo! Nao e necessario reposicao.");
			System.out.println("Estoque de " + getDescricao() + ": " + getQuantidade());
		}
	}
	
	public void estoqueFinal() {
		System.out.println("Estoque de " + getDescricao() + ": " + getQuantidade());
	}
}
