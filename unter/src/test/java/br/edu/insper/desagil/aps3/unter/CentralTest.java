package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class CentralTest {
    private Central central;
    private String cpfPassageiro = "111.111.111-11";
    private String cpfMotorista = "222.222.222-22";
    private double DELTA = .00001;

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

        Passageiro daniel = new Passageiro(cpfPassageiro, "Daniel");
        Passageiro lorenzo = mock(Passageiro.class);
        Motorista motorista = mock(Motorista.class);

        Corrida c1 = new Corrida (daniel, motorista);
        Corrida c2 = new Corrida (daniel, motorista);
        Corrida c3 = new Corrida (daniel, motorista);
        Corrida c4 = new Corrida (lorenzo, motorista);

        c1.avaliaPassageiro(0);
        c2.avaliaPassageiro(4);
        c3.avaliaPassageiro(5);
        c4.avaliaPassageiro(3);

        central.adiciona(c1);
        central.adiciona(c2);
        central.adiciona(c3);
        central.adiciona(c4);

        assertEquals(4.5, central.mediaPassageiro(cpfPassageiro), DELTA);

    }

    @Test
    void avaliacoesMotorista() {

        Motorista jefferson = new Motorista(cpfMotorista, "Jefferson");
        Motorista ze = new Motorista("123.456.789-10", "Zé");

        Passageiro passageiro1 = mock(Passageiro.class);

        Corrida c1 = new Corrida(passageiro1, jefferson);
        Corrida c2 = new Corrida(passageiro1, jefferson);
        Corrida c3 = new Corrida(passageiro1, jefferson);
        Corrida c4 = new Corrida(passageiro1, ze);
        Corrida c5 = new Corrida(passageiro1, null);

        c1.avaliaMotorista(0);
        c2.avaliaMotorista(2);
        c3.avaliaMotorista(3);
        c4.avaliaMotorista(1);
        c5.avaliaMotorista(1);

        central.adiciona(c1);
        central.adiciona(c2);
        central.adiciona(c3);
        central.adiciona(c4);
        central.adiciona(c5);

        assertEquals(2.5, central.mediaMotorista(cpfMotorista), DELTA);
    }
}
