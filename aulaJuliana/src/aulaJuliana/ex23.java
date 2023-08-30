package aulaJuliana;

import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		// Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
		// do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.
		
		try (Scanner imput = new Scanner(System.in)){
			System.out.println("digite o nome do primeiro time:");
			String time1 = imput.next();
			
			System.out.println("digite o nome do segundo time:");
			String time2 = imput.next();
			
			System.out.println("digite a quantidade de gols do primeiro time:");
			int pt1 = imput.nextInt();
			
			System.out.println("digite a quantidade de gols do segundo time:");
			int pt2 = imput.nextInt();
			
			if (pt1>pt2) {
				System.out.println("o vencedor foi: "+time1+" com "+pt1+" gol(s)");
			}
			
			else if (pt1==pt2) {
				System.out.println("os times empataram com o placar de: "+pt1+" a "+pt2);
			}
			
			else {
				System.out.println("o vencedor foi: "+time2+" com "+pt2+" gol(s)");
			}
		}

	}

}
