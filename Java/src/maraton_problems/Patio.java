import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patio {
    public static void main(String[] args) throws IOException  {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(bf.readLine());
        String[] Symbol = bf.readLine().split("");
        int Num = 0;
        
        for (int i = 1; i <= N; i++) {
            if (Symbol[i-1].equals("O")) {
                Num = -(Num-i); 
            }
        }
        
        System.out.println(Num);
        
        if (Num!=0) {
            int Dato = (N%3);
            Dato = 3-Dato;
            if (Dato>Num-1) {
                System.out.println("2");
            } else {
                System.out.println("1");
            }
        }
    }
}
