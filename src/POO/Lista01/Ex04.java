package POO.Lista01;

/*Rafael de Paula Santos*/

/*
4) [POO-004] Escreva um programa que solicite 3 (três) valores double e calcule a Equação do Segundo Grau. 
O primeiro valor será o ‘a’, o segundo o ‘b’ e o último o ‘c’. Crie um método que receba três valores, 
'a', 'b' e 'c', que são os coeficientes da equação do segundo grau e retorne o valor do delta, que é dado por 'b² - 4ac'.
Entrada:            Saída:
a: 1 b: -1 c: -12   Delta é 49.
a: 1 b: -4 c: -5    Delta é 36.
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
		System.out.print("O valor de delta é : " + delta);
	}

	static double equacaoSegundoGrau(double a, double b, double c) {
		double delta = Math.pow(b, 2) - (4 * a * c);
		return delta;
	}
}
