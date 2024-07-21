package Set.OperacoesBasicasSet;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
private Set<Convidado> convidadoSet;

public ConjuntoConvidados() {
    this.convidadoSet = new HashSet<>();
}

public void adicionarConvidado(String nome, int condigoConvite) {
convidadoSet.add(new Convidado(nome, condigoConvite));
}

public void removerConvidadoPorCodigoConvite(int condigoConvite) {
    Convidado ConvidadoParaRemover = null;
    for(Convidado c : convidadoSet) {
        if(c.getCondigoConvite() == condigoConvite) {
            ConvidadoParaRemover = c;
            break;
        } 
    }
    convidadoSet.remove(ConvidadoParaRemover);
}

public int contarConvidados() {
    return convidadoSet.size();
}

public void exibirConvidados() {
    System.out.println(convidadoSet);
}

public static void main(String[] args) {
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
    System.out.println("Existtem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

        System.out.println("Existtem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existtem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.exibirConvidados();
    }

    
}
