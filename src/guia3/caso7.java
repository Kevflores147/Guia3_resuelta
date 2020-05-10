package guia3;
import java.util.Scanner;

public class caso7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese nombre: ");
		String nombre = sc.nextLine();
		
		for (int contador = 1; contador <= 10; contador++ )
		{
		System.out.println("Bienvenido "+nombre+" al curso.");
		}

	}

}
