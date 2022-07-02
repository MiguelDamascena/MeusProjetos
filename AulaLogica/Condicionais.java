package AulaLogica;

public class Condicionais {

	public static void main(String[] args) {
		
		//-----------------
		//ESTRUTURA CONDICIONAL SIMPLES
		//----------------
		/*
		float Idade = 10;
	
		if  (Idade >6) {
			System.out.println("Nota :"+ Idade);
		}
		
		
		System.out.println("Fim");
		*/
		
		
		
		
		//-----------------
		//ESTRUTURA CONDICIONAL COMPOSTA
		//----------------
		
		/*
		double nota = 7;
		if (nota < 6 ) {
			System.out.println("Reprovou, Vacilão");
		} else {
			System.out.println("Aprovado");
			
			System.out.println("");
		}
		
		int idade = 10;
		if (idade <18) {
			System.out.println("Menor de Idade ");
		} else {
			System.out.println("Maior de Idade");
		}
		*/
		
		//-----------------
		//ESTRUTURA CONDICINAL ENCADEADA 
		//----------------
		
		
//		 
//		float notafinal = 8;
//		if (notafinal <4 ) {
//			System.out.println("Reprovado");
//			
//		}else {
//			if (notafinal <6) {
//				System.out.println("Recuperação");
//			}else {
//				System.out.println("Aprovado");
//					
//				}
//			}
			
		
		//-----------------
		//ESTRUTURA CONDICINAL ENCADEADA 
		//----------------
		
//		double nota = 6.1;
//		if (nota <4) {
//			System.out.println("Reprovado");
//		} else if (nota < 6) {
//			System.out.println("Recuperação");
//		}
//		else {
//			System.out.println("Aprovado");
//		}
		
		
		
		
//		int num1 = 4;
//		int num2 = 3;
//		
//		boolean teste = num1 == 4;
//		System.out.println(teste);
//		
//		
//		boolean teste2 = num2 == 2;
//		System.out.println(teste2);
//		
//		int num3 = 2;
//		boolean teste3 = num3 == 2 &&  num3 == 567;
//		System.out.println(teste3);
//		
//		
//		if (num3 == 2 || num3 == 4) {
//			System.out.println("O número é um dos numeros pares");
//		}
	
		
		int escolhaUsario = 1;
		
		switch (escolhaUsario) {
		case 0:
				System.out.println("Sair do Programa");
			break;
		case 1:
			System.out.println("Entrou na minha vida");
			break;
		default:
			System.out.println("Erro");
			
		}
		
	}	
}
	


