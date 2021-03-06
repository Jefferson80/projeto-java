package model;

public class Usuario {

	int matricula;
	public String login;
	public String senha;
	public String nome;
	public String email;
	public String telefone;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;

	}

	
	@Override
	public String toString() {
		return "Usuario [\nmatricula=" + matricula + ",\n login=" + login + ",\n senha=" + senha + ", \n nome=" + nome
				+ ",\n email=" + email + ",\n telefone=" + telefone + "]";
	}

	
}
