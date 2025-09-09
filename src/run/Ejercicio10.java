package run;

import java.util.Scanner;
import models.Cadena;

/*10. Gestor de Cadenas
Objetivo: Clase Cadena que contenga una cadena de texto. Métodos para:
•    Convertir a mayúsculas/minúsculas.
•    Invertir cadena.
•    Verificar si es palíndromo.
•    Contar vocales y consonantes.*/

public class Ejercicio10 {

    // Función main
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String miPalabra;

        System.out.println("Ingrese una palabra");

        while(true){

            miPalabra = entrada.nextLine();

            if (miPalabra.isBlank()){

                System.out.println("Ingrese una palabra correctamente");
            }
            else if (miPalabra.split(" ").length >= 2){

                System.out.println("Usted ingresó una oración, no una palabra");
            }
            else{

                break;
            }
        }

        Cadena miCadena = new Cadena(miPalabra);

        System.out.println("Palabra en mayúscula: " + miCadena.palabraMayuscula());
        System.out.println("Palabra en minúscula: " + miCadena.palabraMinuscula());
        System.out.println("Palabra invertida: " + miCadena.palabraInvertida());
        miCadena.esPalindromo();
        System.out.println("Número de vocales: " + miCadena.numeroVocales());
        System.out.println("Número de consonantes: " + miCadena.numeroConsonantes());
    }
}
