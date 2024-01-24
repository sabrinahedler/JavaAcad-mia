package resolucao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// CÓDIGOS

		// --------------------------------------------------------------------------
		// criação do endereço
		Endereco e1 = new Endereco("Brasil", "SC", "Blumenau", "2 de setembro", 102);

		// ---------------------------------------------------------------------
		// criação dos funcionários

		List<String> modalidades = new ArrayList<>();
		modalidades.add("natacao");
		modalidades.add("musculacao");
		modalidades.add("boxe");
		modalidades.add("pilates");
		modalidades.add("funcional");

		Funcionario f1 = new Funcionario("Jose", "455.778.981-34", "Silva", LocalDate.of(1978, 10, 23), 'h',
				"(41) 96974-8803", e1, "josessilva12@gmail.com", "4546-3", modalidades, LocalDate.of(2007, 01, 19),
				3340);

		Funcionario f2 = new Funcionario("Jose", "455.778.981-34", "Silva", LocalDate.of(1978, 10, 23), 'h',
				"(41) 96974-8803", e1, "josessilva12@gmail.com", "4546-3", modalidades, LocalDate.of(2007, 01, 19),
				3340);
		Funcionario f3 = new Funcionario("Fernanda", "667.985.111-24", "Ribeiro", LocalDate.of(2000, 05, 03), 'f',
				"(11) 94355-0076", e1, "fefezinha34@gmail.com", "3468-3", modalidades, LocalDate.of(2020, 01, 19),
				5100);
		Funcionario f4 = new Funcionario("Lucas", "999.030.286-06", "Rangel", LocalDate.of(1988, 10, 01), 'h',
				"(34) 96953-7759", e1, "lucasrangell457@gmail.com", "8845-0", modalidades, LocalDate.of(2017, 02, 28),
				2679);
		Funcionario f5 = new Funcionario("Gabriel", "677.802.334-11", "Liveira", LocalDate.of(1990, 11, 05), 'h',
				"(53) 98770-3348", e1, "gabriel@gmail.com", "8845-0", modalidades, LocalDate.of(2018, 06, 30), 4802);

		// -----------------------------------------------------------------------
		// criação da academia
		List<String> listaModalidades = new ArrayList<>();
		listaModalidades.add("natacao");
		listaModalidades.add("musculacao");
		listaModalidades.add("boxe");
		listaModalidades.add("pilates");
		listaModalidades.add("funcional");

		List<Funcionario> listaFuncionarios = new ArrayList<>();
		listaFuncionarios.add(f1);
		listaFuncionarios.add(f2);
		listaFuncionarios.add(f3);
		listaFuncionarios.add(f4);
		listaFuncionarios.add(f5);

		Academia academia = new Academia(listaModalidades, listaFuncionarios, "05:00 ás 00:00", e1, "(47) 3335-8770");
		// -------------------------------------------------------------------------------------------

		String nome = null;
		String sobrenome = null;
		String telefone = null;
		char genero = 0;
		String cpf = null;
		String email = null;
		LocalDate dataNascimento = null;
		LocalDate dataContrato = null;
		int quantidadeModalidade = 0;

		System.out.println("Deseja cadastrar um novo cliente?");
		String novoCliente = scan.next();

		while (!novoCliente.equalsIgnoreCase("nao")) {
			modalidades.clear();
			
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("| PREENCHA OS DADOS ABAIXO: |");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

			System.out.print("➤ Nome: ");
			nome = scan.next();

			System.out.print("➤ Sobrenome: ");
			sobrenome = scan.next();

			System.out.print("➤ Telefone: ");
			telefone = scan.next();

			System.out.print("➤ Gênero: ");
			genero = scan.next().charAt(0);

			System.out.print("➤ Cpf: ");
			cpf = scan.next();

			System.out.print("➤ Email: ");
			email = scan.next();

			System.out.print("➤ Data de nascimento: ");
			dataNascimento = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());

			System.out.print("➤ Data atual do contrato: ");
			dataContrato = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());

			System.out.print("➤ Informe a quantidade de modalidades escolhidas: ");
			quantidadeModalidade = scan.nextInt();

			String modalidade = null;

			if (quantidadeModalidade > 1) {
				System.out.println("➤ Informe as modalidades escolhidas:");
				for (int i = 0; i < quantidadeModalidade; i++) {
					modalidade = scan.next();
					modalidades.add(modalidade);
				}
			} else {
				System.out.print("➤ Informe a modalidade escolhida: ");
				modalidades.add(modalidade = scan.next());
			}

			Cliente cliente = new Cliente(nome, cpf, sobrenome, dataNascimento, genero, telefone, e1, email, "575348",
					modalidades, dataContrato);

			// lista de clientes presentes em cada funcionário
			List<Cliente> listaClientes = new ArrayList<>();
			f1.listaClientes.add(cliente);

			System.out.println("Deseja cadastrar mais um cliente?");
			novoCliente = scan.next();
		}

		System.out.println("");
		System.out.println("  ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("  |  CADASTRO EFETUADO COM SUCESSO  |");
		System.out.println("  ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		System.out.println("");
		System.out.println("░░░░░░░░░░░░░░░░░░░░░░█████████░░░░░░░░░\r\n"
				+ "░░███████░░░░░░░░░░███▒▒▒▒▒▒▒▒███░░░░░░░\r\n" + "░░█▒▒▒▒▒▒█░░░░░░░███▒▒▒▒▒▒▒▒▒▒▒▒▒███░░░░\r\n"
				+ "░░░█▒▒▒▒▒▒█░░░░██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██░░\r\n" + "░░░░█▒▒▒▒▒█░░░██▒▒▒▒▒██▒▒▒▒▒▒██▒▒▒▒▒███░\r\n"
				+ "░░░░░█▒▒▒█░░░█▒▒▒▒▒▒████▒▒▒▒████▒▒▒▒▒▒██\r\n" + "░░░█████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\r\n"
				+ "░░░█▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒██\r\n" + "░██▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒██▒▒▒▒▒▒▒▒▒▒██▒▒▒▒██\r\n"
				+ "██▒▒▒███████████▒▒▒▒▒██▒▒▒▒▒▒▒▒██▒▒▒▒▒██\r\n" + "█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒████████▒▒▒▒▒▒▒██\r\n"
				+ "██▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██░\r\n" + "░█▒▒▒███████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██░░░\r\n"
				+ "░██▒▒▒▒▒▒▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█░░░░░\r\n" + "░░████████████░░░█████████████████░░░░░░");

		// -------------------------------------------------------------------------------------------

		System.out.println("");
		System.out.println("             TESTES EXTRAS:");
		System.out.println("");

		System.out.println("Comissão do funcionário " + f1.getNome() + " foi de R$" + f1.comissao()
				+ ", recebendo um salário total de: " + (f1.getSalario() + f1.comissao()));

		System.out.println("Salário anual do funcionário " + f2.getNome() + " foi de R$" + f2.salarioAnual());

		System.out.println("Nome completo do cliente: " + f1.listaClientes.get(0).nomeCompleto());
		System.out.println("O cliente " + f1.listaClientes.get(0).getNome() + " tem " + f1.listaClientes.get(0).idade() + " anos");

		System.out.println("Mensalidade paga pelo funcionário " + f3.getNome() + " é de: " + f3.mensalidade());
		System.out.println("Mensalidade paga pelo cliente " + f1.listaClientes.get(0).getNome() + " é de: "
				+ f1.listaClientes.get(0).mensalidade());

		System.out.println("O cliente " + f1.listaClientes.get(0).getNome() + " tem a validação premium como "
				+ f1.listaClientes.get(0).setClientePremium());

		System.out.println("");
		System.out.println("             TO STRING:");
		System.out.println("");

		System.out.println(f1.toString());
		System.out.println(f1.listaClientes.get(0).toString());

	}
}