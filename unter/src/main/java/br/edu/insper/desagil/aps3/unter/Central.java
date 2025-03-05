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

            if (p.getCpf().equals(cpf) && corrida.getNotaPassageiro() != 0) {
                soma += corrida.getNotaPassageiro();
                total++;
            }
        }

        if (total > 0) {
            return soma / total;
        } else {
            return 0.0;
        }


    }

    public double mediaMotorista(String cpf) {
        double soma = 0.0;
        int total = 0; // Quantidade de corridas que o passageiro em questão fez

        for (Corrida corrida : corridas) {
            Motorista m = corrida.getMotorista();

            if (m != null && m.getCpf().equals(cpf) && corrida.getNotaMotorista() != 0) {
                soma += corrida.getNotaMotorista();
                total++;
            }
        }

        if (total > 0) {
            return soma / total;
        } else {
            return 0.0;
        }

    }
}
