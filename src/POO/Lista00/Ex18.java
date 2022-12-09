package POO.Lista00;

/*Rafael de Paula Santos*/

/*
Escreva um programa em Java para gerar uma matriz quadrada R de dimensão N.
Imprimir os elementos acima da diagonal principal (inclusa) e acima da diagonal secundária (inclusa).
*/

import java.util.Random;

public class Ex18 {
	public static void main(String[] args) {
		int N = 4;
		int[][] matrizR = new int[N][N];
		Random gerador = new Random();

		System.out.println("Matriz quadrada: ");
		for (int linha = 0; linha < matrizR.length; linha++) {
			for (int coluna = 0; coluna < matrizR[linha].length; coluna++) {
				matrizR[linha][coluna] = gerador.nextInt(10);
				System.out.print(matrizR[linha][coluna] + "  ");
			}
			System.out.println();
		}
		System.out.println("Elementos acima da diagonal principal (inclusa) e acima da diagonal secundária (inclusa): ");
		for (int l = 0; l < matrizR.length; l++) {
			for (int c = 0; c < matrizR[l].length; c++) {
				if (l <= c || (l + c) <= (N - 1)) {
					System.out.print(matrizR[l][c] + "  ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
