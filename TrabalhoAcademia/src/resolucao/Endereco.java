package resolucao;

public class Endereco {

	private String pais;
	private String estado;
	private String cidade;
	private String logradouro;
	private int numeroRecidencial;

	public Endereco(String pais, String estado, String cidade, String logradouro, int numeroRecidencial) {
		setPais(pais);
		setEstado(estado);
		setCidade(cidade);
		setLogradouro(logradouro);
		setNumeroRecidencial(numeroRecidencial);
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		if (pais == null && pais.isBlank()) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		this.pais = pais;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		if (estado == null && estado.isBlank()) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		if (cidade == null && cidade.isBlank()) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		this.cidade = cidade;
	}

	public String getlogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		if (logradouro == null && logradouro.isBlank()) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		this.logradouro = logradouro;
	}

	public int getNumeroRecidencial() {
		return numeroRecidencial;
	}

	public void setNumeroRecidencial(int numeroRecidencial) {
		if (numeroRecidencial < 0) {
			throw new IllegalArgumentException("inválido, não pode ser negativo");
		}
		this.numeroRecidencial = numeroRecidencial;
	}

	@Override
	public String toString() {
		return "país: " + this.pais + ", estado: " + this.estado + ", cidade: " + this.cidade + ", logradouro: "
				+ this.logradouro;
	}

}