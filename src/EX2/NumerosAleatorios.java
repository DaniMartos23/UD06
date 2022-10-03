package EX2;
import java.util.Scanner;

public class NumerosAleatorios {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Inserta cantidad de números aleatorios a generar: ");
		
		int numeros=Integer.parseInt(sc.nextLine());
		
		System.out.print("Inserta valor mínimo: ");
		int minimo= Integer.parseInt(sc.nextLine());
		
		System.out.print("Inserta valor máximo ");
		int maximo= Integer.parseInt(sc.nextLine());
		
		int[] valores = new int[numeros];
		for (int i=0;i<valores.length;i++) {
			valores[i]=calculaAleatorios(minimo,maximo,numeros);
			System.out.println(valores[i]);
		}
		
		
	
		
		sc.close();
	}

	private static int calculaAleatorios(int minimo, int maximo, int numeros) {
		
		return (int)(Math.random()*(maximo-minimo+1)+minimo);
	}
	
	

}
