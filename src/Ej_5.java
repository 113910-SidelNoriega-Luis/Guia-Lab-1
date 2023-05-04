import java.util.Scanner;
public class Ej_5 {
    /*Ingresar la cantidad de horas trabajadas ahi va, graciaspor un empleado y el sueldo que
    cobra por hora. Indique el total a cobrar teniendo en cuenta que si trabajó más
    de 180 horas las excedentes las cobra con un 50 % de aumento.*/

    int hora;
    float sueldo;
    float total;

    public void hrt(){
         Scanner s= new Scanner(System.in);

         hora= s.nextInt();

         sueldo= s.nextInt();

         if (hora<180){
             total= hora*sueldo;
             System.out.println("Sueldo total: "+ total);
         } else{
             total= (float) (sueldo*180+(((hora-180)*sueldo)*0.5));
             System.out.println("Sueldo total: "+ total);
         }
    }
}
