import java.util.Scanner;
public class Ej_4 {
    /*4. Ingresar nombre y altura de dos personas, informar el nombre de la más alta.*/

    String[] nombre = new String[2];
    double[] altura = new double[2];
    public void alto(){
        Scanner s= new Scanner(System.in);

        for (int i=0;i <2;i++){

            nombre[i]= s.next();
            s.nextLine();
            altura[i]= s.nextDouble();
            s.nextLine();
            if(altura[0]>altura[1]){
                System.out.println("El mas alto es : " +nombre[0]);
            } else{
                System.out.println("El mas alto es : " +nombre[1]);
            }
        }
    }
}
