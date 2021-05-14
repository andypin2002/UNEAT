import java.util.Scanner;
public class elCaminante{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in); 
		String eleccion = "";
		boolean finished = false, house_flag = false, horse_flag = false, well_flag = false,
		lant_flag = false, rod_flag = false, shovel_flag = false, hammer_flag = false,
		nail_flag = false, worm_flag = false, boat_flag = false;
		int[] position = {0,0};
		double a = (int)(Math.random()*10000);
		int pass = 0;
		{				//  Mensaje inicial
		System.out.println("Te despiertas en un bosque... la cabeza te da vueltas...");
		System.out.println("Miras a tu alrededor...");
		System.out.println("Ves un precipicio  hacia el Oeste, una planicie hacia el Norte, un risco hacia el Sur y m"+"\u00e1"+"s bosque hacia el Este");
		System.out.println("Sientes algo en tu bolsillo... Es una nota!");
		System.out.println("En la nota se lee:");
		System.out.println("COMANDOS: norte, sur, este, oeste, mirar, inspeccionar.");
		System.out.println(" ");
		System.out.println("¿A donde deber"+"\u00ed"+"a ir?");
		}
		do{
			eleccion = sc.nextLine();
		// Comandos
			// Caminar al Norte
			if(eleccion.equals("p")){
				System.out.println(position[0]+","+position[1]);
			}
			else if(eleccion.equals("f")){
				System.out.println("finished: "+ finished);
				System.out.println("house_flag: "+ house_flag);
				System.out.println("horse_flag: "+ horse_flag);
				System.out.println("well_flag: "+ well_flag);
				System.out.println("lant_flag: "+ lant_flag);
				System.out.println("rod_flag: "+ rod_flag);
				System.out.println("shovel_flag: "+ shovel_flag);
				System.out.println("hammer_flag: "+ hammer_flag);
				System.out.println("nail_flag: "+ nail_flag);
				System.out.println("worm_flag: "+ worm_flag);
				System.out.println("boat_flag: "+ boat_flag);
				System.out.println("worm_flag: "+ worm_flag);
				
			}
			else if(eleccion.equals("n")){
				if(position[1] == 3){
					System.out.println("Una cordillera empinada bloquea tu camino");
				}
				else{
					position[1] += 1;
				}
			}
			// Caminar al sur
			else if(eleccion.equals("s")){
				if(position[1] == 0){
					System.out.println("Un precipicio se encuentra ahi. Decides no avanzar");
				}
				else{
					position[1] -= 1;
				}
			}
			// Caminar al Este
			else if(eleccion.equals("e")){
				if(position[0] == 4 && position[1] != 1){
					System.out.println("Una cordillera empinada bloquea tu camino");
				}
				else{
					position[0] += 1;
				}
			}
			// Caminar al oeste
			else if(eleccion.equals("o")){
				if(position[0] == 0){
					System.out.println("Un acantilado impide que avances.");
				}
				else{
					position[0] -= 1;
				}
			}
			
				//#########################################################################################################################			
			
				// Mirar alrededor
			else if(eleccion.equals("v")){
				if(position[0] == 0 && position[1] == 0){
				System.out.println("Ves un precipicio  hacia el Oeste, una planicie hacia el Norte, un risco hacia el Sur y m"+"\u00e1"+"s bosque hacia el Este");
				}
				// [0,1]
				else if(position[0] == 0 && position[1] == 1){
					System.out.println("Una Planicie");
					if(horse_flag == false){
						System.out.println("Ves un caballo en la distancia... Con algo brillante colgando de su cuello");
					}
				}
				// [0,2]
				else if(position[0] == 0 && position[1] == 2){
					System.out.println("Una Casa");
					if(house_flag == false){
						System.out.println("La puerta esta cerrada con llave");
					}
				}
				// [0,3]
				else if(position[0] == 0 && position[1] == 3){
					System.out.println("Un Bosque");
				}
				// [1,0]
				else if(position[0] == 1 && position[1] == 0){
					System.out.println("Un Bosque");
				}
				// [1,1]
				else if(position[0] == 1 && position[1] == 1){
					System.out.println("Un Bosque");
				}
				// [1,2]
				else if(position[0] == 1 && position[1] == 2){
					System.out.println("Un Bosque");
				}
				// [1,3]
				else if(position[0] == 1 && position[1] == 3){
					System.out.println("Un Bosque");
				}
				// [2,0]
				else if(position[0] == 2 && position[1] == 0){
					System.out.println("Un Bosque");
				}
				// [2,1]
				else if(position[0] == 2 && position[1] == 1){
					System.out.println("Un Pozo");
				}
				// [2,2]
				else if(position[0] == 2 && position[1] == 2){
					System.out.println("Un Gran arbol");
				}
				// [2,3]
				else if(position[0] == 2 && position[1] == 3){
					System.out.println("Una Colina");
				}
				// [3,0]
				else if(position[0] == 3 && position[1] == 0){
					System.out.println("Unas Ruinas");
				}
				// [3,1]
				else if(position[0] == 3 && position[1] == 1){
					System.out.println("Un Lago (Zona Suroeste)");
				}
				// [3,2]
				else if(position[0] == 3 && position[1] == 2){
					System.out.println("Un Lago (Zona Noroeste)");
				}
				// [3,3]
				else if(position[0] == 3 && position[1] == 3){
					System.out.println("Un Cementerio");
				}
				// [4,0]
				else if(position[0] == 4 && position[1] == 0){
					System.out.println("Un Bosque");
				}
				// [4,1]
				else if(position[0] == 4 && position[1] == 1){
					System.out.println("Un Lago (Zona Sureste)");
				}
				// [4,2]
				else if(position[0] == 4 && position[1] == 2){
					System.out.println("Un Lago (Zona Noreste)");
				}
				// [4,3]
				else if(position[0] == 4 && position[1] == 3){
					System.out.println("Un Bosque");
				}
				// [5,1]
				else if(position[0] == 5 && position[1] == 1){
					System.out.println("Una Cueva secreta!");
				}
			}
			
				//#############################################################################################################	
			
			else if(eleccion.equals("i")){
				if(position[0] == 0 && position[1] == 0){
					System.out.println("Inspeccionas el area, pero no encuentras nada interesante");
				}
				// [0,1] Una Planicie
				else if(position[0] == 0 && position[1] == 1){
					System.out.println("");
					if(horse_flag == false){
						System.out.println("Persigues al caballo hasta quedarese cansado.");
						System.out.println("Inspeccionas su cuello... Una llave! Me pregunto para que servira...");
						horse_flag = true;
					}
				}
				// [0,2] Una Casa
				else if(position[0] == 0 && position[1] == 2){
					System.out.println("");
					if(house_flag == false && horse_flag == false){
						System.out.println("La puerta esta cerrada con llave");
					}
					else if(house_flag == false && horse_flag == true){
						System.out.println("Intentas abrir la puerta, pero la llave es muy grande.");
					}
					else if(house_flag == true){
						System.out.println("Intentas abrir la puerta... La puerta se abre!");
						System.out.println("En el interior de la casa encuentras una nota?");
						System.out.println("La nota pone: ");
						System.out.println("L(so) + 2E = :D ");
						System.out.println("P: "+ a);
					}
				}
				// [0,3] Un Bosque
				else if((position[0] == 0 && position[1] == 3) || (position[0] == 1 && position[1] == 0) || 
				(position[0] == 1 && position[1] == 1) || (position[0] == 1 && position[1] == 2)
				|| (position[0] == 1 && position[1] == 3) || (position[0] == 2 && position[1] == 0) ||
				(position[0] == 4 && position[1] == 0) || (position[0] == 4 && position[1] == 3))
				{
					if(worm_flag == false){
						System.out.println("Escarvas en la tierra un poco... conseguiste carnada!");
						worm_flag = true;
					}
					else{
						System.out.println("Pero nada pasó.");
					}
				}
				// [2,1]Un Pozo
				else if(position[0] == 2 && position[1] == 1){
					System.out.println("");
					if(well_flag == false){
						System.out.println("Intenas subir el balde, pero el pozo no tiene manibela.");
					}
					else if(well_flag == true){
						System.out.println("Usas la manibela para subir el balde... dentro del balde encuentras una linterna! ahora puedes ver en la oscuridad.");
						lant_flag = true;
					}
					else{
						System.out.println("Huh??");
					}
				}
				// [2,2] Un Gran arbol
				else if(position[0] == 2 && position[1] == 2){
					System.out.println("Te recuestas del gran arbol... El canto de los pajaros te calma y el aire fresco te ayuda a respirar");
					System.out.println("Te quedas dormido un par de horas...");
					System.out.println("Cuando te despiertas, notas algo colgando de una de las ramas.");
					System.out.println("Lleno de curiosidad, meneas el arbol...");
					System.out.println("De las ramas se desprende algo que te golpea en la cabeza... Que hace una manibela colgada ahi???");
					well_flag = true;
				}
				// [2,3] Una Colina
				else if(position[0] == 2 && position[1] == 3){
					System.out.println("");
				}
				// [3,0] Un lugar de excavacion
				else if(position[0] == 3 && position[1] == 0){
					if(lant_flag == false){
						System.out.println("Te asomas hacia adentro, pero esta demasiado oscuro para ver");
					}
					else if(lant_flag == true && horse_flag == false){
						System.out.println("Te adentras a la mina, encuentras una pala escondida debajo de una manta.");
						System.out.println("Tomas la pala contigo.");
						System.out.println("Tambien encuentras un cofre, pero esta cerrado con llave.");
						shovel_flag = true;
					}
					else if(lant_flag == true && horse_flag == true && shovel_flag == false){
						System.out.println("Te adentras a la mina, encuentras una pala escondida debajo de una manta.");
						System.out.println("Tomas la pala contigo.");
						shovel_flag = true;
						System.out.println("Tambien encuentras un cofre... la cerradura se te hace extra"+"\u00f1"+"amente familiar...");
						System.out.println("Usas la llave que le quitaste al caballo para abrir el cofre.");
						System.out.println("Dentro del cofre encuentras una caja con clavos... Te los llevas por si las moscas...");
						System.out.println("A quien se le ocurren estos puzzles? -_-");
						nail_flag = true;
					}
					else if(horse_flag == true && shovel_flag == true){
						System.out.println("Te adentras a la mina de nuevo para revisar el cofre");
						System.out.println("La cerradura se te hace extra"+"\u00f1"+"amente familiar...");
						System.out.println("Usas la llave que le quitaste al caballo para abrir el cofre.");
						System.out.println("Dentro del cofre encuentras una caja con clavos... Te los llevas por si las moscas...");
						System.out.println("A quien se le ocurren estos puzzles? -_-");
						nail_flag = true;
					}
				}
				// [3,1] Un Lago (Zona Suroeste)
				else if(position[0] == 3 && position[1] == 1){
					if(hammer_flag == false && nail_flag == false){
						System.out.println("Un bote destruido... Si lo arreglara podria explorar un poco el lago...");
					}
					else if(hammer_flag == true && nail_flag == false){
						System.out.println("Tengo el martillo, pero no parece ser suficiente para arreglar el bote.");
					}
					else if(hammer_flag == false && nail_flag == true){
						System.out.println("Tengo los clavos, pero no parece ser suficiente para arreglar el bote.");
					}
					else{
						System.out.println("Con los clavos, el martillo y un poco de astucia logre reparar el bote!");
						boat_flag = true;
					}
				}
				// [3,2] Un Lago (Zona Noroeste)
				else if(position[0] == 3 && position[1] == 2){
					System.out.println("Pescar siempre ayuda a aliviar el estres... tomas prestada la caña que ahi yace");
					rod_flag = true;
					if(rod_flag == true && worm_flag == false){
						System.out.println("Lanzas la caña al agua, pero nada pico... quiza debería buscar algun cebo?");
					}
					else{
						System.out.println("Lanzas la caña... Sientes algo picar! Halas con mucha emoción!!! pero solo es una bota... Dentro de la bota hay una llave, para qué servirá?");
						house_flag = true;
					}
				}
				// [3,3] Un Cementerio
				else if(position[0] == 3 && position[1] == 3){
					if(lant_flag == false){
						System.out.println("Entras a un mausoleo, pero está demasiado oscuro...");
					}
					else if(shovel_flag == false && lant_flag == true){
						System.out.println("Entras a un mausoleo, ves un monticulo extraño... Si tuviese una pala podría escavar");
					}
					else if(shovel_flag == true && lant_flag == true){
						System.out.println("Entras a un mausoleo, ves un monticulo extraño... Excavas y encuentras un martillo.");
						hammer_flag = true;
					}
				}
				// [4,1], [4,2] Un Lago (Zonas Sureste y noreste)
				else if((position[0] == 4 && position[1] == 1) || (position[0] == 4 && position[1] == 2)){
					if(rod_flag == true && worm_flag == true){
						System.out.println("Lanzas tu caña y te relajas...");
					}
					else{
						System.out.println("No hay nada interesante...");
					}
				}
				// [5,1] Una Cueva secreta!
				else if(position[0] == 5 && position[1] == 1){
					System.out.println("Entras en la cueva, pero no tiene salida!... Al inspeccionar pared del fondo");
					System.out.println("encuentras una pad numerico y una pantalla que muestra ####");
					System.out.println("Introduce la contraseña");
					pass = sc.nextInt();
					if(pass != a){
						System.out.println("Contraseña incorrecta");
					}
					else{
						System.out.println("La pared empieza a moverse! Mientras ves la pesada roca subir, un halo de luz ilumina la cueva.");
						System.out.println("Ves el exterior y sales.");
						System.out.println(" ");
						System.out.println("FIN");
						finished = true;
					}
				}
			}
			else{
				System.out.println("");
			}
		} while(finished==false);
	}
}