// Esta clase es para el Ejercicio 7

package models;

public class Curso {

    // Atributos
    private String[] estudiantes;
    private double[][] evaluaciones;

    // Constructor
    public Curso(String[] estudiantes, double[][] evaluaciones) {
        this.estudiantes = estudiantes;
        this.evaluaciones = evaluaciones;
    }

    // Getters
    public String[] getEstudiantes() {

        return estudiantes;
    }

    public double[][] getEvaluaciones() {

        return evaluaciones;
    }

    // Métodos

    // 'POO.getEstudiantes().length' retorna el número de filas
    // 'POO.getEstudiantes()[0].length' retorna el número de columnas

    public double promedioEstudiante(int indice) {

        double promedio = 0;

        for (int i = 0; i < evaluaciones[0].length; i++) {

            // Por cada fila (dicho número de fila, está dado por el argumento de este función), se suma cada nota
            promedio += evaluaciones[indice][i];
        }

        return promedio / evaluaciones[0].length;
    }

    public void promedioEvaluacion(){

        for (int i = 0; i < evaluaciones[0].length; i++) {

            double promedio = 0;
            for (int j = 0; j < estudiantes.length; j++) {

                promedio += evaluaciones[j][i];
            }

            System.out.println("Promedio de la evaluación N°" + (i + 1) + " :" + promedio / estudiantes.length);
        }
    }

    public double mejorPromedio(){

        double mejorPromedio = promedioEstudiante(0);

        for (int i = 1; i < estudiantes.length; i++) {

            if (promedioEstudiante(i) > mejorPromedio) {

                mejorPromedio = promedioEstudiante(i);
            }
        }

        return mejorPromedio;
    }
}