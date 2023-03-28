package geral.ambientes;

import java.util.List;
import java.util.ArrayList;

import geral.agentes.Agente;
import geral.percepcoes.Percepcao;

public abstract class AmbienteAbstrato implements Ambiente {
    
    private List<Agente> agentes=  new ArrayList<>();

    public abstract EstadoAmbiente retornarEstadoAtualAmbiente();

    public abstract Percepcao retornarPercepcaoVistaPeloAgente();

    public void adicionarAgente(Agente agente){
        agentes.add(agente);
    }

    public void removerAgente(Agente agente){
        agentes.remove(agente);
    }
}
