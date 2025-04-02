class Produto {
    int codigo;
    String nome;
    int quantidade;
    String tipo;
    double valor;


    public Produto(int codigo, String nome, int quantidade, String tipo, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }


    public void vender(int qtd) {
        if (qtd > quantidade) {
            System.out.println("Estoque insuficiente!");
        } else {
            quantidade -= qtd;
            double totalVenda = qtd * valor;
            System.out.println("Venda realizada! Total: R$ " + totalVenda);
        }
    }


    public void comprar(int qtd, double novoValor) {
        quantidade += qtd;
        valor = novoValor;
        System.out.println("Compra realizada! Novo estoque: " + quantidade);
    }


    public void comprar(int qtd) {
        quantidade += qtd;
        System.out.println("Compra realizada! Novo estoque: " + quantidade);
    }


    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Quantidade: " + quantidade +
                ", Tipo: " + tipo + ", Valor: R$ " + valor;
    }


    public boolean igual(Produto outro) {

        return this.nome.equals(outro.nome) && this.tipo.equals(outro.tipo);
    }
}

public class Principal {
    public static void main(String[] args) {


        Produto p1 = new Produto(1, "Batalha Naval", 10, "jogo", 100.00);
        Produto p2 = new Produto(2, "Jogo Master", 20, "jogo", 20.00);
        Produto p3 = new Produto(3, "Quebra-Cabeça", 30, "jogo", 50.00);

        p1.comprar(3);
        p2.vender(5);
        p3.comprar(2,50.00);
        System.out.println(p1.toString());
        System.out.println(p2);
        System.out.println(p3);
    }
}
