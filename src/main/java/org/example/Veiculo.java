package org.example;

import java.util.Scanner;

public abstract class Veiculo {

    String marca;
    String modelo;
    String combustivel;
    int ano;
    int capacidadePassageiros;

    public Veiculo(String marcaParam, String modeloParam, int anoParam, int capacidadePassageirosParam, String combustivelParam) {
        marca = marcaParam;
        modelo = modeloParam;
        ano = anoParam;
        capacidadePassageiros = capacidadePassageirosParam;
        combustivel = combustivelParam;
    }

    public abstract double calcularAutonomia();

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Capacidade de Passageiros: " + capacidadePassageiros);
        System.out.println("Combustível: " + combustivel);
        System.out.println("Autonomia: " + calcularAutonomia() + " km");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de veículo (1: Caminhão Refrigerado, 2: Carro Elétrico, 3: Ônibus, 4: Caminhão, 5: Carro): ");
        int tipoVeiculo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Escolha a marca do veículo: ");
        String marca = scanner.nextLine();

        System.out.println("Escolha o modelo do veículo: ");
        String modelo = scanner.nextLine();

        System.out.println("Digite o ano do veículo (não pode ultrapassar 2025): ");
        int ano = scanner.nextInt();
        if (ano > 2025) {
            System.out.println("Ano inválido. O ano não pode ultrapassar 2025.");
            return;
        }

        System.out.println("Digite o tipo de combustível: ");
        String combustivel = scanner.next();

        Veiculo veiculo = null;

        switch (tipoVeiculo) {
            case 1:
                System.out.println("Digite a capacidade de carga do caminhão: ");
                double capacidadeCarga = scanner.nextDouble();
                System.out.println("Digite a temperatura mínima do caminhão: ");
                double temperaturaMinima = scanner.nextDouble();
                veiculo = new CaminhaoRefrigerado(marca, modelo, ano, 2, combustivel, capacidadeCarga, temperaturaMinima);
                break;
            case 2:
                System.out.println("Digite o tipo de carro (sedan, hatch, SUV): ");
                String tipoCarro = scanner.next();
                System.out.println("Digite a capacidade da bateria (50, 75, 100 kWh): ");
                double bateriaKWh = scanner.nextDouble();
                veiculo = new CarroEletrico(marca, modelo, ano, 4, combustivel, tipoCarro, bateriaKWh);
                break;
            case 3:
                System.out.println("Digite a quantidade de eixos do ônibus: ");
                int quantidadeEixos = scanner.nextInt();
                veiculo = new Onibus(marca, modelo, ano, 14, combustivel, quantidadeEixos);
                break;
            case 4:
                System.out.println("Digite a capacidade de carga do caminhão: ");
                capacidadeCarga = scanner.nextDouble();
                veiculo = new Caminhao(marca, modelo, ano, 2, combustivel, capacidadeCarga);
                break;
            case 5:
                System.out.println("Digite o tipo de carro (sedan, hatch, SUV): ");
                tipoCarro = scanner.next();
                veiculo = new Carro(marca, modelo, ano, 4, combustivel, tipoCarro);
                break;
            default:
                System.out.println("Tipo de veículo inválido.");
                return;
        }

        veiculo.exibirDetalhes();
    }
}