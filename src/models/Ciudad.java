// Esta clase es para el Ejercicio 6

package models;

public class Ciudad {

    // Atributo
    private double[][] temperaturas;

    // Constructor
    public Ciudad(double[][] temperaturas) {

        this.temperaturas = temperaturas;
    }

    // Getter
    public double[][] getTemperaturas() {

        return temperaturas;
    }

    // Métodos

    // 'esteli.getTemperaturas().length' retorna el número de filas
    // 'esteli.getTemperaturas()[0].length' retorna el número de columnas'

    public void promedioTemperaturas(){

        for(int i = 0; i < temperaturas.length; i++){

            double promedio = 0;
            for(int j = 0; j < temperaturas[0].length; j++){

                promedio += temperaturas[i][j];
            }

            System.out.println("Promedio de la semana " + (i + 1) + " :" + promedio/7);
        }
    }

    public double temperaturaMaxima(){

        // Al inicio, 'tempMAX' será el primer elemento de la matriz
        // El valor de 'tempMAX' cambiará dependiendo de los valores de la matriz
        double tempMAX = temperaturas[0][0];
        for(int i = 0; i < temperaturas.length; i++){

            for(int j = 0; j < temperaturas[0].length; j++){

                if(temperaturas[i][j] > tempMAX){

                    tempMAX = temperaturas[i][j];
                }
            }
        }

        return tempMAX;
    }

    public void temperaturaMinimaSemanal(){

        for(int i = 0; i < temperaturas.length; i++){

            // Similar con 'tempMAX', aquí se hace lo mismo con 'tempMIN'
            // Sin embargo, nos piden el día más frío por semana
            // Por lo tanto, por cada ciclo en este 'for', el valor inicial de 'tempMIN' va a ser igual al primer elemento de cada fila de la matriz
            double tempMIN = temperaturas[i][0];
            for(int j = 0; j < temperaturas[0].length; j++){

                if(temperaturas[i][j] < tempMIN){

                    tempMIN = temperaturas[i][j];
                }
            }

            // Aquí se imprime el día más frío de una semana en específico
            System.out.println("Temperatura más baja de la semana " + (i + 1) + " :" + tempMIN + "°C");
        }

    }
}
