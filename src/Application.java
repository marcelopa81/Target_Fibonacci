import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");

		numero = sc.nextInt();
		
		if (NumeroFibonacci.fibonacci(numero)){
            System.out.println();
            System.out.println("O número digitado " + numero + " pertence à sequência de Fibonacci!");
        } else {
            System.out.println("Dessa forma, o número digitado " + numero + " NÃO pertence à sequência de Fibonacci!");
        }
	}

}
