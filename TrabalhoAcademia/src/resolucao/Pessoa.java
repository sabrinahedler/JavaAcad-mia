package resolucao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {

	private String nome;
	private String cpf;
	private String sobreNome;
	private LocalDate dataNascimento;
	private char sexo;
	private String telefone;
	private Endereco endereco;
	private String email;
	private String idCadastro;
	private List<String> modalidades = new ArrayList<>();
	
		public Pessoa(String nome, String cpf, String sobreNome, LocalDate dataNascimento, char sexo, String telefone,
			Endereco endereco, String email, String idCadastro, List<String> modalidades) {
		setNome(nome);
		setCpf(cpf);
		setSobreNome(sobreNome);
		setDataNascimento(dataNascimento);
		setSexo(sexo);
		setTelefone(telefone);
		setEndereco(endereco);
		setEmail(email);
		setIdCadastro(idCadastro);
		setModalidades(modalidades);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null && nome.isBlank()) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (cpf == null && cpf.isBlank()) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		this.cpf = cpf;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		if (sobreNome == null && sobreNome.isBlank()) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		this.sobreNome = sobreNome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		if (dataNascimento == null) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		this.dataNascimento = dataNascimento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if (telefone == null) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		if (endereco == null) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email == null && email.isBlank()) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		this.email = email;
	}

	public String getIdCadastro() {
		return idCadastro;
	}

	public void setIdCadastro(String idCadastro) {
		if (idCadastro == null && idCadastro.isBlank()) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		this.idCadastro = idCadastro;
	}

	public List<String> getModalidades() {
		return modalidades;
	}

	public void setModalidades(List<String> modalidades) {
		this.modalidades = modalidades;
	}

	public String nomeCompleto() {
		return this.nome + " " + this.sobreNome;
	}

	public int idade() {
		LocalDate hoje = LocalDate.now();
		return hoje.compareTo(this.dataNascimento);
	}

	public abstract double mensalidade();

	@Override
	public String toString() {
		return "Nome: " + this.nome + ", sobrenome: " + this.sobreNome + ", CPF: " + this.cpf + ", email: " + this.email
				+ ", id de cadastro: " + this.idCadastro + ", endereco: " + this.endereco;
	}

}