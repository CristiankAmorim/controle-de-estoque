package pecas;

import java.util.Scanner;

import excecao.EstoqueInsuficienteException;
import interfac.Item;

public class RoupaPMG implements Item{

	private String descricao;
	private int quantidadeP;
	private int quantidadeM;
	private int quantidadeG;
	private int estoqueMinimo;
	private int estoqueMaximo;
	
	public RoupaPMG(String descricao, int qP, int qM, int qG, int estMinimo, int estMaximo) {
		this.descricao = descricao;
		this.quantidadeP = qP;
		this.quantidadeM = qM;
		this.quantidadeG = qG;
		this.estoqueMinimo = estMinimo;
		this.estoqueMaximo = estMaximo;
	}
	
	Scanner sc = new Scanner(System.in);
	public void venda() {
		System.out.print("Selecione o tamanho do item: \n1- P\n2- M\n3- G\n");
		System.out.print("Digite o numero referente ao tamanho: ");
		int tamanho = sc.nextInt();
		System.out.print("Informe a quantidade: ");
		int quantidade = sc.nextInt();		
		
		if(tamanho == 1) {
			if(quantidade >= 1 && quantidade <= getQuantidadeP()) {
				setQuantidadeP(getQuantidadeP() - quantidade);
				System.out.println("Venda realizada! | Estoque de " + getDescricao() + " P: " + getQuantidadeP());
			}else if(quantidade > getQuantidadeP()){
				throw new EstoqueInsuficienteException("Estoque insuficiente.");
			}else {
				System.out.println("Número de vendas inválido!");
			}
		}
		
		if(tamanho == 2) {
			if(quantidade >= 1 && quantidade <= getQuantidadeM()) {
				setQuantidadeM(getQuantidadeM() - quantidade);
				System.out.println("Venda realizada! | Estoque de " + getDescricao() + " M: " + getQuantidadeM());
			}else if(quantidade > getQuantidadeM()){
				throw new EstoqueInsuficienteException("Estoque insuficiente.");
			}else {
				System.out.println("Número de vendas inválido!");
			}
		}
		
		if(tamanho == 3) {
			if(quantidade >= 1 && quantidade <= getQuantidadeG()) {
				setQuantidadeG(getQuantidadeG() - quantidade);
				System.out.println("Venda realizada! | Estoque de " + getDescricao() + " G: " + getQuantidadeG());
			}else if(quantidade > getQuantidadeG()){
				throw new EstoqueInsuficienteException("Estoque insuficiente.");
			}else {
				System.out.println("Número de vendas inválido!");
			}
		}
		
		if(tamanho != 1 && tamanho != 2 && tamanho != 3) {
			System.out.println("Opcao de tamanho invalida!");
		}	
		
	}
	
	public void reposicaoDeEstoque() {
		if(getQuantidadeP() < getEstoqueMinimo()) {
			setQuantidadeP(getEstoqueMaximo());
			System.out.println("Estoque reposto! | Novo estoque de " + getDescricao() + " P: " + getQuantidadeP());
		}else {
			System.out.println("Estoque acima do minimo! Nao e necessario reposicao.");
			System.out.println("Estoque de " + getDescricao() + " P: " + getQuantidadeP());
		}
		
		if(getQuantidadeM() < getEstoqueMinimo()) {
			setQuantidadeM(getEstoqueMaximo());
			System.out.println("Estoque reposto! | Novo estoque de " + getDescricao() + " M: " + getQuantidadeM());
		}else {
			System.out.println("Estoque acima do minimo! Nao e necessario reposicao.");
			System.out.println("Estoque de " + getDescricao() + " M: " + getQuantidadeM());
		}
		
		if(getQuantidadeG() < getEstoqueMinimo()) {
			setQuantidadeG(getEstoqueMaximo());
			System.out.println("Estoque reposto! | Novo estoque de " + getDescricao() +" G: " + getQuantidadeG());
		}else {
			System.out.println("Estoque acima do minimo! Nao e necessario reposicao.");
			System.out.println("Estoque de " + getDescricao() + " G: " + getQuantidadeG());
		}
	}
	
	public void estoqueFinal() {
		System.out.println("Estoque de " + getDescricao() + " P: " + getQuantidadeP());
		System.out.println("Estoque de " + getDescricao() + " M: " + getQuantidadeM());
		System.out.println("Estoque de " + getDescricao() + " G: " + getQuantidadeG());
	}
	
	public int getQuantidadeP() {
		return quantidadeP;
	}
	public void setQuantidadeP(int quantidadeP) {
		this.quantidadeP = quantidadeP;
	}
	public int getQuantidadeM() {
		return quantidadeM;
	}
	public void setQuantidadeM(int quantidadeM) {
		this.quantidadeM = quantidadeM;
	}
	public int getQuantidadeG() {
		return quantidadeG;
	}
	public void setQuantidadeG(int quantidadeG) {
		this.quantidadeG = quantidadeG;
	}
	public String getDescricao() {
		return descricao;
	}
	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}
	public int getEstoqueMaximo() {
		return estoqueMaximo;
	}

}