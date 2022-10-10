package EX11;

import java.util.Scanner;

public class ArraysAleatoriosApp {

	public static void main(String[] args) {
		
		int[][] arrays;
		int[] array_result;
		arrays= creaarrays();
		
		
		System.out.println("----------------------ARRAY 1----------------------");
		imprimeArrays(arrays[0]);
		System.out.println("----------------------ARRAY 2----------------------");
		imprimeArrays(arrays[1]);
		
		System.out.println("----------------------Generando aleatorio en array 2----------------------");
		arrays[1]=generaAleatorio(arrays[1]);
		
		System.out.println("----------------------ARRAY 1----------------------");
		imprimeArrays(arrays[0]);
		System.out.println("----------------------ARRAY 2----------------------");
		imprimeArrays(arrays[1]);
		
		System.out.println("----------------------Generando array resultado de la multiplicación----------------------");
		array_result=multiplicaArrays(arrays);
		
		System.out.println("----------------------ARRAY 1----------------------");
		imprimeArrays(arrays[0]);
		System.out.println("----------------------ARRAY 2----------------------");
		imprimeArrays(arrays[1]);
		System.out.println("----------------------ARRAY RESULTADO----------------------");
		imprimeArrays(array_result);
		

	}

	private static int[] multiplicaArrays(int[][] arrays) {
		// Método que devuelve la multiplicación de las dos arrays.
		int[] mult = new int[arrays[0].length];
		for(int i=0;i<arrays[0].length;i++) {
			mult[i]=arrays[0][i]*arrays[1][i];
		}
		return mult;
	}

	private static int[] generaAleatorio(int[] is) {
		// método que genera aleatorios
		int[] aux=is.clone();
		for(int i=0; i<is.length;i++) {
			aux[i]=(int)(Math.random()*100);
		}
		return aux;
	}

	private static void imprimeArrays(int[] array) {
		// Método que imprime los arrays para comprobarlos
		int i=0;
		System.out.print("El array contiene: [");
		do {
			if(i==(array.length-1)) System.out.println(array[i]+"]");
			else System.out.print(array[i]+", ");
			i++;
		}while(i<array.length);		
		
	}

	private static int[][] creaarrays() {
		// método que pide la dimensión del array y los crea.
		Scanner sc= new Scanner(System.in);
		System.out.print("Entra dimensión de los arrays: ");
		int dim=Integer.parseInt(sc.nextLine());
		
		int[][] arrays= new int[2][dim];
		arrays[0]=generaAleatorio(arrays[0]);
		arrays[1]=arrays[0].clone();
		sc.close();
		
		return arrays;
	}

}
