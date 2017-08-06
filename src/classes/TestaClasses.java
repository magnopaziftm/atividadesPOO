package classes;

import java.util.Scanner;

public class TestaClasses {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome da pessoa:");
		String nome = teclado.nextLine();
		System.out.println("Digite o logradouro do endere�o:");
		String logra = teclado.nextLine();
		System.out.println("Digite o n�mero do endere�o:");
		int numero = teclado.nextInt();
		System.out.println("Digite a cidade do endere�o:");
		String cidade = teclado.nextLine();
		System.out.println("Digite o Estado do endere�o:");
		String estado = teclado.nextLine();
		System.out.println("Digite o CEP do endere�o:");
		String cep = teclado.nextLine();
		
		Pessoa p1 = new Pessoa(nome);
		Endereco e1 = new Endereco(logra, cidade, estado, numero, cep);
		Casa c1 = new Casa(p1, e1);
		
		System.out.println("O nome da pessoa da casa � " + c1.proprietario.nome);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
