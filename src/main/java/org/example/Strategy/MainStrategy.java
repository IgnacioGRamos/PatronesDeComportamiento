package org.example.Strategy;

import java.util.ArrayList;
import java.util.List;

public class MainStrategy {

    public static void main(String[] args) {

        List<Integer>  notas = new ArrayList<>();

        notas.add(5);
        notas.add(7);
        notas.add(9);
        notas.add(6);

        Alumno alumno = new Alumno(new PromedioSimple());
        double notaFinalSimple = alumno.calcularNota(notas);
        System.out.println("Nota final (Promedio Simple): " + notaFinalSimple);

        alumno.setNotas(new PromedioPonderado());
        double notaFinalPonderado = alumno.calcularNota(notas);
        System.out.println("Nota final (Promedio Ponderado): " + notaFinalPonderado);
    }
}
