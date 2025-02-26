package org.example;

public class CaminhaoRefrigerado extends Caminhao {
    double temperaturaMinima;

    public CaminhaoRefrigerado(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, double capacidadeCarga, double temperaturaMinimaParam) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel, capacidadeCarga);
        if (capacidadePassageiros < 1 || capacidadePassageiros > 3) {
            throw new IllegalArgumentException("Capacidade de passageiros inválida para Caminhão Refrigerado. Deve ser entre 1 e 3.");
        }
        temperaturaMinima = temperaturaMinimaParam;
    }

    @Override
    public double calcularAutonomia() {
        return super.calcularAutonomia() * 0.9;
    }
}