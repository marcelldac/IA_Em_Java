package aspirador.ambientes;

import geral.ambientes.AmbienteAbstrato;
import geral.ambientes.EstadoAmbiente;
import geral.percepcoes.Percepcao;

public class AmbienteAspirador extends AmbieteAbstrato {

    @Override
    public EstadoAmbiente retornarEstadoAmbiente() {
        return null;
    }

    @Override
    public Percepcao retornarPercepcaoVistaPeloAgente(){
        return null;
    }
    
}
