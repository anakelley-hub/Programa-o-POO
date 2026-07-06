// Herança: Carro é uma subclasse de Automóvel
public class Carro extends Automovel {
    // Atributos protegidos
    private String marca;
    private String modelo;
    private int ano;
    private double preço;
    private boolean motorLigado;

    public Carro (String marca, String modelo, int ano, double preco, boolean motorLigado){
        super(marca, modelo, an , preco);
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.motorLigado = motorLigado; // Atributo booleano recebe o valor passado
    }
    
}
