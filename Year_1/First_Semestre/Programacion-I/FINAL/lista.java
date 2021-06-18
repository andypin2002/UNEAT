import java.util.Scanner;
import java.util.ArrayList; 
import java.util.*;
public class lista{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int elect = 0, groups = 0, numGroups = 0, t = 0;
		String electS = "";
		ArrayList<String> kids = new ArrayList<String>(); 
		
		
		do{
		System.out.println("1. Ingresar lista de alumnos");
		System.out.println("2. Indicar tamaño de grupos");
		System.out.println("3. Crear grupos");
		System.out.print("Elija opción: ");
		elect = sc.nextInt();
		
		
		
		if(elect == 1){
			System.out.println("Ingrese el nombre de los alumnos (FIN para terminar)");
			while(true){
				electS = sc.nextLine();
				if(electS.equalsIgnoreCase("FIN")){
					break;
				}
				else{
					kids.add(electS);
				}
				
				
				
			}
			kids.remove(0);
			Collections.shuffle(kids);
			
		}
		else if(elect == 2){
			System.out.println("Ingrese el tamaño de los grupos");
			groups = sc.nextInt();				
			for(int s = 0; s < kids.size(); s++){
				System.out.println("- "+kids.get(s));
			}
		}
		else if(elect == 3){
			numGroups = kids.size() / groups;
			if( (kids.size() % groups) == 1){
				numGroups+=1;
			}
			for(int i = 0; i < numGroups; i++){
				System.out.println("Grupo "+ (i+1));
				for(int j = 0; j < groups; j++){
					System.out.println("- "+ kids.get(t));
					t = t+1;
				}
			}
		}
		
		
		}while(!electS.equalsIgnoreCase("salir"));
		
	}
}