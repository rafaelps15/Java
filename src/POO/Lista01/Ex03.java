package POO.Lista01;

/*Rafael de Paula Santos*/

/*
3) [POO-003] Com base nos dois exercícios anteriores, crie programa que solicite ao usuário um número tipo double.
Após verifique se o número é positivo, negativo ou zero. As verificações devem ser feitas através de métodos.
Entrada:                     Saída:
Entre com um número: -1,48   O número -1.48 é negativo.
Entre com um número: 3,14    O número 3.14 é positivo.
Entre com um número: 0       O número 0.0 é zero.
 */

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int cont = 0;
		double num;

		do {
			System.out.print("Entre com um número: ");
			num = leia.nextDouble();
			
			System.out.printf("O número " + num + " é %s\n", positivoNegativo(num));

			cont++;
		} while (cont < 3);

	}

	private static String positivoNegativo(double num) {
		if (num > 0.0) {
			return "positivo.";
		} else if (num < 0.0) {
			return "negativo.";
		} else {
			return "zero.";
		}
	}
}
