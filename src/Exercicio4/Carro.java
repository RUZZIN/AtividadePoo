package Exercicio4;

public class Carro extends Veiculo {
    private int numerosPortas;

    public Carro(String marca, String modelo, int ano, int numerosPortas) {
        super(marca, modelo, ano);
        this.numerosPortas = numerosPortas;
    }

    public int getNumerosPortas() {
        return numerosPortas;
    }

    public void setNumerosPortas(int numerosPortas) {
        this.numerosPortas = numerosPortas;
    }

    public String exibirDetalhes() {
        return "Marca: " + getMarca() +
                "\nModelo: " + getModelo() +
                "\nAno: " + getAno() +
                "\nCilindradas: " + numerosPortas;
    }
}
