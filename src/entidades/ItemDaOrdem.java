package entidades;

public class ItemDaOrdem {

	private Integer quantidade;
	private Double preco;
	private Produto produto;

	public ItemDaOrdem() {

	}

	public ItemDaOrdem(Integer quantidade, Double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double subTotal() {
		return quantidade * preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(produto.getNome() + ", ");
		sb.append(produto.getPreco() + ", ");
		sb.append("Qantidade: " + quantidade + ", ");
		sb.append("Subtotal:" + subTotal());
		return sb.toString();
	}

}
