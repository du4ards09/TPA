import java.util.Scanner;
public class MaiorMenorValor {
	public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int a[], i, maior = 0, menor = 0;
        //definir o tamanho do vetor
		final int TAM = 10; 
        a = new int[TAM]; 
		//ler o vetor A
        for (i = 0; i < TAM; i++) {
        	System.out.println("Digite o valor "+(i+1)+"� :");
        	a[i] = leitura.nextInt();
        }
		//verificar quem é o maior valor e quem é o menor valor
        menor = a[0];
        for (i = 0; i < TAM; i++) {
        	if (a[i] > maior) {
        		maior = a[i];
        	}else if (a[i] < menor) {
        		menor = a[i];
        	}
        }
		//apresentar o vetor A
        for (i = 0; i < TAM; i++) {
			if (i == 0 ) {
				System.out.print("Vetor A = ["+a[i]+ ",");
			}else if (i == (TAM-1)) {
				System.out.println(a[i]+"]");
			}else {
				System.out.print(a[i]+",");
			}
	    }
		//apresentar o menor e o maior valor
        System.out.println("O menor valor � :" + menor);
        System.out.println("O maior valor � :" + maior);

	}
}
