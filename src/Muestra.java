public class Muestra {
    public void matriz(double [][] matriz){
        for (double[] doubles : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(doubles[j] + " | ");
            }
            System.out.println();
        }
    }
}
