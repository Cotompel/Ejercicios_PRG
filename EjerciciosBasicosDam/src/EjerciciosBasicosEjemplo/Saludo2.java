package EjerciciosBasicosEjemplo;

import java.util.Scanner;

public class Saludo2 {
    public static void main(String[] args) {

        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre: ");
        nombre = sc.nextLine();

        System.out.println("Buenos dias.\nSr/a " + nombre +"\nQue tengas un buen dia");


    }

}
