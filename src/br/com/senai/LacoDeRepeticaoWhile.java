package br.com.senai;

public class LacoDeRepeticaoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor = 0;
		
		System.out.println("Valor:" + valor);
		
		while(valor <= 25) {
			System.out.println("-> valor:" + valor);
			valor += 1;
			valor = valor + 1;
			
		}
		
		System.out.println("Agora valor é:" + valor);
	}

}
