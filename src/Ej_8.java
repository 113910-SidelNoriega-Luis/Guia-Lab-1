import java.util.Scanner;
public class Ej_8 {
    int num;
    int suma;
    double promedio;

    public void Op(){
        Scanner s= new Scanner(System.in);

        for(int i=0;i<10;i++){
            num=s.nextInt();
            suma+=num;
        }
        System.out.println(suma);
        System.out.println(promedio=suma/10);
    }
}
