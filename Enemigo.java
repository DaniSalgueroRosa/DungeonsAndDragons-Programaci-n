
public class Enemigo {

    private String nombreEnemigo;
    private int vidaActualEnemigo;
    private int vidaMaximaEnemigo;
    private int danoBaseEnemigo;

    public Enemigo(String nombreEnemigo, int golpesActual, int golpesMaximo, int danobase) {
        this.nombreEnemigo = nombreEnemigo;
        this.vidaActualEnemigo = vidaActualEnemigo;
        this.vidaMaximaEnemigo = vidaMaximaEnemigo;
    }

    public void atacarEnemigo(Aventurero objetivo) {
        objetivo.recibirDanoAventurero(danoBaseEnemigo);
    }

    public void recibirDanoEnemigo(int dano) {
        vidaActualEnemigo -= dano;
        if (vidaActualEnemigo < 0) {
            vidaActualEnemigo = 0;
        }
    }

    public boolean estaDerrotado() {
        boolean derrotado = false;
        if (vidaMaximaEnemigo <= 0) {
            derrotado = true;
        }
        return derrotado;

    }

    //Getters 
    public String getNombreEnemigo() {
        return nombreEnemigo;
    }

    public void setNombreEnemigo(String nombreEnemigo) {
        this.nombreEnemigo = nombreEnemigo;
    }

    public int getVidaActualEnemigo() {
        return vidaActualEnemigo;
    }

    public void setVidaActualEnemigo(){
        this.vidaActualEnemigo = vidaActualEnemigo;
    }

    public int getVidaMaximaEnemigo() {
        return vidaMaximaEnemigo;
    }

    public void setVidaMaximaEnemigo(){
        this.vidaMaximaEnemigo = vidaMaximaEnemigo;
    }

    public int getDanoBaseEnemigo() {
        return danoBaseEnemigo;
    }

    public void setDanoBaseEnemigo(){
        this.danoBaseEnemigo = danoBaseEnemigo;
    }
}
