package POO.Lista01;

/*Rafael de Paula Santos*/

/*
3) [POO-003] Com base nos dois exerc�cios anteriores, crie programa que solicite ao usu�rio um n�mero tipo double.
Ap�s verifique se o n�mero � positivo, negativo ou zero. As verifica��es devem ser feitas atrav�s de m�todos.
Entrada:                     Sa�da:
Entre com um n�mero: -1,48   O n�mero -1.48 � negativo.
Entre com um n�mero: 3,14    O n�mero 3.14 � positivo.
Entre com um n�mero: 0       O n�mero 0.0 � zero.
 */

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int cont = 0;
		double num;

		do {
			System.out.print("Entre com um n�mero: ");
			num = leia.nextDouble();
			
			System.out.printf("O n�mero " + num + " � %s\n", positivoNegativo(num));

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
