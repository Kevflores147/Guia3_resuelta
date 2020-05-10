package guia3;

import java.util.Scanner;

public class caso4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = 0, i=1, mayor = 0;
		
		while (i<=4)
		{
			System.out.println("Ingrese numero "+ i + ": ");
			n = sc.nextInt();
			
			if (n>mayor)
				mayor = n;
			
			i++;
		}
		
		System.out.println("El numero mayor es: "+mayor);

	}

}
