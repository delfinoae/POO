import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main.apresentacao();
		
		Main.novo_exercicio_inicio(1);
		Main.exercicio_1();
		Main.novo_exercicio_fim(1);
		
		Main.novo_exercicio_inicio(2);
		Main.exercicio_2();
		Main.novo_exercicio_fim(2);
		
		Main.novo_exercicio_inicio(3);
		Main.exercicio_3();
		Main.novo_exercicio_fim(3);
	}
	
	/*
	 * Exerc�cio 1 do Moodle
	 */
	public static void exercicio_1() {
		int a,b,c;
		double d;
		double e[];

		e = new double[10];
		Scanner in = new Scanner(System.in);
		System.out.println("Por favor, informe o valor de 'a': ");
		a = in.nextInt();
		System.out.println("Por favor, informe o valor de 'b': ");
		b = in.nextInt();
		
		try {
			c = a / b;
			d = e[a];
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("O valor de 'a' deve estar entre 0 e 9.");
		} catch (ArithmeticException ae) {
			System.out.println("O valor de 'b' deve ser maior que 0 .");
		}
	}
	
	/*
	 * Exerc�cio 2 do Moodle
	 */
	public static void exercicio_2() {
		try {
			ContaCorrente cc = new ContaCorrente(10.000);
		} catch (InvalidBalanceException e) {
			System.out.println("O saldo informado � negativo.");
		}
	}
	
	/*
	 * Exerc�cio 3 do Moodle
	 */
	public static void exercicio_3() {
		try{
		   int i = Main.getAlgo();
		} catch (IndexOutOfBoundsException e1) {
		   System.out.println("Exce��o 1");
		} catch (Exception e2){
		   System.out.println("Exce��o 2");
		} finally {
		   System.out.println("Mais nada");
		}
	    System.out.println("Adeus");
	    System.out.println("Resposta do exerc�cio 3: Ser� impresso 'Exce��o 2' e 'Mais nada'.");
	}
	/*
	 * Complemento do Exerc�cio 3 do Moodle
	 */
	public static int getAlgo() {
		return 0;
	}
	
	public static void apresentacao() {
		System.out.println("*-*-*-*-*-*-*-* ################### *-*-*-*-*-*-*-*-*");
		System.out.println("*-*-*-*-*-*-*-* ##     PUCRS     ## *-*-*-*-*-*-*-*-*");
		System.out.println("*-*-*-*-*-*-*-* ################### *-*-*-*-*-*-*-*-*");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("*-*-*-*-*-* Matr�cula: 12205117-7 *-*-*-*-*-*-*-*-*-*");
		System.out.println("*-*-*-*-*-* Aluno: Allan Delfino Ederich  *-*-*-*-*-*");
		System.out.println("*-*-*-*-*-* Curso: Engenharia de Software *-*-*-*-*-*");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("");
	}
	public static void novo_exercicio_inicio(int exercicio) {
		System.out.println("*-*-*-*-*-* In�cio do exerc�cio " + exercicio + " do Moodle *-*-*-*-*-*");
	}
	public static void novo_exercicio_fim(int exercicio) {
		System.out.println("*-*-*-*-*-* Fim do exerc�cio " + exercicio + " do Moodle *-*-*-*-*-*");
		System.out.println("");
	}

}
