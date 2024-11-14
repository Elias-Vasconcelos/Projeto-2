package main.java.services;

import main.java.domain.Cliente;

public interface IClienteService {

    Boolean cadastrar(Cliente cliente);

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente);


}
