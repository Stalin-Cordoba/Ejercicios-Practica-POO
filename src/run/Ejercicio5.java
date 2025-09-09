package run;

import models.AnalizadorTexto;

import java.util.Scanner;

/*5. Análisis de Texto
Objetivo: Clase AnalizadorTexto que reciba un String y tenga métodos para:
•    Contar palabras.
•    Contar cuántas veces aparece una palabra específica.
•    Reemplazar una palabra por otra.*/

public class Ejercicio5 {

    static Scanner entrada = new Scanner(System.in);

    // Función main
    public static void main(String[] args) {

        boolean confirmarSalir = false;
        String eleccion;

        String textoEntrada;

        System.out.println("Ingrese el texto que desea ingresar");
        while (true) {

            textoEntrada = entrada.nextLine();

            // Se asegura que el texto no está vacío
            if (textoEntrada.isBlank()) {

                System.out.println("Ingrese texto");
            }
            else{

                break;
            }
        }

        // 'textoEntrada.split(" ")' divide el texto ingresado, en elementos individuales, para posteriormente meterlos en un arreglo
        AnalizadorTexto analisis = new AnalizadorTexto(textoEntrada, textoEntrada.split(" "));

        do {

            System.out.println("¿Qué desea hacer con el texto que ingresó?\n");

            System.out.println("1. Contar Palabras");
            System.out.println("2. Contar la cantidad de veces que aparece una palabra específica");
            System.out.println("3. Reemplazar una palabra específica por otra");
            System.out.println("0. Salir");

            eleccion = entrada.nextLine();

            switch (eleccion) {

                case "1":

                    System.out.println("\nN° de palabras: " + analisis.contarPalabras());
                    break;
                case "2":

                    analisis.contarPalabraEspecifica();
                    break;
                case "3":

                    analisis.reemplazarPalabra();
                    break;
                case "0":

                    confirmarSalir = true;
                    break;
                default:

                    System.out.println("Ingrese una opción válida");
                    break;
            }
        } while(!confirmarSalir);
    }
}