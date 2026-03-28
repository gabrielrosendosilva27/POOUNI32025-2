package gabriel.silva;

import static org.junit.jupiter.api.Assertions.*;

import gabriel.silva.SistemaContatoImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContatoTest {
    @Test
    void testValidarDados() {
        SistemaContatoImpl sistema = new SistemaContatoImpl();
        Contato contatoValido = new Contato("João", "Silva", "123456789", "joao@example.com", null);
        assertDoesNotThrow(() -> sistema.validarDados(contatoValido));

        Contato contatoSemNome = new Contato("", "Silva", "123456789", "joao@example.com", null);
        assertThrows(IllegalArgumentException.class, () -> sistema.validarDados(contatoSemNome));

        Contato contatoSemSobrenome = new Contato("João", "", "123456789", "joao@example.com", null);
        assertThrows(IllegalArgumentException.class, () -> sistema.validarDados(contatoSemSobrenome));

        Contato contatoSemTelefone = new Contato("João", "Silva", "", "joao@example.com", null);
        assertThrows(IllegalArgumentException.class, () -> sistema.validarDados(contatoSemTelefone));

        Contato contatoSemEmail = new Contato("João", "Silva", "123456789", "", null);
        assertThrows(IllegalArgumentException.class, () -> sistema.validarDados(contatoSemEmail));
    }

    @org.junit.jupiter.api.Test
    void updateContactDetails() {
    }

    @org.junit.jupiter.api.Test
    void getFullName() {
    }

    @org.junit.jupiter.api.Test
    void getNome() {
    }

    @org.junit.jupiter.api.Test
    void setNome() {
    }

    @org.junit.jupiter.api.Test
    void getSobrenome() {
    }

    @org.junit.jupiter.api.Test
    void setSobrenome() {
    }

    @org.junit.jupiter.api.Test
    void getTelefone() {
    }

    @org.junit.jupiter.api.Test
    void setTelefone() {
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
    }

    @org.junit.jupiter.api.Test
    void setEmail() {
    }

    @org.junit.jupiter.api.Test
    void getEndereco() {
    }

    @org.junit.jupiter.api.Test
    void setEndereco() {
    }
}
