package Clase1Ejs;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int a = scanner.nextInt();

        int i;
        for (int j=1; j<=a; j++){
            int counter=0;
            for(i = 1; i <= j; i++){
                if((j % i) == 0){
                    counter++;
                }
            }
            if(counter <= 2){
                System.out.println(j);
            }
        }

    }
}
