package Proyecto;


public class Accidente_Transito extends Muerte_Violenta {
   
    float numaccidentes;

    public Accidente_Transito(float numaccidente){
        this.numaccidentes=numaccidente;
    }

    @Override
    public String Descripcion() {
        return "Es el que ocurre sobre la vía y se presenta súbita e inesperadamente, determinado por\n" +
            "condiciones y actos irresponsables potencialmente previsibles, atribuidos a factores humanos,\n" +
            "vehículos preponderantemente automotores, condiciones climatológicas, señalización y caminos,\n" +
            "los cuales ocasionan pérdidas prematuras de vidas humanas y/o lesiones, así como secuelas\n" +
            "físicas o psicológicas, perjuicios materiales y daños a terceros.";
    }

   


}
