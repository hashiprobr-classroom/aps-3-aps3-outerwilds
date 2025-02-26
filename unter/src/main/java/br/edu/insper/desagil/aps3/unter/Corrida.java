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
}
