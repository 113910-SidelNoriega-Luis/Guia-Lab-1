import java.util.Scanner;
public class Ej_11 {
    /*11.Ingresar el tiempo en segundos que realizó el ganador de la clasificación de
         una carrera de F1. Luego ingresar los tiempos de los otros 9 corredores e
         informar cuántos disputarán la carrera. Para que un corredor pueda participar
         su tiempo de clasificación no puede superar en 15 % al del ganador.*/

    int t1,t2,p;

    public void Op(){
        Scanner s= new Scanner(System.in);
         t1 = s.nextInt();

         for (int n=0;n<9;n++) {
             t2 = s.nextInt();
             if (t2 <= t1 * 1.15) {
                 p++;
             }
         }
         System.out.println(p);
    }
}
