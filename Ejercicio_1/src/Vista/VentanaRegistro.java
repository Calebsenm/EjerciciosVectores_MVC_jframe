
package Vista;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Controlador.Controlador;
import Controlador.ControladorRegistro;
import Controlador.ControladorUsuarios;

public class VentanaRegistro extends javax.swing.JPanel {

    public VentanaRegistro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id_Empleado = new javax.swing.JLabel();
        id_Empleado1 = new javax.swing.JLabel();
        id_Empleado4 = new javax.swing.JLabel();
        id_Empleado3 = new javax.swing.JLabel();
        id_Empleado5 = new javax.swing.JLabel();
        id_Empleado6 = new javax.swing.JLabel();
        id_Empleado7 = new javax.swing.JLabel();
        Nomnbre = new javax.swing.JTextField();
        ID_Empleado = new javax.swing.JTextField();
        Genero = new javax.swing.JTextField();
        Estrato = new javax.swing.JTextField();
        SalarioBasico = new javax.swing.JTextField();
        HorasExtrasLaboradas = new javax.swing.JTextField();
        HorasLaboradas = new javax.swing.JTextField();
        GuardarBn_2 = new javax.swing.JButton();
        CerrarBn_2 = new javax.swing.JButton();
        FechaVinculacion = new javax.swing.JTextField();
        id_Empleado8 = new javax.swing.JLabel();

        id_Empleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        id_Empleado.setText("Nombre");

        id_Empleado1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        id_Empleado1.setText("Genero");

        id_Empleado4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        id_Empleado4.setText("ID Empleado");

        id_Empleado3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        id_Empleado3.setText("Estrato");

        id_Empleado5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        id_Empleado5.setText("Horas Laboradas");

        id_Empleado6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        id_Empleado6.setText("Horas Extras Laboradas");

        id_Empleado7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        id_Empleado7.setText("Salario Basico");

        FechaVinculacion.setText("01-01-2000");

        ID_Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_EmpleadoActionPerformed(evt);
            }
        });

        GuardarBn_2.setText("Guardar");
        GuardarBn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarBn_2ActionPerformed(evt);
            }
        });

        CerrarBn_2.setText("Cerrar");
        CerrarBn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarBn_2ActionPerformed(evt);
            }
        });

        id_Empleado8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        id_Empleado8.setText("Fecha Vinculación");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(id_Empleado7,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                137,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(id_Empleado5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                137,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(id_Empleado3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                137,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(76, 76, 76))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addComponent(id_Empleado6,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 201,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(HorasLaboradas,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 216,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Estrato, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(HorasExtrasLaboradas,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 216,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(SalarioBasico,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 216,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(id_Empleado8, javax.swing.GroupLayout.PREFERRED_SIZE, 183,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(FechaVinculacion, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(GuardarBn_2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CerrarBn_2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(id_Empleado4,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 137,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(id_Empleado1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 137,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(id_Empleado,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 137,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(76, 76, 76)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Genero, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ID_Empleado,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 216,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Nomnbre, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(11, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Nomnbre, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addComponent(ID_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addComponent(id_Empleado4, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(id_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(id_Empleado1, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Genero, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(SalarioBasico, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Estrato, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(HorasLaboradas,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(37, 37, 37))
                                                        .addComponent(HorasExtrasLaboradas,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(id_Empleado7, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(id_Empleado3, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(id_Empleado5, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(id_Empleado6, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(FechaVinculacion, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(id_Empleado8, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(GuardarBn_2)
                                                .addComponent(CerrarBn_2)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
    }// </editor-fold>//GEN-END:initComponents

    private void ID_EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ID_EmpleadoActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_ID_EmpleadoActionPerformed

    private void CerrarBn_2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CerrarBn_2ActionPerformed
        ControladorRegistro.ocultar();
        ControladorUsuarios.mostrar();
    }// GEN-LAST:event_CerrarBn_2ActionPerformed

    // este Indice es para compararlo con el indice de la clase controlador
    int index = 0;
    private void GuardarBn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarBn_2ActionPerformed

        ControladorRegistro.Guardar(index); 
        
        // controla el indice de la clase controlador para que si ocurre un error no se sume
        if(!ControladorRegistro.errorGuardado){
              index++;    
        }
      
        if (index == Controlador.Index){
                Controlador.actualizarTabla();        
                ControladorRegistro.ocultar();
                ControladorUsuarios.mostrar(); 
        } 
        
    }// GEN-LAST:event_GuardarBn_2ActionPerformed

    public JButton getCerrarBn_2() {
        return CerrarBn_2;
    }

    public JTextField getEstrato() {
        return Estrato;
    }

    public JTextField getFechaVinculacion() {
        return FechaVinculacion;
    }

    public JTextField getGenero() {
        return Genero;
    }

    public JButton getGuardarBn_2() {
        return GuardarBn_2;
    }

    public JTextField getHorasExtrasLaboradas() {
        return HorasExtrasLaboradas;
    }

    public JTextField getHorasLaboradas() {
        return HorasLaboradas;
    }

    public JTextField getNomnbre() {
        return Nomnbre;
    }

    public JTextField getSalarioBasico() {
        return SalarioBasico;
    }

    public JTextField getID_Empleado() {
        return ID_Empleado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton CerrarBn_2;
    public javax.swing.JTextField Estrato;
    public javax.swing.JTextField FechaVinculacion;
    public javax.swing.JTextField Genero;
    public javax.swing.JButton GuardarBn_2;
    public javax.swing.JTextField HorasExtrasLaboradas;
    public javax.swing.JTextField HorasLaboradas;
    public javax.swing.JTextField ID_Empleado;
    public javax.swing.JTextField Nomnbre;
    public javax.swing.JTextField SalarioBasico;
    private javax.swing.JLabel id_Empleado;
    private javax.swing.JLabel id_Empleado1;
    private javax.swing.JLabel id_Empleado3;
    private javax.swing.JLabel id_Empleado4;
    private javax.swing.JLabel id_Empleado5;
    private javax.swing.JLabel id_Empleado6;
    private javax.swing.JLabel id_Empleado7;
    private javax.swing.JLabel id_Empleado8;
    // End of variables declaration//GEN-END:variables
}
