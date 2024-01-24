package resolucao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

	private LocalDate inicioContrato;

	public Cliente(String nome, String cpf, String sobreNome, LocalDate dataNascimento, char sexo, String telefone,
			Endereco endereco, String email, String idCadastro, List<String> modalidades, LocalDate inicioContrato) {
		super(nome, cpf, sobreNome, dataNascimento, sexo, telefone, endereco, email, idCadastro, modalidades);
		setInicioContrato(inicioContrato);
	}

	public LocalDate getInicioContrato() {
		return inicioContrato;
	}

	public void setInicioContrato(LocalDate inicioContrato) {
		this.inicioContrato = inicioContrato;
	}

	public double mensalidade() {
		double valor = 0;
			for (String modalidade : getModalidades()) {
				switch (modalidade) {
				case "natacao":
					valor = valor + 149.99;
					break;

				case "musculacao":
					valor = valor + 89.99;
					break;

				case "boxe":
					valor = valor + 109.99;
					break;

				case "pilates":
					valor = valor + 189.99;
					break;

				case "funcional":
					valor = valor + 129.99;
					break;

				default:
					valor = 0;
					break;
				}
		}
		return valor;
	}

	public boolean setClientePremium() {
		LocalDate hoje = LocalDate.now();
		if (hoje.isAfter(inicioContrato.plusYears(1))) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return super.toString() + ", inicio do contrato: " + this.inicioContrato;
	}

}