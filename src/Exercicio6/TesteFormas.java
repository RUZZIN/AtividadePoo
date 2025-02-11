package Exercicio6;

public class TesteFormas {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Retangulo retangulo = new Retangulo(4, 6);
        Triangulo quadrado = new Triangulo(5, 8);

        System.out.println("Circulo " + circulo.calcularArea());
        System.out.println("Retangulo " + retangulo.calcularArea());
        System.out.println("Quadrado " + quadrado.calcularArea());
    }
}
