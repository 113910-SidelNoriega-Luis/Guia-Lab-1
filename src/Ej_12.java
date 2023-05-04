import java.util.Scanner;
public class Ej_12 {
    /*Desarrollar un programa que permita ingresar la antigüedad los autos de una
      concesionaria de usados. Finalizar la carga cuando se ingrese 0. Por cada
      auto ingresado mostrar por pantalla un mensaje adecuado con el siguiente
      criterio: si el auto tiene entre 1 y 5 años mostrar el texto “NUEVO”, si tiene
      entre 6 y 10 mostrar “POCO USO”, si tiene entre 11 y 20 “MUCHO USO” y si
      tiene más de 20 “MUY ANTIGUO”.
      Luego de finalizada la carga calcular y mostrar los siguientes resultados:
      • Cantidad total de autos.
      • Cantidad de autos con poco uso.
      • Promedio de antigüedad de los autos que no sean muy antiguos.*/
    int ant;
    int A;
    int Q;
    int W;
    int E;
    public void Op(){
        Scanner s=new Scanner(System.in);
        ant = s.nextInt();
        while (ant!=0) {
            if (ant>0 && ant<6) {
                System.out.println("Nuevo");
                W++;
                E+=ant;
            } else if (ant>5 && ant<11) {
                System.out.println("Poco Uso");
                Q++;
                W++;
                E+=ant;
            }else if (ant>10 && ant<21) {
                System.out.println("MUCHO USO");
                W++;
                E+=ant;
            }else if (ant>20) {
                System.out.println("Muy Antiguo");
            }
            A++;
            ant = s.nextInt();
        }
        System.out.println(A);
        System.out.println(Q);
        System.out.println(E/W);
    }
}
