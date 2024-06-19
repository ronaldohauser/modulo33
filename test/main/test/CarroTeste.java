package main.test;

import br.dao.*;
import br.domain.*;
import main.java.br.dao.IMarcaDAO;
import main.java.br.dao.MarcaDAO;

public class CarroTeste {
    public static void main(String[] args) {
        ICarroDAO carroDAO = new CarroDAO();
        IMarcaDAO marcaDAO = new MarcaDAO();
        IAcessorioDAO acessorioDAO = new AcessorioDAO();

        // Create Marca
        Marca marca = new Marca();
        marca.setCodigo("123");
        marca.setModelo("Modelo X");
        marcaDAO.cadastrar(marca);

        // Create Acessorio
        Acessorio acessorio = new Acessorio();
        acessorio.setCodigo("A1");
        acessorio.setClassificacao("Interior");
        acessorio.setDetalhes("Detalhes do acessório A1");
        acessorioDAO.cadastrar(acessorio);

        // Create Carro
        Carro carro = new Carro();
        carro.setChassi("XYZ123");
        carro.setCor("Preto");
        carro.setAno_fabricacao(2021L);
        carro.setMarca(marca);
        carro.addAcessorio(acessorio);

        // Persist Carro
        carroDAO.cadastrar(carro);

        // Fetch Carro by Chassi
        Carro fetchedCarro = carroDAO.buscarPorChassi("XYZ123");
        System.out.println("Carro Chassi: " + fetchedCarro.getChassi());
    }
}
