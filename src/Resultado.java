import java.util.Scanner;

public class Resultado {
    public void solucion(Scanner scanner,double [][] matriz){
        double valor1,valor2;

        System.out.println("Matiriz:");
        System.out.println("\nResultados:");
        valor1=(matriz[0][2]*matriz[1][1])-(matriz[1][2]*matriz[0][1]);
        valor2=(matriz[0][0]*matriz[1][1])-(matriz[1][0]*matriz[0][1]);
        System.out.println("X = " + (valor1/valor2));
        valor1=(matriz[0][0]*matriz[1][2])-(matriz[1][0]*matriz[0][2]);
        valor2=(matriz[0][0]*matriz[1][1])-(matriz[1][0]*matriz[0][1]);
        System.out.println("Y = " + (valor1/valor2));
    }
}
