import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Journals {
    public static void main(String[] args) throws IOException  {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] K = bf.readLine().split("");
        int count = 0;
        for (int i = 0; i < K.length; i++) {
            if (i%2==0) {
                if (!K[0].equals(K[i])) {
                    count+=1;
                }
            }
        }
        System.out.println((count/2)+(count%2));
    }
}
