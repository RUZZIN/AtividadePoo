package Exercicio3;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeDeEstoque;

    public Produto(String nome, double preco, int quantidadeDeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeDeEstoque = quantidadeDeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeDeEstoque() {
        return quantidadeDeEstoque;
    }


    public String exibirProdutos() {
        System.out.println( "Produto: " +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidadeDeEstoque=" + quantidadeDeEstoque
        );
        return "";
    }

    public void adicionarUnidadesAoEstoque() {
        quantidadeDeEstoque++;
    }

    public void removerUnidadesDoEstoque() {
        if (quantidadeDeEstoque > 0) {
            quantidadeDeEstoque--;
        } else {
            System.out.println("Não há produtos em estoque para remover.");
        }
    }
}
