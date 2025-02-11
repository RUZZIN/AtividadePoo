package Exercicio7;

public class TesteFuncionarios {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Ariana", 10000);
        System.out.println("Nome: " + gerente.calcularBonus());

        Funcionario desenvolvedor = new Desenvolvedor("Marcos", 2000);
        System.out.println("Nome: " + desenvolvedor.calcularBonus());
    }
}
