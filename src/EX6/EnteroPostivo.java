package EX6;
import java.util.Scanner;
public class EnteroPostivo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num;
		
		do {
			
			System.out.print("Inserta valor entero positivo: ");
			num=Integer.parseInt(sc.nextLine());
			if(num<0)
				System.out.println("Valor incorrecto.");
		}while(num<0);
		
		int cifras = calculaCifras(num);
		
		System.out.println("El número de cifras del número "+num+" es "+cifras);
		
		sc.close();

	}

	private static int calculaCifras(int num) {
		
		String s_num=""+num;
		return s_num.length();	
		
	}

}
