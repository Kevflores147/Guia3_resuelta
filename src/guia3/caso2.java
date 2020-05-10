package guia3;

import java.util.Scanner;

public class caso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int  c = 1, suma = 0 , num = 0;
		
		System.out.println("Ingrese numero: ");
		num = sc.nextInt();
		
		while(c<=num)
		{
			suma = suma + c;
			c = c + 1;
		}
		
		System.out.println("Sumatoria de "+ num + " es " + suma);

	}

}
