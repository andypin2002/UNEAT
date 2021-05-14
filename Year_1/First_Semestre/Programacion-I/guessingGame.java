import java.util.Scanner;
import java.lang.Math;
public class guessingGame{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Intente adivinar un numero del 0 al 100");
		int x, g, c;
		c = 1;
		x = (int) (Math.random()*(100+1));
		while(true){
			System.out.print("Numero: ");
			g = sc.nextInt();
			if(g==x){
				System.out.println("WOW! Lo lograste");
				System.out.print("Te tomo "+ c + " intento");
				if(c > 1){
					System.out.print("s.");
				}else if(c == 1){ System.out.print("."); }
				break;
			} else if(g<x){
				System.out.println("Lo siento, el numero secreto es mas grande... ");
			} else {
				System.out.println("Lo siento, el numero secreto es mas chiquito...");
			}
			c = c + 1;
		}
	}
}