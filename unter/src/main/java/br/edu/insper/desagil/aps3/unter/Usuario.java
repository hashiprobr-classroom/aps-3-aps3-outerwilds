package br.edu.insper.desagil.aps3.unter;

public abstract class Usuario {
    private String cpf;
    private String nome;

    public Usuario(String cpf, String nome) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void avalia(Corrida corrida, int nota);
}
