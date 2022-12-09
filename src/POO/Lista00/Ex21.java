package POO.Lista00;

/*Rafael de Paula Santos*/

/*
Escreva um programa em Java para gerar uma matriz (N x M) e outra (N x P). 
Gerar uma terceira matriz (N x (M+P)), sendo que para cada linha concatenar
suas respectivas colunas e apresentar as três matrizes.
*/

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[][] m1, m2, m3;

		int linhas, col1, col2, col3, coluna;

		do {

			System.out.print("Entre com a quantidade de linhas das matrizes: ");
			linhas = leia.nextInt();

			if (linhas < 1) {

				System.out.println("\n\tErro! Precisa ter pelo menos uma linha!\n");
			}

		} while (linhas < 1);

		do {

			System.out.print("Entre com a quantidade de colunas das primeira matriz: ");
			col1 = leia.nextInt();

			if (col1 < 1) {

				System.out.println("\n\tErro! Precisa ter pelo menos uma coluna!\n");
			}

		} while (col1 < 1);

		do {

			System.out.print("Entre com a quantidade de colunas das segunda matriz: ");
			col2 = leia.nextInt();

			if (col2 < 1) {

				System.out.println("\n\tErro! Precisa ter pelo menos uma coluna!\n");
			}

		} while (col2 < 1);

		m1 = new int[linhas][col1];
		m2 = new int[linhas][col2];

		col3 = col1 + col2;

		m3 = new int[linhas][col3];

		for (int i = 0; i < linhas; i++) {

			coluna = 0;

			// gerando as colunas da primeira matriz
			for (int j = 0; j < col1; j++) {

				m1[i][j] = (int) (Math.random() * 10) + 1;

				// concatenar na terceira matriz
				m3[i][coluna++] = m1[i][j];
			}

			// gerando as colunas da segunda matriz
			for (int k = 0; k < col2; k++) {

				m2[i][k] = (int) (Math.random() * 10) + 1;

				// concatenar na terceira matriz
				m3[i][coluna++] = m2[i][k];
			}
		}

		// imprimindo a m1
		System.out.println("\nMatriz 1:");
		for (int linha = 0; linha < m1.length; linha++) {

			for (coluna = 0; coluna < m1[linha].length; coluna++) {

				System.out.print(m1[linha][coluna] + "\t");
			}
			System.out.println();
		}

		// imprimindo a m2
		System.out.println("\nMatriz 2:");
		for (int linha = 0; linha < m2.length; linha++) {

			for (coluna = 0; coluna < m2[linha].length; coluna++) {

				System.out.print(m2[linha][coluna] + "\t");
			}
			System.out.println();
		}

		// imprimindo a m3
		System.out.println("\nMatriz 3 (concatenada):");
		for (int linha = 0; linha < m3.length; linha++) {

			for (coluna = 0; coluna < m3[linha].length; coluna++) {

				System.out.print(m3[linha][coluna] + "\t");
			}
			System.out.println();
		}
	}
}