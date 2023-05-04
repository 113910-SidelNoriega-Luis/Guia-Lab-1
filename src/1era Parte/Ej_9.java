import java.util.Scanner;
public class Ej_9 {
    /*Ingresar un número n y a continuación n números positivos. Informar la
    cantidad de mayores a 5 que se hayan ingresado.*/

    int n;
    int a;
    int d=0;
    public void Op(){
        Scanner s=new Scanner(System.in);
        n=s.nextInt();

        for (int i=0;i<n;i++){
           a=s.nextInt();
           if (a>5){
               d++;
           }
        }
        System.out.println(d);
    }
}
