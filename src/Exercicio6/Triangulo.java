package Exercicio6;

public class Triangulo implements Forma {
    private double base;
    public double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    public String exibirArea() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
