import java.util.Scanner;
public class Idade {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int maior = -100, menor = 200, idade, i ;
		double altura, somaAltura = 0, alturaMedia;
		
		for(i=1;i<=10;i++) {
			System.out.println("Digite a idade");
			idade = in.nextInt();
			System.out.println("Digite a altura");
			altura = in.nextDouble();
			if(idade<=menor) {
				menor = idade;
			} if (idade>=maior ){
				maior = idade;
			}
			somaAltura = altura+somaAltura;
		}
		
		alturaMedia = somaAltura/10;
		
		System.out.println("A pessoa mais nova têm: " + menor);
		System.out.println("A pessoa mais velha têm: " + maior);
		System.out.println("A média das alturas é de: " + alturaMedia);
	}
}
