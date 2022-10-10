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
		// M�todo que pide una cifra e imprime los n�meros acabados en esta.
		int digito;
		do {
			System.out.print("Entra digito a reconocer: ");
			digito= Integer.parseInt(sc.nextLine());
		}while(digito<0 || digito>9);
		
		System.out.println("Los n�meros acabados por el digito "+digito+ " s�n: ");
		for(int i=0;i<array.length;i++) {
			if(array[i]%10==digito) System.out.print(array[i]+" ");
		}
	}

	private static int[] generaArray(int dim) {
		// M�todo que genera la array con la dimensi�n pasada por referencia y con n�meros aleatorios entre 1 y 300
		int[] aux=new int[dim];
		for(int i=0;i<dim;i++) {
			aux[i]=(int)(Math.random()*(300-1+1)+1);
		}
		return aux;
	}

	private static int pedirDimension(Scanner sc) {
		// M�todo que pide la dimensi�n que queremos del array
		System.out.print("Entra dimensi�n de la matriz: ");
		return Integer.parseInt(sc.nextLine());
	}

}
