import java.util.Scanner;
import java.lang.Math;
public class area{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Hola muy buenas, desea sacar area de rectangulo, triangulo o circulo? (r/t/c/salir)");
		while (true){
			String a = System.console().readLine();
			if (a.equals("r")){
				System.out.println("Cuanto mide su primer lado?");
				float l1 = sc.nextFloat();
				System.out.println("Cuanto mide su segundo lado?");
				float l2 = sc.nextFloat();
				System.out.println("El area del rectangulo es igual a: " + (l1*l2));
				break;
			}
			else if(a.equals("t")){
				System.out.println("Cuanto mide su base?");
				float l1 = sc.nextFloat();
				System.out.println("Cuanto mide su altura?");
				float l2 = sc.nextFloat();
				System.out.println("El area del triangulo es igual a: " + (l1*l2)/2);
				break;
			}
			else if(a.equals("c")){
				System.out.println("Cuanto mide su radio?");
				float l1 = sc.nextFloat();
				System.out.println("El area del triangulo es igual a: " + Math.pow(l1,2)*(3.141592));
				break;
			}
			else if(a.equals("salir")){
				System.out.println("bye bye~");
				break;
			}
			else{
				System.out.println("Esa no fue una de las opciones!!!");
			}
		}
	}
}