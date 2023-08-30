package aulaJuliana;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		try (Scanner imput = new Scanner(System.in)){
			
			System.out.println("digite um valor");
			int num1 = imput.nextInt();
			
			System.out.println("digite agora outro numero diferente");
			int num2 = imput.nextInt();
			
			if (num1 > num2) {
				System.out.println("o numero maior e: "+num1);
			}
			
			else if (num1 == num2) {
				System.out.println("os numeros devem ser diferentes, tente novamente");
			}
			
			else {
				System.out.println("o numero maior e: "+num2);
			}
			
		}

	}

}
