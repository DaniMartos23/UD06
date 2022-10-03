package EX4;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Introduce número: ");
		int numero=Integer.parseInt(sc.nextLine());
		
		calculaFactorial(numero);
		
		sc.close();
	}

	private static void calculaFactorial(int numero) {
		int resultado=1;
		for (int i=numero;i>1;i--) {
			resultado*=i;
			System.out.print(i+"*");
		}
		System.out.println("1="+resultado);
	}

}
