package Proyecto;

public class Homicidio extends Muerte_Violenta {
    
    
    int numhomicidios;

    public Homicidio(int numhomicidio){
        this.numhomicidios = numhomicidio;
    }
            
    @Override
     public String Descripcion(){
    return "Homicidio es considerado un comportamiento reprochable en donde un individuo actúa en contra de otro con el propósito de violentar la vida de ese individuo.";
    }
  
         

   
}
