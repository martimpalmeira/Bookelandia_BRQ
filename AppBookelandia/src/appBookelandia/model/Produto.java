package appBookelandia.model;

public class Produto {
	private String codigoDoProduto;
	private String codigoDoCategoria;
	private String nome;
	private String descricao;
	private Double preco;

	public Produto(String codigoDoProduto, String codigoDoCategoria, String nome, String descricao, Double preco) {
		this.codigoDoProduto = codigoDoProduto;
		this.codigoDoCategoria = codigoDoCategoria;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}

	public String getCodigoDoProduto() {
		return codigoDoProduto;
	}

	public void setCodigoDoProduto(String codigoDoProduto) {
		this.codigoDoProduto = codigoDoProduto;
	}

	public String getCodigoDoCategoria() {
		return codigoDoCategoria;
	}

	public void setCodigoDoCategoria(String codigoDoCategoria) {
		this.codigoDoCategoria = codigoDoCategoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
