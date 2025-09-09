package run;

import java.util.Scanner;
import models.Ciudad;

/*6. Matriz de Temperaturas
Objetivo: Clase Ciudad con una matriz de temperaturas (7x4 para 7 días y 4 semanas). Métodos:
•    Promedio semanal.
•    Temperatura máxima del mes.
•    Día más frío (día y semana).*/

public class Ejercicio6 {

    // Función main
    public static void main(String[] args) {

        Ciudad esteli = new Ciudad(new double[4][7]);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese las temperaturas de las respectivas semanas (en Celsius)");

        // 'esteli.getTemperaturas().length' retorna el número de filas
        // 'esteli.getTemperaturas()[0].length' retorna el número de columnas'

        for (int i = 0; i < esteli.getTemperaturas().length; i++) {

            System.out.println("\nSemana " + (i + 1));
            for (int j = 0; j < esteli.getTemperaturas()[0].length; j++) {

                System.out.println("Día " + (j + 1));

                double temp = entrada.nextDouble();

                esteli.getTemperaturas()[i][j] = temp;
            }
        }

        esteli.promedioTemperaturas();
        System.out.println("\nTemperatura más alta: " + esteli.temperaturaMaxima() + " °C\n");
        esteli.temperaturaMinimaSemanal();
    }
}
