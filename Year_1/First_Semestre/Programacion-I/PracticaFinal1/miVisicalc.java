import java.util.Scanner;
public class miVisicalc{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String election = "";
		int rows = 15;
		String[][] = {}
		
		do{
			System.out.println(+------------------------------------------------------------------------+);
			System.out.println(|  |   A  |   B  |   C  |   D  |   E  |   F  |   G  |   H  |   I  |   J  |);
			System.out.println(|--+------+------+------+------+------+------+------+------+------+------|);
			for(int i = 0; i < rows; i++){
				for
			}
			
			
			
			
			System.out.println("CMDs: [W]Arriba, [S]Abajo, [A]Izquierda, [D]Derecha, [F]Salir");
			election = sc.nextLine();
			if(election.equals("W") || election.equals("w")){
				System.out.println("Arriba");
			}
			else if(election.equals("A") || election.equals("a")){
				System.out.println("Izquierda");
			}
			else if(election.equals("S") || election.equals("s")){
				System.out.println("Abajo");
			}
			else if(election.equals("D") || election.equals("d")){
				System.out.println("Derecha");
			}
			else if(election.equals("F") || election.equals("f")){
				System.out.println("Salir");
			}
		}while(!(election.equals("F") || election.equals("f")));
	}
}