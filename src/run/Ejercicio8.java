package run;

import java.util.Scanner;
import models.EstadisticaTexto;

/*8. Estadísticas de Palabras
Objetivo: Clase EstadisticaTexto con un arreglo de Strings (palabras) y métodos para:
•    Contar cuántas palabras hay.
•    Mostrar palabras únicas.
•    Palabra más larga y más corta.*/

public class Ejercicio8 {

    static Scanner entrada = new Scanner(System.in);

    // Función main
    public static void main(String[] args) {

        String textoEntrada;

        System.out.println("Ingrese el texto que desea ingresar");
        textoEntrada = entrada.nextLine();

        // 'textoEntrada.split(" ")' divide el texto ingresado, en elementos individuales, para posteriormente meterlos en un arreglo
        EstadisticaTexto estadisticas = new EstadisticaTexto(textoEntrada, textoEntrada.split(" "));

        // Los métodos pedidos se usan aquí
        System.out.println("\nNúmero de palabras: " + estadisticas.contarPalabras());
        estadisticas.mostrarPalabrasUnicas();
        System.out.println("\nPalabra más larga: " + estadisticas.palabraMasLarga());
        System.out.println("Palabra más corta: " + estadisticas.palabraMasCorta());
    }
}
