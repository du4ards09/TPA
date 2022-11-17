import java.util.Scanner;
public class potencia {

	public static void main(String[] args) {
		try (Scanner in = new Scanner (System.in)) {
			int a, n, res = 1;
			
			System.out.println("Informe a base:");
			a = in.nextInt();
			System.out.println ("Informe o expoente:");
			n =in.nextInt();
			for(int i = n; i>= 1; i--) {
				res = res*a;
				System.out.println("Res:" +res);
			}
			System.out.println("Resposta:" +res);
		}
	}
}
