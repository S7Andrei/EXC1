package org.example;

public class Onibus extends Veiculo {
    int quantidadeEixos;

    public Onibus(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, int eixos) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        if (capacidadePassageiros < 1 || capacidadePassageiros > 24) {
            throw new IllegalArgumentException("Capacidade de passageiros inválida para Ônibus. Deve ser entre 1 e 24.");
        }
        if (eixos < 6 || eixos > 8) {
            throw new IllegalArgumentException("Ônibus deve ter entre 6 a 8 eixos.");
        }
        quantidadeEixos = eixos;
    }

    @Override
    public double calcularAutonomia() {
        return 1000;
    }
}
