package resolucao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {

	private LocalDate dataIngresso;
	private double salario;
	List<Cliente> listaClientes = new ArrayList<>();
		
		
		public Funcionario(String nome, String cpf, String sobreNome, LocalDate dataNascimento, char sexo, String telefone,
			Endereco endereco, String email, String idCadastro, List<String> modalidades, LocalDate dataIngresso,
			double salario) {
		super(nome, cpf, sobreNome, dataNascimento, sexo, telefone, endereco, email, idCadastro, modalidades);
		setSalario(salario);
	}

	public LocalDate getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(LocalDate dataIngresso) {
		if (dataIngresso == null) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		this.dataIngresso = dataIngresso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario < 1.212) {
			throw new IllegalArgumentException("inválido, menor que um salário mínimo");
		}
		this.salario = salario;
	}

	public List<Cliente> getClientes() {
		return listaClientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.listaClientes = clientes;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public double salarioAnual() {
		return this.salario * 12;
	}

	public double mensalidade() {
		double valor = 0;
		for (String modalidade : getModalidades()) {
			switch (modalidade) {
			case "natacao":
				valor = valor + 74.99;
				break;

			case "musculacao":
				valor = valor + 44.99;
				break;

			case "boxe":
				valor = valor + 54.99;
				break;

			case "pilates":
				valor = valor + 94.99;
				break;

			case "funcional":
				valor = valor + 64.99;
				break;

			default:
				valor = 0;
				break;
			}
		}

		return valor;
	}

	public double comissao() {
		int numeroClientes = listaClientes.size();
		double soma = this.salario * 0.02;
		return soma * numeroClientes;
	}

	@Override
	public String toString() {
		return super.toString() + ", data de ingresso: " + this.dataIngresso + ", salário: " + this.salario;
	}
}