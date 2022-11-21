import java.util.Scanner;
public class Escolafutebol {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int id;
		System.out.println("Entre com uma idade");
		id = in.nextInt();
		
		switch(id) {
		case 6:
			System.out.println(" você é dente de leite");
			break;
		case 7:
			System.out.println(" você é júrnior");
			break;
		case 8:
			System.out.println(" você é júnior max");
			break;
		case 9:
			System.out.println(" você é júnior master");
			break;
		case 10:
			System.out.println(" você é master");
			break;
		default:
			System.out.println("você não tem idade para estar na escolinha");
			
		}

	 }
}
