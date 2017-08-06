package classes;

import java.util.Scanner;

public class TestaCirculo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o raio do circulo:");
		int raio = teclado.nextInt();
		Circulo c1 = new Circulo(raio);
		System.out.println("A área do circulo é " + c1.calculaArea() + " e a circunferência é " + c1.calculaCircunferencia());

	}

}
