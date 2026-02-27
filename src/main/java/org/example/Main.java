package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args){




    }

    public static int calcularPrecioFinal(int precioBase, int descuento) {
        if (descuento < 0 || descuento > 100) {
            throw new IllegalArgumentException("Descuento inválido");
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

