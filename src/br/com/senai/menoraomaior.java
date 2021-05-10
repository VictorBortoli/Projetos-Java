package br.com.senai;

import java.util.Scanner;

public class menoraomaior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---- Incrementos ----");
		Scanner tec = new Scanner (System.in);
		System.out.print("Informe o 1° valor: ");
		int numero1 = tec.nextInt();
		System.out.print("Informe o 2°° valor: ");
		int numero2 = tec.nextInt();
		
		if(numero1 < numero2) {
			while(numero1 <= numero2) {
				System.out.println(numero1);
				numero1 = numero1 + 1;
			}
		}
		else if(numero1 > numero2) {
			while(numero1 >= numero2) {
				System.out.println(numero1);
				numero1 = numero1 - 1;
			}
		}
			
			
	}

}
