package maraton_problems;
import java.util.Scanner;
public class Coffee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cafe = 0;
        
        int cantC = Integer.parseInt(sc.nextLine());
        String cad = sc.nextLine();
        
        String[] cadena = cad.split("");
        
        for (int i = 0; i < cad.length(); i++) {
            
            int num = Integer.parseInt(cadena[i]);
            
            if (num == 0 & cafe==2) {
                cafe--;
            } else if (num==0 & cafe==1) {
                cafe--;
            } else if (num==0 & cafe==0) {
                cantC--;
            } else if (num==1) {
                cafe=2;
            }
        }
        
        System.out.println(cantC);
    }
}
