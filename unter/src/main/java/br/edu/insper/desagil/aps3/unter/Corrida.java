package br.edu.insper.desagil.aps3.unter;

public class Corrida {
    private Passageiro passageiro;
    private Motorista motorista;
    private int notaPassageiro;
    private int notaMotorista;

    public Corrida(Passageiro passageiro, Motorista motorista) {
        this.passageiro = passageiro;
        this.motorista = motorista;
        this.notaMotorista = 0;
        this.notaPassageiro = 0;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public int getNotaPassageiro() {
        return notaPassageiro;
    }

    public int getNotaMotorista() {
        return notaMotorista;
    }

    private int truncaNota(int nota) {
        if (nota > 5) {
            return 5;
        } else if (nota < 1) {
            return 1;
        } else {
            return nota;
        }
    }

    public void avaliaPassageiro(int nota) {
        notaPassageiro = truncaNota(nota);
    }

    public void avaliaMotorista(int nota) {
        notaMotorista = truncaNota(nota);
    }
}