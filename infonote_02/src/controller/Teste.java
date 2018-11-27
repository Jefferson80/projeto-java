package controller;


import model.*;


public class Teste {
	

	public static void main(String[] args) {
		
		
		Usuario user = new Usuario(1, "joseph", "climber", "Joseph Climber", "josephclimber@gmail.com","2222-3344");
		
		
			//Mostrar Usuário
			user.mostrar();

		


			Endereco edc = new Endereco ("Rua", "74", "Antigo 21", "Bangu", "Rio de Janeiro","Rio de Janeiro", "21840-190");
			
			
				//Mostrar Usuário
				edc.mostrar();

				
			
				Pedido ped = new Pedido (300, "27/11/2018", "Dinheiro", 450, "OK");
				
				
				//Mostrar Usuário
				ped.mostrar();

			
				ItemDePedido Iped = new ItemDePedido (300, "27/11/2018", "Dinheiro", 450, "OK");
				
				
				//Mostrar Usuário
				Iped.mostrar();

			
			
				System.out.println("\n\n____________________________________________________________________________________ \n");		
		
		
		//ItemDePedido - 2 Objetos
		
		ItemDePedido Idp1 = new ItemDePedido();
		Idp1.setQtde(2);
		Idp1.setSubtotal(22.98);
		System.out.println(Idp1.toString());
		
						
		ItemDePedido Idp2 = new ItemDePedido();
		Idp2.setQtde(1);
		Idp2.setSubtotal(98.75);
		System.out.println(Idp2.toString());
				
		
		System.out.println("____________________________________________________________________________________");
		
		//Usuario - 1 Objeto
		
		Usuario Idp3 = new Usuario();
		Idp3.setQtde(1);
		Idp3.setSubtotal(98.75);
		System.out.println(Idp3.toString());
		
		
		System.out.println("____________________________________________________________________________________");
				
		
		
		
	}

}
