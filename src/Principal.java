import java.util.Scanner;

public class Principal {

public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		int suma = 0;
		boolean val1 = false;
		boolean val2 = false;
		
		System.out.println("----Evaluaci�n pr�ctica Unidad III----");			
		System.out.println("Suma de  dos n�meros primos.");			
		System.out.println("Ingrese primer n�mero:");			
		numero1 = reader.nextInt();
		System.out.println("Ingrese segundo n�mero:");			
		numero2 = reader.nextInt();
		val1=esPrimo(numero1);
		System.out.println("Numero " + numero1 + " es primo: "  + val1);
		val2=esPrimo(numero2);
		System.out.println("Numero " + numero2 + " es primo: "  + val2);
		if(val1==true && val2==true) {
			suma = numero1 + numero2;
			System.out.println("Suma: "  + suma);
		}else {
			System.out.println("Los dos numeros deben ser primos");
		}
			
	}

	public static boolean esPrimo(int numero){
	  int contador = 2;
	  boolean primo=true;
	  while ((primo) && (contador!=numero)){
	    if (numero % contador == 0)
	      primo = false;
	    contador++;
	  }
	  return primo;
	}
}

