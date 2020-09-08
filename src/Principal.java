import java.util.Scanner;

public class Principal {

public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		int suma = 0;
		
		System.out.println("----Evaluación práctica Unidad III----");			
		System.out.println("Suma de  dos números.");			
		System.out.println("Ingrese primer número:");			
		numero1 = reader.nextInt();
		System.out.println("Ingrese segundo número:");			
		numero2 = reader.nextInt();
		suma = numero1 + numero2;
		System.out.println("Suma: "  + suma);
	}

}

