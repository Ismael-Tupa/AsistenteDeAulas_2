/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Aula;
import clases.EstadoAula;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ISMAEL
 */
public class ventanaAulaEstado extends javax.swing.JFrame {

    /**
     * Creates new form vistaAulaDisponible
     */
    public ventanaAulaEstado() {
        initComponents();
        this.setLocationRelativeTo(this);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstadoAula = new javax.swing.JTable();
        btnEstadoAula = new javax.swing.JButton();
        btnAulaDisponible = new javax.swing.JButton();
        btnAulaOcupada = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnOcuparAula = new javax.swing.JButton();
        btnDesocuparAula = new javax.swing.JButton();
        btnSelecOcupante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestion de aulas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        tablaEstadoAula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre de aula", "Capacidad", "Descripcion", "Estado", "Ocupante", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(tablaEstadoAula);

        btnEstadoAula.setText("Estado de aulas");
        btnEstadoAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoAulaActionPerformed(evt);
            }
        });

        btnAulaDisponible.setText("Aulas disponibles");

        btnAulaOcupada.setText("Aulas ocupadas");

        btnSalir.setText("Atras");

        btnOcuparAula.setText("Ocupar");

        btnDesocuparAula.setText("Desocupar");

        btnSelecOcupante.setText("Seleccionar Ocupante");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEstadoAula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAulaDisponible)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAulaOcupada)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnOcuparAula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDesocuparAula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSelecOcupante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEstadoAula)
                    .addComponent(btnAulaDisponible)
                    .addComponent(btnAulaOcupada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnOcuparAula)
                    .addComponent(btnDesocuparAula)
                    .addComponent(btnSelecOcupante))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEstadoAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoAulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstadoAulaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAulaDisponible;
    public javax.swing.JButton btnAulaOcupada;
    public javax.swing.JButton btnDesocuparAula;
    public javax.swing.JButton btnEstadoAula;
    public javax.swing.JButton btnOcuparAula;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnSelecOcupante;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tablaEstadoAula;
    // End of variables declaration//GEN-END:variables

    public static void listarEstadoAula(ventanaAulaEstado vea,List v1,List v2,String op){
        List<Aula>listaA = v1;
        List<EstadoAula>listaAE = v2;
        List<Object>listaO = new ArrayList<>();
        DefaultTableModel modeloT = new DefaultTableModel();
        JTable tabla = vea.tablaEstadoAula;
        modeloT = (DefaultTableModel)tabla.getModel();
        modeloT.setRowCount(0);
        Object[] object = new Object[5];
        for(int i=0 ; i<listaA.size() ; i++){
            
            object[1] = listaA.get(i).getNombre();
            object[2] = listaA.get(i).getCantidad();
            object[3] = listaA.get(i).getDescripcion();
            for(int x=0 ; x < listaAE.size() ; x++){
                //if(listaA.get(i).getId() == listaAE.get(x).getAula()){
                    //object[0] = listaAE.get(x).getId();
                    object[4] = listaAE.get(x).getEstado();
                //}
            }
            if(op.equals("todo")){
                modeloT.addRow(object);
            }else if(object[4].equals(op)){
                modeloT.addRow(object);
            }
        }
        
        vea.tablaEstadoAula.setModel(modeloT);
    }
    public static int modificamos(ventanaAulaEstado vea){
        int fila = vea.tablaEstadoAula.getSelectedRow();
            if(fila <= -1){
                JOptionPane.showMessageDialog(vea, "Debe seleccionar una fila");
            }
            if(fila > -1){
                int id = Integer.parseInt((String)vea.tablaEstadoAula.getValueAt(fila, 0).toString());   
                return id; 
            }
        return -1;
    }
}
