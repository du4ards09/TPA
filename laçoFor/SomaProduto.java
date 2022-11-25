import java.util.Scanner;
public class SomaProduto {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
				int   valorProduto = 0 , menor = 0, i , maior = 0, somaTotal,somaPreço;
				double mediaProduto ;
				
				for(i=1;i<=5;i++) {
					System.out.println("Preço do Produto:");
					valorProduto = in.nextInt();
					
					if(valorProduto<=menor) {
						menor = valorProduto;
					} if (valorProduto>=maior ){
						maior = valorProduto;
						somaTotal = valorProduto;
					}
					
					
					
				}
				
				mediaProduto = somaTotal/5;
				
				
				System.out.println("A Soma total: " + somaTotal);
				System.out.println("Produto mais caro: " + maior);
				System.out.println("A média dos Preços: " + mediaProduto);
			}
		

	}


