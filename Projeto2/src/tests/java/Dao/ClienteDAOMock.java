package tests.java.Dao;

import main.java.DAO.IClienteDAO;
import main.java.domain.Cliente;

public class ClienteDAOMock implements IClienteDAO {

    @Override
    public Boolean cadastrar(Cliente cliente) {
        return true;
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        Cliente clienteEncontrado = new Cliente();
        return clienteEncontrado;
    }

    @Override
    public void excluir(Long cpf) {

    }
}
