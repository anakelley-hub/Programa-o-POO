public class Onibus extends Veiculo {
    private int assentos;

    public Onibus (String placa, int ano, int assentos) {
        super(placa, ano);
        this.setAssentos(assentos);
    }

    public int getAssentoa() {
        return assentos;
    }
    
    public void setAssentos (int assentos) {
        this.assentos = assentos;
    }

    @Override
    public void exibirDados() {
        System.out.println("A placa do veículo e " + getPlaca() + " e o ano de fabricação e " + getAno() + ", o numero e " + assentos);
    }
}
