package aulaJuliana;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		try (Scanner imput = new Scanner(System.in)) {
			System.out.println("digite um numero para saber se e maior que 10");
			int num1 = imput.nextInt();
			
			if (num1 > 10) {
				System.out.println("maior que 10");
				
			}
			else if (num1 == 10) {
				System.out.println("o numero e igual a 10");
			}
			
			else {
				System.out.println("menor que 10");
			}
		}

	}

}
