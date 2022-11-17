import java.util.Scanner;
public class Nomes {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i, anoAtual, anoNasc, idade, maior = 0 , menor = 200;

		System.out.println("Digite o ano atual");
		anoAtual = ler.nextInt();
		for(i = 1; i<=10; i++) {
		System.out.println("Digite o ano do nascimento");
		anoNasc = ler.nextInt();
		idade = anoAtual-anoNasc;
		System.out.println("A idade e de: " + idade);
		if(maior<=idade) {
		maior = idade+0;
		} else {
		menor = idade+0;
		}
		}
		System.out.println("O mais novo tem: " + menor +"anos");
		System.out.println("O mais velho tem: " + maior + "anos");
		}

	}
