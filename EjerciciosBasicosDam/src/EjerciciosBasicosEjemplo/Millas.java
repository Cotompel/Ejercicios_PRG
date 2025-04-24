package EjerciciosBasicosEjemplo;

import java.util.Scanner;

public class Millas {
    public static void main(String[] args) {

        double millas, metros;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las millas a transformar en metros: ");
        millas = sc.nextDouble();
        metros = millas * 1609.34;
        System.out.println();
       // System.out.println(millas + " millas son " + metros + " metros" + " o sea, " + Math.round(metros/1000) + " kilometros");
        System.out.printf("%.2f millas son %.2f metros, o sea %d kilometros\n", millas, metros, Math.round(metros/1000));

    }

}
