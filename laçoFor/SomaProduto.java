
package exerProva;
import java.util.Scanner;
public class Produto {
	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	
			int preço, somaProduto = 0 ,i ;
			double total = 150 , maior = 0, menor = 0 , mediaValor;
			
			for(i=1;i<=5;i++) {
				System.out.println("Digite o preço");
				preço = in.nextInt();
				
				if(preço<=menor) {
					menor = preço;
				} if (preço>=maior ){
					maior = preço;
				}
				somaProduto = somaProduto + preço;
			}
			
				mediaValor = somaProduto*5;
			
			System.out.println("Total da compra: " + somaProduto);
			System.out.println("O maior valor: " + maior);
			System.out.println("A média dos preços: " + mediaValor);
			
			if(somaProduto<=total) {
				System.out.println("Dinheiro Sulficiente");
			}else{
				System.out.println("Dinheiro Insulficiente");
			}
	
				
			
	} 
			
	}

			


