package tests.java;

import main.java.DAO.ClienteDao;
import main.java.domain.Cliente;
import main.java.services.ClienteService;
import main.java.services.IClienteService;
import org.junit.Assert;
import org.junit.Test;


public class ClienteTest {

    private IClienteService clienteService;

   public ClienteTest(){
       ClienteDao dao = new ClienteDao();
      clienteService  = new ClienteService(dao);
   }

    @Test
    public void pesquisarClient(){
        Cliente cliente = new Cliente();
        cliente.setCpf(11223456L);
        cliente.setNome("elias");
        cliente.setCidade("sao paulo");
        cliente.setEnd("sao paulo");
        cliente.setEstado("sao paulo");
        cliente.setNumero(11223456);
        cliente.setTel(11223456L);

        clienteService.cadastrar(cliente);

       Cliente clienteEncontrado =  clienteService.buscarPorCPF(cliente.getCpf());

        Assert.assertNotNull(clienteEncontrado);

    }

}
