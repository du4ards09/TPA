import java.util.Scanner;
public class Lanchonete {

	public static void main(String[] args) {
		try (Scanner in = new Scanner (System.in)) {
			int cod;
			System.out.println("Digite o codigo do lanche (1 ate 5):");
			cod = in.nextInt();
			switch (cod){
			case 1:
				System.out.println("Cachorro quente R$ 8,00");
				break;
			case 2: 
				System.out.println("Cheesebuger R$ 12,00");
				break;
			case 3: 
				System.out.println("X-Salada R$ 15,00");
				break;
			case 4:
				System.out.println("Misto Quente R$ 11,00");
				break;
			case 5:
				System.out.println("Pao na chapa R$ 6,00");
				break;
				default:
					System.out.println("Codigo invalido.");
			}
		}
	}

}
