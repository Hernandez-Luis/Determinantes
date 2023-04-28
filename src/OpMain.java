import java.util.Scanner;

public class OpMain {

    public void op(){
        Scanner scanner = new Scanner(System.in);
        Llenar llenar = new Llenar();
        Resultado resultado = new Resultado();

        int filas =2;
        int columnas =3;
        double mattriz[][]=new double[filas][columnas];

        mattriz = llenar.ingresa(scanner,mattriz);
        resultado.solucion(scanner,mattriz);
    }
}