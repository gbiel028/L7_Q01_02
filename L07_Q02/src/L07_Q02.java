import java.util.Scanner;

public class L07_Q02 {

	public static void main(String[] args) {
		double Num1 = 0, Num2 = 0;
		int operacao = 0;
		
		
		//Utilizado para trazer as acoes para o codigo principal;
		
		OperacoesMatematicas operar = new OperacoesMatematicas();
		
		
		Scanner LerNum = new Scanner(System.in);
		Scanner LerOperacao = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		Num1 = LerNum.nextDouble();

		System.out.println("Digite o segundo valor: ");
		Num2 = LerNum.nextDouble();

		System.out.println("Escolha a operacao: 1. Soma / 2. Subtracao / 3. Multiplicacao /  4. Divisao"	);
		operacao = LerOperacao.nextInt();

		switch (operacao) {
		case 1:
			System.out.println("Operacao Soma:");
			System.out.println("Soma:" + operar.soma(Num1, Num2));
			break;
		case 2:
			System.out.println("Operacao Subtrair:");
			System.out.println("Substracao:" + operar.subtracao(Num1, Num2));
			break;
		case 3:
			System.out.println("Operacao Multiplicacao:");
			System.out.println("Multiplicacao:" + operar.multiplicacao(Num1, Num2));
			break;
		case 4:
			System.out.println("Operacao Divisao:");
			System.out.println("Divisao:" + operar.divisao(Num1, Num2));
			break;
		}
		
		LerNum.close();
		LerOperacao.close();
	}
}

