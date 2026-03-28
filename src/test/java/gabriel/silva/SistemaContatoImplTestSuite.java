package gabriel.silva;

import gabriel.silva.Contato;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SistemaContatoImplTestSuite {
    @Test
    void testAdicionarContato() {
        SistemaContatoImpl sistema = new SistemaContatoImpl();
        Contato contato = new Contato("João", "Silva", "123456789", "joao@example.com", null);
        sistema.adicionarContato(contato);
        assertEquals(contato, sistema.pesquisarContatoPorNome("João"));
    }

    @Test
    void testPesquisarContatoPorNome() {
        SistemaContatoImpl sistema = new SistemaContatoImpl();
        Contato contato = new Contato("João", "Silva", "123456789", "joao@example.com", null);
        sistema.adicionarContato(contato);
        assertEquals(contato, sistema.pesquisarContatoPorNome("João"));
    }

    @Test
    void testPesquisarContatoPorTelefone() {
        SistemaContatoImpl sistema = new SistemaContatoImpl();
        Contato contato = new Contato("João", "Silva", "123456789", "joao@example.com", null);
        sistema.adicionarContato(contato);
        assertEquals(contato, sistema.pesquisarContatoPorTelefone("123456789"));
    }

    @Test
    void testListarContatos() {
        SistemaContatoImpl sistema = new SistemaContatoImpl();
        Contato contato1 = new Contato("João", "Silva", "123456789", "joao@example.com", null);
        Contato contato2 = new Contato("Maria", "Oliveira", "987654321", "maria@example.com", null);
        sistema.adicionarContato(contato1);
        sistema.adicionarContato(contato2);
        assertEquals(2, sistema.listarContatos().size());
    }

    @Test
    void testRemoverContatoPorNome() {
        SistemaContatoImpl sistema = new SistemaContatoImpl();
        Contato contato = new Contato("João", "Silva", "123456789", "joao@example.com", null);
        sistema.adicionarContato(contato);
        sistema.removerContatoPorNome("João");
        assertNull(sistema.pesquisarContatoPorNome("João"));
    }

    @Test
    void testRemoverContatoPorTelefone() {
        SistemaContatoImpl sistema = new SistemaContatoImpl();
        Contato contato = new Contato("João", "Silva", "123456789", "joao@example.com", null);
        sistema.adicionarContato(contato);
        sistema.removerContatoPorTelefone("123456789");
        assertNull(sistema.pesquisarContatoPorTelefone("123456789"));
    }

    @Test
    void testAtualizarTelefone() {
        SistemaContatoImpl sistema = new SistemaContatoImpl();
        Contato contato = new Contato("João", "Silva", "123456789", "joao@example.com", null);
        sistema.adicionarContato(contato);
        sistema.atualizarTelefone("João", "987654321");
        assertEquals("987654321", sistema.pesquisarContatoPorNome("João").getTelefone());
    }
    @Test
    void testContarContatos() {
        SistemaContatoImpl sistema = new SistemaContatoImpl();
        Contato contato1 = new Contato("João", "Silva", "123456789", "joao@example.com", null);
        Contato contato2 = new Contato("Maria", "Oliveira", "987654321", "maria@example.com", null);
        sistema.adicionarContato(contato1);
        sistema.adicionarContato(contato2);
        assertEquals(2, sistema.contarContatos());
    }

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

    @Test
    void testGetContatos() {
        SistemaContatoImpl sistema = new SistemaContatoImpl();
        Contato contato1 = new Contato("João", "Silva", "123456789", "joao@example.com", null);
        Contato contato2 = new Contato("Maria", "Oliveira", "987654321", "maria@example.com", null);
        sistema.adicionarContato(contato1);
        sistema.adicionarContato(contato2);
        assertEquals(2, sistema.getContatos().size());
    }
}
