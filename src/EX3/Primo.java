package EX3;
import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		int numero;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Introduce un n�mero: ");
		numero=Integer.parseInt(sc.nextLine());
		
		if(esPrimo(numero)) {
			System.out.println("El n�mero " + numero + " es primo");
		}
		else {
			System.out.println("El n�mero " + numero + " no es primo");
		}
		sc.close();
	}
	

	private static boolean esPrimo(int numero) {
		int i=2;
		while(i<numero) {
			if(numero%i==0)
				return false;
			i++;
		}
		return true;
		
	}

}
