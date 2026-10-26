public class Aventurero {
   private String nombreAventurero;
   private int vidaActualAventurero;
   private int vidaMaximaAventurero;
   private int danoBaseAventurero; 
   private int cantidadPociones;
   
   public static final int curación = 20;

   public Aventurero (String nombreAventurero , int vidaActualAventurero , int vidaMaximaAventurero , int cantidadPociones){
    this.nombreAventurero = nombreAventurero;
    this.vidaActualAventurero = vidaActualAventurero;
    this.vidaMaximaAventurero = vidaMaximaAventurero;
    this.cantidadPociones = cantidadPociones;
   }

   public void atacarAventurero(Enemigo objetivo){
    objetivo.recibirDanoEnemigo(danoBaseAventurero);
   }

   public void beberPocion(){
    if (cantidadPociones>0){
        cantidadPociones += curación;
        cantidadPociones--;
        if (vidaActualAventurero + curación > vidaMaximaAventurero){
            vidaActualAventurero = vidaMaximaAventurero;
        }
    }else{
        System.out.println("No dispones de pociones");
    }
   }

   public void recibirDanoAventurero(int dano){
    vidaActualAventurero -= dano;
    if (vidaActualAventurero<0){
        vidaActualAventurero=0;
    }
   }

   public boolean estaCaido(){
    boolean caido = false;
    if (vidaActualAventurero <= 0){
        caido = true;
    }
    return caido;
   }

   // Getters 
   public String getNombreAventuro(){
    return nombreAventurero;
   }

   public int getVidaActualAventurero(){
    return vidaActualAventurero;
   }

   public int getVidaMaximaAventurero(){
    return vidaMaximaAventurero;
   }

   public int getDanoBaseAventurero(){
    return danoBaseAventurero;
   }

   public int getCantidadPociones(){
    return cantidadPociones;
   }
}
