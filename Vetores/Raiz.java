import java.util.Scanner;
public class RaizQuadrada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int i, a[], b[];
        //definir o tamanho dos vetores
        final int TAM = 5;
        a = new int[TAM];
        b = new int[];
        //ler o vetor A e calcular o vetor B
        for(i=0; i<TAM; i++) {
            System.out.println("entre com o "+(i+1)+ "o. valor");
            a[i] = leitura.nextInt();
            b[i] = a[i]*a[i];
        }
        //apresentar o vetor A
        for(i=0; i<TAM; i++) {
            if(i==0) {
                System.out.print("A = ["+a[i]+" ");
            }else if (i==(TAM-1)) {
                System.out.println(a[i]+"]");
            }else {
                System.out.print(a[i]+" ");
            }
        }
        System.out.println(); 
        //apresentar o vetor B
        for(i=0; i<TAM; i++) {
            if(i==0) {
                System.out.print("B = ["+b[i]+" ");
            }else if (i==(TAM-1)) {
                System.out.println(b[i]+"]");
            }else {
                System.out.print(b[i]+" ");
            }
        }
    }
}
