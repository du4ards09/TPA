import java.util.Scanner;
public class Invertidos {
	public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int i = 0, a[], b[];
        //definir o tamanho dos vetores
        final int TAM = 10;
        a = new int[TAM];
        b = new int[10];
        //ler o vetor A 
        for (i = 0; i<TAM ; i++) {
            System.out.println("Digite o n�mero "+(i+1)+ ":");
            a[i] = leitura.nextInt();
        }
        //calcular o vetor B
        for (i = 0; i < TAM; i++) {
            b[i] = a[TAM - i - 1];
        }
        //apresentar o vetor A
        for(i=0; i<TAM; i++) {
            if(i==0) {
                System.out.print("A = ["+a[i]+",");
            }else if (i==(TAM-1)) {
                System.out.println(a[i]+"]");
            }else {
                System.out.print(a[i]+",");
            }
        }
        //apresentar o vetor B
        for(i=0; i<TAM; i++) {
            if(i==0) {
                System.out.print("B = ["+b[i]+",");
            }else if (i==(TAM-1)) {
                System.out.println(b[i]+"]");
            }else {
                System.out.print(b[i]+",");
            }
        }
	}
}
