package main.java.DAO;

import main.java.domain.Cliente;

public interface IClienteDAO {

    Boolean cadastrar(Cliente cliente);


    Cliente buscarPorCPF(Long cpf);
}
