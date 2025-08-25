package CalculadoraPOO;

import java.util.ArrayList;

public class Historico {
    private ArrayList<String> registros;

    public Historico() {
        registros = new ArrayList<>();
    }

    public void adicionar(String operacao) {
        registros.add(operacao);
    }

    public void exibir() {
        System.out.println("\n=== HISTÓRICO ===");
        if (registros.isEmpty()) {
            System.out.println("Nenhuma operação realizada ainda.");
        } else {
            for (String registro : registros) {
                System.out.println(registro);
            }
        }
    }
}

