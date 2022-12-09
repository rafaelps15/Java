package POO.Lista00;

/*Rafael de Paula Santos*/


/*
 Escreva um programa em Java para gerar uma matriz quadrada T de dimensão N.
 Imprimir os elementos da “ampulheta”.
 
 */

public class Ex20 {

	public static void main(String[] args) {
		int N = 6;
		int matrizT[][] = new int[N][N];

		System.out.println("Matriz quadrada");
		for (int linha = 0; linha < matrizT.length; linha++) {
			for (int coluna = 0; coluna < matrizT[linha].length; coluna++) {
				matrizT[linha][coluna] = 0;
				System.out.print(matrizT[linha][coluna] + "  ");
			}
			System.out.println();
		}
		System.out.println("Ampulheta: ");
		for (int l = 0; l < matrizT.length; l++) {
			for (int c = 0; c < matrizT[l].length; c++) {
				if (l <= c && (l + c) <= (N - 1) || l >= c && (l + c) >= (N - 1)) {
					System.out.print(matrizT[l][c] + "  ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
