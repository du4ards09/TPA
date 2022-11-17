import java.util.Scanner;
public class Porcentagem {

	private static int mencao;

	public static void main(String[] args) {
		try (Scanner in = new Scanner (System.in)) {
			int aluno, notaMB, porcenMb, notaB, porcenB, notaR, porcenR, notaI, porcenI;
			System.out.println("Digite a quantidade total dos alunos na sala:");
			aluno = in.nextInt();
			System.out.println("Digite a quantidade de alunos que tiraram nota MB:");
			notaMB = in.nextInt();
			System.out.println("Digite a quantidade de alunos que tiraram nota B:");
			notaB = in.nextInt();
			System.out.println("Digite a quantidade de alunos que tiraram nota R:");
			notaR = in.nextInt();
			System.out.println("Digite a quantidade de alunos que tiraram nota I:");
			notaI = in.nextInt();
			System.out.println("Digite o numero correspondente a mencao que deseja a porcentagem: 1-MB; 2-B; 3-R; 4-I.");
			mencao = in.nextInt();
			porcenMb = ((notaMB*100)/aluno);
			porcenB = ((notaB*100)/aluno);
			porcenR = ((notaR*100)/aluno);
			porcenI = ((notaI*100)/aluno);
			
			switch (mencao){
			case 1:
				System.out.println("A porcentagem de alunos com notas Mb: " + porcenMb);
			break;
			
			case 2:
				System.out.println("A porcentagem de alunos com notas B: " + porcenB);
			break;
			
			case 3:
				System.out.println("A porcentagem de alunos com notas R: " + porcenR);
			break;
			
			case 4:
				System.out.println("A porcentagem de alunos com notas I: " + porcenI);
			break;
			
			default:
				System.out.println("Mencao nao existente.");
			}
		} finally {
		}
	}

}

