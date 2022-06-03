package appBookelandia.model;

import java.time.LocalDate;

public class Pedido {
	
	private String numeroDoPedido;
	
	private String codigoDoCliente;
	
	private String formaPagamento;
	
	private String status;
	
	private LocalDate data;

	public Pedido(Cliente cliente, String formaPagamento, String status, LocalDate data) {
	
		this.codigoDoCliente = cliente.getCpf();
		this.formaPagamento = formaPagamento;
		this.status = status;
		this.data = data;
	}

	public String getNumeroDoPedido() {
		return numeroDoPedido;
	}

	public void setNumeroDoPedido(String numeroDoPedido) {
		this.numeroDoPedido = numeroDoPedido;
	}

	public String getCodigoDoCliente() {
		return codigoDoCliente;
	}

	public void setCodigoDoCliente(String codigoDoCliente) {
		this.codigoDoCliente = codigoDoCliente;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	
	
	
}
