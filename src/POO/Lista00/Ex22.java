package POO.Lista00;

/*Rafael de Paula Santos*/

/*
Escreva um programa em Java para gerar uma matriz (N x M) e outra (N x P). 
Gerar uma terceira matriz (N x (M+P)), sendo que para cada linha intercalar 
suas respectivas colunas e apresentar as três matrizes.
*/

import java.util.Scanner;

public class Ex22 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[][] m1, m2, m3;

		int linhas, col1, col2, col3, coluna, c1, c2;

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

			// gerando as colunas da primeira matriz
			for (int j = 0; j < col1; j++) {

				m1[i][j] = (int) (Math.random() * 1000) + 1;
			}

			// gerando as colunas da segunda matriz
			for (int k = 0; k < col2; k++) {

				m2[i][k] = (int) (Math.random() * 1000) + 1;
			}
		}

		// intercalando na terceira matriz
		for (int i = 0; i < linhas; i++) {

			c1 = c2 = 0;

			for (int j = 0; j < col3;) {

				// intercalando a primeira
				if (c1 < col1) {
					m3[i][j] = m1[i][c1];
					c1++;
					j++;
				}

				// intercalando a segunda
				if (c2 < col2) {
					m3[i][j] = m2[i][c2];
					c2++;
					j++;
				}
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
		System.out.println("\nMatriz 3:");
		for (int linha = 0; linha < m3.length; linha++) {

			for (coluna = 0; coluna < m3[linha].length; coluna++) {

				System.out.print(m3[linha][coluna] + "\t");
			}
			System.out.println();
		}
	}
}