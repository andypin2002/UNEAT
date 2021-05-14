import java.lang.Math;
public class prueba{
  public static void main(String[] args){
    int c = 0;
	int a = 0;
    while(true){
      System.out.println("Te amu <3 (" + a + ")");
      c = (int) Math.random() * 10000000;
	  a++;
      if(c == 1){
        System.out.println("Maybe I dont actually luv u");
        break;
      }
    }
  }
}
