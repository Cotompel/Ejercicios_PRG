package EjerciciosBasicosEjemplo;

/* Programa que lee dos números enteros tipo int y muestra la suma, resta, multiplicación
    división, resto de la división, incremento y decremento unario.
*/

import java.util.Scanner;

public class Opera {
    public static void main(String[] args) {

        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número ");
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo número ");
        num2 = sc.nextInt();

        System.out.println("El resultado de " + num1 + " + " + num2 + " es -> " + (num1 + num2));
        System.out.println("El resultado de " + num1 + " - " + num2 + " es -> " + (num1 - num2));
        System.out.println("El resultado de " + num1 + " * " + num2 + " es -> " + (num1 * num2));
        System.out.println("El resultado de " + num1 + " / " + num2 + " es -> " + (num1 / num2));
        System.out.println("El resultado del resto de " + num1 + " / " + num2 + " es -> " + (num1 % num2));
        System.out.println("El incremento de " + num1 + " y " + num2 + " es -> " + ++num1 + " y " + ++num2);
        System.out.println("El decremento de " + num1 + " y " + num2 + " es -> " + --num1 + " y " + --num2);


    }

}
