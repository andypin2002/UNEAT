import java.util.Scanner;
public class simulacionColas2021{

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);
		String inputDelUsuario = "";
		double probabilidadLlegadaUsuario;
		int laCola=0;
		int laCaja1=0, laCaja2=0, laCaja3=0, laCaja4=0, laCaja5=0 ;
		int minutosSinGenteEnCola=0;

		
		for (int hora=9;hora<22;hora=hora+1){
			for (int minuto=0;minuto<60;minuto=minuto+1){
				if (laCola<=0) {minutosSinGenteEnCola=minutosSinGenteEnCola+1;}
				System.out.print("Son las ["+hora+"]:["+minuto+"] ");
				
			//	-- INICIO Cálculo de llegada de un usuario --  
				probabilidadLlegadaUsuario = Math.random();
				if (probabilidadLlegadaUsuario<=.4){
					System.out.print("Llega un usuario ");
					laCola=laCola+1;
				} else {
					System.out.print("");
				}
			//	-- FIN Cálculo de llegada de un usuario --	

				
				if (laCaja1<=0 && laCola>0){
					// Hacer pasar un cliente (restar 1 a la cola)
					laCola = laCola-1;
					// Calcular los packs de items que trae el cliente
					laCaja1 = (int)(Math.random()*11+5);
					System.out.print("Pasan a caja1 con ["+laCaja1+"] ");
				}

				if (laCaja1>0){
					// Atender a un cliente
					laCaja1=laCaja1-1;
				}
				

				if (laCaja2<=0 && laCola>0){
					// Hacer pasar un cliente (restar 1 a la cola)
					laCola = laCola-1;
					// Calcular los packs de items que trae el cliente
					laCaja2 = (int)(Math.random()*11+5);
					System.out.print("Pasan a caja2 con ["+laCaja2+"] ");
				}

				if (laCaja2>0){
					// Atender a un cliente
					laCaja2=laCaja2-1;
				}
				
				if (laCaja3<=0 && laCola>0){
					// Hacer pasar un cliente (restar 1 a la cola)
					laCola = laCola-1;
					// Calcular los packs de items que trae el cliente
					laCaja3 = (int)(Math.random()*11+5);
					System.out.print("Pasan a caja3 con ["+laCaja3+"] ");
				}

				if (laCaja3>0){
					// Atender a un cliente
					laCaja3=laCaja3-1;
				}

				if (laCaja4<=0 && laCola>0){
					// Hacer pasar un cliente (restar 1 a la cola)
					laCola = laCola-1;
					// Calcular los packs de items que trae el cliente
					laCaja4 = (int)(Math.random()*11+5);
					System.out.print("Pasan a caja4 con ["+laCaja4+"] ");
				}

				if (laCaja4>0){
					// Atender a un cliente
					laCaja4=laCaja4-1;
				}
				if (laCaja5<=0 && laCola>10){
					// Hacer pasar un cliente (restar 1 a la cola)
					laCola = laCola-1;
					// Calcular los packs de items que trae el cliente
					laCaja5 = (int)(Math.random()*11+5);
					System.out.print("Pasan a caja5 con ["+laCaja5+"] ");
				}

				if (laCaja5>0){
					// Atender a un cliente
					laCaja5=laCaja5-1;
				}

			// -- ZONA DE IMPRESION
				System.out.println(" ");
				System.out.println("----------------------------------------------");
				//System.out.println("Hay ["+laCola+"] personas en cola.");
				for(int m = 0; m < laCola; m++){System.out.print("_o_  ");};
				System.out.println(" ");
				System.out.println(" ");
				System.out.print("Caja1: "); for(int x=1;x<=laCaja1;x=x+1){System.out.print("[]");}System.out.println(" ->"+laCaja1);
				System.out.print("Caja2: "); for(int x=1;x<=laCaja2;x=x+1){System.out.print("[]");}System.out.println(" ->"+laCaja2);
				System.out.print("Caja3: "); for(int x=1;x<=laCaja3;x=x+1){System.out.print("[]");}System.out.println(" ->"+laCaja3);
				System.out.print("Caja4: "); for(int x=1;x<=laCaja4;x=x+1){System.out.print("[]");}System.out.println(" ->"+laCaja4);
				System.out.print("Caja5: "); for(int x=1;x<=laCaja5;x=x+1){System.out.print("[]");}System.out.println(" ->"+laCaja5);
				System.out.println(" ");
				System.out.println("----------------------------------------------");
			// -- FIN DE ZONA DE IMPRESION 
			inputDelUsuario = entrada.nextLine();
			}
			
			
		}
	
		System.out.println("Minutos sin gente en la cola: "+minutosSinGenteEnCola);
	
	}
}