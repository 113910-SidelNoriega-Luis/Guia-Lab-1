import java.util.Scanner;
public class Ej_3 {
    /*3. Hacer un programa que ingrese los datos de una factura en la cual haya tres
    artículos vendidos. De cada artículo ingresar el precio unitario y la cantidad.
    Finalmente imprimir el total de la factura*/
    public void Factura(){

        Scanner s= new Scanner(System.in);

        double[] precios = new double[3];
        int[] cantidades = new int[3];
        double total = 0;

        // Ingreso de datos de los tres artículos
        for (int i = 0; i < 3; i++) {
            System.out.printf("Ingrese el precio del artículo %d: ", i + 1);
            precios[i] = s.nextDouble();
            System.out.printf("Ingrese la cantidad del artículo %d: ", i + 1);
            cantidades[i] = s.nextInt();
            total += precios[i] * cantidades[i];
        }

        // Impresión del total
        System.out.printf("El total de la factura es: $%.2f%n", total);
    }

    }

