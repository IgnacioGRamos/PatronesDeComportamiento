package org.example.Strategy;

import java.util.List;

public class PromedioPonderado implements CalculoNota{

    @Override
    public double calcularNota(List<Integer> notas) {
        if (notas == null || notas.isEmpty()) {
            return 0;
        }
        double sumaPonderada = 0;
        double sumaPesos = 0;
        for (int i = 0; i < notas.size(); i++) {
            int peso = i + 1; // Peso creciente
            sumaPonderada += notas.get(i) * peso;
            sumaPesos += peso;
        }
        return sumaPonderada / sumaPesos;
    }
}
