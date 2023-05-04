import java.util.Scanner;
public class Ej_6 {
    int anio;
    public void bis(){
        Scanner s=new Scanner(System.in);
        anio=s.nextInt();
        if (anio % 100 != 0 && (anio % 4 == 0 || anio%400==0)) {
            System.out.println("Bisiesto");
        }else {
            System.out.println("no Bisiesto");

        }
    }
}
