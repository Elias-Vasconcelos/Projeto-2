package tests.java;

import main.java.DAO.IClienteDAO;
import main.java.domain.Cliente;
import main.java.services.ClienteService;
import main.java.services.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tests.java.Dao.ClienteDAOMock;


public class ClienServiceTest {

    private IClienteService clienteService;
    Cliente cliente = new Cliente();

   public ClienServiceTest(){
       IClienteDAO dao = new ClienteDAOMock();
      clienteService  = new ClienteService(dao);
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

       clienteService.cadastrar(cliente);
   }

    @Test
    public void pesquisarClient(){

       Cliente clienteEncontrado =  clienteService.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteEncontrado);

    }

    @Test
    public void cadastrarClient(){

        Boolean clientcadastrado =  clienteService.cadastrar(cliente);
        Assert.assertEquals(true, clientcadastrado);

    }

    @Test
    public void excluirClient(){

        clienteService.excluir(cliente.getCpf());

    }

}
