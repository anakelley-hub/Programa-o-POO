package br.gov.cetam.modelo.app;

import br.gov.cetam.modelo.Carro;
import br.gov.cetam.modelo.Caminhao;

public class MainHeranca {

    public static void main(String[] args) {

        System.out.println("Sistema Integrado da Concessionária - Teste de Herança de Veículos\n");

        // 1. Instanciando um Caminhão (Subclasse 1)
        Caminhao caminhao1 = new Caminhao("Scania", "R 540", 2024, 720000.00, 80.0, 6);

        // 2. Instanciando diferentes Carros de Passeio (Subclasse 2)
        // Aqui demonstramos os exemplos de carroceria: SUV, Sedan, Hatch e Cupê
        Carro carro1 = new Carro(4, "SUV", "Honda", "HR-V", 2025, 160000.0);
        Carro carro2 = new Carro(4, "Sedan", "toyota", "Corola", 2024, 150000.00);
        Carro carro3 = new Carro(4, "Hatch", "Chevrolet", "Onix", 2023, 85000.0);
        Carro carro4 = new Carro(4, "Cupe", "Porche", "911 Carrera", 2026, 900000.0);

        // 3. Testando interações com os Carros (Métodos herdados e exclusivos)
        System.out.println("=== Interagindo com os Carros ===");
        carro1.realizarVistoriaGases();
        System.out.println("Laudo Aprovado? " + carro1.emitirLaudoSeguranca());

        System.out.println("=== VISTORIA AMBIENTAL: VEICULOS DE PASSEIO ===");
        carro2.realizarVistoriaGases();
        System.out.println("Laudo Aprovado? " + carro2.emitirLaudoSeguranca());

        System.out.println("=== VISTORIA AMBIENTAL: VEICULOS DE PASSEIO ===");
        carro3.realizarVistoriaGases();
        System.out.println("Laudo Aprovado? " + carro3.emitirLaudoSeguranca());

        System.out.println("=== VISTORIA AMBIENTAL: VEICULOS DE PASSEIO ===");
        carro4.realizarVistoriaGases();
        System.out.println("Laudo Aprovado? " + carro4.emititLaudoSeguranca());

        //Simulaçao teste para Caminhao
        System.out.println("=== VISTORIA AMBIENTAL: VEICULOS PESADOS ===");
        caminhao1.realizarVistoriaGases();
        System.out.println("Laudo Aprovado? " + carro4.emitirLaudoSeguranca());


        carroSUV.ligarMotor();       // Método herdado de Automóvel
        carroSUV.abrirPortaMalas();  // Método exclusivo de Carro

        System.out.println();
        carroHatch.ligarMotor();
        carroHatch.atualizarPreco(87000.00); //Método herdado de Automovel

        System.out.println();
        carroCupe.abrirPortaMalas();


        // 4. Testando o Caminhão para contrapor com as regras do Carro
        System.out.println("\n=== Interagindo com o Caminhão ===");
        caminhaoGrande.ligarMotor();
        caminhaoGrande.carregarCarga(45.0); // Método exclusivo de Caminhão

        // 5. Exibindo as Fichas Técnicas Personalizadas (Polimorfismo em Ação)
       System.out.println("\n=== FICHAS TÉCNICAS DOS CARROS DE PASSEIO ===");
       carroSUV.exibirFichaTecnica();
       carroSedan.exibirFichaTecnica();
       carroHatch.exibirFichaTecnica();
       carroCupe.exibirFichaTecnica();
    }
    
 

}
