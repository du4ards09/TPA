package laco;

import java.util.Scanner;
public class ano {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anoAtual, anoNasc, idade, i=1, escolha;
		System.out.println("Digite o ano atual");
		anoAtual = ler.nextInt();
		
		do {
			System.out.println("Digite o ano do nascimento");
			anoNasc = ler.nextInt();
			
			idade = anoAtual-anoNasc;
			
			if(idade<18) {
				System.out.println(idade + "Você é menor de idade");
			}else {
				System.out.println(idade + "Você é maior de idade");
			}
			
			System.out.println("Deseja continuar");
			System.out.println("I: Sim");
			System.out.println("II: Não");
			escolha = ler.nextInt();
			
			if(escolha==1) {
				i = escolha+0;
			}else {
				i++;
			}
			
		}while(i==1);
		
		

	}

}
