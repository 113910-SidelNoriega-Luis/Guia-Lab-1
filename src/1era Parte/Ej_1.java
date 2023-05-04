import java.util.Scanner;
public class Ej_1 {

    int a;

    int b;
    public void op(){
        Scanner s=new Scanner(System.in);

        int a=s.nextInt();

        int b= s.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        double con = (float)a / b;
        System.out.println(con);
    }
}
