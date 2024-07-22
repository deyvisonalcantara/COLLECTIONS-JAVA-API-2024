package Map.OperacaoBasicasMap;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos 
    private Map<String, Integer> agendaContatoMap;


    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("José", 123456);
        agendaContatos.adicionarContato("José", 0);
        agendaContatos.adicionarContato("José silva", 111111);
        agendaContatos.adicionarContato("José dio", 654987);
        agendaContatos.adicionarContato("José santos", 111111);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("José dio");
        agendaContatos.exibirContatos();

        System.out.println("o numero é: "+ agendaContatos.pesquisarPorNome("José silva"));

        agendaContatos.adicionarContato("Deyvison", 44444);

        agendaContatos.exibirContatos();
    }



    
}
