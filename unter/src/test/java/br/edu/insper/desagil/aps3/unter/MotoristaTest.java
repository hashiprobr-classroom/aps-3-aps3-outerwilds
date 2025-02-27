package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotoristaTest {

    Motorista m;

    @BeforeEach
    void setUp() {
        m = new Motorista("222.222.222-22", "Vitor");
    }

    @Test
    void constroi() {
        assertEquals("222.222.222-22", m.getCpf());
        assertEquals("Vitor", m.getNome());
    }

    @Test
    void mudaNome() {
        m.setNome("Hashi");

        assertEquals("Hashi", m.getNome());
    }

    @Test
    void avalia() {
        Corrida c = new Corrida(
                new Passageiro("111.111.111-11", "Vinicius"),
                m
        );

        m.avalia(c, 3);

        assertEquals(3, c.getNotaPassageiro());
    }

    @Test
    void avaliaBaixo() {
        Corrida c = new Corrida(
                new Passageiro("111.111.111-11", "Vinicius"),
                m
        );

        m.avalia(c, 0);

        assertEquals(1, c.getNotaPassageiro());
    }

    @Test
    void avaliaAlto() {
        Corrida c = new Corrida(
                new Passageiro("111.111.111-11", "Vinicius"),
                m
        );

        m.avalia(c, 6);

        assertEquals(5, c.getNotaPassageiro());
    }
}
