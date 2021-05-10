package br.com.senai;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---- Calculando a Tabuada ----");
		Scanner tec = new Scanner (System.in);
		System.out.print("Informe o valor que deseja calcular a tabuada: ");
		int valor1 = tec.nextInt();
		int num1 = 0;
		while (num1 <= 10) {
			System.out.println(valor1 + " X " + num1 + " = " + num1 * valor1);		
			num1 = num1 + 1;	
		}
			
	}

}
