package org.example;


public class Carro extends Veiculo {
    String tipoCarro;

    public Carro(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, String tipo) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        if (capacidadePassageiros < 1 || capacidadePassageiros > 5) {
            throw new IllegalArgumentException("Capacidade de passageiros inválida para Carro. Deve ser entre 1 e 5.");
        }
        if (!tipo.equals("sedan") && !tipo.equals("hatch") && !tipo.equals("SUV")) {
            throw new IllegalArgumentException("Tipo de carro inválido. Deve ser sedan, hatch ou SUV.");
        }
        tipoCarro = tipo;
    }

    @Override
    public double calcularAutonomia() {
        return 600;
    }
}
