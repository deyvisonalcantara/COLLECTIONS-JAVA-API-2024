package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributo 
private Map<Long, Produto> EstoqueProdutoMap;

public EstoqueProdutos() {
    EstoqueProdutoMap = new HashMap<>();
}

public void adicionarProduto(long cod, String nome, int quantidade, double preco){
    EstoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade));
}
public void exibirProduto() {
    System.out.println(EstoqueProdutoMap);
}

public double calcularValorTotalEstoque() {
    double valorTotalEstoque = 0d;
    if(!EstoqueProdutoMap.isEmpty()){
        for(Produto p : EstoqueProdutoMap.values()) {
            valorTotalEstoque += p.getQuantidade() * p.getPreco();
        }
    }
    return valorTotalEstoque;
}

public Produto obteProdutoMaisCaro() {
    Produto produtoMaisCaro = null;
    double maiorPreco = Double.MIN_VALUE;
    if(!EstoqueProdutoMap.isEmpty()){
        for(Produto p : EstoqueProdutoMap.values()){
            if(p.getPreco() > maiorPreco){
                produtoMaisCaro = p;
            }
        }
    }
    return produtoMaisCaro;
}
  

public static void main(String[] args) {
    EstoqueProdutos estoque = new EstoqueProdutos();

    estoque.exibirProduto();

    estoque.adicionarProduto(1L, "Produto A", 10, 5.0);
    estoque.adicionarProduto(2L, "Produto B", 10, 10.0);
    estoque.adicionarProduto(3L, "Produto C", 15, 15.0);

    estoque.exibirProduto();

    System.out.println("Valor toatl do estoque: R$" + estoque.calcularValorTotalEstoque());
    System.out.println("Produto mais caro: " + estoque.obteProdutoMaisCaro());


    
    
    

}
    
}
