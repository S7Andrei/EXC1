package org.example;

public class Caminhao extends Veiculo {
    double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, double capacidadeCargaParam) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        if (capacidadePassageiros < 1 || capacidadePassageiros > 2) {
            throw new IllegalArgumentException("Capacidade de passageiros inválida para Caminhão. Deve ser entre 1 e 2.");
        }
        capacidadeCarga = capacidadeCargaParam;
    }

    @Override
    public double calcularAutonomia() {
        return 300;
    }
}
