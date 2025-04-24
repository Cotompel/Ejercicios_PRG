package EjerciciosBasicosEjemplo;

import java.util.Scanner;

public class Rectangulo {

    public static void main(String[] args) {

        int base, altura, area, perimetro;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la longitud de la base: ");
        base = sc.nextInt();
        System.out.println("Introduce la longitud de la altura: ");
        altura = sc.nextInt();

        area = (base * altura);
        perimetro = ((base * 2) + (altura*2));

        System.out.println("El area del rectangulo es -> " + area+"\n" + "Su perímetro es -> " + perimetro);

    }

}
