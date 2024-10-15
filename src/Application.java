import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro");

		numero = sc.nextInt();
		
		NumeroFibonacci.fibonacci(numero);
	}

}
