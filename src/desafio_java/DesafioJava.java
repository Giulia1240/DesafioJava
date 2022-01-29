package desafio_java;

import java.util.Scanner;

public class DesafioJava {

	public static void fizzBuzy(int n) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de n: ");
		n = sc.nextInt();
		int x = 10;
		int potenciacao = (int) (Math.pow(x, 5) * 2);

		if (n < potenciacao) {

			for (int i = 1; i <= n; i++) {

				if ((i % 3) == 0 && (i % 5) == 0) {
					System.out.println("Fizzbuzz ");
				}

				else if ((i % 3) == 0) {

					System.out.println("Fizz ");
				}

				else if ((i % 5) == 0) {
					System.out.println("Buzz ");
				}

				else {
					System.out.println(i);
				}

			}

		} else {

			System.out.println("Valor de n excede o limite");
		}
		sc.close();
	}

}
