import java.util.Scanner;

public class ReforcandoAprendizado {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int opcao;
		
		System.out.println("CALCULATOR");
		System.out.println("1- Calcular média da sala");
		System.out.println("2- Calculadora");
		opcao=leitor.nextInt();
		
		switch(opcao) {
		
		default:
			System.out.println("Opcão Inválida");
			break;
			
		case 1:
			double[] alunos = new double[5];
			double total = 0, media=0;
			
			for(int i = 0; i<alunos.length;i++) {
				System.out.println("Digite a nota do " + (i+1) + " º aluno");
				alunos[i]=leitor.nextDouble();
			}
			
			for(int i = 0; i<alunos.length;i++) {
				System.out.println("A nota do " + (i+1) + " º aluno é: " + alunos[i]);
				if (alunos[i]>7) {
					System.out.println("A nota desse aluno é azul");
				} else if(alunos[i]<7) {
					System.out.println("A nota desse aluno é vermelha");
				}
				
				total = total + alunos[i];
				media = total / 5;
			}
			
			System.out.println("A média da sala é: " + media);
			break;
			
		case 2:
			double valor1, valor2;
			double soma, subtracao, multiplicacao, divisao;
			
			System.out.println("Digite um número");
			valor1=leitor.nextDouble();
			
			System.out.println("Digite outro número");
			valor2=leitor.nextDouble();
			
			soma = valor1 + valor2;
			subtracao = valor1 - valor2;
			multiplicacao = valor1 * valor2;
			divisao = valor1 / valor2;
			
			System.out.println("O resultado da soma é: " + soma);
			System.out.println("O resultado da subtracão é: " + subtracao);
			System.out.println("O resultado da multiplicacão é: " + multiplicacao);
			System.out.println("O resultado da divisão é: " + divisao);
			break;
		}
		leitor.close();
	}

}
