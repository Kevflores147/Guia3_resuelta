package guia3;

import java.util.Scanner;

public class caso3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int  c = 1, factorial = 1 , num = 0;
		
		System.out.println("Ingrese numero menor a 7: ");
		num = sc.nextInt();
		if(num > 7)
		{
			System.out.println("Su numero mayor a 7");
		}
		
		else
		{
		while(c<=num)
		{
			factorial = factorial * c;
			c = c + 1;
		}
		
		System.out.println("Factorial de "+ num + " es " + factorial);
		}


	}

}
