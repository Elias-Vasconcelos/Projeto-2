package tests.java;

import main.java.DAO.ClienteDao;
import main.java.DAO.IClienteDAO;
import main.java.domain.Cliente;
import main.java.exeptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tests.java.Dao.ClienteDAOMock;

public class ClienteDAOTest {


    Cliente cliente;
    IClienteDAO dao;


    public ClienteDAOTest(){
        cliente = new Cliente();
        dao = new ClienteDao();
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        cliente.setCpf(11223456L);
        cliente.setNome("elias");
        cliente.setCidade("sao paulo");
        cliente.setEnd("sao paulo");
        cliente.setEstado("sao paulo");
        cliente.setNumero(11223456);
        cliente.setTel(11223456L);
        dao.cadastrar(cliente);
    }

    @Test
    public void pesquisarClient(){

        Cliente clienteEncontrado =  dao.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteEncontrado);

    }

    @Test
    public void cadastrarClient() throws TipoChaveNaoEncontradaException {

        Cliente clientcadastrado =  dao.consultar(cliente.getCpf());
        Assert.assertNotNull(clientcadastrado);

    }

    @Test
    public void excluirClient(){

        dao.excluir(cliente.getCpf());

    }

    @Test
    public void alterarClient()throws TipoChaveNaoEncontradaException{
        cliente.setNome("Elias Ferreira");
        dao.alterar(cliente);

        Assert.assertEquals("Elias Ferreira", cliente.getNome());
    }


}
