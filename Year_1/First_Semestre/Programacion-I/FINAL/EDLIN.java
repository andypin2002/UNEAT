import java.util.Scanner;
//import java.util.ArrayList;
public class EDLIN{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
//		ArrayList<String> text = new ArrayList<String>();
		String eleccion = "", tempS = "", borde = "+.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-";
		int lineaActiva = 0, tempI1 = 0, tempI2 = 0;
		String[] notes = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
		do{
			System.out.print("\033[H\033[2J");System.out.flush();
//===========================================================================================================================================
																// Impresion
			System.out.println(borde);
			for(int i = 0; i < 10; i++){
				System.out.print("| "+i+":");
				if(i == lineaActiva){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
				System.out.println(notes[i]);
			}
			System.out.println(borde);
//===========================================================================================================================================
																// Menu
			System.out.println("Comandos: [L]inea Activa | [E]ditar | [I]ntercambiar | [B]orrar | [S]alir");
			System.out.println("Ingrese comando:>");
//===========================================================================================================================================
																// Logica
			eleccion = sc.nextLine();
			if(eleccion.equalsIgnoreCase("L")){
				System.out.println("Que linea desea activar? \nLinea:");
				lineaActiva = sc.nextInt();
			}
			else if(eleccion.equalsIgnoreCase("E")){
				System.out.println("Nueva linea:");
				notes[lineaActiva] = sc.nextLine();
				
			}
			else if(eleccion.equalsIgnoreCase("I")){
				System.out.println("Que lineas desea intercambiar?");
				System.out.println("Linea N:");
				tempI1 = sc.nextInt();
				System.out.println("Linea N:");
				tempI2 = sc.nextInt();
				tempS = notes[tempI1];
				notes[tempI1] = notes[tempI2];
				notes[tempI2] = tempS;
			}
			else if(eleccion.equalsIgnoreCase("B")){
				System.out.println("Que linea desea borrar?");
				tempI1 = sc.nextInt();
				notes[tempI1] = " ";				
			}
			else if(eleccion.equalsIgnoreCase("S")){
				break;
			}
//===========================================================================================================================================
		}while(true);
	}
}
/*
	Implementaci??n CTRL+Z
	
	Yo utilizar??a un ArrayList para poder almacenar una cantidad ilimitada de estados a los que volver. Tambi??n utilizar??a 
	otro ArrayList de enteros para guardar el ??ndice de la l??nea que se ha modificado. Al momento de volver a un estado 
	anterior, simplemente revisar??a el ??ltimo estado almadenado y el ??ndice de su l??nea, los guardar??a es variables temporales,
	y cambiar??a el valor actual de la l??nea con el valor almacenado en las variables temporales.	

*/