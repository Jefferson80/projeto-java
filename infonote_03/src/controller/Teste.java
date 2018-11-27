package controller;

import model.*;

public class Teste {

	public static void main(String[] args) {

		Usuario user = new Usuario(1, "Mr. Catra", "Borel001", "Wagner", "mrcatra@gmail.com", "2222-3344");

		user.mostrar();

		System.out.println("=======================================");

		ItemDePedido Idp1 = new ItemDePedido(3, 48.73);
		Idp1.mostrar();

		
		
		System.out.println("=======================================");

		ItemDePedido Idp2 = new ItemDePedido(1, 23.49);
		Idp2.mostrar();

		System.out.println("=======================================");

		Endereco edc = new Endereco("Avenida", "400", "Bairro Imperial", "São Cristovão", "Rio de Janeiro", "RJ",
				"21870-190");
		edc.mostrar();

		System.out.println("=======================================");

		Pedido pd = new Pedido("27/09", "Dinheiro", "OK", 23, 357.54);
		pd.mostrar();

		System.out.println("=======================================");

		Notebook nt1 = new Notebook("Acer 72145", "HD 500G, 18G de Memória, Tela 15\"", "Frágil", "2016", 1, 35, 150.50);
		nt1.mostrar();

		System.out.println("=======================================");

		Notebook nt2 = new Notebook("Aparelho eletrônico", "20/09", "Frágil", "2016", 2, 36, 150.50);
		nt2.mostrar();

		System.out.println("=======================================");

		Notebook nt3 = new Notebook("Aparelho eletrônico", "20/09", "Frágil", "2016", 3, 37, 150.50);
		nt3.mostrar();

	}

}
