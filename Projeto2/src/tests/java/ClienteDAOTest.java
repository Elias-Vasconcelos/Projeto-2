package tests.java;

import main.java.DAO.IClienteDAO;
import main.java.domain.Cliente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tests.java.Dao.ClienteDAOMock;

public class ClienteDAOTest {


    Cliente cliente;
    IClienteDAO dao;


    public ClienteDAOTest(){
        cliente = new Cliente();
        dao = new ClienteDAOMock();
    }

    @Before
    public void init(){
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

        Cliente clienteEncontrado =  dao.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteEncontrado);

    }

    @Test
    public void cadastrarClient(){

        Boolean clientcadastrado =  dao.cadastrar(cliente);
        Assert.assertEquals(true, clientcadastrado);

    }

    @Test
    public void excluirClient(){

        dao.excluir(cliente.getCpf());

    }



}
