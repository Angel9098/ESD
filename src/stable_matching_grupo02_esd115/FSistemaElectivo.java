/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stable_matching_grupo02_esd115;

import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author W7LBL
 */
public class FSistemaElectivo extends javax.swing.JFrame {

    /**
     * Creates new form FSistemaElectivo
     */
      
    
    
public FSistemaElectivo() {
    initComponents();
    inicializarColumnas();
        
}

private void inicializarColumnas() {
    TableColumnModel tColumnModel = new DefaultTableColumnModel();
        for (int i = 0; i < 9; i++) {
            TableColumn col = new TableColumn(i);
            switch (i) {
                    case 0:
                    col.setHeaderValue("Nombre");
                    break;
                    
                    case 1:                        
                    col.setHeaderValue("Carnet");
                    break;
                    
                    case 2:
                    col.setHeaderValue("Carrera");
                    break;
                    
                    case 3:
                    col.setHeaderValue("Experiencia");
                    break;
                    
                    case 4:
                    col.setHeaderValue("Preferencias");
                    break;
                    
                    case 5:
                    col.setHeaderValue("Telefono");
                    break;
                    
                    case 6:
                    col.setHeaderValue("Direccion");
                    break;
                    
                    case 7:
                    col.setHeaderValue("Edad");
                    break;
                    
                    case 8:
                    col.setHeaderValue("CUM");
            }
               
            tColumnModel.addColumn(col);
        }
            
    TModel.setColumnModel(tColumnModel);
 }
    
    
private void agregarDatos(){


    DefaultTableModel modelo = (DefaultTableModel)TModel.getModel();


    String datos[] = new String[9];
    STABLE_MATCHING estu = new STABLE_MATCHING();

    for (int i = 0; i <  estu.estd.size(); i++) {

        datos[0] = estu.estd.get(i).getNombre();
        datos[1] = estu.estd.get(i).getCarnet();
        datos[2] = estu.estd.get(i).getCarrera();
        datos[3] = String.valueOf(estu.estd.get(i).getExperiencia());
        datos[4] = String.valueOf(estu.estd.get(i).getPreferencias());
        datos[5] = estu.estd.get(i).getTelefono();
        datos[6] = estu.estd.get(i).getDireccion();
        datos[7] = String.valueOf( estu.estd.get(i).getEdad());
        datos[8] =String.valueOf( estu.estd.get(i).getCum());
        modelo.addRow(datos);
    }
    TableColumn colum1 = null;
    colum1 = TModel.getColumnModel().getColumn(0);
    colum1.setPreferredWidth(60);
    
    TableColumn colum2 = null;
    colum2 = TModel.getColumnModel().getColumn(1);
    colum2.setPreferredWidth(5);
    
    TableColumn colum3 = null;
    colum3 = TModel.getColumnModel().getColumn(2);
    colum3.setPreferredWidth(40);    
    colum3.setPreferredWidth(10);
    
    TableColumn colum4 = null;
    colum4 = TModel.getColumnModel().getColumn(3);
    colum4.setPreferredWidth(10);
    
    TableColumn colum5 = null;
    colum5 = TModel.getColumnModel().getColumn(4);
    colum5.setPreferredWidth(60);
    TableColumn colum6 = null;
    
    colum6 = TModel.getColumnModel().getColumn(5);
    colum6.setPreferredWidth(5);
    TableColumn colum7 = null;
    
    colum7 = TModel.getColumnModel().getColumn(6);
    colum7.setPreferredWidth(40);
    colum7.setPreferredWidth(10);
    
    TableColumn colum8 = null;
    colum8 = TModel.getColumnModel().getColumn(7);
    colum8.setPreferredWidth(10);
    
    TableColumn colum9 = null;
    colum9 = TModel.getColumnModel().getColumn(8);
    colum9.setPreferredWidth(10);


} 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BarraProceso = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TModel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setText("Ejecutar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar");

        jButton3.setText("Limpiar");

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        TModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "experiencia","Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        TModel.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(TModel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BarraProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(46, 46, 46))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(BarraProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // inicio();
     inicioBarra();  
     agregarDatos();
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(FSistemaElectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FSistemaElectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FSistemaElectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FSistemaElectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FSistemaElectivo().setVisible(true);
        });
    }
    
    //¨Probemos al reves, entravos
    //Método que llamaremos desde nuestro botón
    //No se puede
  
    private void inicioBarra(){
        //Creamos un Thread para mejorar el ejemplo
        final Thread t;
        //Inicializamos
        t = new Thread(new Runnable() {
            //Implementamos el método run()
            @Override
            public void run() {
                //Permite mostrar el valor del progreso
                BarraProceso.setStringPainted(true);
                int x = 0;
                //Utilizamos un while para emular el valor mínimo y máximo
                //En este caso 0 - 100
                while(x <= 100){
                    //Asignamos valor a nuestro JProgressBar por cada siclo del bucle
                    BarraProceso.setValue(x);
                    //Valor que se mostrará en el JTextArea
                    
                    //Hacemos una parada de medio segundo por cada siclo while
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                    }
                    //Se incrementa el valor de x
                    x+=25;
                }
            }
        });
        //Se ejecuta el Thread
        t.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BarraProceso;
    private javax.swing.JTable TModel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
