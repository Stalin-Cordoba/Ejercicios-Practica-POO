package run;

import models.Tablero;
import models.Jugador;
import java.util.Scanner;

/*9. Tablero de Juego (Tic-Tac-Toe)
Objetivo: Clase Tablero que use una matriz 3x3 de caracteres.
•    Métodos para colocar ficha, verificar ganador, y mostrar tablero.
•    Usa una clase Jugador para registrar nombre y ficha (‘X’ o ‘O’).*/

public class Ejercicio9 {

    static Scanner entrada = new Scanner(System.in);

    // Función main
    public static void main(String[] args) {

        // Aquí se crea el tablero
        Tablero elTablero = new Tablero(new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}});
        String nombre;

        System.out.println("Ingrese el nombre del primer jugador");

        while (true) {

            nombre = entrada.nextLine();

            if (nombre.isBlank()){

                System.out.println("Ingrese un nombre");
            }
            else{

                break;
            }
        }

        Jugador Jugador1 = new Jugador(nombre, "X");
        System.out.println("El jugador " + Jugador1.getNombre() + " tendrá como ficha la X");

        System.out.println("Ingrese el nombre del segundo jugador");

        while (true) {

            nombre = entrada.nextLine();

            if (nombre.isBlank()){

                System.out.println("Ingrese un nombre");
            }
            else{

                break;
            }
        }

        Jugador Jugador2 = new Jugador(nombre, "O");
        System.out.println("El jugador " + Jugador1.getNombre() + " tendrá como ficha la O");

        // Texto que indica el inicio del juego
        System.out.println("\nAhora empieza el juego!\n");

        // Este bucle 'while' permite que se desarrolle el juego en sí
        while (true) {

            elTablero.mostrarTablero();
            System.out.println("\nEs el turno de " + Jugador1.getNombre() + " (Ficha: " + Jugador1.getFicha() + ")");

            while (true){

                // Si el valor retornado es 'true', entonces se pasa el turno al siguiente jugador
                if (elTablero.ingresarFicha(Jugador1.setFila(), Jugador1.setColumna(), Jugador1.getFicha())){

                    break;
                }
                else{

                    // Si no lo es, entonces se le pedirá al jugador que ingrese la ficha nuevamente
                    System.out.println("Esa casilla ya está ocupada");
                }
            }

            // Se ejecuta si se encontró una fila, columna o diagonal con un sólo tipo de ficha
            if (elTablero.verificarGanador(Jugador1.getFicha()))
            {
                elTablero.mostrarTablero();
                System.out.println("Se acabó el juego!\n");
                System.out.println(Jugador1.getNombre() + " es el ganador!");
                break; // Se rompe el bucle
            }
            // Se ejecuta si el tablero ya está lleno
            else if (elTablero.tableroLleno()){

                elTablero.mostrarTablero();
                System.out.println("Se acabó el juego!\n");
                System.out.println("El juego quedó en empate...");
                break; // Se rompe el bucle
            }

            elTablero.mostrarTablero();
            System.out.println("\nEs el turno de " + Jugador2.getNombre() + " (Ficha: " + Jugador2.getFicha() + ")");

            while (true){

                // Si el valor retornado es 'true', entonces se pasa el turno al siguiente jugador
                if (elTablero.ingresarFicha(Jugador2.setFila(), Jugador2.setColumna(), Jugador2.getFicha())){

                    break;
                }
                else{

                    // Si no lo es, entonces se le pedirá al jugador que ingrese la ficha nuevamente
                    System.out.println("Esa casilla ya está ocupada");
                }
            }

            // Se ejecuta si se encontró una fila, columna o diagonal con un sólo tipo de ficha
            if (elTablero.verificarGanador(Jugador2.getFicha()))
            {
                elTablero.mostrarTablero();
                System.out.println("Se acabó el juego!\n");
                System.out.println(Jugador2.getNombre() + " es el ganador!");
                break; // Se rompe el bucle
            }
            // Se ejecuta si el tablero ya está lleno
            else if (elTablero.tableroLleno()){

                elTablero.mostrarTablero();
                System.out.println("Se acabó el juego!\n");
                System.out.println("El juego quedó en empate...");
                break; // Se rompe el bucle
            }
        }

        System.out.println("\nPara volver a jugar, ejecute de nuevo el programa :D");
    }
}
