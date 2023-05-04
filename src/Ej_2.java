import java.util.Scanner;
public class Ej_2 {
    int precio;
    double iva= 0.21;

    public void CalcularIva(){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        precio=s.nextInt();
        System.out.println("El precio con iva es: " + ((float) precio + (precio*iva)));
    }

}
