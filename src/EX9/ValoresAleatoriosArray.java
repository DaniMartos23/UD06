package EX9;
import java.util.Scanner;

public class ValoresAleatoriosArray {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Introduce dimensión array: ");
		int dim= Integer.parseInt(sc.nextLine());
		
		int[] numeros=generaArray(dim);
		
		muestraValoresyResultado(numeros);
		
		sc.close();

	}

	private static void muestraValoresyResultado(int[] numeros) {
		int resultado=0;
		for(int i=0;i<numeros.length;i++) {
			System.out.println("El valor en la posición "+i+ " es "+numeros[i]);
			resultado+=numeros[i];
		}
		System.out.println("El resultado de la suma de todos los valores es "+resultado);
		
	}

	private static int[] generaArray(int dim) {
		int[] valores= new int[dim];
		
		for(int i=0;i<dim;i++) {
			valores[i]=(int)(Math.random()*(9+1));
		}
		return valores;
	}

}
