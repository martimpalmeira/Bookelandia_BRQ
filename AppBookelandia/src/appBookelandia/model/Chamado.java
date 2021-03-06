package appBookelandia.model;

public class Chamado {
	
	private String ticket;

	private boolean estaAtivo;
	
	private String codigoDoFuncionario;
	
	private String codigoDoCliente;
	
	private String codigoDoProduto;
	
	private String descricao;
	
	public Chamado(String descricao, Cliente cliente) {
		this.descricao = descricao;
		this.codigoDoCliente = cliente.getCpf();
	}

	public Chamado(boolean estaAtivo, String codigoDoFuncionario, Cliente cliente,
			Produto produto, String descricao) {
		this.estaAtivo = estaAtivo;
		this.codigoDoFuncionario = codigoDoFuncionario;
		this.codigoDoCliente = cliente.getCpf();
		this.codigoDoProduto = produto.getCodigoDoProduto();
		this.descricao = descricao;
	}



	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	

	public String getCodigoDoFuncionario() {
		return codigoDoFuncionario;
	}

	public void setCodigoDoFuncionario(String codigoDoFuncionario) {
		this.codigoDoFuncionario = codigoDoFuncionario;
	}

	public String getCodigoDoCliente() {
		return codigoDoCliente;
	}

	public void setCodigoDoCliente(String codigoDoCliente) {
		this.codigoDoCliente = codigoDoCliente;
	}


	public String getCodigoDoProduto() {
		return codigoDoProduto;
	}

	public void setCodigoDoProduto(String codigoDoProduto) {
		this.codigoDoProduto = codigoDoProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
