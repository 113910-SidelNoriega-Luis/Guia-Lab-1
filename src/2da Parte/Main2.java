import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        int c= s.nextInt();
        Persona[] personas= new Persona[c];

        for (int i=0; i<c;i++ ){
            Persona p=new Persona();
            p.Op();
            personas[i]=p;
        }
        for (int i=0; i<c;i++ ){
            System.out.println(personas[i].nc());
        }
    }
}