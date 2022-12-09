package POO.Lista00;

/*Rafael de Paula Santos*/

/*
Escreva um programa em Java para gerar uma matriz quadrada S de dimensão N.
Imprimir os elementos da {asa da borboleta}
*/

public class Ex19 {

	public static void main(String[] args) {
		int N = 5;
		int matrizS[][] = new int[N][N];

		System.out.println("Matriz quadrada");
		for (int linha = 0; linha < matrizS.length; linha++) {
			for (int coluna = 0; coluna < matrizS[linha].length; coluna++) {
				matrizS[linha][coluna] = 0;
				System.out.print(matrizS[linha][coluna] + "  ");
			}
			System.out.println();
		}
		System.out.println("Asa da borboleta");
		for (int l = 0; l < matrizS.length; l++) {
			for (int c = 0; c < matrizS[l].length; c++) {
				if (l >= c && (l + c) <= (N - 1) || l <= c && (l + c) >= (N - 1)) {
					System.out.print(matrizS[l][c] + "\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
