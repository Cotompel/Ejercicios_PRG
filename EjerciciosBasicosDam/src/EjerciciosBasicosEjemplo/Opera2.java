package EjerciciosBasicosEjemplo;

import java.util.Scanner;

public class Opera2 {

    public static void main(String[] args) {

        float num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número ");
        num1 = sc.nextFloat();
        System.out.println("Introduce el segundo número ");
        num2 = sc.nextFloat();

        System.out.println("El resultado de " + num1 + " + " + num2 + " es -> " + (num1 + num2));
        System.out.println("El resultado de " + num1 + " - " + num2 + " es -> " + (num1 - num2));
        System.out.println("El resultado de " + num1 + " * " + num2 + " es -> " + (num1 * num2));
        System.out.println("El resultado de " + num1 + " / " + num2 + " es -> " + (num1 / num2));
        System.out.println("El resultado del resto de " + num1 + " / " + num2 + " es -> " + (num1 % num2));
        System.out.println("El incremento de " + num1 + " y " + num2 + " es -> " + ++num1 + " y " + ++num2);
        System.out.println("El decremento de " + num1 + " y " + num2 + " es -> " + --num1 + " y " + --num2);

        sc.close();
    }

}
