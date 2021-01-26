package Clase1Ejs;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int a = scanner.nextInt();
        int i;
        int counter=0;

        for(i = 1; i <= a; i++){
            if((a % i) == 0){
                counter++;
            }
        }

        if(counter <= 2){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }
}
