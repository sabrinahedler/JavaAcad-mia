package resolucao;

import java.util.ArrayList;
import java.util.List;

public class Academia {

	private List<String> listaModalidades = new ArrayList<>();
	private List<Funcionario> listaFuncionarios = new ArrayList<>();
	private String horarioFuncionamento;
	private Endereco endereco;
	private String telefone;

	public Academia(List<String> listaModalidades, List<Funcionario> listaFuncionarios, String horarioFuncionamento, Endereco endereco,
			String telefone) {
		setModalidades(listaModalidades);
		setFuncionarios(listaFuncionarios);;
		setHorarioFuncionamento(horarioFuncionamento);
		setEndereco(endereco);
		setTelefone(telefone);
	}

	public List<String> getModalidades() {
		return listaModalidades;
	}

	public void setModalidades(List<String> modalidades) {
		if (modalidades == null) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		this.listaModalidades = modalidades;
	}

	public List<Funcionario> getFuncionarios() {
		return listaFuncionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		if (funcionarios == null) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		this.listaFuncionarios = funcionarios;
	}

	public String getHorarioFuncionamento() {
		return horarioFuncionamento;
	}

	public void setHorarioFuncionamento(String horarioFuncionamento) {
		if (horarioFuncionamento == null) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		this.horarioFuncionamento = horarioFuncionamento;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if (telefone == null) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Horário de funcionamento: " + this.horarioFuncionamento + ", telefone: " + this.telefone
				+ ", modalidades: " + this.listaModalidades + ", endereço: " + this.endereco;
	}

}