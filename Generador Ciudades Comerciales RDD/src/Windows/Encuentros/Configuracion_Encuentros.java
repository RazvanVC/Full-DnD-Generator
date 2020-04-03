/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows.Encuentros;

/**
 *
 * @author razvanvc
 */
public class Configuracion_Encuentros extends javax.swing.JFrame {

    /**
     * Creates new form Configuracion_Encuentros
     */
    public Configuracion_Encuentros() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnG_Dificultad = new javax.swing.ButtonGroup();
        pan_Options = new javax.swing.JPanel();
        lbl_Tablas_Encuentros = new javax.swing.JLabel();
        btn_Save = new javax.swing.JButton();
        btn_Anadir_Tabla_Encuentro = new javax.swing.JButton();
        btn_Modificar_Tabla_Encuentro = new javax.swing.JButton();
        btn_Cancell = new javax.swing.JButton();
        cb_NJugadores = new javax.swing.JComboBox<>();
        lbl_NPlayers = new javax.swing.JLabel();
        lbl_LvLPlayers = new javax.swing.JLabel();
        cb_LvLPlayers = new javax.swing.JComboBox<>();
        cb_Tablas_Encuentros1 = new javax.swing.JComboBox<>();
        lbl_monster_Limit = new javax.swing.JLabel();
        tf_monster_Limit = new javax.swing.JTextField();
        pan_Difficulty = new javax.swing.JPanel();
        rb_Easy = new javax.swing.JRadioButton();
        rb_Medium = new javax.swing.JRadioButton();
        rb_Hard = new javax.swing.JRadioButton();
        rb_Deadly = new javax.swing.JRadioButton();
        lbl_Dificultad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Tablas_Encuentros.setText("Tabla de Encuentros");

