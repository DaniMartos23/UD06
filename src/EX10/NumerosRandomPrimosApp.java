package EX10;

import java.util.Scanner;

public class NumerosRandomPrimosApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=entraSize(sc);
		
		
		int[] valores=generaAleatorio(size,sc);
		sc.close();
		imprimeMayor(valores);
	}

	private static void imprimeMayor(int[] valores) {
		// Metodo que imprime la posicion y el valor del número primo mayor en la array
		int i=0;
		for (int j=1;j<valores.length;j++) {
			if(valores[j]>valores[i]) i=j;
		}
		System.out.println("El número primo mayor de la array es el que está en la posición "+i+" y tiene el valor "+valores[i]);
		
	}

	private static int entraSize(Scanner sc) {
		// método para entrar la medida del array deseada
		int fsize;
		
		System.out.print("Entra tamaño del array: ");
		fsize=Integer.parseInt(sc.nextLine());
		
		return fsize;
	}

	private static int[] generaAleatorio(int size, Scanner sc) {
		//método que genera un numero aleatorio definido entre los parametros entrados por pantalla
		//y comprueba si es primo
		int random_number,menor,mayor;
		int[] arrayprimos=new int[size];
		System.out.print("Entra el numero menor deseado: ");
		menor=Integer.parseInt(sc.nextLine());
		System.out.print("Entra el numero mayor deseado: ");
		mayor=Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<size;i++) {
			random_number=0;
			do {
				random_number=(int)(Math.random()*(mayor-menor+1)+menor);
			}while(!esPrimo(random_number));
			arrayprimos[i]=random_number;
		}
		
		
		return arrayprimos;
	}

	private static boolean esPrimo(int random_number) {
		// Método que comprueba si el numero aleatorio generado es primo
		int i=2;
		while(i<random_number) {
			if(random_number%i==0) {
				return false;
			}
			i++;
		}
		
		return true;
	}

	

}
