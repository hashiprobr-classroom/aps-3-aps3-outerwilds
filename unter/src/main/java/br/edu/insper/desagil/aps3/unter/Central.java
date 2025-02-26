package br.edu.insper.desagil.aps3.unter;

import java.util.ArrayList;
import java.util.List;

public class Central {
    private List<Corrida> corridas;

    public Central() {
        this.corridas = new ArrayList<>();
    }

    public void adiciona(Corrida corrida) {
        corridas.add(corrida);
    }

    public double mediaPassageiro(String cpf) {

        double soma = 0.0;
        int total = 0; // Quantidade de corridas que o passageiro em questão fez

        for (Corrida corrida : corridas) {
            Passageiro p = corrida.getPassageiro();

            if (p.getCpf().equals(cpf)) {
                soma += corrida.getNotaPassageiro();
                total++;
            }
        }
        return soma / total;

    }

    public double mediaMotorista(String cpf) {

    }
}
