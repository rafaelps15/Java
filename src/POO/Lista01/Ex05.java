package POO.Lista01;

/*Rafael de Paula Santos*/

/*
5) [POO-005] Baseado no exercício anterior, crie uma nova versão, que calcula as raízes de uma equação do segundo grau: ax² + bx + c = 0.
Para ela existir, o coeficiente 'a' deve ser diferente de zero. Caso o delta seja maior ou igual a zero, as raízes serão reais. 
Caso o delta seja negativo, as reais serão complexas e da forma, assim retorne zero.
Entrada:            Saída:
a: 1 b: -1 c: -12   Delta é 49.
a: 1 b: -4 c: -5    Delta é 36.
 */

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double a, b, c;
		String delta;

		do {
			System.out.print("Entre com o valor de \'a\': ");
			a = leia.nextDouble();
		} while (a == 0);

		System.out.print("Entre com o valor de \'b\': ");
		b = leia.nextDouble();

		System.out.print("Entre com o valor de \'c\': ");
		c = leia.nextDouble();
		leia.close();

		delta = equacao2Grau(a, b, c);
		System.out.print("O valor de delta é : " + delta);
	}

	private static String equacao2Grau(double a, double b, double c) {
		double delta = Math.pow(b, 2) - (4 * a * c);
		
		if (delta < 0) {
			return String.format("Não existem raizes reais! ");
		} else {
			double x1 = (-b + (Math.sqrt(delta))) / (2 * a);
			double x2 = (-b - (Math.sqrt(delta))) / (2 * a);
			return String.format("Raíz x\' = %.1f\n" + "Raíz x\" = %.1f", x1, x2);
		}

	}

}
