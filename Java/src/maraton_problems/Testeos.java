package maraton_problems;
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner text = new Scanner(System.in);
        int M = input.nextInt();
        int N = input.nextInt();
        int[][] tablero = new int[M][N];

        for(int i=0;i<M;i++) {
            for(int j=0;j<N;j++) {
                tablero[i][j] = (int)(Math.random() * (1000+1)); 
            }
        }

        for(int i=0;i<M;i++) { //Quitar
            for(int j=0;j<N;j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }

        int K = input.nextInt();
        String[] Kv = text.nextLine().split("");
        
        for (int l = 1; l <=K; l++) {
            for(int k = 0; k < Kv.length; k++) {
                if (Kv[k].equals("V")) {
                    for (int i = M-1; i>=10; i--) {
                        for (int j = 0; j < N; j++) {
                            tablero[i-M][j] = tablero[i][j];
                        }
                    }
                } else {
                    for (int i = 0; i<M; i++) {
                        for (int j = N-1; j >= N; j--) {
                            tablero[M-i][j] = tablero[i][j];
                        }
                    }
                }
            }
        }
        
        for(int i=0;i<M;i++) { //Quitar
            for(int j=0;j<N;j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
}