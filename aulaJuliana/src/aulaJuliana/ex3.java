package aulaJuliana;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		try (Scanner imput = new Scanner(System.in)) {
			System.out.println("digite o numero de frutas a serem compradas");
			int qtdmaca = imput.nextInt();
			
			if (qtdmaca >= 12) {
				System.out.println("o valor da compra e de: " + qtdmaca * 1);
			}
			
			else {
				System.out.println("o valor da compra e de: " + (qtdmaca * 1.3));
			}
		}
		
	}

}
