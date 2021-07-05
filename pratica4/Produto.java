package pratica4;

public class Produto {

	private final String descricao;
	private final float valor;
	private int quantidadeEstoque;

	public Produto(String descricao, int quantidadeEstoque, double valor){
	this.descricao=descricao;
	this.valor=(float)valor;
	this.quantidadeEstoque=quantidadeEstoque;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int qnt) {
		quantidadeEstoque = quantidadeEstoque- qnt;
	}

	public float getValor() {
		return valor;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
