package org.example.Strategy;

public class PromedioSimple implements CalculoNota{

    @Override
    public double calcularNota(java.util.List<Integer> notas) {
        if (notas == null || notas.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }
}
