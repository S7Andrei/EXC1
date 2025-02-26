package org.example;

public class CarroEletrico extends Carro {
    private double bateriaKWh;

    public CarroEletrico(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, String tipoCarro, double bateriaKWhParam) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel, tipoCarro);
        if (bateriaKWhParam != 50 && bateriaKWhParam != 75 && bateriaKWhParam != 100) {
            throw new IllegalArgumentException("Capacidade de bateria inválida. Deve ser 50, 75 ou 100 kWh.");
        }
        bateriaKWh = bateriaKWhParam;
    }

    @Override
    public double calcularAutonomia() {
        return bateriaKWh * 5;
    }
}
