package bar;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		String nome;
		String formato;
		String telefone;
			
		
		System.out.println("====Seja bem vindo====");
		System.out.println("Digite seu nome: ");
		nome = leitor.next();
		System.out.println("Digite sua data de nascimento(dd/mm/AAAA): ");
		formato = "[0-9][0-9]\\/[0-9][0-9]\\/[0-9][0-9][0-9][0-9]";
		boolean fomatoCorreto = leitor.hasNext(formato);
		leitor = new Scanner(System.in);;
		try {
			if(fomatoCorreto == false) {
				throw new Exception();
			} else {	
				Calendar calendar = Calendar.getInstance();
				calendar.set(2002, Calendar.MAY, 15);
				Date dataNascimento = calendar.getTime();
				
				Cliente cliente = new Cliente("José",  dataNascimento, "98564-8552");
				
				System.out.println("Digite seu telefone: ");
				telefone = leitor.nextLine();
								
				Compra compra = new Compra(cliente);
				
				Produto produto1 = new Bebida("Cachaça", 15.0, 1, "Ypióca", 1, true);
				Produto produto2 = new Bebida("Refrigerante", 5, 2, "Coca Cola", 1, false);
				Produto produto3 = new Petisco("Bacon", 8.0, 3, 1, "Não vegetariano", false);
				
				compra.incluirProduto(produto1);
				compra.incluirProduto(produto2);
				compra.incluirProduto(produto3);
				
				double  total = compra.somarConta();
				double valor = 100.0;
				double troco = compra.pagarConta(valor, total);
				
				System.out.println("Você pagou: "+valor);
				System.out.println("Sua conta é: "+total);
				System.out.println("Seu troco é: "+troco);
			}
		} catch (Exception e) {
			System.out.println("Formato de data inválido");
			System.out.println("Fechando o programa.");
		}
		
		
		
	
	}

}
