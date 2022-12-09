package POO.Lista01;

/*Rafael de Paula Santos*/

/*
4) [POO-004] Escreva um programa que solicite 3 (tr�s) valores double e calcule a Equa��o do Segundo Grau. 
O primeiro valor ser� o �a�, o segundo o �b� e o �ltimo o �c�. Crie um m�todo que receba tr�s valores, 
'a', 'b' e 'c', que s�o os coeficientes da equa��o do segundo grau e retorne o valor do delta, que � dado por 'b� - 4ac'.
Entrada:            Sa�da:
a: 1 b: -1 c: -12   Delta � 49.
a: 1 b: -4 c: -5    Delta � 36.
 */

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double a, b, c, delta;

		do {
			System.out.print("Entre com o valor de \'a\': ");
			a = leia.nextDouble();
		} while (a == 0);

		System.out.print("Entre com o valor de \'b\': ");
		b = leia.nextDouble();

		System.out.print("Entre com o valor de \'c\': ");
		c = leia.nextDouble();
		leia.close();

		delta = equacaoSegundoGrau(a, b, c);
		System.out.print("O valor de delta � : " + delta);
	}

	static double equacaoSegundoGrau(double a, double b, double c) {
		double delta = Math.pow(b, 2) - (4 * a * c);
		return delta;
	}
}
