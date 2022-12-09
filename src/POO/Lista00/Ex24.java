package POO.Lista00;

/*Rafael de Paula Santos*/


/*
Escreva um programa em Java para solicitar ao usuário dimensões de uma matriz. 
Preencher a matriz com os elementos da sequencia de Fibonacci e imprimir o resultado.
*/

import java.util.Scanner;

public class Ex24 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int linha, coluna;

		do {
			System.out.print("Entre com a quantidade de linhas da matriz: ");
			linha = leia.nextInt();

			if (linha < 1) {
				System.out.println("\n\tErro! Precisa ter pelo menos uma linha!\n");
			}

		} while (linha < 1);

		do {
			System.out.print("Entre com a quantidade de colunas da matriz:");
			coluna = leia.nextInt();

			if (coluna < 1) {
				System.out.println("\n\tErro! Precisa ter pelo menos uma coluna!\n");
			}

		} while (coluna < 1);

		int matriz[][] = new int[linha][coluna];
		int numeroAnterior = 0, proximoNumero = 1, fibonacci = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = numeroAnterior;
				System.out.print(matriz[i][j]);
				fibonacci = numeroAnterior + proximoNumero;
				numeroAnterior = proximoNumero;
				proximoNumero = fibonacci;
			}
			System.out.println();
		}
	}
}

/*
 * public class Fibonacci {
 * 
 * static long fibo(int n) { return (n < 2) ? n : fibo(n - 1) + fibo(n - 2); }
 * 
 * public static void main(String[] args) {
 * 
 * // teste do programa. Imprima os 30 primeiros termos 
 * for (int i = 0; i < 30; i++) { 
 * System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\t"); } 
 * 	 } 
 * 	}
 */
