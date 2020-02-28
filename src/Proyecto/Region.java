package Proyecto;

//import java.util.ArrayList;

public class Region {
    protected String nombre_Region;
    protected int id_region;
    //Un departamento tiene solo un numero de homicidios y accidentes
    Homicidio homicidio;
    Accidente_Transito accidente;
    
    public Region(){
        
    }
    public void setid(int id){
        this.id_region=id;  
    }
    public void setRegion(String nombre_Region) {
        this.nombre_Region = nombre_Region;
    }
    public void setHomicidios(int numhomicidio){
        homicidio.numhomicidios=numhomicidio;
    }
    public void setAccidentes(float numaccidente){
        accidente.numaccidentes=numaccidente;
    }
    
    public String getRegion(){
        return nombre_Region;
    }
    
    public int getHomicidios(){
        return homicidio.numhomicidios;
    }
    
    public float getAccidentes(){
        return accidente.numaccidentes;
    }

    
    /*public Integer getid(){
        return id_region;
    }*/
    
    

    /*public ArrayList<Homicidio> getHomicidios() {
        return homicidios;
    }

    public ArrayList<Accidente_Transito> getAccidentes() {
        return accidentes;
    }
    
    public void setAcidente_Transito(Accidente_Transito accidente){
        accidentes.add(accidente);
    }
    public int contador(ArrayList<Homicidio>homicidios){
       int size = homicidios.size(); 
       return size;
     }
     public int contador_A(ArrayList<Accidente_Transito>accidentes){
       int size = accidentes.size(); 
       return size;
     }*/
}
