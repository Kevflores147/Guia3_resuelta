package guia3;
import java.util.Scanner;

public class caso9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String continuar="S", estado = "", nombre="";
		float promedio = 0, asistencias = 0, nota=0, nota2=0 ,nota3=0,prom_asis=0;
		int c=0;
		
		while(continuar.contentEquals("S")||continuar.equals("s"))
		{
			c++; 
			
			System.out.println("Registro numero: "+c);
			 
			System.out.println("Ingrese nombre del alumno: ");
			nombre = sc.nextLine();
			
			System.out.println("Ingrese nota 1: ");
			nota = sc.nextFloat();
			System.out.println("Ingrese nota 2: ");
			nota2 = sc.nextFloat();
			System.out.println("Ingrese nota 3: ");
			nota3 = sc.nextFloat();
	
			
			System.out.println("Ingrese asistencia[1-12]: ");
			asistencias = sc.nextFloat();
			
			sc.nextLine();
			
			promedio = (float)((nota*0.2)+(nota2*0.3)+(nota3*0.5));
			
			prom_asis = (float)((asistencias/12)*100);
			
			if (promedio >= 13 && prom_asis >=70)
			{
				estado = "Obtiene certificado";
			}
			else
			{
				estado = "Sin certificado";
			}
			
			System.out.println("Resultados");
			System.out.println("Promedio: "+promedio);
			System.out.println("Asistencias: "+prom_asis+"%");
			System.out.println("Estado: "+estado);
			
			
			System.out.println("Desea continuar? [S/N] :");
			continuar = sc.nextLine();
			
			
		}
		

	}

}
