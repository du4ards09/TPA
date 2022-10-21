import java.util.*;
public class teste {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int i=1;
	double n1, n2, m;
	
	while (i<=5) {
		System.out.println("Digite a 1a nota do"+i+"º aluno");
	    n1 = in.nextDouble();
	    System.out.println("Digite a 2a nota do"+i+"º aluno");
	    n2 = in.nextDouble();
	    m = (n1+n2)/2;
	    System.out.println("A média é:  " +m);
	    if (m>=6) {
	    	System.out.println("Aprovado !");
	    }else {
	    	System.out.println("Reprovado !");
	    }
	
		
	}
	}

}
