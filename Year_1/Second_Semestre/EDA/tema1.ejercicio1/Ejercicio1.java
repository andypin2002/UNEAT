package edai.tema1.ejercicio1;
import java.util.ArrayList;
public class Ejercicio1 {
    public static String removeEs(String text){
        String a = text;
        ArrayList<String> sentence = new ArrayList<String>();

        for(int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != 'E' && a.charAt(i) != 'e') {
                String l = "" + a.charAt(i);
                sentence.add(l);
            }
        }
        String res = String.join("", sentence);
        return res;
    }
}