import java.util.Scanner;
public class unMapaVersionRestringida{

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);
		int opcionElegida;
		String descripcionDeAccion = "";
		// La matriz "valores" almacena el mapa codificado.
		int[][] valores = {	
							{0,1,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,1,0,0,0,3,3,3,3,3,3},
							{0,1,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,1,0,0,0,0,0,3,0,3,0},
							{2,2,2,2,0,0,0,0,0,2,2,2,2,0,0,0,0,0,0,3,3,3,3,3,3,3,3},
							{0,1,1,0,0,0,0,0,1,0,1,1,0,0,0,0,0,1,1,0,0,0,0,1,0,1,0},
							{0,0,7,0,0,1,1,0,0,0,0,0,0,0,1,1,0,0,0,0,0,1,1,1,0,1,0},
							{0,0,7,7,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0},
							{0,1,1,1,0,0,0,0,1,0,1,1,1,0,0,0,0,1,1,1,0,0,0,1,0,1,0},
							{0,1,1,0,0,0,0,0,1,0,1,1,0,0,0,0,0,1,1,0,0,0,0,1,0,1,0},
							{0,0,0,0,0,1,1,0,0,0,0,0,0,0,1,1,0,0,0,0,0,1,1,1,0,1,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,1,2,1,2},
							{0,1,1,1,0,0,0,0,1,0,1,1,1,0,0,0,0,1,1,1,0,0,2,1,2,1,2},
							{0,1,1,1,0,0,0,0,1,0,1,1,1,0,0,0,0,1,1,1,0,0,0,1,0,1,0},
							{0,1,1,0,0,0,0,0,1,0,1,1,0,0,0,0,0,1,1,0,0,0,0,1,0,1,0},
							{0,0,0,0,0,1,1,0,0,0,0,0,0,0,1,1,0,0,0,0,0,1,1,1,0,1,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,1,2,1,2},
							{0,1,1,1,0,0,0,0,1,0,1,1,1,0,0,0,0,1,1,1,0,0,2,1,2,1,2},								
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2}
						};


		int maxX, maxY, minX, minY;
		int posX, posY;
		
		posX = 1;
		posY = 2;
		
		minX=0;
		minY=0;
		maxX=valores[0].length;
		maxY=valores.length;
		boolean sigamosJugando = true;

		do {
						// INICIO DE IMPRESION DE MAPA
			System.out.print("+");for (int i=minX;i<maxX;i=i+1){System.out.print("---");}System.out.println("+");
			for (int i=minY; i<maxY; i=i+1){
				System.out.print("|");
				for (int j=minX; j<maxX; j=j+1) {
					if (j==posX && i==posY) {
						// Imprimir al personaje
						System.out.print("_ô_");
					} else {
						//System.out.print(" " + valores[i][j] + " ");	
						// Imprimir lo que tenga la matriz, parseandola
						if (valores[i][j]==0){System.out.print(" · ");} else
						if (valores[i][j]==1){System.out.print("[#]"); }else
						if (valores[i][j]==2){System.out.print(";·'");} else
						if (valores[i][j]==3){System.out.print("/^\\");} else
						if (valores[i][j]==7){System.out.print("~~~");}						
						//for(long xyz=0;xyz<500000000;xyz=xyz+1){} // Bucle de retraso
					}
				}
				System.out.print("|");
				System.out.println();
			}
			System.out.print("+");for (int i=minX;i<maxX;i=i+1){System.out.print("---");}System.out.println("+");
			System.out.println("El personaje "+descripcionDeAccion+" y ahora está en X=["+posX+"] y=["+posY+"]");
			// FIN DE IMPRESION DE MAPA
			
			System.out.print("¿Adónde va? (8/2/4/6):");
			opcionElegida = entrada.nextInt();
			descripcionDeAccion = "no puede moverse hacia allá";
			
					if (opcionElegida==8 && posY>minY 	&& valores[posY-1][posX]%2==0 )		{	posY = posY-1;	descripcionDeAccion = "va al norte";	}
			else 	if (opcionElegida==2 && posY<maxY-1	&& valores[posY+1][posX]%2==0 ) 	{	posY = posY+1;	descripcionDeAccion = "va al sur";		}
			else 	if (opcionElegida==4 && posX>minX 	&& valores[posY][posX-1]%2==0 ) 	{	posX = posX-1;	descripcionDeAccion = "va al oeste";	}
			else 	if (opcionElegida==6 && posX<maxX-1	&& valores[posY][posX+1]%2==0 ) 	{	posX = posX+1;	descripcionDeAccion = "va al este";		}
				
		} while (sigamosJugando);
	}
}


	

	
