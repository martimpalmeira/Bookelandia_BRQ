package appBookelandia.model;

public class CategoriaDoProduto {
	
	private String codigo;
	
	private String nome;
	
	private String descricao;
	
	public CategoriaDoProduto(String codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	
	
}
