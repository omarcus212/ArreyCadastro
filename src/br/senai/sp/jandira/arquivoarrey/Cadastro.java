package br.senai.sp.jandira.arquivoarrey;

public class Cadastro {

	private String nome;
	private String email;
	private String cidade;
	private String numerocll;

	public Cadastro(String nome, String email, String cidade, String numerocll) {
		this.nome = nome;
		this.cidade = cidade;
		this.email = email;
		this.numerocll = numerocll; 
	}

	public Cadastro() {

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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getNumerocll() {
		return numerocll;
	}

	public void setNumerocll(String numerocll) {
		this.numerocll = numerocll;
	}

}
