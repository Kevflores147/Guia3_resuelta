package guia3;

import java.util.Scanner;

public class caso9_parte2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String continuar="S", estado = "", nombre="",mon_mprom="",nom_1="";
		float promedio = 0, asistencias = 0, nota=0, nota2=0 ,nota3=0,prom_asis=0,ma_prom=0,men_prom=21;
		int c=0,c_c=0,c_sc=0;
		
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
				c_c++;
			}
			else
			{
				estado = "Sin certificado";
				c_sc++;
			}
			
			if(promedio>ma_prom)
			{
				ma_prom = promedio;
				nom_1=nombre;
			}
			if(promedio<men_prom)
			{
				men_prom=promedio;
				mon_mprom=nombre;
			}
			
			System.out.println("Resultados");
			System.out.println("Promedio: "+promedio);
			System.out.println("Asistencias: "+prom_asis+"%");
			System.out.println("Estado: "+estado);
			
			
			System.out.println("Desea continuar? [S/N] :");
			continuar = sc.nextLine();
			
			
		}
		
		System.out.println("Resumen");
		System.out.println("Numero de alumnos registrados: "+c);
		System.out.println("Mayor promedio: "+ma_prom+"  pertenece a: "+nom_1);
		System.out.println("Menor promedio: "+men_prom+"  pertenece a: "+mon_mprom);
		System.out.println("Numero de alumnos certificados: "+c_c);
		System.out.println("Numero de alumnos sin certificado: "+c_sc);

	}

}

