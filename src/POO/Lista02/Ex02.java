package POO.Lista02;

/*Rafael de Paula Santos*/

/*
2) [POO-007] Crie um programa que solicite ao usuário dois números inteiros. Através de um método, que 
receba esses 2 números como parâmetros de entrada, verifique e retorne o menor dos dois valores.
Restrição: NÃO usar o pacote Math.
Entrada:                            Saída:
Entre com um número inteiro: 8      O menor é: 2
Entre com outro número inteiro: 2

Entre com um número inteiro: -48    O menor é: -48
Entre com outro número inteiro: 48

Entre com um número inteiro: 17     O menor é: 17
Entre com outro número inteiro: 17
*/

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int num1, num2;

		System.out.print("Entre com um numero inteiro: ");
		num1 = leia.nextInt();

		System.out.print("Entre com outro numero inteiro: ");
		num2 = leia.nextInt();

		System.out.print("O maior eh: " + menorValor(num1, num2));
	}

	static int menorValor(int num1, int num2) {
		if (num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}
}
