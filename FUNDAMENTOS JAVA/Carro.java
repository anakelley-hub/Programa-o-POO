// Herança: Carro é uma subclasse de Automóvel
public class Carro extends Automovel {
    // Atrbutos específicos e esclusivos da classe carro
    //Criar dois novos atributos para a classe carro
    // Atributos protegidos
    private int quantidadePortas;
    private String tipoCarroceria; // ex: Sedan, Hatch, Suv, Cupê

    // Construtor da subclasse carro


    public Carro(int quantidadePortas, String tipoCarroceria, String marca, String modelo, int ano, double preco) {
        //Envia obrigatoriamente os dados genericos para o construtor da superclasse (Automovel) 
        super(marca, modelo, ano, preco);

        //Inicializa as propriedades que pertencem apenas ao Carro
        this.quantidadePortas = quantidadePortas;
        this.tipoCarroceria = tipoCarroceria;
    }

    //Métodos de comportamento exclusivo do carro de passeio
    public void abrirPortaMalas(){
        System.out.println("O porta-malas do" + getModelo() + " (" + this.tipoCarroceria + ") foi aberto pelo controle remoto."); 
    }

    // Sobrescrita de Método (Polimorfismo): Adaptando a Ficha Técnica para as características de um Carro
@Override
     public void exibirFichaTecnica() {

    // Invoca o comportamento padrão escrito em Automovel (Evita duplicação de código)
    super.exibirFichaTecnica();

    // Adiciona informações específicas do veículo de passeio
    System.out.println("--- Especificações de Veículo de Passeio ---");
    System.out.println("Quantidade de Portas: " + this.quantidadePortas);
    System.out.println("Tipo de Carroceria: " + this.tipoCarroceria);
    System.out.println("=========================================\n");
}

// Getters e Setters específicos
public int getQuantidadePortas() { return quantidadePortas; }

public void setQuantidadePortas(int quantidadePortas) { this.quantidadePortas = quantidadePortas;}

public String getTipoCarroceria() { return tipoCarroceria;}

public void setTipoCarroceria(String tipoCarroceria) { this.tipoCarroceria = tipoCarroceria; }
}