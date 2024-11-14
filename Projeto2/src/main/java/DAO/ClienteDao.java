package main.java.DAO;

import main.java.DAO.generics.GenericDAO;
import main.java.domain.Cliente;
import main.java.domain.Persistente;

import java.io.Serializable;

public class ClienteDao extends GenericDAO<Cliente, Long> implements IClienteDAO {


    public ClienteDao() {
        super();
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
        entityCadastrado.setCidade(entity.getCidade());
        entityCadastrado.setCpf(entity.getCpf());
        entityCadastrado.setEnd(entity.getEnd());
        entityCadastrado.setEstado(entity.getEstado());
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setNumero(entity.getNumero());
        entityCadastrado.setTel(entity.getTel());
    }
}
