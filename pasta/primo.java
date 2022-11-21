package classico;
import java.util.Scanner;

public class primo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numPrimo,i,resto = 0;
		
		System.out.println("Digite um numero, e descubra se e primo ou nao");
		numPrimo = in.nextInt();
		
		for(i=1;i<=numPrimo;i++) {
			if(numPrimo%i==0){
				resto++;
			}
		}
		
		if(resto==2) {
			System.out.println(numPrimo + " E primo");
		}else {
			System.out.println(numPrimo + "Nao e primo");
		}
	}

}
