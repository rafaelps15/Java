package POO.Lista00;

/*Rafael de Paula Santos*/

/*
Escreva um programa em Java para solicitar ao usuário dimensões de uma matriz.
Preencher a matriz com os elementos da sequencia de Primos e imprimir o resultado.
*/

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[][] m1;

		int linhas, colunas, primo, contador;

		do {

			System.out.print("Entre com a quantidade de linhas da matriz: ");
			linhas = leia.nextInt();

			if (linhas < 1) {

				System.out.println("\n\tErro! Precisa ter pelo menos uma linha!\n");
			}

		} while (linhas < 1);

		do {

			System.out.print("Entre com a quantidade de colunas da matriz: ");
			colunas = leia.nextInt();

			if (colunas < 1) {

				System.out.println("\n\tErro! Precisa ter pelo menos uma coluna!\n");
			}

		} while (colunas < 1);

		m1 = new int[linhas][colunas];

		primo = 2;

		for (int linha = 0; linha < linhas; linha++) {

			for (int coluna = 0; coluna < colunas;) {

				contador = 0;

				for (int valor = 1; valor <= primo; valor++) {

					if (primo % valor == 0) {

						contador++;
					}
				}

				if (contador == 2) {

					m1[linha][coluna] = primo;

					// imprimindo
					System.out.print(m1[linha][coluna] + "\t");

					coluna++;
				}

				primo++;
			}

			System.out.println();
		}
	}
}