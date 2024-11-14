package main.java.DAO;

import main.java.domain.Cliente;

public class ClienteDao implements IClienteDAO {

    @Override
    public Boolean cadastrar(Cliente cliente) {
        return null;
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        Cliente clienteEncontrado = new Cliente();
        return clienteEncontrado;
    }
}
