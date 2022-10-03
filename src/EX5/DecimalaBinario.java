package EX5;
import java.util.Scanner;

public class DecimalaBinario {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Inserta número: ");
		int num= Integer.parseInt(sc.nextLine());
		
		String binario= calculaBinario(num);
		System.out.println(binario);
		
		sc.close();
		

	}

	private static String calculaBinario(int num) {
		String f_binario="";
		
		while (num>0) {
			f_binario=(num%2)+f_binario;
			num/=2;
		}
		
		return f_binario;
		
	}

}
