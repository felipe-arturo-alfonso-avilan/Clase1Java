package Clase1Ejs;

import java.util.Scanner;

public class NumerosNaturales {
    private static int charCount(String s, char c){
        int counter =0;
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i)==c){
                counter++;
            }
        }
        return counter;
    }

    public static boolean cumpleCOndicion(int i, int m, int d){
        //Convierto a string
        String s = Integer.toString(i);
        char c = (char)(d+48);  //Se convierte de caracter a numero, 48 es el codigo ascii del 0
        return charCount(s,c)==m;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese n: ");
        int n = scanner.nextInt();

        System.out.println("Ingrese m: ");
        int m = scanner.nextInt();

        System.out.println("Ingrese d: ");
        int d = scanner.nextInt();

        int i=1;
        int counter=0;

        while(counter<n){
            if(cumpleCOndicion(i,m,d)){
                System.out.println(i);
                counter++;
            }
            i++;
        }
    }
}
