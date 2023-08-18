import java.util.Scanner;

public class L07_Q01 {

	public static void main(String[] args) {

		ParOuImpar analisar = new ParOuImpar();
		int saida = 1, num = 0;
		
		Scanner LerNum = new Scanner(System.in);

		while(saida == 1) {
		System.out.println("Numero: ");
		num = LerNum.nextInt();
		analisar.ChecarValor(num);
		System.out.println("Deseja continuar? 1 = Continue   2 = Para.");
		saida = LerNum.nextInt();
		}

		LerNum.close();

	}

}
