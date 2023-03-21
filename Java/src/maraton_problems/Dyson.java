package maraton_problems;
import java.util.*;
public class Dyson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner number = new Scanner(System.in);
        
        int numeroEstrellas = input.nextInt();//Tomar la Cantidad de Estrellas  
        int Total=0; //Total de Estrellas
        String[] Coordenadas; //Se almacenan las Coordenadas
        int TotalY = 0;
        
        if (numeroEstrellas>=4) {
            
            for (int i = 0; i < numeroEstrellas; i++) {
                Coordenadas = number.nextLine().split(" ");
                Total+= Math.abs(Integer.parseInt(Coordenadas[0]))+Math.abs(Integer.parseInt(Coordenadas[1]));
            }
            Total+=numeroEstrellas;
            
        } else if (numeroEstrellas>1 && numeroEstrellas<=3) {
            
            for (int i = 0; i < numeroEstrellas; i++) {
                Coordenadas = number.nextLine().split(" ");
                if (Integer.parseInt(Coordenadas[1])>TotalY) {
                    TotalY= -TotalY + Integer.parseInt(Coordenadas[1]);
                } 
                Total= (numeroEstrellas*3) + Math.abs(TotalY) + 1;
            }
            
        } else if(numeroEstrellas==1) {
            Total = 4;
        }
        
        System.out.println("Total is: "+Total);
    }
}
