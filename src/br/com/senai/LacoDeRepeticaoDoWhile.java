package br.com.senai;

public class LacoDeRepeticaoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor = 0;
		
		System.out.println("Valor incial: " + valor);
		
		do {
			System.out.println("-> " + valor);
			valor++;
		}while(valor <= 10);
		
		System.out.println("Valor Final: " + valor);
			
		}
	}


