package controller;

import model.ItemDePedido;
import model.Notebook;
import model.Pedido;
import model.Usuario;
import util.Teclado;

public class InfoNote {

	Usuario user;
	Notebook notebooks[] = new Notebook[10];
	Pedido pedido;

	boolean logado = false;

	public InfoNote() {
		notebooks[0] = new Notebook("Negativo N22BR", "CPU Intel Core 2 Duo, Mem�ria 2 GB, HD 250 GB",
				"img\\n22br.jjpg", "19/05/2011", 1, 6, 1200.00);

		notebooks[1] = new Notebook("Bell B55BR", "CPU Intel I3, Mem�ria 4 GB, HD 500 GB", "img\\b55br.jpg",
				"20/05/2011", 2, 3, 1800.00);

		notebooks[2] = new Notebook("Pompaq P41BR", "CPU Intel I3, Mem�ria 3 GB, HD 320 GB", "img\\p41br.jpg",
				"21/05/2011", 3, 1, 1600.00);

		notebooks[3] = new Notebook("CCF CR71CH", "CPU Intel Dual Core, Mem�ria 2 GB, HD 160 GB", "img\\cr71ch.jpg",
				"10/06/2011", 4, 5, 1100.00);

		notebooks[4] = new Notebook("BradescoTech BD22BR", "CPU AMD Phenon II, Mem�ria 4 GB, HD 500 GB",
				"img\\bd22br.jpg", "10/06/2011", 5, 2, 1900.00);
	}

	public void mostrarMenu() {
		System.out.println("--------------------------------");
		System.out.println("    InfoNote - Se n�o � Info n�o vendemos.   ");
		System.out.println("--------------------------------");
		System.out.println("1 - Login");
		System.out.println("2 - Cadastrar Cliente");
		System.out.println("3 - Buscar Notebook");
		System.out.println("4 - Inserir Notebook no carrinho");
		System.out.println("5 - Remover Notebook no carrinho");
		System.out.println("6 - Ver Carrinho");
		System.out.println("7 - Efetuar Compra");
		System.out.println("8 - Sair");

	}

	public void efetuarLogin() {
		String login, senha;
		login = Teclado.lerTexto("Digite o login: ");
		senha = Teclado.lerTexto("Digite o senha: ");

		if (login.equals("admin") && senha.equals("1234")) {
			System.out.println("Login efetuado com sucesso.");
			logado = true;

		} else {
			System.out.println("Login ou Senha inv�lido.");
			efetuarLogin();

		}
	}

	public void cadastrarUsuario() {
		System.out.println("--------------------");
		System.out.println("   InfoNote - Cadastro de usu�rios.  ");
		System.out.println("--------------------");

		int matricula = Teclado.lerInt("Matr�cula: ");
		String login = Teclado.lerTexto("Login: ");
		String senha = Teclado.lerTexto("Senha: ");
		String nome = Teclado.lerTexto("Nome: ");
		String email = Teclado.lerTexto("E-mail: ");
		String telefone = Teclado.lerTexto("Telefone: ");

		user = new Usuario(matricula, login, senha, nome, email, telefone);
		System.out.println("----------------------");
		System.out.println("   Usu�rio Cadastrado Com Sucesso.    ");
		System.out.println("----------------------");
		System.out.println(user);

	}

	public void manterCarrinho() {
		System.out.println("manterCarrinho - Em Constru��o");
	}

	public void buscarNotebook() {
		for (int i = 0; i < notebooks.length; i++) {
			if (notebooks[i] != null) {
				System.out.println(notebooks[i].getNumeroNote() + "-----" + notebooks[i].getModelo());
			}
		}
	}

	public void inserirNotebook() {

		String numeroNote = Teclado.lerTexto("Informe o n�mero do notebook" + " para compra: ");

		if (pedido == null) {
			pedido = new Pedido();
		}
		// Busca notebook selecionado
		Notebook aux = null;
		for (int i = 0; i < notebooks.length; i++) {
			if (notebooks[i] != null && numeroNote.equals(notebooks[i].getNumeroNote())) {
				aux = notebooks[i];
			}
		}

		if (aux == null) {
			return;
		}

		ItemDePedido item = new ItemDePedido(1, aux.getPrecoUnitario(), aux);

		pedido.inserirItem(item);
	}

	public void efetuarCompra() {
		System.out.println("efetuarCompra - Em Constru��o");
	}

	InfoNote info = new InfoNote();

	int opcao = 8;
	{

		do {
			info.mostrarMenu();
			opcao = Teclado.lerInt("Digite sua op��o: ");

			switch (opcao) {

			case 1:
				info.efetuarLogin();
				break;

			case 2:
				info.cadastrarUsuario();
				break;

			case 3:
				info.buscarNotebook();
				break;

			case 4:
				info.manterCarrinho();
				break;

			case 5:
				info.manterCarrinho();
				break;

			case 6:
				info.manterCarrinho();
				break;

			case 7:
				if (!info.logado) {
					System.out.println("Efetue login para efetuar compra.");
					break;

				} else {

					info.efetuarCompra();
					break;
				}

			case 8:
				System.out.println("Sa�da do Sistema.");
				break;

			default:
				System.out.println("Op��o inv�lida!");
			}
		} while (opcao != 8);
		Teclado.lerTexto("Pressione uma tecla para continuar...");

	}
}
