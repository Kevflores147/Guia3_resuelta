package guia3;

import java.util.Scanner;

public class caso5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = 0, i=1, menor=10000000;
		
		while (i<=5)
		{
			System.out.println("Ingrese numero "+ i + ": ");
			n = sc.nextInt();
			
			if (n<menor)
				menor = n;
			
			i++;
		}
		
		System.out.println("El numero menor es: "+menor);

	}

}
