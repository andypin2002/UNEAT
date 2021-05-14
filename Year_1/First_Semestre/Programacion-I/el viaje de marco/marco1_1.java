import java.lang.Math;
public class marco1_1{
	public static void main(String[] args){
		// Variables globales.
		int dia = 0;
		double total = 0, rec = 0.0, clima, vel, horas, monoE, monoC, posM = 350, velM, horasM = 0, recM = 0.0, climaM;
		System.out.println("============================");
		System.out.println("||DIARO DEL VIAJE DE MARCO||");
		System.out.println("============================");
		while(total <= posM){
			// Se le da valor a las variables.
			dia = dia + 1;
			clima = (int)(Math.random()*(100+1))+1;
			vel = (Math.random()*(15-10+1))+10;
			horas = (Math.random()*(10-8+1))+8;
			monoE = (int)(Math.random()*(100-15+1))+15;
			monoC = (int)(Math.random()*(4))+1;
			velM = (Math.random()*(9-6+1))+6;
			horasM = (Math.random()*(9-6+1))+6;
			climaM = (int)(Math.random()*(100+1))+1;
			// Chequea el clima y ajusta la velocidad de marco.
			System.out.println("DIA "+dia);
			if(clima<=10){
				vel = (vel*0.25);
				System.out.println("¡Hoy ha llovido muchísimo!");
			}
			else if(clima <= 40 && clima > 10){
				vel = (vel*0.75);
				System.out.println("Hoy ha llovido un poco...");
			}
			else if(clima <= 100 && clima > 40){
				System.out.println("Hoy ha hecho un buen dia");
			}
			// Chequea si el mono se escapó y ajusta cantidad de horas que recorrio marco durante el día.
			if(monoE <= 15){
				horas = horas - 2;
				System.out.println("¡He perdido tiempo buscando a Amedio!");
			}
			//Chequea si el mono se cansa y ajusta la velocidad de marco.
			if(monoC <= 1){
				vel = vel*0.9;
				System.out.println("Amedio se ha cansado y me ha tocado llevarlo...");
			}
			// Calcula e imprime los detalles del dia de marco.
			rec = vel * horas;
			total = total + rec;
			System.out.println("Hoy avance "+(Math.round(horas*100.0)/100.0)+" horas a "+(Math.round(vel*100.0)/100.0)+" Km/h, recorriendo "+(Math.round(rec*100.0)/100.0)+" Km.");
			
			//Chequea el clima de la madre y ajusta su velocidad;
			if(climaM <= 10){
				velM = velM * 0.25;
				System.out.println("¡A mama le ha llovido muchisimo!");
			}
			else if(climaM <= 40 && climaM > 10){
				velM = velM * 0.5;
				System.out.println("A mama le ha llovido un poco...");
			}
			else if(climaM <= 100 && climaM > 40){
				System.out.println("A mama le ha hecho un buen dia");
			}
			//Calcula e imprime los detalles del dia de la madre.
			recM = velM * horasM;			
			posM = posM + recM;
			System.out.println("Mama pudo avanzar "+(Math.round(horasM*100.0)/100.0)+" horas a "+(Math.round(velM*100.0)/100.0)+" Km/h, recorriendo "+(Math.round(recM*100.0)/100.0)+" Km.");
			
			// Imprime la distancia entre marco y su madre al final del dia.
			if((posM-total)>0){
				System.out.println("Al final del dia "+dia+" la distancia entre marco y su madre es de "+(Math.round((posM-total)*100.0)/100.0)+"Km");
				System.out.println("----------------------------------------------------------------------------------------");
			}
		}
		System.out.println("*********************************************************");
		System.out.println("Al final del dia "+dia+" Marco encuentra a su madre!!!");
		System.out.println("*********************************************************");
	}
}