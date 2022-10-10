package EX12;

import java.util.Scanner;

public class main12App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[]array;
		int dim=pedirDimension(sc);
		
		array=generaArray(dim);
		
		imprimeNumeros(sc,array);
		sc.close();

	}

	private static void imprimeNumeros(Scanner sc, int[] array) {
		// Método que pide una cifra e imprime los números acabados en esta.
		int digito;
		do {
			System.out.print("Entra digito a reconocer: ");
			digito= Integer.parseInt(sc.nextLine());
		}while(digito<0 || digito>9);
		
		System.out.println("Los números acabados por el digito "+digito+ " són: ");
		for(int i=0;i<array.length;i++) {
			if(array[i]%10==digito) System.out.print(array[i]+" ");
		}
	}

	private static int[] generaArray(int dim) {
		// Método que genera la array con la dimensión pasada por referencia y con números aleatorios entre 1 y 300
		int[] aux=new int[dim];
		for(int i=0;i<dim;i++) {
			aux[i]=(int)(Math.random()*(300-1+1)+1);
		}
		return aux;
	}

	private static int pedirDimension(Scanner sc) {
		// Método que pide la dimensión que queremos del array
		System.out.print("Entra dimensión de la matriz: ");
		return Integer.parseInt(sc.nextLine());
	}

}
