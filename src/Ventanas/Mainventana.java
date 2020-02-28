/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import Proyecto.*;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Usuario
 */

public class Mainventana extends javax.swing.JFrame {

    /**
     * Creates new form resultados
     */
    
    public Mainventana() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenaritems();
    }
    public void llenaritems(){
        busqueda.addItem("Seleccione una region");
        busqueda.addItem("Amazonas");
        busqueda.addItem("Ancash");
        busqueda.addItem("Apurimac");
        busqueda.addItem("Arequipa");
        busqueda.addItem("Ayacucho");
        busqueda.addItem("Cajamarca");
        busqueda.addItem("Callao");
        busqueda.addItem("Cusco");
        busqueda.addItem("Huancavelica");
        busqueda.addItem("Huanuco");
        busqueda.addItem("Ica");
        busqueda.addItem("Junin");
        busqueda.addItem("La Libertad");
        busqueda.addItem("Lambayeque");
        busqueda.addItem("Lima Metropolitana");
        busqueda.addItem("Lima Provincias");
        busqueda.addItem("Loreto");
        busqueda.addItem("Madre de Dios");
        busqueda.addItem("Moquegua");
        busqueda.addItem("Pasco");
        busqueda.addItem("Piura");
        busqueda.addItem("Puno");
        busqueda.addItem("San Martin");
        busqueda.addItem("Tacna");
        busqueda.addItem("Tumbes");
        busqueda.addItem("Ucayali");
        
    }
        

        /*ConexionConsulta connect=new ConexionConsulta;
        connect.conector();
        String sql="SELECT * FROM consulta";
        connect.setRs(sql);
        try{
            while (connect.getRs().next()){
                busqueda.addItem(connect.getRs().getString("region"));
            }
            connect.cerrar();
        }catch(SQLException error){
            System.exit(0);
        }*/   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        busqueda = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        resultado = new javax.swing.JTextField();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        busqueda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                busquedaItemStateChanged(evt);
            }
        });
        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });
        getContentPane().add(busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 270, 30));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Busqueda por Region");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 250, 20));

        exit.setText("Salir");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        resultado.setEditable(false);
        resultado.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });
        getContentPane().add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 500, 150));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vector-forest-sunset-forest-sunset-forest-wallpaper-thumb.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        // TODO add your handling code here:
        String newSelection = (String) busqueda.getSelectedItem();
        
        if(newSelection.equals("Seleccione una opcion")){
            resultado.setText("Seleccione una opcion en la lista desplegable");
        }
        if(newSelection.equals("Amazonas")){
            resultado.setText("Numero de homicidios: 42            Tasa de Accidentes: 3.8");
        }
        if(newSelection.equals("Ancash")){
            resultado.setText("Numero de homicidios: 63            Tasa de Accidentes: 14.9");  
        }
        if(newSelection.equals("Apurimac")){
            resultado.setText("Numero de homicidios: 17            Tasa de Accidentes: 13 ");
        }
        if(newSelection.equals("Arequipa")){
            resultado.setText("Numero de homicidios: 79            Tasa de Accidentes: 15");  
        }
        if(newSelection.equals("Ayacucho")){
            resultado.setText("Numero de homicidios: 70            Tasa de Accidentes: 6.6");
        }
        if(newSelection.equals("Cajamarca")){
            resultado.setText("Numero de homicidios: 86            Tasa de Accidentes: 5.2");  
        }
        if(newSelection.equals("Callao")){
            resultado.setText("Numero de homicidios: 115           Tasa de Accidentes: 6");
        }
        if(newSelection.equals("Cusco")){
            resultado.setText("Numero de homicidios: 28            Tasa de Accidentes: 11.9");  
        }
        if(newSelection.equals("Huancavelica")){
            resultado.setText("Numero de homicidios: 73            Tasa de Accidentes: 14.7");
        }
        if(newSelection.equals("Huanuco")){
            resultado.setText("Numero de homicidios: 64            Tasa de Accidentes: 9.8");  
        }
        if(newSelection.equals("Ica")){
            resultado.setText("Numero de homicidios: 105           Tasa de Accidentes: 10");
        }
        if(newSelection.equals("Junin")){
            resultado.setText("Numero de homicidios: 140           Tasa de Accidentes: 9.9");  
        }
        if(newSelection.equals("La Libertad")){
            resultado.setText("Numero de homicidios: 64            Tasa de Accidentes: 8.1");
        }
        if(newSelection.equals("Lambayeque")){
            resultado.setText("Numero de homicidios: 31            Tasa de Accidentes: 8");  
        }
        if(newSelection.equals("Lima Metropolitana")){
            resultado.setText("Numero de homicidios: 633           Tasa de Accidentes: 3.8");
        }
        if(newSelection.equals("Lima Provincias")){
            resultado.setText("Numero de homicidios: 148           Tasa de Accidentes: 20.4");     
        }
        if(newSelection.equals("Loreto")){
            resultado.setText("Numero de homicidios: 69            Tasa de Accidentes: 2.3");
        }
        if(newSelection.equals("Madre de Dios")){
            resultado.setText("Numero de homicidios: 15            Tasa de Accidentes: 37.5");  
        }
        if(newSelection.equals("Moquegua")){
            resultado.setText("Numero de homicidios: 42            Tasa de Accidentes: 10.9");
        }
        if(newSelection.equals("Pasco")){
            resultado.setText("Numero de homicidios: 100           Tasa de Accidentes: 14");  
        }
        if(newSelection.equals("Piura")){
            resultado.setText("Numero de homicidios: 140           Tasa de Accidentes: 5.5");
        }
        if(newSelection.equals("Puno")){
            resultado.setText("Numero de homicidios: 145           Tasa de Accidentes: 17.9");
        }
        if(newSelection.equals("San Martin")){
            resultado.setText("Numero de homicidios: 72            Tasa de Accidentes: 5.9");
        }
        if(newSelection.equals("Tacna")){
            resultado.setText("Numero de homicidios: 11            Tasa de Accidentes: 9.7");  
        }
        if(newSelection.equals("Tumbes")){
            resultado.setText("Numero de homicidios: 70            Tasa de Accidentes: 8.2");
        }
        if(newSelection.equals("Ucayali")){
            resultado.setText("Numero de homicidios: 65            Tasa de Accidentes: 3.2");  
        }  
    }//GEN-LAST:event_busquedaActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void busquedaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_busquedaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_busquedaItemStateChanged

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mainventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JComboBox<String> busqueda;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables
}
