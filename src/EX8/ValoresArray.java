package EX8;
import java.util.Scanner;

public class ValoresArray {

	public static void main(String[] args) {
		
		int valors[]=insertaValores();
		
		muestraValores(valors);
		

	}

	private static void muestraValores(int[] valors) {
		
		for(int i=0;i<valors.length;i++) {
			System.out.println("El valor en la posición "+i+ " es "+valors[i]);
		}
		
	}

	private static int[] insertaValores() {
		Scanner sc=new Scanner(System.in);
		int[] valores=new int[10];
		
		int i=0;
		do {
			System.out.print("Inserta valor: ");
			valores[i]=Integer.parseInt(sc.nextLine());
			i++;
		}while(i<valores.length);
		
		sc.close();
		
		return valores;
	}

}
