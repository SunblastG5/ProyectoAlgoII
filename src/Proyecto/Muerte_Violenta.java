package Proyecto;

public abstract class Muerte_Violenta {
    String Definicion=" Es aquella que se debe a un mecanismo suicida, homicida o\n" +
        "accidental, es decir exógeno al sujeto, concurren en estas muertes la existencia\n" +
        "de un mecanismo exógeno y una persona responsable del mismo.";;
    String Codigo_CIE;
       

    public Muerte_Violenta() {
    }

    public String getDefinicion() {
        return Definicion;
    }

    public void setDefinicion(String Definicion) {
        this.Definicion = Definicion;
    }

    public String getCodigo_CIE() {
        return Codigo_CIE;
    }

    public void setCodigo_CIE(String Codigo_CIE) {
        this.Codigo_CIE = Codigo_CIE;
    }
    
  //Abstract classes
  public abstract String Descripcion();
  
}
