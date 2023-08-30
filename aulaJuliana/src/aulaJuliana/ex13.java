package aulaJuliana;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		// : Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa, calcule e mostre 
		// seu peso ideal, utilizando as seguintes fórmulas:
		//	- para sexo masculino: peso ideal = (72.7 * altura) - 58
		//	- para sexo feminino: peso ideal = (62.1 * altura) - 44.7
		
		try (Scanner imput = new Scanner(System.in)){
			
			System.out.println("digite seu nome por favor");
			String nome = imput.next();
			
			System.out.println("agora digite sua altura em metros");
			double altura = imput.nextDouble();
			
			System.out.println("agora digite seu sexo (M para masculino e F para feminino");
			String sexo = imput.next();
			
			if (sexo.equals("M")){
				double pesoideal = (72.7*altura)-58;
				System.out.println("ola "+nome+" o seu peso ideal com a altura de "+altura+" e de "+pesoideal);
			}
			
			else {
				double pesoideal = (62.1*altura)-44.7;
				System.out.println("ola "+nome+" o seu peso ideal com a altura de "+altura+" e de "+pesoideal);
			}
			
		}
		

	}

}
