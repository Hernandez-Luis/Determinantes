import java.util.Scanner;

public class Llenar {
    public double [][] ingresa(Scanner scanner,double [][] matriz) {
        int cont = 0;
        for (int i = 0; i < 2; i++) {
            cont = 0;
            for (int j = 0; j < 3; j++) {
                if (i == 0) {
                    System.out.println("Ingresa los datos" + (cont + 1) + ":");
                    matriz[i][j] = scanner.nextDouble();
                } else {
                    System.out.println("ingresa y" + (cont + 1) + ":");
                    matriz[i][j] = scanner.nextDouble();
                }
                cont++;
            }
            System.out.println();
        }
        return matriz;
    }
}
