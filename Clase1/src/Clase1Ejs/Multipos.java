package Clase1Ejs;

import java.util.Scanner;

public class Multipos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero n: ");
        int n = scanner.nextInt();
        System.out.println("Ingresa otro numero m:");
        int m = scanner.nextInt();

        System.out.println("Los n multiplos de "+m+" son: \n");
        int i;
        for (i = 1; i <= n; i++) {

            if (i % m == 0) System.out.println(i);

        }
    }
}
