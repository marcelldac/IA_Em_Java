package agente;

import ambiente.Labirinto;
import ambiente.PosicaoXY;

public class AgenteLabirinto{

    private Labirinto labirinto;
    private MovimentosAgenteLabirinto movimento;

    private PosicaoXY posXY;

    public AgenteLabirinto(Labirinto labirinto){

        this.labirinto = labirinto;
        
        this.posXY = new PosicaoXY();

        this.movimento = MovimentosAgenteLabirinto.CIMA;

    }

    public PosicaoXY retornarMovimento() {

        int retornoPosX = this.posXY.getPosX();
        int retornoPosY = this.posXY.getPosY();

        switch(movimento){
            case CIMA:
                if(retornoPosX > 0){
                    retornoPosX-=1;

                }
                break;
            case BAIXO:
                if(retornoPosX < this.labirinto.getTamanhoLabirinto() - 1){
                    retornoPosX+=1;
                }
                break;
            case ESQUERDA:
                if(retornoPosY > 0){
                    retornoPosY-=1;
                }
                break;
            case DIREITA:
                if(retornoPosY < this.labirinto.getTamanhoLabirinto() - 1){
                    retornoPosY+=1;
                }
                break;
        }
        
        return new PosicaoXY(retornoPosX, retornoPosY);

    }
}