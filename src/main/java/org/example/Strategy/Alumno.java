package org.example.Strategy;

import java.util.List;

public class Alumno {

    CalculoNota notas;

    public Alumno(CalculoNota notas) {
        this.notas = notas;
    }

    public void setNotas(CalculoNota notas) {
        this.notas = notas;
    }

    public double calcularNota(List<Integer> notas) {
        return this.notas.calcularNota(notas);
    }
}
