package Proyecto;

import Ventanas.Inicio;
import java.sql.*;
public class Principal {
    public static void main(String args[]){
        
        Inicio ventana=new Inicio();
        ConexionConsulta connect=new ConexionConsulta();
         /*uncomment when testing db*/
        try{
            connect.conector();
            connect.cargardatos();
            ventana.setVisible(true);
            connect.cerrar();
        }
        catch(SQLException ex){
            System.exit(0);
        }
        
        
    } 
}
