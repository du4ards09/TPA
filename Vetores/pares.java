import java.util.Scanner;
public class ParesVetor {
	public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int a[], i;
		//definir o tamanho do vetor
		final int TAM = 10;
		a = new int[TAM];
		//ler o vetor A
		for (i = 0; i<TAM ; i++) {
			System.out.println("Digite o n�mero "+(i+1)+ ":");
            a[i] = leitura.nextInt();
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
		//apresentar os vetores pares de A
		System.out.print("O vetores pares de A s�o: ");
		for (i = 0; i<TAM ; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + "|");
			}
        }
	}

}
