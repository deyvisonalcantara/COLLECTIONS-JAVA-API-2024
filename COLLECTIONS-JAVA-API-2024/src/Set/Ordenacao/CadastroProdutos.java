package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributo
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

public void adicinarProduto(String nome, long condigo, double preco, int quantidade) {
    produtoSet.add(new Produto(nome, condigo, preco, quantidade));
}

public Set<Produto> exibirProdutosPorNome(){
    Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
    return produtosPorNome;
}


public Set<Produto> exibirProdutosPorPreco() {
    Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
    produtoSet.addAll(produtoSet);
    return produtosPorPreco;
}
    
 
public static void main(String[] args) {
    CadastroProdutos cadastroProdutos = new CadastroProdutos();

    cadastroProdutos.adicinarProduto("Produto 5", 1L, 15d, 5);
    cadastroProdutos.adicinarProduto("Produto 0", 2L, 20d, 10); cadastroProdutos.adicinarProduto("Produto 3", 1L,16d, 2);
    cadastroProdutos.adicinarProduto("Produto 9", 9L, 2d, 2);

    System.out.println(cadastroProdutos.produtoSet);
    System.out.println(cadastroProdutos.exibirProdutosPorNome());
    System.out.println(cadastroProdutos.exibirProdutosPorPreco());
}

}
