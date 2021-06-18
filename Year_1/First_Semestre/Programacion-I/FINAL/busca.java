// Escrito y compilado con Java 16.0.1

import java.util.Scanner;
public class busca{
	public static void main(String[] args){
		
		// Declaracion de variables
		Scanner sc = new Scanner(System.in);
		boolean seguir = true;
		String borde="================", raya="----------------";
		int gx=0, gy=0, x=0, y=0, vidas=3, zeroes=0;
		int[][] tablero = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
		};
		
		// Se plantan entre 0 y 5 minas
		for(int i = 0; i < 5; i++){
			gx = (int)((Math.random()*(7))-1);
			gy = (int)((Math.random()*(5))-1);
			
			/*System.out.println("["+gx+"]["+gy+"]");*/      // Imprime las coordenadas de todas las minas
			
			tablero[gy][gx] = 9;
			
		}
		
		// Impresion Inicial del tablero
		System.out.print("\033[H\033[2J");System.out.flush();
		System.out.println(borde);
		System.out.println("  0 1 2 3 4 5 6");
		for(int i = 0; i < 5; i++){
			System.out.print(i+" ");
			for(int j = 0; j < 7; j++){
				if(tablero[i][j] == 0){
					System.out.print("- ");
					zeroes+=1;
				}
				else if(tablero[i][j] == 9){
					System.out.print("- ");					
				}				
			}
			System.out.println();
		}
		System.out.println(borde);
		System.out.println("Celdas restantes: "+zeroes);
		System.out.println();
		
		// Inicio del bucle
		do{
			// El usuario elije la celda donde buscar
			System.out.println("Ingrese X");
			x = sc.nextInt();
			System.out.println("Ingrese Y");
			y = sc.nextInt();
			System.out.println(raya);
			// Logica de celdas
			if(tablero[y][x] == 0){
				tablero[y][x] = 1;
				System.out.println("Libre!");
				zeroes-=1;
			}
			else if(tablero[y][x] == 1){
				System.out.println("Esa celda ya esta libre!");
			}
			else if(tablero[y][x] == 9){
				tablero[y][x] = 2;
				System.out.println("Mina!");
				vidas -= 1;		
			}
			else if(tablero[y][x] == 2){
				System.out.println("Esa celda ya exploto!");
			}
			
			// Impresion
			System.out.print("\033[H\033[2J");System.out.flush();
			System.out.println(borde);
			System.out.println("  0 1 2 3 4 5 6");
			for(int i = 0; i < 5; i++){
				System.out.print(i+" ");
				for(int j = 0; j < 7; j++){
					if(tablero[i][j] == 0 || tablero[i][j] == 9){
						System.out.print("- ");
					}
					else if(tablero[i][j] == 1){
						System.out.print(". ");					
					}
					else if(tablero[i][j] == 2){
						System.out.print("* ");					
					}	
				}
				System.out.println();
			}
			System.out.println(borde);
			System.out.println("vidas: "+vidas);
			System.out.println("Celdas restantes: "+zeroes);
		}while(vidas>0 && zeroes!=0);
		// Mensaje Final
		if(vidas == 0){
			System.out.println("Perdiste!");
		}
		else{
			System.out.println("Felicitaciones!");
		}
		
		
	}
}