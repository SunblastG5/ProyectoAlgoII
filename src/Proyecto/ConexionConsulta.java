package Proyecto;

import java.sql.*;
import javax.swing.JOptionPane;
import java.util.*;


public class ConexionConsulta {
    //Declaracion de variables para la db y consultas
    private com.mysql.jdbc.Connection consult;
    private Statement sentencia;
    private ResultSet resultado;
           
    //Declaramos los datos de conexion a la BD
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String bd="algodb";
    private static final String user="root";
    private static final String pass="";
    private static final String url ="jdbc:mysql://localhost/"+bd;
    
    //Declaracion de variables locales
    //Llamada a un array tipo Region para ser llenado por el Statement sentencia
    ArrayList<Region> reg= new ArrayList<>();
    Iterator<Region> regcont = reg.iterator();
    Region r=new Region();
    
    
    public void conector(){
        //Se resetea a null la conexion a la BD
        consult = null;
        try{
            Class.forName(driver);
            //Nos conectamos a la BD
            consult = (com.mysql.jdbc.Connection) DriverManager.getConnection(url,user,pass);
            sentencia= consult.createStatement();
            //Si la conexion fue exitosa
            if (consult!=null){
                JOptionPane.showMessageDialog(null,"Inició sesión de BD correctamente...",
                "Datos de acceso del usuario",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        //Si la conexion NO fue exitosa
        catch (ClassNotFoundException | SQLException e){
        
            JOptionPane.showMessageDialog(null,"Error de conexiòn a la BD..."+e,
            "Datos de acceso del usuario",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
    
    public ResultSet getRs() {
        return this.resultado;
    }
    public void setRs(String devcode) {
        try {
            setSql();
            this.resultado = getSql().executeQuery(devcode);
        } catch (SQLException e) {
        }
    }
    public Statement getSql() {
        return this.sentencia;
    }
    public void setSql() {
        try {
            this.sentencia = (Statement) consult.createStatement();
        } catch (SQLException e) {
        }
    }
    
    public void cargardatos(){
        String q="SELECT * FROM consulta";
        try{
            resultado=sentencia.executeQuery(q);
            while (resultado.next()&& regcont.hasNext()){
                r.setid(resultado.getInt("id"));
                r.setRegion(resultado.getString("region"));
                r.setHomicidios(resultado.getInt("numhomicidios"));
                r.setAccidentes(resultado.getFloat("tasaaccidentes"));
                reg.add(r);
                System.out.println(r.getRegion());
            }
            
        }
        catch(SQLException a){}
        
    }
    
    public void cerrar() throws SQLException {
        if (consult != null) {
            consult.close();
        }
    }
}

    

   

