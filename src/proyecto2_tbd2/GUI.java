// GUI que muestra los formularios concernientes a la aplicación.

package proyecto2_tbd2;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        d_origen = new javax.swing.JDialog();
        l_origen = new javax.swing.JLabel();
        l_sqlserver = new javax.swing.JLabel();
        l_origen_nombreInstancia = new javax.swing.JLabel();
        l_origen_nombreBD = new javax.swing.JLabel();
        l_origen_puerto = new javax.swing.JLabel();
        l_origen_nombreUsuario = new javax.swing.JLabel();
        l_origen_passUsuario = new javax.swing.JLabel();
        tf_origen_nombreInstancia = new javax.swing.JTextField();
        tf_origen_nombreBD = new javax.swing.JTextField();
        tf_origen_puerto = new javax.swing.JTextField();
        tf_origen_nombreUsuario = new javax.swing.JTextField();
        tf_origen_passUsuario = new javax.swing.JTextField();
        b_origen_conectar = new javax.swing.JButton();
        d_destino = new javax.swing.JDialog();
        l_destino = new javax.swing.JLabel();
        l_mysql = new javax.swing.JLabel();
        l_destino_nombreInstancia = new javax.swing.JLabel();
        tf_destino_nombreInstancia = new javax.swing.JTextField();
        l_destino_nombreBD = new javax.swing.JLabel();
        tf_destino_nombreBD = new javax.swing.JTextField();
        l_destino_puerto = new javax.swing.JLabel();
        tf_destino_puerto = new javax.swing.JTextField();
        l_destino_nombreUsuario = new javax.swing.JLabel();
        tf_destino_nombreUsuario = new javax.swing.JTextField();
        l_destino_passUsuario = new javax.swing.JLabel();
        tf_destino_passUsuario = new javax.swing.JTextField();
        b_destino_conectar = new javax.swing.JButton();
        d_tablas = new javax.swing.JDialog();
        l_sinReplicar = new javax.swing.JLabel();
        sp_sinReplicar = new javax.swing.JScrollPane();
        list_sinReplicar = new javax.swing.JList<>();
        b_add = new javax.swing.JButton();
        b_sub = new javax.swing.JButton();
        l_replicando = new javax.swing.JLabel();
        sp_replicando = new javax.swing.JScrollPane();
        list_replicando = new javax.swing.JList<>();
        b_guardar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();
        p_inicio = new javax.swing.JPanel();
        l_proyecto2 = new javax.swing.JLabel();
        l_asignatura = new javax.swing.JLabel();
        l_grupo4 = new javax.swing.JLabel();
        l_integrante1 = new javax.swing.JLabel();
        l_integrante2 = new javax.swing.JLabel();
        l_integrante3 = new javax.swing.JLabel();
        b_continuar = new javax.swing.JButton();

        d_origen.setTitle("Configuración de Bases de Datos");

        l_origen.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        l_origen.setText("Origen");

        l_sqlserver.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        l_sqlserver.setText("(SQL Server)");

        l_origen_nombreInstancia.setText("Nombre de la Instancia");

        l_origen_nombreBD.setText("Nombre de la Base de Datos");

        l_origen_puerto.setText("Puerto");

        l_origen_nombreUsuario.setText("Nombre del Usuario");

        l_origen_passUsuario.setText("Contraseña del Usuario");

        b_origen_conectar.setText("Establecer conexión");
        b_origen_conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_origen_conectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout d_origenLayout = new javax.swing.GroupLayout(d_origen.getContentPane());
        d_origen.getContentPane().setLayout(d_origenLayout);
        d_origenLayout.setHorizontalGroup(
            d_origenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_origenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(d_origenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(d_origenLayout.createSequentialGroup()
                        .addGroup(d_origenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_origen_nombreInstancia)
                            .addComponent(l_origen_nombreBD)
                            .addComponent(l_origen_puerto)
                            .addComponent(l_origen_nombreUsuario)
                            .addComponent(l_origen_passUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(d_origenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_origen_passUsuario)
                            .addComponent(tf_origen_nombreUsuario)
                            .addComponent(tf_origen_puerto)
                            .addComponent(tf_origen_nombreBD)
                            .addComponent(tf_origen_nombreInstancia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(b_origen_conectar)
                    .addGroup(d_origenLayout.createSequentialGroup()
                        .addComponent(l_origen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_sqlserver)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        d_origenLayout.setVerticalGroup(
            d_origenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, d_origenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(d_origenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_origen)
                    .addComponent(l_sqlserver))
                .addGap(18, 18, 18)
                .addGroup(d_origenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_origen_nombreInstancia)
                    .addComponent(tf_origen_nombreInstancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(d_origenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_origen_nombreBD)
                    .addComponent(tf_origen_nombreBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(d_origenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_origen_puerto)
                    .addComponent(tf_origen_puerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(d_origenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_origen_nombreUsuario)
                    .addComponent(tf_origen_nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(d_origenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_origen_passUsuario)
                    .addComponent(tf_origen_passUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(b_origen_conectar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        d_destino.setTitle("Configuración de Bases de Datos");

        l_destino.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        l_destino.setText("Destino");

        l_mysql.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        l_mysql.setText("(MySQL)");

        l_destino_nombreInstancia.setText("Nombre de la Instancia");

        l_destino_nombreBD.setText("Nombre de la Base de Datos");

        l_destino_puerto.setText("Puerto");

        l_destino_nombreUsuario.setText("Nombre del Usuario");

        l_destino_passUsuario.setText("Contraseña del Usuario");

        b_destino_conectar.setText("Establecer conexión");
        b_destino_conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_destino_conectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout d_destinoLayout = new javax.swing.GroupLayout(d_destino.getContentPane());
        d_destino.getContentPane().setLayout(d_destinoLayout);
        d_destinoLayout.setHorizontalGroup(
            d_destinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_destinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(d_destinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(d_destinoLayout.createSequentialGroup()
                        .addGroup(d_destinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_destino_nombreInstancia)
                            .addComponent(l_destino_nombreBD)
                            .addComponent(l_destino_puerto)
                            .addComponent(l_destino_nombreUsuario)
                            .addComponent(l_destino_passUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(d_destinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_destino_passUsuario)
                            .addComponent(tf_destino_nombreUsuario)
                            .addComponent(tf_destino_puerto)
                            .addComponent(tf_destino_nombreBD)
                            .addComponent(tf_destino_nombreInstancia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(b_destino_conectar)
                    .addGroup(d_destinoLayout.createSequentialGroup()
                        .addComponent(l_destino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_mysql)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        d_destinoLayout.setVerticalGroup(
            d_destinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, d_destinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(d_destinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_destino)
                    .addComponent(l_mysql))
                .addGap(18, 18, 18)
                .addGroup(d_destinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_destino_nombreInstancia)
                    .addComponent(tf_destino_nombreInstancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(d_destinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_destino_nombreBD)
                    .addComponent(tf_destino_nombreBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(d_destinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_destino_puerto)
                    .addComponent(tf_destino_puerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(d_destinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_destino_nombreUsuario)
                    .addComponent(tf_destino_nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(d_destinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_destino_passUsuario)
                    .addComponent(tf_destino_passUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(b_destino_conectar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        d_tablas.setTitle("Replicación de Tablas Seleccionadas");

        l_sinReplicar.setText("Sin Replicar");

        sp_sinReplicar.setViewportView(list_sinReplicar);

        b_add.setText(">>");
        b_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_addActionPerformed(evt);
            }
        });

        b_sub.setText("<<");
        b_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_subActionPerformed(evt);
            }
        });

        l_replicando.setText("Replicando");

        sp_replicando.setViewportView(list_replicando);

        b_guardar.setText("Guardar");
        b_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_guardarActionPerformed(evt);
            }
        });

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout d_tablasLayout = new javax.swing.GroupLayout(d_tablas.getContentPane());
        d_tablas.getContentPane().setLayout(d_tablasLayout);
        d_tablasLayout.setHorizontalGroup(
            d_tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_tablasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(d_tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(d_tablasLayout.createSequentialGroup()
                        .addComponent(l_sinReplicar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(l_replicando))
                    .addGroup(d_tablasLayout.createSequentialGroup()
                        .addGroup(d_tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sp_sinReplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_guardar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(d_tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_add)
                            .addComponent(b_sub))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(d_tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_cancelar)
                            .addComponent(sp_replicando, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        d_tablasLayout.setVerticalGroup(
            d_tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_tablasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(d_tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_sinReplicar)
                    .addComponent(l_replicando))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(d_tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(d_tablasLayout.createSequentialGroup()
                        .addComponent(b_add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_sub))
                    .addComponent(sp_replicando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_sinReplicar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(d_tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cancelar)
                    .addComponent(b_guardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Teoría de Bases de Datos II");

        l_proyecto2.setText("Proyecto II");

        l_asignatura.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        l_asignatura.setText("Sistema Integrador de Bases de Datos");

        l_grupo4.setText("Grupo 4");

        l_integrante1.setText("Daniela Cáceres");

        l_integrante2.setText("José Rojas");

        l_integrante3.setText("Oswal Fuentes");

        b_continuar.setText("Continuar");
        b_continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_continuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_inicioLayout = new javax.swing.GroupLayout(p_inicio);
        p_inicio.setLayout(p_inicioLayout);
        p_inicioLayout.setHorizontalGroup(
            p_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_inicioLayout.createSequentialGroup()
                .addGap(0, 74, Short.MAX_VALUE)
                .addGroup(p_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(l_proyecto2)
                    .addComponent(l_asignatura)
                    .addComponent(l_grupo4)
                    .addComponent(l_integrante3)
                    .addComponent(l_integrante1)
                    .addComponent(l_integrante2)
                    .addComponent(b_continuar))
                .addGap(74, 74, 74))
        );
        p_inicioLayout.setVerticalGroup(
            p_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_inicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_proyecto2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_asignatura)
                .addGap(18, 18, 18)
                .addComponent(l_grupo4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_integrante1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_integrante2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_integrante3)
                .addGap(18, 18, 18)
                .addComponent(b_continuar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_continuarActionPerformed
        this.setVisible(false);
        // Muestra la ventana para hacer la conexión a la base de datos origen.        
        d_origen.setModal(true);
        d_origen.pack();
        d_origen.setLocationRelativeTo(this);
        d_origen.setVisible(true);
    }//GEN-LAST:event_b_continuarActionPerformed

    private void b_origen_conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_origen_conectarActionPerformed
        // Establecer la conexión a la base de datos origen.
        
        d_origen.dispose();
        // Muestra la ventana para hacer la conexión a la base de datos destino.        
        d_destino.setModal(true);
        d_destino.pack();
        d_destino.setLocationRelativeTo(this);
        d_destino.setVisible(true);
    }//GEN-LAST:event_b_origen_conectarActionPerformed

    private void b_destino_conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_destino_conectarActionPerformed
        // Establecer la conexión a la base de datos destino.
        // Iniciar el hilo de ejecución del job cuando se seleccione por lo menos una tabla.
        
        d_destino.dispose();
        // Muestra la ventana para seleccionar la tablas a ser replicadas.
        d_tablas.setModal(true);
        d_tablas.pack();
        d_tablas.setLocationRelativeTo(this);
        d_tablas.setVisible(true);
    }//GEN-LAST:event_b_destino_conectarActionPerformed

    private void b_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_addActionPerformed
        // Se agrega la tabla seleccionada a la lista de tablas que se estarán replicando.
    }//GEN-LAST:event_b_addActionPerformed

    private void b_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_subActionPerformed
        // Se quita la tabla seleccionada de la lista de tablas que se estarán replicando.
    }//GEN-LAST:event_b_subActionPerformed

    private void b_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_guardarActionPerformed
        // Se guardan las tablas de la lista de tablas que se estarán replicando.
        
        /* Se podría mostrar una ventana que visualice una etiqueta 
        que se actualice cada vez que se ejecute el job. */
    }//GEN-LAST:event_b_guardarActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        // Se podría detener el job.
    }//GEN-LAST:event_b_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_add;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JButton b_continuar;
    private javax.swing.JButton b_destino_conectar;
    private javax.swing.JButton b_guardar;
    private javax.swing.JButton b_origen_conectar;
    private javax.swing.JButton b_sub;
    private javax.swing.JDialog d_destino;
    private javax.swing.JDialog d_origen;
    private javax.swing.JDialog d_tablas;
    private javax.swing.JLabel l_asignatura;
    private javax.swing.JLabel l_destino;
    private javax.swing.JLabel l_destino_nombreBD;
    private javax.swing.JLabel l_destino_nombreInstancia;
    private javax.swing.JLabel l_destino_nombreUsuario;
    private javax.swing.JLabel l_destino_passUsuario;
    private javax.swing.JLabel l_destino_puerto;
    private javax.swing.JLabel l_grupo4;
    private javax.swing.JLabel l_integrante1;
    private javax.swing.JLabel l_integrante2;
    private javax.swing.JLabel l_integrante3;
    private javax.swing.JLabel l_mysql;
    private javax.swing.JLabel l_origen;
    private javax.swing.JLabel l_origen_nombreBD;
    private javax.swing.JLabel l_origen_nombreInstancia;
    private javax.swing.JLabel l_origen_nombreUsuario;
    private javax.swing.JLabel l_origen_passUsuario;
    private javax.swing.JLabel l_origen_puerto;
    private javax.swing.JLabel l_proyecto2;
    private javax.swing.JLabel l_replicando;
    private javax.swing.JLabel l_sinReplicar;
    private javax.swing.JLabel l_sqlserver;
    private javax.swing.JList<String> list_replicando;
    private javax.swing.JList<String> list_sinReplicar;
    private javax.swing.JPanel p_inicio;
    private javax.swing.JScrollPane sp_replicando;
    private javax.swing.JScrollPane sp_sinReplicar;
    private javax.swing.JTextField tf_destino_nombreBD;
    private javax.swing.JTextField tf_destino_nombreInstancia;
    private javax.swing.JTextField tf_destino_nombreUsuario;
    private javax.swing.JTextField tf_destino_passUsuario;
    private javax.swing.JTextField tf_destino_puerto;
    private javax.swing.JTextField tf_origen_nombreBD;
    private javax.swing.JTextField tf_origen_nombreInstancia;
    private javax.swing.JTextField tf_origen_nombreUsuario;
    private javax.swing.JTextField tf_origen_passUsuario;
    private javax.swing.JTextField tf_origen_puerto;
    // End of variables declaration//GEN-END:variables
}
