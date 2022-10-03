package EX1;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce figura: ");
		
		String figura= sc.nextLine().toLowerCase();
		
		
		switch(figura) {
		
			case "triangulo":
				areaTriangulo(sc);
				break;
				
			case "circulo":
				areaCirculo(sc);
				break;
				
			case "cuadrado":
				areaCuadrado(sc);
				break;
				
			default:
				System.out.println("Figura no correcta");
				break;
							
		}
		sc.close();

	}

	private static void areaCuadrado(Scanner sc) {
		
		double lado;
		
		System.out.print("Introduce lado: ");
		lado= Double.parseDouble(sc.nextLine());
		
		System.out.println("El área del cuadrado es: "+(lado*lado));
		
		
	}

	private static void areaCirculo(Scanner sc) {
		
		double radio;
		
		System.out.print("Introduce radio: ");
		radio= Double.parseDouble(sc.nextLine());
		
		System.out.println("El área del circulo es: "+(Math.PI* Math.pow(radio, 2)));
	}

	private static void areaTriangulo(Scanner sc) {
		
		double base,altura;
		
		System.out.print("Introduce base: ");
		base= Double.parseDouble(sc.nextLine());
		
		System.out.print("Introduce altura: ");
		altura= Double.parseDouble(sc.nextLine());
		
		System.out.println("El área del triángulo es: "+((base*altura)/2));
	}
	

}
