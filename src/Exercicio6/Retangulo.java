package Exercicio6;

public class Retangulo implements Forma {
    private double base;
    public double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    public String exibirArea() {
        return "Retangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
