package appBookelandia.model;

import java.time.LocalDate;

public class Cliente {
	private String nome;
	private String cpf;
	private String email;
	private String telfone;
	private String endereco;
	private LocalDate dataCadastro;
	
	
	public Cliente(String nome, String cpf, LocalDate dataCadastro) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataCadastro = dataCadastro;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelfone() {
		return telfone;
	}
	
	public void setTelfone(String telfone) {
		this.telfone = telfone;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	
}
