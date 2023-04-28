import java.util.Scanner;

public class OpMain implements Operaciones {

    public void op(){
        Scanner scanner = new Scanner(System.in);
        
        int filas =2;
        int columnas =3;
        double matriz[][]=new double[filas][columnas];

        matriz = ingresa(scanner,matriz);
        System.out.println("Matiriz:");
        matriz(matriz);
        solucion(scanner,matriz);
    }

    @Override
    public void solucion(Scanner scanner, double[][] matriz) {
        double valor1,valor2;

        System.out.println("\nResultados:");
        valor1=(matriz[0][2]*matriz[1][1])-(matriz[1][2]*matriz[0][1]);
        valor2=(matriz[0][0]*matriz[1][1])-(matriz[1][0]*matriz[0][1]);
        System.out.println("X = " + (valor1/valor2));
        valor1=(matriz[0][0]*matriz[1][2])-(matriz[1][0]*matriz[0][2]);
        valor2=(matriz[0][0]*matriz[1][1])-(matriz[1][0]*matriz[0][1]);
        System.out.println("Y = " + (valor1/valor2));
    }

    @Override
    public void matriz(double[][] matriz) {
        for (double[] doubles : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(doubles[j] + " | ");
            }
            System.out.println();
        }
    }

    @Override
    public double[][] ingresa(Scanner scanner, double[][] matriz) {
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