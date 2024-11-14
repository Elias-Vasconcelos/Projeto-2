package main.java.services;

import main.java.DAO.ClienteDao;
import main.java.DAO.IClienteDAO;
import main.java.domain.Cliente;

public class ClienteService implements IClienteService {


    IClienteDAO clinteDao;

    public ClienteService(IClienteDAO dao){
         clinteDao = dao ;
    }


    @Override
    public Boolean cadastrar(Cliente cliente) {
        clinteDao.cadastrar(cliente);
        return true;
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        Cliente clienteEncontrado = clinteDao.buscarPorCPF(cpf);
        return clienteEncontrado;
    }

    @Override
    public void excluir(Long cpf) {

    }

    @Override
    public void alterar(Cliente cliente) {

    }
}
