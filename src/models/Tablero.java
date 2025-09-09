// Esta clase es para el Ejercicio 9

package models;

public class Tablero {

    // Atributo
    private String[][] mapa;

    // Constructor
    public Tablero(String[][] mapa) {
        this.mapa = mapa;
    }

    //Métodos
    public void mostrarTablero(){

        System.out.println(" " + mapa[0][0] + " | " + mapa[0][1] + " | " + mapa[0][2] + " ");
        System.out.println("--------");
        System.out.println(" " + mapa[1][0] + " | " + mapa[1][1] + " | " + mapa[1][2] + " ");
        System.out.println("--------");
        System.out.println(" " + mapa[2][0] + " | " + mapa[2][1] + " | " + mapa[2][2] + " ");
    }

    // Esta función es 'booleana' dado que sirve para un bucle 'while' que está en la función 'main' de este ejercicio
    public boolean ingresarFicha(int fila, int columna, String ficha){

        if (mapa[fila - 1][columna - 1].isBlank()){

            mapa[fila - 1][columna - 1] = ficha;
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean tableroLleno(){

        // Verifica si cada espacio del tablero no está vacío. En caso de encontrar uno vacío, retorna 'false'
        for (int i = 0; i < mapa.length; i++) {

            for (int j = 0; j < mapa[0].length; j++) {

                if (mapa[i][j].isBlank()){

                    return false;
                }
            }
        }

        return true;
    }

    public boolean verificarGanador(String ficha){

        // Verifica que las diagonales tengan la misma ficha
        if (mapa[0][0].equals(ficha) && mapa[1][1].equals(ficha) && mapa[2][2].equals(ficha)){

            return true;
        }
        else if (mapa[0][2].equals(ficha) && mapa[1][1].equals(ficha) && mapa[2][0].equals(ficha)){

            return true;
        }

        // Verifica si las filas o columnas tengan la misma ficha
        for (int i = 0; i < mapa.length; i++) {

            // Primero, verifica si hay una fila, donde en cada espacio, hay un sólo tipo de ficha
            if (mapa[i][0].equals(ficha) && mapa[i][1].equals(ficha) && mapa[i][2].equals(ficha)){

                return true;
            }
            // Después, hace lo mismo con las columnas
            else if (mapa[0][i].equals(ficha) && mapa[1][i].equals(ficha) && mapa[2][i].equals(ficha)){

                return true;
            }
        }

        return false;
    }
}
