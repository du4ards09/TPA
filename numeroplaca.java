import java.util.Scanner;
public class numeroplaca {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int d;
		System.out.println("Entre com um número inteiro para saber a" + "que dia esse número corresponde");
		d = in.nextInt();
		switch(d) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 9:
				System.out.println("dia ímpar");
				break;
			case 0:
			case 2:
			case 4:
			case 6:
			case 8:
				System.out.println("dia par");
				break;
			default:
				System.out.println("dia invalido");
				
		}
	}
}
