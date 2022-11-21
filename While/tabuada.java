import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		try (Scanner in = new Scanner (System.in)) {
			int i=1, n, res;
			System.out.println("Digite um numero e obtenha sua tabuada:");
			n = in.nextInt();
			while (i<=10) {
				res = n*i;
				System.out.println(n+"x" + i + "=" + res);
				i++;
			}
		}
	}

}
