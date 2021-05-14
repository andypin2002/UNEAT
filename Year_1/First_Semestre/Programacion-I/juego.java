import java.util.Scanner;
import java.lang.Math;
public class juego{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Intenta adivinar un numero del 0 al 100");
		int x, y, c, d, t;
		boolean adi;
		adi = false;
		c = 1;
		x = (int) (Math.random()*(100+1));
		t = (int) (Math.random()*(100)+1);
		System.out.println(x);
		while(c <= 10 && adi == false){
			System.out.print("Numero: ");
			y = sc.nextInt();
			d = Math.abs(x - y);
			if(d <= 10 && d >= 1){
				System.out.println("Caliente!!!");
			} else if(d > 10 && d <= 20){
				System.out.println("Tibio!!");
			} else if(d > 20 && c != 10){
				System.out.println("**Frio**");
			}else if(d == 0){
				adi = true;
				System.out.println("Felicidades! Ganaste.");
			}
			c = c+1;
			if(c > 7){
				if(t < 5){
					System.out.println("Achuu!!! *sniff*");
					x = (int) (Math.random()*(100+1));
				}
			}
		}
		if(c != 11){
			System.out.print("Te tomo "+ (c-1) + " intento");
			if(c > 1){
				System.out.print("s.");
			}else if(c == 1){ System.out.print("."); }
		} else {
			System.out.print("Perdiste :(... intentalo de nuevo.");
		}
		
	}
}