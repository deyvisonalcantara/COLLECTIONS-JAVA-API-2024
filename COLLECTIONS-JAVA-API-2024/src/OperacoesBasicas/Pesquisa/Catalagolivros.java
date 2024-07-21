package OperacoesBasicas.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class Catalagolivros {
    //atributo 
    private List<Livro> livroList;

    public Catalagolivros() {
        this.livroList = new ArrayList<>();
    }

    public void  adicionarlivro(String titulo, String autor, int anoPublicacao) {
    livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) { 
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                    
                }
            }
        } 
        return livrosPorAutor;

    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) { 
        List<Livro> livrosPorIntervaloanos  = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloanos.add(l);
                    
                }
            }
        } 
        return livrosPorIntervaloanos;
    }
    public Livro pesquisaPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;  
                    break; 
                }
            }
        }
        return livroPorTitulo;

    }

    public static void main(String[] args) {
       Catalagolivros catalagolivros = new Catalagolivros();

       catalagolivros.adicionarlivro("Livro 1","Autor 1" , 2020);
       catalagolivros.adicionarlivro("Livro 1","Autor 2" , 2021);
       catalagolivros.adicionarlivro("Livro 2","Autor 2" , 2022);
       catalagolivros.adicionarlivro("Livro 3","Autor 3" , 2023);
       catalagolivros.adicionarlivro("Livro 4","Autor 4" , 2024);

       System.out.println(catalagolivros.pesquisarPorAutor("Autor 2"));
       System.out.println(catalagolivros.pesquisarPorIntervaloAnos(2020, 2022));
       System.out.println(catalagolivros.pesquisaPorTitulo("Livro 1"));

    }
       
}
   