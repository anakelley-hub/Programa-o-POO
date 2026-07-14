public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.setEixos( eixos);
        
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public void exibirDados() {
        System.out.println("A placa do veiculo e " + getPlaca() + " e ano de fabricação e " + getAno() + ", a quantidade de eixos e " + eixos);
    }

}

    

