import java.util.Scanner;
public class Ej_10 {
    /*10.Ingresar un número y validar que sea positivo. Si no lo es continuar
    solicitándolo al usuario hasta que ingrese un número correcto.*/
    int n;
    public void Op(){
        Scanner s= new Scanner(System.in);

        do {
            n=s.nextInt();
        }while (n<0);
        System.out.println("OK");

    }
}
