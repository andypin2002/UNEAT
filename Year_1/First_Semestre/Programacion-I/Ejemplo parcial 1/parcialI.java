public class parcialI{
	public static void main(String[] args){
		//variables
		double colaP, caja1I, caja2I, caja3I, caja4I;
		colaP = caja1I = caja2I = caja3I = caja4I = 0.0;
		int cola = 0, minuto;
		boolean caja1S, caja2S, caja3S, caja4S;
		caja1S = caja2S = caja3S = caja4S = true;
		
		
		// Simulacion de minutos
		for(int i = 1; i <= 720; i++){
			// 40% de probabilidad de que una persona entre en la fila cada minuto.
			colaP = (int)(Math.random()*(100+1));
			if(colaP <= 40){
				cola = cola+1;
			}
			// Si la caja  esta vacia, lleva a una persona a esa caja.
			if(caja1S = true && cola > 0){
				caja1S = false;
				cola = cola-1;
				caja1I = (int) (Math.random()*(15-5+1))+1;
				
			if(caja1I <= 0){
				caja1S = true;
			}
			
			
			System.out.println("["+cola+"]");
			}
			// Si la caja uno no tiene personas, esta vacia.
			// Visualizacion grafica 
			/*
			System.out.print("Personas: ");
			for(int j = 1; j <= cola; j++){
				System.out.print("O");
				System.out.println(" ");
			}
			System.out.print("Caja 1: ");
			for(int k = 1; k <= caja1I; k++){
				System.out.print("[]");
				System.out.println("");
			}
			*/
			caja1I = caja1I-1;	
		}
	}
}
