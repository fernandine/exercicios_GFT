package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o n�mero 1: ");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.print("Digite o n�mero 2: ");
        int num2 = Integer.parseInt(sc.nextLine());

		System.out.print("Os n�meros pares entre " + num1 + " e " + num2 + " s�o:");
        for (int num = num1; num <= num2; num++) {
            if (num % 2 == 0) {
                System.out.print(" " + num);
            }
        }
        sc.close();
    }
}