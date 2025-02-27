package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PassageiroTest {

    private Passageiro p;

    @BeforeEach
    void setUp() {
        p = new Passageiro("111.111.111-11", "Jefferson");
    }

    @Test
    void constroi() {

        assertEquals("111.111.111-11", p.getCpf());
        assertEquals("Jefferson", p.getNome());
    }

    @Test
    void mudaNome() {

        p.setNome("Clayton");

        assertEquals("Clayton", p.getNome());
    }

    @Test
    void avalia() {
        Corrida c = mock(Corrida.class);

        p.avalia(c, 3);
        when(c.getNotaMotorista()).thenReturn(3);

        assertEquals(3, c.getNotaMotorista());
    }

    @Test
    void avaliaBaixo() {
        Corrida c = mock(Corrida.class);

        p.avalia(c, 0);
        when(c.getNotaMotorista()).thenReturn(1);

        assertEquals(1, c.getNotaMotorista());
    }

    @Test
    void avaliaAlto() {
        Corrida c = mock(Corrida.class);

        p.avalia(c, 6);
        when(c.getNotaMotorista()).thenReturn(5);

        assertEquals(5, c.getNotaMotorista());
    }
}
