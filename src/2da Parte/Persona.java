import java.util.Scanner;
public class Persona {

    /*1. Programar una clase Persona con atributos suficientes para almacenar
         nombre, apellido y edad de una persona. Crear un programa que permita
         ingresar los datos de algunas personas por teclado y con esos datos cree
         instancias y muestre por pantalla el estado de las mismas.*/

    String n,p;
    int edad;

    public Persona(String n, String p, int edad) {
        this.n = n;
        this.p = p;
        this.edad = edad;
    }
    public Persona() {
        this.n = " ";
        this.p = " ";
        this.edad = 0;
    }

    public String getN() {
        return n;
    }

    public String getP() {
        return p;
    }

    public int getEdad() {
        return edad;
    }

    public void setN(String n) {
        this.n = n;
    }

    public void setP(String p) {
        this.p = p;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void Op(){
        Scanner s= new Scanner(System.in);
        n= s.next();
        s.nextLine();
        p = s.next();
        s.nextLine();
        edad= s.nextInt();
    }
    public String nc(){
        return "Nombre: " + n +"\nApellido: "+ p+ "\nEdad:" + edad;
    }

}
