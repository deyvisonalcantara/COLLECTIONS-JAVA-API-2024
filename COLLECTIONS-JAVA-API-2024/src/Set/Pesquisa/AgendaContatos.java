package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
private Set<Contato> contatoSet;

public AgendaContatos() {
    this.contatoSet = new HashSet<>();
}

public void adicionarContato(String nome, int numero) {
    contatoSet.add(new Contato(nome, numero));
}

public void exbirContatos() { 
    System.out.println(contatoSet);
}

public Set<Contato> pesquisarPorNome(String nome) {
    Set<Contato> contatosPornome = new HashSet<>();
    for(Contato c : contatoSet) {
        if(c.getNome().startsWith(nome)) {
            contatosPornome.add(c);
        }
    }
    return contatosPornome;
}

public Contato atualizarNumerContato(String nome, int novoNumero) {
    Contato contatoAtualizado = null;
    for(Contato c: contatoSet) { 
        if(c.getNome().equalsIgnoreCase(nome)) {
            c.setNumero(novoNumero);
            contatoAtualizado = c;
            break;
        }
    }
    return contatoAtualizado;
}

public static void main(String[] args) {
    
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.exbirContatos();

    agendaContatos.adicionarContato("José", 123456);
    agendaContatos.adicionarContato("José", 0);
    agendaContatos.adicionarContato("José silva", 111111);
    agendaContatos.adicionarContato("José dio", 654987);
    agendaContatos.adicionarContato("José santos", 111111);

    agendaContatos.exbirContatos();

    System.out.println(agendaContatos.pesquisarPorNome("José"));

    System.out.println("Contato atualizado: " + agendaContatos.atualizarNumerContato("José silva", 147258));
    agendaContatos.exbirContatos();
}





    
    

    
}
