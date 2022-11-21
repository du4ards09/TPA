import java.util.Scanner;
public class Fatorial {

	public static void main(String[] args) {
		 (Scanner in = new Scanner (System.in)) {
			int n, i=1;
			long fatorial = 1;
			System.out.println("Digite um numero:");
			n = in.nextInt();
			while(i<=n){
				fatorial = (fatorial*i);
				i++;
			}
			System.out.println(n + "=" + fatorial);
		}
		}
	}
