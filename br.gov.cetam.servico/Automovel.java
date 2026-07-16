// package br.gov.cetam.modelo;

public abstract class Automovel {
     //Atributos recebe o tipo dado 4 o nome do atributo
    // Programação Orientada a Objetos,
  private String marca;
  private String modelo;
  private  int ano;
  private double preco;
   boolean motorLigado; 

   public Automovel(String marca, String modelo, int ano, double preco) { //Contrutor
       this.marca = marca;
       this.modelo = modelo;
       this.ano = ano;
       this.preco = preco;
       this.motorLigado = false; // Atributo booleano recebe false
   }
   public void ligarMotor(){
        if (this.motorLigado){
            this.motorLigado = true;
            System.out.println("O motor do" + this.modelo + "foi ligado");
            
        }
        else{
            System.out.println("O motor do " + this.modelo + " já está ligado " );
        }
   }

    public void desligarMotor(){
        if(this.motorLigado){
            this.motorLigado = false;
            System.out.println("  O motor do " + this.modelo +  "já está ligado");
        } 
        else{
            System.out.println( "O motor do " + this.modelo + " foi ligado");
        }
    }

    public void atualizarPreco(double novoPreco) {
        if(novoPreco > 0) {
            this.preco = novoPreco;
            System.out.println( "O preço do " + this.modelo + " foi atualizado para R$" + this.preco);
        }
        else{
            System.out.println("Preço inválido inserido. Digite um valor maior que zero.");
        }
    }
    public void exibirFichaTecnica(){
        System.out.println("Ficha Técnica - Veículo\n");
        System.out.println("Ficha Técnica - Veículo\n");
        System.out.println("Ficha Técnica - Veículo\n");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Preço: R$ " + this.preco);
        System.out.println("Estado do Motor: " + this.motorLigado);

    }    
    // 4. metodos Getters e Setters
    public String getMarca(){ return this.marca; }
    public void setMarca(String marca){ this.marca = marca;}

    public String getModelo(){ return this.modelo; }
    public void setModelo(String modelo){ this.modelo = modelo; }

    public int getAno(){ return this.ano; }
    public void setAno(int ano){ this.ano = ano; }

    public double getPreco(){ return this.preco; }
    public void setPreco(double preco){ this.preco = preco; }

}
