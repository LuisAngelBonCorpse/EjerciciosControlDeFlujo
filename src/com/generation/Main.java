package com.generation;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	/*
	EJERCICIO 1
	Solicitar al usuario 3 ángulos de un triángulo y determinar si el triángulo es válido
	*/
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Ingresa el primer ángulo del triangulo en grados");
        int a1 = sc.nextInt();
        System.out.println("Ingresa el segundo ángulo del triangulo en grados");
        int a2 = sc.nextInt();
        System.out.println("Ingresa el tercer ángulo del triangulo en grados");
        int a3 = sc.nextInt();

        sc.close();

        if (a1+a2+a3 == 180){
            System.out.println("Este es un triangulo valido.");
        } else {
            System.out.println("Triangulo invalido");
        }
        */

    /*
    EJERCICIO 2
    Pedir un año al usuario por consola, y determinar si el año es bisiesto.
    */
        /*
        System.out.println("Ingresa un año:");
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0)||(year % 100 == 0 && year % 400 == 0)){
            System.out.println("El año " + year +" es un año bisiesto.");
        } else {
            System.out.println("El año "+ year +" no es un año bisiesto.");
        }
        */
    /*
    EJERCICIO 3
    Pedir un número al usuario y dependiendo la respuesta mostrar un dia de la semana,
    ejemplo: 1) Domingo, 2) Lunes ... 7) sábado
    Si elige un número fuera de ese rango mostar un mensaje de error;
    */
        System.out.println("Ingresa un numero del 1 al 7:");
        int opDia = sc.nextInt();
        String dia = "Input invalido";

        switch (opDia) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miércoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                System.out.println("Input invalido.");
                break;
        }
        System.out.println("Seleccionaste el dia: "+ dia +".");
    }
}
