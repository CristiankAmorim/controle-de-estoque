package pecas;

public abstract class Peca {

	protected String descricao;
	protected int quantidade;
	protected int estoqueMinimo;
	protected int estoqueMaximo;

	public Peca(String descricao, int quantidade, int estMinimo, int estMaximo) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.estoqueMinimo = estMinimo;
		this.estoqueMaximo = estMaximo;
	}

	public abstract void venda();

	public String getDescricao() {
		return descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	public int getEstoqueMaximo() {
		return estoqueMaximo;
	}

	public void reposicaoDeEstoque() {
		if (this.quantidade < this.estoqueMinimo) {
			this.quantidade = this.estoqueMaximo;
			System.out.println("Reposicao de estoque realizada! (Quantidade maxima)");
		} else {
			System.out.println("Estoque acima do minimo! Nao e necessario reposicao.");
		}
	}

}
