package maraton_problems;
import java.util.Scanner;
public class Hill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hmax = 0;
        
        System.out.print("Numero Picos: ");
        int pics = Integer.parseInt(sc.nextLine());
        
        System.out.print("Alturas: ");
        long hs;
        hs = sc.nextLong().split(" ");
        
        for (int i = 0; i < hs.length; i++) {
            int h = Integer.parseInt(hs[i]);
            
            if (h>hmax) {
                hmax = h;
            }
        }
        
        int r = hmax-(Integer.parseInt(hs[0])+Integer.parseInt(hs[hs.length-1]));
        
        System.out.println(r);
    }
}
