package guia3;
import java.util.Scanner;
public class caso8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		while(num<1|| num >100)
		{
		
		System.out.println("Ingrese numero: ");
		num = sc.nextInt();
		if(num<1|| num >100)
			System.out.println("Numero fuera de rango");
		}
		for ( int contador = 1; contador <= 15; contador++)
		{
			System.out.println(num + " * "+ contador+" = "+ (num*contador));
		}

	}

}
