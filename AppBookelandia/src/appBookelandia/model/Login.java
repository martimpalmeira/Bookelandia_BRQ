package appBookelandia.model;

public class Login {
	private String email;
	private String senha;
	private String nivelDeAcesso;
	private String status;

	public Login(String email, String senha, String nivelDeAcesso, String status) {
		this.email = email;
		this.senha = senha;
		this.nivelDeAcesso = nivelDeAcesso;
		this.status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNivelDeAcesso() {
		return nivelDeAcesso;
	}

	public void setNivelDeAcesso(String nivelDeAcesso) {
		this.nivelDeAcesso = nivelDeAcesso;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
