import java.util.Scanner;
public class reflexionesCaracol{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in); 
		
		String pasarDia    = "";
		String elCoche     = "[__]     O[|||]O    [__]";
		String laVictoria  = "[__]     _(O)_/'    [__]";
		String laTapa      = "[__]                [__]";
		String elFondo     = "  [][][][][][][][][][]";
		String laPared     = "  []:.  :.  :.  :. :[]";
		String elAgua      = "  []~~~~~~~~~~~~~~~~[]";
		String elCaracol   = "  []:    _(O)/'    :[]";
		
		int profundidadPozo = 20, dia = 0, profundidadAgua = 0;
		double alturaCaracol= (int)(Math.random()*(11)), subida = 0.0, caida = 0.0, coche = 0.0, clima = 0.0;
		
		
		
		do{
			// INICIO DE DIBUJO DEL POZO
			dia = dia+1;
			if(dia <= 10 && dia >= 1){
				// Establece cuanto sube el caracol si es entre el dia 1 y 10;
				subida = (int)(Math.random()*(4)+1);
			}
			else if(dia > 10 && dia <= 20){
				// Establece cuanto sube el caracol si es entre el dia 10 y 20;
				subida = (int)(Math.random()*(3)+1);
			}
			else if(dia > 20){
				// Establece cuanto sube el caracol despues del dia 20;
				subida = (int)(Math.random()*(2)+1);
			}
			// Dicta si este dia ha pasado un coche
			coche = Math.random();
			if(coche <= 0.35){
				alturaCaracol = alturaCaracol-2;
			}
			// Establece el clima del dia
			clima = Math.random();
			if(clima <= 0.05){
				// 5% de probabilidad de lluvia fuerte
				profundidadAgua = profundidadAgua + 5;
			}
			else if(clima > 0.05 && clima <= 0.15){
				// 10% de probabilidad de lluvia
				profundidadAgua = profundidadAgua + 2;
			}
				// 85% de probabilidad de buen dia
			
			
			// Establece cuanto cae el caracol durante la noche;
			caida = (int)(Math.random()*(5));
			// Calcula es desplazamiento neto del caracol ese dia;
			alturaCaracol = alturaCaracol + caida - subida ;
			
			
			
			
			if(alturaCaracol < profundidadAgua){
				// Establece que el caracol no puede estar bajo el agua
				alturaCaracol = profundidadAgua+1;
			}
			String c = "";
			if(coche<0.35){c = "SI";}else{c = "NO";}
			String cl = "";
			if(clima<=0.05){cl = "Lluvia fuerte";}else if(clima > 0.05 && clima <= 0.15){cl = "Lluvia";}else{cl="Soleado";}
			System.out.println("dia: ["+dia+"] / Sube: ["+subida+"] / Baja: ["+caida+"] / Altura: ["+alturaCaracol+"] / Coche: [" + c + "] / Clima: ["+cl+"]");
			System.out.println(" ");
			System.out.println(" ");
			if(alturaCaracol >= 20 && coche < 0.35){
				System.out.println(laVictoria);
			}
			else if(coche < 0.35){
				// Si pasa un coche, imprime el carro
				System.out.println(elCoche);
			}
			else if(alturaCaracol < 20){
				// Si no pasa un coche, imprime la tapa del pozo
				System.out.println(laTapa);
			}
			else{
				// Si el caracol logra escapar, imprime al caracol fuera del pozo
				System.out.println(laVictoria);
			}
			
			// Imprime el interior del pozo
			for (int i=0;i<=profundidadPozo;i=i+1){
				if (profundidadPozo-i==alturaCaracol && alturaCaracol < 20) {
					System.out.println(elCaracol + " -->" + i);
				} else {
					if (profundidadPozo-i<profundidadAgua) {
						System.out.println(elAgua + " -->" + i);
					} else {
						System.out.println(laPared + " -->" + i);	
					}
				}
			}
			System.out.println(elFondo);
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("==================================================");
			pasarDia = entrada.nextLine();
			// FIN DEL DIBUJO DEL POZO
			
		}while(alturaCaracol < 20 && dia < 50);
		if(dia >= 50 && alturaCaracol < 20){
			System.out.println("                                 _____  _____");
			System.out.println("                                <     `/     |");
			System.out.println("                                 >          (");
			System.out.println("                                |   _     _  |");
			System.out.println("                                |  |_) | |_) |");
			System.out.println("                                |  | | | |   |");
			System.out.println("                                |            |");
			System.out.println("                 ______.______%_|            |__________  _____");
			System.out.println("               _/                                       ||     |");
			System.out.println("              |                E L  C A R A C O L              <");
			System.out.println("              |_____.-._________              ____/|___________|");
			System.out.println("                                | * 04/20/21 |");
			System.out.println("                                | + 06/09/21 |");
			System.out.println("                                |            |");
			System.out.println("                                |            |");
			System.out.println("                                |   _        <");
			System.out.println("                                |__/         |");
			System.out.println("                                 / `--.      |");
			System.out.println("                               %|            |%");
			System.out.println("                           |/.%%|          -< @%%%");
			System.out.println("                          `\\%`@|     v      |@@%@%%");
			System.out.println("                        .%%%%@@@|%    |    % @@@%%@%%%%");
			System.out.println("                    _.%%%%%%@@@@@@%%_/%\\%@@%%@@@@@@@%%%%%%");
		}
		else if(alturaCaracol >= 20){
			System.out.println("EL CARACOL SALIO DEL POZO DESPUES DE "+dia+" DIAS");
			System.out.println("=====================================");
		}
		
		

	}

}