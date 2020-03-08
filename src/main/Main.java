package main;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Selecciona una opcion");
        System.out.println("");
        System.out.println("1. Desayuna: $4000");
        System.out.println("2. Almuerzo: $10000");
        System.out.println("3. cena: $8000");

        int opcion = teclado.nextInt();

        if(opcion == 1){
            System.out.println("Paga $4000 por el desayuno.");

        }else if(opcion == 2){
            System.out.println("Paga $10000 por el almuerzo.");

        }else if(opcion == 3){
            System.out.println("Paga $8000 por la cena.");

        }else{
            System.out.println("Opcion incorrecta.");
        }


        switch (opcion){

            case 1:
                System.out.println("Paga $4000 por el desayuno.");
            break;

            case 2:
                System.out.println("Paga $10000 por el almuerzo.");
            break;

            case 3:
                System.out.println("Paga $8000 por la cena.");
            break;

                default:
                    System.out.println("Opcion incorrecta.");
                break;




        }


        System.out.println("Ingresa tu edad");
        int edad = teclado.nextInt();

        if (edad >= 0 && edad<= 3 ){
            System.out.println("Es un bebe");

        }else if (edad >= 4 && edad<= 7 ){

            System.out.println("Es un niño");

        }else if (edad >= 8 && edad<= 14 ){

            System.out.println("Es un adolescente");

        }else if (edad >= 15 && edad<= 20 ){

            System.out.println("Es un joven");

        }else if (edad >= 21 && edad<= 40 ){

            System.out.println("Es un adulto");

        }else if (edad >= 41){

            System.out.println("Es un anciano");

        }else {

            System.out.println("edad incorrecta");

        }





    }
}

