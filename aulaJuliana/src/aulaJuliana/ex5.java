package aulaJuliana;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		try (Scanner imput = new Scanner(System.in)) {
			System.out.println("digite o ano que voce nasceu");
			int nasc = imput.nextInt();
			
			System.out.println("digite o ano atual");
			int ano = imput.nextInt();
			
			int resul = ano - nasc;
			
			if (resul > 16) {
				System.out.println("voce tem "+resul+"anos e ja pode votar este ano");
			}
			
			else {
				System.out.println("voce tem "+resul+"anos e ainda nao pode votar este ano");
			}
		}
	}

}
