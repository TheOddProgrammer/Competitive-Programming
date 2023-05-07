import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Shamans {
    public static void main(String[] args) throws IOException  {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] K = bf.readLine().split(" ");
        
        String[][] cc = new String[Integer.parseInt(K[0])][Integer.parseInt(K[1])];
        
        for (int i = 0; i < cc.length; i++) {
            for (int j = 0; j < cc[0].length; j++) {
                cc[i][j] = bf.readLine();
            }
        }
    }
}
