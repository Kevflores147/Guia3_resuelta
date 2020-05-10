package guia3;
import java.util.Scanner;

public class caso10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String empleado = "", continuar = "S";
		float Ht ,Txh ,tardanza , sueldo_bruto, bono = 0, descuento = 0, sueldo_neto, porcentaje;
		int c = 0;
		
		while(continuar.contentEquals("S")||continuar.equals("s"))
		{
			c++;
			
			System.out.println("Numero de registro: "+c);
			System.out.println("======================");
			System.out.println("Ingrese nombre del empleado");
			empleado = sc.nextLine();
			
			System.out.println("Ingrese horas trabajadas: ");
			Ht = sc.nextFloat();
			
			System.out.println("Ingrese tarifa por horas: ");
			Txh = sc.nextFloat();
			
			System.out.println("Minutos de tardanza: ");
			tardanza = sc.nextFloat();
			
			sueldo_bruto = (Ht*Txh);
			
			if(Ht>=0 && Ht<=50)
			{
				bono = 0;
			}
			if(Ht>50 && Ht<=60)
			{
				bono = (float)(sueldo_bruto*0.02);
			}
			if(Ht>60 && Ht<=70)
			{
				bono = (float)(sueldo_bruto*0.08);
			}
			if(Ht>70 && Ht<=80)
			{
				bono = (float)(sueldo_bruto*0.13);
			}
			if(Ht>80)
			{
				bono = (float)(sueldo_bruto*0.15);
			}
			
			
			
			if(tardanza <= 15)
			{
				descuento = 0;
			}
			if(tardanza>15 && tardanza<=30)
			{
				descuento = (float)(sueldo_bruto*0.03);
			}
			if(tardanza>30)
			{
				descuento = (float)(sueldo_bruto*0.15);
			}
			
			
			
			sueldo_neto = (float)(sueldo_bruto + bono - descuento);
			
			porcentaje = (float)((Ht/80)*100);
			
			
			System.out.println("Suldo bruto: "+sueldo_bruto);
			System.out.println("Bonificacion: "+bono);
			System.out.println("Descuento: "+descuento);
			System.out.println("Sueldo neto: "+sueldo_neto);
			System.out.println("%Alcanzado: "+porcentaje+"%");
			
			sc.nextLine();
			
			System.out.println("Desea continuar? [S/N] :");
			continuar = sc.nextLine();
			
			
		}

	}

}
