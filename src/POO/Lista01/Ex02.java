package POO.Lista01;

/*Rafael de Paula Santos*/

/*
2) [POO-002] Crie programa que solicite ao usu�rio um n�mero tipo double. Ap�s verifique se o n�mero � zero ou n�o. 
A verifica��o deve ser feita atrav�s de um m�todo que receba um valor (par�metro de entrada) e informe se ele � zero 
ou n�o atrav�s de um retorno do tipo boolean. Declare como: boolean isZero ( double num ).
Entrada:                     Sa�da:
Entre com um n�mero: -1,48   O n�mero -1.48 n�o � zero.
Entre com um n�mero: 3,14    O n�mero 3.14 n�o � zero.
Entre com um n�mero: 0       O n�mero 0.0 � zero.
*/

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int cont = 0;
		double num;

		do {
			System.out.print("Entre com um n�mero: ");
			num = leia.nextDouble();

			System.out.println("O n�mero " + num + " � zero? " + (isZero(num) ? "Eh zero" : "N�o eh zero"));

			cont++;
		} while (cont < 3);

	}

	public static boolean isZero(double num) {
		if (num == 0.0) {
			return true;
		} else {
			return false;
		}
	}
}
