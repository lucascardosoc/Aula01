import java.util.Scanner;

public class ReforcandoAprendizado {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int opcao;
		
		System.out.println("CALCULATOR");
		System.out.println("1- Calcular m�dia da sala");
		System.out.println("2- Calculadora");
		opcao=leitor.nextInt();
		
		switch(opcao) {
		
		default:
			System.out.println("Opc�o Inv�lida");
			break;
			
		case 1:
			double[] alunos = new double[5];
			double total = 0, media=0;
			
			for(int i = 0; i<alunos.length;i++) {
				System.out.println("Digite a nota do " + (i+1) + " � aluno");
				alunos[i]=leitor.nextDouble();
			}
			
			for(int i = 0; i<alunos.length;i++) {
				System.out.println("A nota do " + (i+1) + " � aluno �: " + alunos[i]);
				if (alunos[i]>7) {
					System.out.println("A nota desse aluno � azul");
				} else if(alunos[i]<7) {
					System.out.println("A nota desse aluno � vermelha");
				}
				
				total = total + alunos[i];
				media = total / 5;
			}
			
			System.out.println("A m�dia da sala �: " + media);
			break;
			
		case 2:
			double valor1, valor2;
			double soma, subtracao, multiplicacao, divisao;
			
			System.out.println("Digite um n�mero");
			valor1=leitor.nextDouble();
			
			System.out.println("Digite outro n�mero");
			valor2=leitor.nextDouble();
			
			soma = valor1 + valor2;
			subtracao = valor1 - valor2;
			multiplicacao = valor1 * valor2;
			divisao = valor1 / valor2;
			
			System.out.println("O resultado da soma �: " + soma);
			System.out.println("O resultado da subtrac�o �: " + subtracao);
			System.out.println("O resultado da multiplicac�o �: " + multiplicacao);
			System.out.println("O resultado da divis�o �: " + divisao);
			break;
		}
		leitor.close();
	}

}
