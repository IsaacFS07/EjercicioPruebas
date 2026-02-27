package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args){

        int res, precioBase, descuento;
        Scanner leer=new Scanner(System.in);

        System.out.println("Dame el precio inicial");
        precioBase=leer.nextInt();
        System.out.println("Dame el descuento");
        descuento=leer.nextInt();

        try {
             res = calcularPrecioFinal(precioBase, descuento);
            System.out.println("El precio final es: "+ res);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR FATAL: "+ e);
        }


    }

    public static int calcularPrecioFinal(int precioBase, int descuento) {

        if (precioBase < 0) {
            throw new IllegalArgumentException("Precio invalido");
        }
        if (descuento < 0 || descuento > 100) {
            throw new IllegalArgumentException("Descuento invalido");
        }
        return precioBase - (precioBase * descuento / 100);
    }


    public static int maximo(int[] datos) {
        if (datos.length == 0) {
            throw new IllegalArgumentException("Array vacío");
        }

        int max = datos[0];
        for (int i = 1; i < datos.length; i++) {
            if (datos[i] > max) {
                max = datos[i];
            }
        }
        return max;
    }




}

