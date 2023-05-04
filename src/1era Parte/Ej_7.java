import java.util.Scanner;
public class Ej_7 {
    int precio=300;
    int km;
    int km1=200;
    int ad1=5;
    int km2=1000;
    int ad2=10;

    public void kilo(){
       Scanner s= new Scanner(System.in);
       km=s.nextInt();

       if (km<km1){
           System.out.println(precio);
       } else if (km>km1 && km<km2){
           System.out.println(precio+=(ad1*(km-km1)));
       } else if (km>km2){
           System.out.println(precio+=(ad2*(km-km1)));
       }
    }
}
