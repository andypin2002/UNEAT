import java.util.Scanner;
public class conway{
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";	
	
	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String nextFrame = "";
		int currentNeighbors = 0, dia=0;
		
		// Para evitar tener que editar dos matrices, estas son diferentes, pero sus valores se igualan mas adelante.
		int[][] life = {
			{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
			{9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9},
			{9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9},
			{9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9},
			{9, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 9},
			{9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9},
			{9, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 9},
			{9, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 9},
			{9, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 9},
			{9, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 9},
			{9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9},
			{9, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 9},
			{9, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 9},
			{9, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 9},
			{9, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 9},
			{9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9},
			{9, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 9},
			{9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9},
			{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9},

		};
		int[][] temp = {
			{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
			{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
			{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
			{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
			{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
			{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
			{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
			{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
			{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
			{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
			{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
			{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
			{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
			{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
			{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
			{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
			{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
			{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
			{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9},

		};
		
		// Se igualan los valoder de la matriz temp a los valores de la matriz life
		for(int i = 1; i < 19; i++){
			for(int j = 1; j < 23; j++){
			temp[i][j] = life[i][j];
			}
		}		
		
		
		// Se imprime la matriz life
		System.out.print("\033[H\033[2J");System.out.flush();
		System.out.println("Dia: 0");
		for(int i = 1; i <= 17; i++){
			for(int j = 1; j <= 21; j++){
				if(life[i][j] == 0){
					System.out.print(ANSI_RED_BACKGROUND+"  "+ANSI_RESET);
				}else if(life[i][j] == 1){
					System.out.print(ANSI_GREEN_BACKGROUND+"  "+ANSI_RESET);
				}else{
					System.out.print("what");
				}
			}
			System.out.println();
		}
		
		nextFrame = sc.nextLine();

		

		// Empieza el contador de dias
		dia += 1;
		// Empieza el loop infinito
		do{
			System.out.print("\033[H\033[2J");System.out.flush();
			System.out.println("Dia: "+dia);
			// Se recorre la matriz life
			for(int i = 1; i <= 17; i++){
				for(int j = 1; j <= 21; j++){
					// Busca cuantas celdas adyacentes estan vivas y las almacena en la variable  currentNeighbors
                    if(life[i-1][j-1] == 1){
                        currentNeighbors+=1;
                    }
                    if(life[i-1][j] == 1){
                        currentNeighbors+=1;
                    }
                    if(life[i-1][j+1] == 1){
                        currentNeighbors+=1;
                    }
                    if(life[i][j-1] == 1){
                        currentNeighbors+=1;
                    }
					if(life[i][j+1] == 1){
                        currentNeighbors+=1;
                    }
                    if(life[i+1][j-1] == 1){ 
                        currentNeighbors+=1;
                    }
                    if(life[i+1][j] == 1){ 
                        currentNeighbors+=1;
                    }
                    if(life[i+1][j+1] == 1){ 
                        currentNeighbors+=1;
                    }


					// Dependiendo de las condiciones de la matriz life, actualiza los valores de la matriz temp.
                    if(life[i][j] == 1 && (currentNeighbors == 1 || currentNeighbors == 0 || currentNeighbors >= 4 )){
						temp[i][j] = 0;
					}
					else if(life[i][j] == 1 && (currentNeighbors == 2 || currentNeighbors == 3 )){
                        temp[i][j] = 1;
					}
					else if(life[i][j] == 0 && (currentNeighbors == 3)){
						temp[i][j] = 1;
                    }
					currentNeighbors = 0;
                }
            }
			
			// Se igualan los valores de la matriz life a los valores de la matriz temp.
			for(int i = 1; i <= 17; i++){
				for(int j = 1; j <= 21; j++){
					life[i][j] = temp[i][j];
				}
			}
			// Se imprime la version actualizada de la matriz life.
			for(int i = 1; i <= 17; i++){
				for(int j = 1; j <= 21; j++){
					if(life[i][j] == 0){
						System.out.print(ANSI_RED_BACKGROUND+"  "+ANSI_RESET);
					}
					else if(life[i][j] == 1){
						System.out.print(ANSI_GREEN_BACKGROUND+"  "+ANSI_RESET);
					}
				}
				System.out.println();
			}
			dia += 1;
			nextFrame = sc.nextLine();
		}while(true);
	}
}