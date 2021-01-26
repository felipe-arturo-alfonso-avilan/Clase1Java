package Clase1Ejs;

import java.util.Scanner;

class NumerosPares{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int a = scanner.nextInt();

        System.out.println("Los números pares de 1 hasta "+ a+ " Son:\n");
        int i = 1;
        while (i<=a){
            if (i%2==0){
                System.out.println(i);
                i++;
            }else {
                i++;
            }
        }
    }
}