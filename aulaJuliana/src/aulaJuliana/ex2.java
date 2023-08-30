package aulaJuliana;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		try (Scanner imput = new Scanner(System.in)) {
			System.out.println("digite um numero para saber se e positivo ou negativo");
			int numero = imput.nextInt();
			
			if (numero > 0) {
				System.out.println("o numero " +numero+ " e maior que zero , entao e positivo");
			}
			
			else if (numero == 0) {
				System.out.println("o numero " +numero+ " e igual a zero, entao e positivo");
			}
			
			else {
				System.out.println("o numero " +numero+ " e menor que zero, entao e negativo");
			}
		}

	}

}
