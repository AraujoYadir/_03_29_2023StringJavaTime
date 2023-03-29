package com.edima.presentacion;

public class ProbarEstructuraIf {

    public static void main(String[] args) {
        //En base a una variable decir si es mayor o menor que 18
        int edad = 15;
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        //Declarar una variable y decir si es un numero positivo o negativo
        //Declarar una variable y decir si es un numero par o impar
        int numero = 0;
        if (numero >= 0) {
            System.out.println("El número es postivo");
        } else {
            System.out.println("El número es negativo");
        }

        int numero2 = 0;
        if (numero2 %2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("Es número es impar");
        }

    }
}
