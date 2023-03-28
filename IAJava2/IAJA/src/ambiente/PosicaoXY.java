package ambiente;

public class PosicaoXY {
    
    private int posX;
    private int posY;

    public PosicaoXY(){
        this.posX = 0;
        this.posY = 0;
    }

    public PosicaoXY(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    public int getPos(){
        return posX;
    }
    public void setPosX(int posX){
        this.posX = posX;
    }
    public int getPosY(int posY){
        return posY;
    }
    public void setPosY(int posY){
        this.posY = posY;
    }
}
