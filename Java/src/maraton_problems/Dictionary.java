package maraton_problems;
import java.util.Scanner;
public class Dictionary {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String[] left = "qwertasdfgzxcvb".split("");
        
        String word = sc.nextLine().toLowerCase();
        int pir=0;
        String cant= "";
        
        
        for (int i = 0; i < word.length(); i++) {
            String letra = word.split("")[i];
            for (int j = 0; j < left.length; j++) {
                if (letra.equals(left[j])) {
                    pir=1;
                }
            }
            
            if (pir==1) {
                cant+="1";
            } else {
                cant+="0";
            }
            
            pir=0;
        }
        
        left = cant.split("");
        int n=0;
        
        for (int i = 0; i < left.length-1; i++) {
            if (left[i].equals(left[i+1])) {
                n++;
            }
        }
        
        if (n==0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
