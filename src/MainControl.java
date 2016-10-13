import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean sunnyday;
		sunnyday = true;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Control control = new Control("Felipe Lham", "8-888-888", "78");
		
		
		do
		{
		try
		{
		System.out.println("Ingrese la cantidad de temperaturas");
		int n = Integer.parseInt(br.readLine());
		control.setTamaño(n);	
		sunnyday=true;
		}
		
		catch(NumberFormatException e) {
			System.out.println("Error. Introduzca un número.");	
			sunnyday=false;
			continue;
			} 
			
			catch (IOException e) 
			{
			System.out.println("algo ocurrió, pero no se que :v");
			sunnyday=false;
			
			}
		try
		{
		for (int i=0;i<control.temperatura.length;i++)
			{
		System.out.println("Ingrese la temperatura "+ (i+1));
		control.temperatura[i] = Integer.parseInt(br.readLine());
			}
		}
		catch(NumberFormatException e) {
			System.out.println("Error. No introdujo un número.");
			sunnyday=false;
			
			} 
			
			catch (IOException e) 
			{
			System.out.println("algo ocurrio");
			sunnyday=false;
			
			}
		}while(sunnyday==false);
		
		
		sunnyday=true;
		
		do
		{
			System.out.println("1.Promedio de temperaturas\n "
					+ "2.Estado del paciente\n "
					+ "3.Temperatura mayor y menor\n "
					+ "4.Moda\n ");
		try
		{
		int z = Integer.parseInt(br.readLine());
		sunnyday=false;
		switch (z){
		
		
		case 1: 
			{
			System.out.println("\t PROMEDIO DE TEMPERATURAS \t");
			System.out.println("Paciente: "+control.nombre+" con edad " +control.edad+" y cedula: "+control.cedula);
			System.out.println("Promedio de temperaturas "+control.prom());
			sunnyday=true;
			}break;
		
		case 2:
		{
			
			System.out.println("\t ESTADO DEL PACIENTE \t");
			 System.out.println("Estado del paciente: "+control.estado());
			 sunnyday=true;
			 
		}break;
		
		case 3: 
		{
			System.out.println("\t TEMPERATURA MAYOR Y MENOR \t.");
			 if(control.mayor==0)
			 {
				 System.out.println("Temperatura mayor: "+control.getMenorup()+ control.menor());
			 }else
			 {
			 System.out.println("Temperatura mayor: " +control.mayor());
			 System.out.println("Temperatura menor: "+control.menor());
			 sunnyday=true;
			 }
		}break;
		case 4:
		{
			
		System.out.println("\t MODA \t");
			 System.out.println("LA MODA ES: "+control.moda(control.temperatura));
			 sunnyday=true;
		}break;
		default: System.out.println("Error de selección. ");
		sunnyday=false;
			
		}
		}
		catch(Exception e){
			System.out.println("Porfavor, ingrese un número. ");
			sunnyday=false;
		}
		}while(sunnyday==false);
		
		System.out.println("Adios!");
		
	}
}
	

