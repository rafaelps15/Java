package POO.Lista01;

/*Rafael de Paula Santos*/

/*
1) [POO-001] Crie programa que solicite ao usu�rio um n�mero tipo double. Ap�s verifique se o n�mero � positivo ou n�o. 
A verifica��o deve ser feita atrav�s de um m�todo que receba um valor (par�metro de entrada) e informe se ele � positivo
ou negativo atrav�s de um retorno do tipo boolean. Assuma o n�mero zero como positivo. Declare como: boolean isPositivo ( double num ).
Entrada:                      Sa�da:
Entre com um n�mero: -1,48    O n�mero -1.48 � negativo.
Entre com um n�mero: 3,14     O n�mero 3.14 � positivo.
Entre com um n�mero: 0        O n�mero 0.0 � positivo.
*/

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int cont = 0;
		double num;

		do {
			System.out.print("Entre com um n�mero: ");
			num = leia.nextDouble();

			System.out.println("O n�mero " + num + " � positivo? " + (isPositive(num) ? "Sim" : "N�o"));
			
			cont++;
		} while (cont < 3);

	}

	public static boolean isPositive(double num) {
		if (num >= 0.0) {
			return true;
		} else {
			return false;
		}
	}
}