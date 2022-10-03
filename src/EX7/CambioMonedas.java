package EX7;
import java.util.Scanner;

public class CambioMonedas {
	
	final static double libraeuro=0.86;
	final static double dolareuro=1.28611;
	final static double yeneuro=129.852;
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Introduce valor en euros: ");
		double euros= Double.parseDouble(sc.nextLine());
		
		System.out.print("Introduce moneda a cambiar: ");
		String moneda= sc.nextLine();
		
		calculaCambio(euros,moneda);
		
		
		sc.close();
		
		
	}

	private static void calculaCambio(double euros, String moneda) {
		moneda=moneda.toLowerCase();
		switch(moneda) {
			case "dolar":
				System.out.println("El valor de "+euros+ "€ es igual a "+(euros*dolareuro)+"$");
				break;
			case "libra":
				System.out.println("El valor de "+euros+ "€ es igual a "+(euros/libraeuro)+" libras");
				break;
			case "yen":
				System.out.println("El valor de "+euros+ "€ es igual a "+(euros*yeneuro)+" yenes");
				break;
			default:
				System.out.println("Moneda no válida.");
				break;
		}
		
	}

}
