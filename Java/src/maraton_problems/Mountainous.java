package maraton_problems;
import java.util.Scanner;
public class Mountainous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int[] ns = new int[size];
        int cont = 0;
        
        for (int i = 0; i < size; i++) {
            ns[i] = sc.nextInt();
        }
        
        int supra=0;
        
        for (int i = 0; i < size; i++) {
            if (i>1 & i<(size-1)) {
                if (ns[i]>ns[i+1] & ns[i]>ns[i-1]) {
                    cont++;
                    if (i>2 & i<(size-2)) {
                        if (ns[i+1]>ns[i+2] & ns[i-1]>ns[i-2]) {
                            cont++;
                        }
                    }
                }
            }
            
            if (cont>supra) {
                supra=cont;
            }
            
            if (supra==0) {
                supra=-1;
            } else {
                supra = (supra*2)+1;
            }
        }
        
        System.out.println(cont);
    }
}
