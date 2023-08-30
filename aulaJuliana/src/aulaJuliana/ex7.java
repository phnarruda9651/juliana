package aulaJuliana;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// ) Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente
		
		try (Scanner imput = new Scanner(System.in)){
			
			System.out.println("digite o primeiro valor");
			int vlr1 = imput.nextInt();
			
			System.out.println("digite o segundo numero");
			int vlr2 = imput.nextInt();
			
			if (vlr1 > vlr2) {
				System.out.print(vlr2+ "," +vlr1);
			}
			
			else if (vlr1 < vlr2) {
				System.out.print(vlr1+ "," +vlr2);
			
		}
			else {
				System.out.print("os valores sao iguais, tente novamente");
			}

	}
}
}
