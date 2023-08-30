package aulaJuliana;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		//  A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 
		// horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.Escreva um 
		// programa que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do 
		// funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês 
		// possua 4 semanas exatas).
		
		try (Scanner imput = new Scanner(System.in)){
			
			System.out.println("digite as horas trabalhadas na primeira semana:");
			int sm1 = imput.nextInt();
			
			System.out.println("digite as horas trabalhadas na segunda semana:");
			int sm2 = imput.nextInt();
			
			System.out.println("digite as horas trabalhadas na terceira semana:");
			int sm3 = imput.nextInt();
			
			System.out.println("digite as horas trabalhadas na quarta semana:");
			int sm4 = imput.nextInt();
			
			int totalhora = sm1+sm2+sm3+sm4 ;
			
			System.out.println("digite quanto voce ganha por hora:");
			int vlrhora = imput.nextInt();
			
			if (totalhora > 40) {
				int horaextra = totalhora-40;
				double pgextra = (horaextra*vlrhora)*1.5;
				double salariototal = (40*vlrhora)+pgextra;
				System.out.println("seu salario total e: "+salariototal);
			}
			
			else {
				double salariototal = totalhora*vlrhora;
				System.out.println("seu salario total e: "+salariototal);
			}
		}

	}

}