        btn_Save.setText("Guardar Cambios");
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });

        btn_Anadir_Tabla_Encuentro.setText("Nueva Tabla");
        btn_Anadir_Tabla_Encuentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Anadir_Tabla_EncuentroActionPerformed(evt);
            }
        });

        btn_Modificar_Tabla_Encuentro.setText("Modificar Tabla");
        btn_Modificar_Tabla_Encuentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Modificar_Tabla_EncuentroActionPerformed(evt);
            }
        });

        btn_Cancell.setText("Cancelar");
        btn_Cancell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancellActionPerformed(evt);
            }
        });

        cb_NJugadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cb_NJugadores.setSelectedIndex(3);
        cb_NJugadores.setToolTipText("");

        lbl_NPlayers.setText("Numero de Jugadores");

        lbl_LvLPlayers.setText("Nivel de Jugadores");

        cb_LvLPlayers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        cb_Tablas_Encuentros1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_Tablas_Encuentros1.setNextFocusableComponent(btn_Modificar_Tabla_Encuentro);
        cb_Tablas_Encuentros1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_Tablas_Encuentros1ActionPerformed(evt);
            }
        });

        lbl_monster_Limit.setText("Límite de Monstruos:");

        btnG_Dificultad.add(rb_Easy);
        rb_Easy.setText("Fácil");

        btnG_Dificultad.add(rb_Medium);
        rb_Medium.setSelected(true);
        rb_Medium.setText("Media");

        btnG_Dificultad.add(rb_Hard);
        rb_Hard.setText("Difícil");

        btnG_Dificultad.add(rb_Deadly);
        rb_Deadly.setText("Mortal");

        lbl_Dificultad.setText("Dificultad:");

        javax.swing.GroupLayout pan_DifficultyLayout = new javax.swing.GroupLayout(pan_Difficulty);
        pan_Difficulty.setLayout(pan_DifficultyLayout);
        pan_DifficultyLayout.setHorizontalGroup(
            pan_DifficultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_DifficultyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan_DifficultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Dificultad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pan_DifficultyLayout.createSequentialGroup()
                        .addGroup(pan_DifficultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rb_Easy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rb_Hard, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                        .addGroup(pan_DifficultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pan_DifficultyLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(rb_Deadly))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan_DifficultyLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(rb_Medium, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pan_DifficultyLayout.setVerticalGroup(
            pan_DifficultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan_DifficultyLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lbl_Dificultad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pan_DifficultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_Easy)
                    .addComponent(rb_Medium))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pan_DifficultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_Hard)
                    .addComponent(rb_Deadly)))
        );

        javax.swing.GroupLayout pan_OptionsLayout = new javax.swing.GroupLayout(pan_Options);
        pan_Options.setLayout(pan_OptionsLayout);
        pan_OptionsLayout.setHorizontalGroup(
            pan_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_OptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan_OptionsLayout.createSequentialGroup()
                        .addGroup(pan_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Modificar_Tabla_Encuentro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pan_Difficulty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pan_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan_OptionsLayout.createSequentialGroup()
                                .addComponent(lbl_LvLPlayers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pan_OptionsLayout.createSequentialGroup()
                                .addGroup(pan_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_NPlayers)
                                    .addGroup(pan_OptionsLayout.createSequentialGroup()
                                        .addComponent(lbl_monster_Limit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tf_monster_Limit))
                                    .addGroup(pan_OptionsLayout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addGroup(pan_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cb_NJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_Anadir_Tabla_Encuentro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cb_LvLPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(pan_OptionsLayout.createSequentialGroup()
                        .addGroup(pan_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Tablas_Encuentros, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_Tablas_Encuentros1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pan_OptionsLayout.createSequentialGroup()
                        .addComponent(btn_Cancell, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                        .addGap(45, 45, 45)
                        .addComponent(btn_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pan_OptionsLayout.setVerticalGroup(
            pan_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_OptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Tablas_Encuentros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_Tablas_Encuentros1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Anadir_Tabla_Encuentro)
                    .addComponent(btn_Modificar_Tabla_Encuentro))
                .addGroup(pan_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan_OptionsLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(pan_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_NPlayers)
                            .addComponent(cb_NJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pan_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_LvLPlayers)
                            .addComponent(cb_LvLPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pan_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_monster_Limit)
                            .addComponent(tf_monster_Limit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pan_OptionsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pan_Difficulty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pan_OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Save)
                    .addComponent(btn_Cancell))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pan_Options, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pan_Options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     * @param evt 
     */
    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
        //Implementar Guardado de Ajustes --> Estructura de Ficheros y Carpetas
        Gen_Evts_Main_Menu menuGenEvts = new Gen_Evts_Main_Menu();
        menuGenEvts.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_SaveActionPerformed

    /**
     * 
     * @param evt 
     */
    private void btn_Modificar_Tabla_EncuentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Modificar_Tabla_EncuentroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Modificar_Tabla_EncuentroActionPerformed

    /**
     * 
     * @param evt 
     */
    private void btn_Anadir_Tabla_EncuentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Anadir_Tabla_EncuentroActionPerformed
        New_Table newTable = new New_Table();
        newTable.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_Anadir_Tabla_EncuentroActionPerformed

    /**
     * 
     * @param evt 
     */
    private void btn_CancellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancellActionPerformed
        Gen_Evts_Main_Menu menuGenEvts = new Gen_Evts_Main_Menu();
        menuGenEvts.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_CancellActionPerformed

    private void cb_Tablas_Encuentros1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_Tablas_Encuentros1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_Tablas_Encuentros1ActionPerformed

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
            java.util.logging.Logger.getLogger(Configuracion_Encuentros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configuracion_Encuentros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configuracion_Encuentros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configuracion_Encuentros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configuracion_Encuentros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnG_Dificultad;
    private javax.swing.JButton btn_Anadir_Tabla_Encuentro;
    private javax.swing.JButton btn_Cancell;
    private javax.swing.JButton btn_Modificar_Tabla_Encuentro;
    private javax.swing.JButton btn_Save;
    private javax.swing.JComboBox<String> cb_LvLPlayers;
    private javax.swing.JComboBox<String> cb_NJugadores;
    private javax.swing.JComboBox<String> cb_Tablas_Encuentros1;
    private javax.swing.JLabel lbl_Dificultad;
    private javax.swing.JLabel lbl_LvLPlayers;
    private javax.swing.JLabel lbl_NPlayers;
    private javax.swing.JLabel lbl_Tablas_Encuentros;
    private javax.swing.JLabel lbl_monster_Limit;
    private javax.swing.JPanel pan_Difficulty;
    private javax.swing.JPanel pan_Options;
    private javax.swing.JRadioButton rb_Deadly;
    private javax.swing.JRadioButton rb_Easy;
    private javax.swing.JRadioButton rb_Hard;
    private javax.swing.JRadioButton rb_Medium;
    private javax.swing.JTextField tf_monster_Limit;
    // End of variables declaration//GEN-END:variables
}
