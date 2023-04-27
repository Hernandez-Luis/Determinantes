import java.util.Scanner;
public class OpMain {
    public void op(){
        double a,b,c,d,e,f;
        double v1,v2,v3,v4;
        Scanner scanner = new  Scanner(System.in);
        Operaciones operaciones = new Operaciones();
        int x=0;

        while (x!=2){
            System.out.println("a + b = c");
            System.out.println("Ingresa el valor de a: ");
            a= scanner.nextDouble();
            System.out.println("Ingresa un valor para b: ");
            b = scanner.nextDouble();
            System.out.println("Ingresa un valor para c: ");
            c = scanner.nextDouble();

            System.out.println("d + e = f");
            System.out.println("Ingresa el valor de d: ");
            d= scanner.nextDouble();
            System.out.println("Ingresa un valor para e: ");
            e = scanner.nextDouble();
            System.out.println("Ingresa un valor para f: ");
            f = scanner.nextDouble();

            v1 = operaciones.v1(c,e,f,b);
            v2 = operaciones.v2(a,e,d,b);
            System.out.println("Valor de X = " + v1/v2);
            v3 = operaciones.v3(a,f,d,c);
            v4 = operaciones.v4(a,e,d,b);
            System.out.println("Valor de Y = " + v3/v4);

            System.out.println("¿Quieres ingresar otro problema? Si(1) No(2)");
            x = scanner.nextInt();
        }
    }
}
