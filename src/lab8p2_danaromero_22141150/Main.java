/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_danaromero_22141150;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Calendar;
import java.util.Random;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dana Romero
 */
public class Main extends javax.swing.JFrame {

    Color color;
    RandomAccessFile carros;
    boolean actionTabla, actionComenzar;
    public Main() {
        actionTabla = false;
        try {
            carros = new RandomAccessFile("carros.dr","rw");
            initComponents();
            this.setVisible(true);
            this.setLocationRelativeTo(null);
             llenarComboBox();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_comenzar = new javax.swing.JButton();
        btn_pausar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jl_largo = new javax.swing.JLabel();
        jl_pista = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pb_barra = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_tabla = new javax.swing.JTable();
        cb_carros = new javax.swing.JComboBox<>();
        btn_agregar = new javax.swing.JButton();
        cb_tipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_numId = new javax.swing.JTextField();
        tf_nombre = new javax.swing.JTextField();
        btn_color = new javax.swing.JButton();
        btn_guardarCarro = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tf_nombrePista = new javax.swing.JTextField();
        tf_pistaLargo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_usarPista = new javax.swing.JButton();
        btn_reiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_comenzar.setText("Comenzar");
        btn_comenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comenzarActionPerformed(evt);
            }
        });

        btn_pausar.setText("Pausar");

        jLabel1.setText("Pista:");

        jLabel2.setText("Largo:");

        jt_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Corredor", "Distancia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_tabla);

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        cb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "McQueen", "Convertible", "Nascar" }));

        jLabel3.setText("Numero Identificador");

        jLabel4.setText("Nombre Corredor");

        btn_color.setText("Color");
        btn_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_colorActionPerformed(evt);
            }
        });

        btn_guardarCarro.setText("Guardar");
        btn_guardarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarCarroActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre Pista");

        tf_pistaLargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_pistaLargoKeyTyped(evt);
            }
        });

        jLabel6.setText("Largo");

        btn_usarPista.setText("Usar Pista");
        btn_usarPista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usarPistaActionPerformed(evt);
            }
        });

        btn_reiniciar.setText("Reiniciar");
        btn_reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_guardarCarro, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(btn_color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_usarPista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_reiniciar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tf_numId, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel6))
                                            .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cb_carros, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_agregar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_nombrePista, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_pistaLargo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pb_barra, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_comenzar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_pausar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jl_pista, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jl_largo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jl_largo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl_pista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_comenzar)
                        .addComponent(btn_pausar))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(pb_barra, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_carros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregar)
                    .addComponent(jLabel5)
                    .addComponent(tf_nombrePista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_numId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_pistaLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_color)
                    .addComponent(btn_usarPista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardarCarro)
                    .addComponent(btn_reiniciar))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarCarroActionPerformed
        try {
            int numId = Integer. parseInt(tf_numId.getText());
            long distancia=0;
            String nombreCorredor = tf_nombre.getText();
            String tipo = String.valueOf(cb_tipo.getSelectedItem());
            int RGB = color.getRGB();
            int minV = (tipo.equals("McQueen")?30:((tipo.equals("Convertible"))?20:40));
            int maxV = (tipo.equals("McQueen")?190:((tipo.equals("Convertible"))?200:180));
            boolean corriendo = false;
            
            //Escribir el dato en el archivo binario
            if(idUnico(numId)){
                carros.writeInt(numId);
                carros.writeLong(distancia);
                carros.writeUTF(nombreCorredor);
                carros.writeInt(RGB);
                carros.writeInt(minV);
                carros.writeInt(maxV);
                carros.writeUTF(tipo);
                //carros.writeBoolean(corriendo);
                JOptionPane.showMessageDialog(null, "¡El carro fue creado exitosamente!");
                llenarComboBox();
            }else{
                JOptionPane.showMessageDialog(null, "¡El ID ingresado ya existe!");
            }
                
                
            } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_guardarCarroActionPerformed

    private void btn_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_colorActionPerformed
        JColorChooser colorChooser = new JColorChooser();
        color = JColorChooser.showDialog(this, "Escoja un color", Color.black);
        btn_color.setBackground(color);
    }//GEN-LAST:event_btn_colorActionPerformed

    private void btn_usarPistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usarPistaActionPerformed
        String nombrePista = tf_nombrePista.getText();
        int largo = Integer.parseInt(tf_pistaLargo.getText());
        if(largo>0){
            jl_pista.setText(nombrePista);
            jl_largo.setText(tf_pistaLargo.getText());
            pb_barra.setMaximum(largo);
        }else{
            JOptionPane.showMessageDialog(null, "El largo debe ser mayor que 0");
        }
    }//GEN-LAST:event_btn_usarPistaActionPerformed

    private void tf_pistaLargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_pistaLargoKeyTyped
        //tf_codigo solo aceptará dígitos
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tf_pistaLargoKeyTyped

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        try {
            agregarCarroATabla();
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_comenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comenzarActionPerformed
            hilo hilo = new hilo();
            hilo.start();
        actionComenzar=true;
        
        
    }//GEN-LAST:event_btn_comenzarActionPerformed
    
    private void jt_tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_tablaMouseClicked
        actionTabla = true;
        if(actionComenzar){
            try {
                seeBarOfSelectedCar();
                
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jt_tablaMouseClicked

    private void btn_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reiniciarActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jt_tabla.getModel();
        dtm.setRowCount(0);
    }//GEN-LAST:event_btn_reiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_color;
    private javax.swing.JButton btn_comenzar;
    private javax.swing.JButton btn_guardarCarro;
    private javax.swing.JButton btn_pausar;
    private javax.swing.JButton btn_reiniciar;
    private javax.swing.JButton btn_usarPista;
    private javax.swing.JComboBox<String> cb_carros;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl_largo;
    private javax.swing.JLabel jl_pista;
    private javax.swing.JTable jt_tabla;
    private javax.swing.JProgressBar pb_barra;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombrePista;
    private javax.swing.JTextField tf_numId;
    private javax.swing.JTextField tf_pistaLargo;
    // End of variables declaration//GEN-END:variables

    //Función para ver si el ID del carro es único
    
    public boolean idUnico(int id) throws IOException{
        carros.seek(0);
        while(carros.getFilePointer()<carros.length()){
            if(carros.readInt()==id){
                return false;
            }else{
                carros.skipBytes(8);
                carros.readUTF();
                carros.skipBytes(12);
                carros.readUTF();
                
            }
        }
        return true;
        
    }
    
    public void llenarComboBox() throws IOException{
        cb_carros.removeAllItems();
        carros.seek(0);
        while(carros.getFilePointer()<carros.length()){
            cb_carros.addItem(String.valueOf(carros.readInt()));
            //skip bytes
            carros.readLong();
            carros.readUTF();
            carros.skipBytes(12);
            carros.readUTF();
        }
    }
    
    private void agregarCarroATabla() throws IOException{
        DefaultTableModel modelo = (DefaultTableModel)jt_tabla.getModel();
        int numId = Integer.parseInt(String.valueOf(cb_carros.getSelectedItem()));
        idUnico(numId);
        long distancia = carros.readLong();
        String corredor = carros.readUTF();
        if(!carroEnTabla(String.valueOf(cb_carros.getSelectedItem()))){
            Object[] u = {numId, corredor, distancia};
            modelo.addRow(u);
        }else{
            JOptionPane.showMessageDialog(null, "El carro ya está en la carrera");
        }

    }    
    
    public boolean carroEnTabla(String id){
        int cantRows = jt_tabla.getRowCount();
        for(int i = 0;i<cantRows;i++){
            System.out.println(jt_tabla.getValueAt(i,0));
             if(jt_tabla.getValueAt(i, 0)==id){
                 
                 
                 return true;
             }
        }
        
        return false;
        
    }
    
    public void setDistance(String id) throws IOException{
        idUnico(Integer.parseInt(id));
        Random r = new Random();
        carros.skipBytes(8);
        carros.readUTF();
        carros.skipBytes(4);
        int min = carros.readInt();
        int max = carros.readInt();
        int distanciaNueva = r.nextInt(max-min) + min;
        int row = getRowOfCar(id);
        int distanciaVieja = Integer.parseInt(String.valueOf(jt_tabla.getValueAt(row,2)));
        int distanciaTotal = distanciaNueva+distanciaVieja;
        jt_tabla.setValueAt(distanciaTotal, row, 2);
        
    }
    
    public void seeBarOfSelectedCar() throws IOException{
        
        int row = Integer.parseInt(String.valueOf(jt_tabla.getSelectedRow()));
        if(row !=-1){
            int id = Integer.parseInt(String.valueOf(jt_tabla.getValueAt(row,0)));
            int distancia = Integer.parseInt(String.valueOf(jt_tabla.getValueAt(row,2)));
            idUnico(id);
            carros.skipBytes(8);
            carros.readUTF();
            int rgb = carros.readInt();
            pb_barra.setBackground(new Color(rgb));
            pb_barra.setVisible(true);
            pb_barra.setValue(distancia);
            pb_barra.repaint();
            
        }
        
        
    }
    
    public int getRowOfCar(String id){
        for(int i=0; i<jt_tabla.getRowCount();i++){
            if(String.valueOf(jt_tabla.getValueAt(i,0)).equals(id)){
                return i;
            }
        }
        return -1;
    }
    
    class hilo extends Thread{
        
        public void run(){
            while(true){
            for(int i=0; i<jt_tabla.getRowCount();i++){
                try{
                    String id = String.valueOf(jt_tabla.getValueAt(i,0));
                    setDistance(id); 
                    seeBarOfSelectedCar();
                   
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                        
                    }
                }catch(IOException ex){
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
            }
            }
        }
    }
    
    
    
    
}
