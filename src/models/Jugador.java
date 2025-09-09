// NOTA: Esta clase es para el Ejercicio 9

package models;

import java.util.Scanner;

public class Jugador {

    Scanner entrada = new Scanner(System.in);

    // Atributos
    private String nombre;
    private String ficha;

    // Constructor
    public Jugador(String nombre, String ficha) {
        this.nombre = nombre;
        this.ficha = ficha;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getFicha() {
        return ficha;
    }

    // Métodos
    public int setFila(){

        int num;

        System.out.println("Ingrese la fila (entre 1 y 3) donde desea insertar su ficha");

        while(true){

            num = entrada.nextInt();

            if (num < 1 || num > 3){

                System.out.println("Ingrese un número entre 1 y 3");
            }
            else{

                return num;
            }
        }
    }

    public int setColumna(){

        int num;

        System.out.println("Ingrese la columna (entre 1 y 3) donde desea insertar su ficha");

        while(true){

            num = entrada.nextInt();

            if (num < 1 || num > 3){

                System.out.println("Ingrese un número entre 1 y 3");
            }
            else{

                return num;
            }
        }
    }
}
