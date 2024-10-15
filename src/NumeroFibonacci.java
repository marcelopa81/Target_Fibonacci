
public class NumeroFibonacci {
	public static boolean fibonacci(int n) {

		if (n == 0 || n == 1) {
			return true;
		}
		int fib1 = 0, fib2 = 1;
		int fibN = 0;

		while (fibN <= n) {
			if (fibN == n) {
				System.out.print(fibN + " "); // Retorna o número Fibonacci digitado na última posição da sequência
				return true;
			}
			System.out.print(fibN + " ");
			fib1 = fib2;
			fib2 = fibN;
			fibN = fib1 + fib2;

		}
		System.out.println();
		System.out.println("Próximo número da sequência é o " + fibN + "."); // Apenas para formatar a sáida do console
		return false;
	}
}
