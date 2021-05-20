package br.com.senai;

import java.util.Scanner;

public class MenuInterrativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		String opcao = "s";
		int opcaoDoMenu;
		
		do {
			System.out.println("---MENU---");
			System.out.println("1) Verificar sexo e idade");
			System.out.println("2) Contagem de valores");
			System.out.println("3) Tabuada");
			System.out.println("4) Cadastrar cursos");
			System.out.println("5) sair");
			System.out.println("------------");
			System.out.print("Informe a op��o desejada: ");
			opcaoDoMenu = tec.nextInt();

			switch (opcaoDoMenu) {
			case 1: 
				System.out.println("---- Verificar Sexo e Idade ----");
				String nome;
				int anoDeNascimento;
				String sexo;
				int idade;
				System.out.print("Informe seu nome: ");
				nome = tec.next();
				System.out.print("Informe seu ano de nascimento: ");
				anoDeNascimento = tec.nextInt();
				System.out.print("Informe seu sexo [M/F]: ");
				sexo = tec.next();
				idade = 2021 - anoDeNascimento;
				
				System.out.println("\n");
				
				if(idade < 12) {
					System.out.println(nome+ ", voc� ainda � uma crian�a, tem " +idade+ " anos de idade");
				}
				else if (idade >= 12 && idade < 18) {
					System.out.println(nome+ ", voc� � jovem, tem " +idade+ " anos de idade");
				}
				else if (idade >= 18 && idade < 65) {
					System.out.println(nome+ ", voc� j� � adulto, tem " +idade+ " anos de idade");
				}
				else {
					System.out.println(nome+ ", voc� j� � um idoso, tem " +idade+ " anos de idade");
				}
				
				if(sexo.equalsIgnoreCase("m")) {
					System.out.println("� do sexo masculino");
				}
				else if (sexo.equalsIgnoreCase("f")) {
					System.out.println("� do sexo feminino");
				}
				else {
					System.out.println("Op��o Inv�lida!!!");
				}
				
				if(idade < 16) {
					System.out.println("Voc� ainda n�o pode votar");
				}
				else if(idade >= 16 && idade < 18 || idade > 70) {
					System.out.println("Voc� pode votar, mas n�o � obrigat�rio");
				}
				else {
					System.out.println("Seu voto � obrigat�rio!!");
				}
				
				if(idade < 18) {
					System.out.println("E voc� ainda n�o pode tirar habilita��o");
				}
				else {
					System.out.println("E voc� j� pode tirar habilita��o");
				}
				break;	
					
			case 2:
				int primeiroValor;
				int segundoValor;
				System.out.println("---CONTAGEM DE VALORES---");
				System.out.println("informe o primeiro valor");
				primeiroValor = tec.nextInt();
				System.out.println("informe o segundo valor");
				segundoValor = tec.nextInt();
				if (primeiroValor == segundoValor) {
					System.out.println("Valor igual ao primeiro, imposs�vel imprimir a sequ�ncia");
				}
				if (primeiroValor > segundoValor) {
					while (segundoValor <= primeiroValor) {
						System.out.print(segundoValor);
						segundoValor = segundoValor + 1;
					}

				} else if (segundoValor > primeiroValor) {
					while (primeiroValor <= segundoValor) {
						System.out.print(primeiroValor);
						primeiroValor += 1;
					}
				}

				break;
			case 3:
				System.out.println("---TABUADA---");
				int valor;
				int multiplicador = 0;

				System.out.println("Informe um valor inteiro: ");
				valor = tec.nextInt();

				do {
					System.out.println(valor + " X " + multiplicador + " = " + (valor * multiplicador));
					multiplicador++;
				} while (multiplicador <= 10);

				break;
			case 4:
				System.out.println("---- Cadastrar Cursos ----");
				String[] cursos = new String[5];
				String inserirCursos = "s";
				int aux = 0;
				
				while(inserirCursos.equalsIgnoreCase("s") && aux < cursos.length) {
					System.out.print("Informe o Curso que Deseja Cadastrar: ");
					cursos[aux] = tec.next();
					aux++;
					System.out.println("\n");
					System.out.print("Deseja Cadastrar um novo Curso? [S/N] -> ");
					inserirCursos = tec.next();
					System.out.println("\n");
				}
				
				for (int i = 0; i < cursos.length; i ++) {
					System.out.println(cursos [i]);	
		}
				break;

			case 5:
				opcao = "n";
				break;
			default:
				System.out.println("Op��o Invalida");
				break;
			}

		} while (opcao.equalsIgnoreCase("s"));

		System.out.println("SISTEMA FINALIZADO");

	}

}