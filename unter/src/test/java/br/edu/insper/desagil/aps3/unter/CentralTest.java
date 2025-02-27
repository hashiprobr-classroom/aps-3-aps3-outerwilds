package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class CentralTest {
    private Central central;
    private String cpfPassageiro = "111.111.111-11";
    private String cpfMotorista = "222.222.222-22";

    @BeforeEach
    void setUp() {
        central = new Central();
    }

    @Test
    void nenhumaAvaliacaoPassageiro() {

        assertEquals(0, central.mediaPassageiro(cpfPassageiro));
    }

    @Test
    void nenhumaAvaliacaoMotorista() {
        assertEquals(0, central.mediaMotorista(cpfMotorista));
    }

    @Test
    void avaliacoesPassageiro() {

        Passageiro daniel = mock(Passageiro.class);
        Passageiro errado = mock(Passageiro.class);

        Corrida c1 = mock(Corrida.class);
        Corrida c2 = mock(Corrida.class);
        Corrida c3 = mock(Corrida.class);
        Corrida c4 = mock(Corrida.class);


    }
}
