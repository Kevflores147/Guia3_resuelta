package guia3;
import java.util.Scanner;

public class caso6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String continuar = "S", nombres = "", estado = "";
		int edad = 0, c = 0, c_aptos = 0;
		
		while(continuar.contentEquals("S")||continuar.contentEquals("s"))
		{
			c++;
			
			System.out.println("Resgistro numero: "+ c );
			
			System.out.println("Nombre: ");
			nombres = sc.nextLine();
			
			System.out.println("Ingrese edad: ");
			edad = sc.nextInt();
			if(edad<=18)
			{
				estado = "Menor de edad";
			}
			else
			{
				estado = "Apto para votar";
				c_aptos++;
			}
			
			System.out.println("Estado del participante: "+estado);
			
			sc.nextLine();
			
			System.out.println("Desea continuar? [S/N] :");
			continuar = sc.nextLine();
		}
		
		System.out.println("=======");
		System.out.println("Resumen");
		System.out.println("Participantes registrados: "+c);
		System.out.println("Estado del participantes: "+c_aptos);
		
		

	}

}
