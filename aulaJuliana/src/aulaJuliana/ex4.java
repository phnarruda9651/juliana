package aulaJuliana;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		try (Scanner imput = new Scanner(System.in)) {
			System.out.println("digite sua primeira nota");
			int nota1 = imput.nextInt();
			
			System.out.println("agora a segunda nota");
			int nota2 = imput.nextInt();
			
			int notaf = (nota1 + nota2)/2;
			
			if (notaf >= 6) {
				System.out.println("sua nota final foi de: " +notaf+ " voce foi aprovado" );
			}
			
			else {
				System.out.println("sua nota final foi de: " +notaf+ " voce foi reprovado" );				
			}
		}
	}

}
