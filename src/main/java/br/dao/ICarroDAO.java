package main.java.br.dao;

import br.domain.Carro;

public interface ICarroDAO {
    Carro cadastrar(Carro carro);
    Carro buscarPorChassi(String chassi);
}
