// GUI que muestra los formularios concernientes a la aplicación.

package proyecto2_tbd2;

import java.sql.*;
import SQL_Server.JDBC_SQLServer;
import MySQL.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame {
    
    JDBC_SQLServer con_sqlserver = null;
    JDBC_MySQL con_mysql = null;
    
    ArrayList<String> tablasSinReplicar = new ArrayList();
    ArrayList<String> tablasReplicando = new ArrayList();
    
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
        pf_origen_passUsuario = new javax.swing.JPasswordField();
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
        pf_destino_passUsuario = new javax.swing.JPasswordField();
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
        l_job = new javax.swing.JLabel();
        b_job = new javax.swing.JButton();
        b_finalizar = new javax.swing.JButton();
        p_inicio = new javax.swing.JPanel();
        l_proyecto2 = new javax.swing.JLabel();
        l_asignatura = new javax.swing.JLabel();
        l_grupo4 = new javax.swing.JLabel();
        l_integrante1 = new javax.swing.JLabel();
        l_integrante2 = new javax.swing.JLabel();
        l_integrante3 = new javax.swing.JLabel();
        b_continuar = new javax.swing.JButton();

        d_origen.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        tf_origen_nombreInstancia.setEnabled(false);

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
                            .addComponent(tf_origen_nombreUsuario)
                            .addComponent(tf_origen_puerto)
                            .addComponent(tf_origen_nombreBD)
                            .addComponent(tf_origen_nombreInstancia, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(pf_origen_passUsuario)))
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
                    .addComponent(pf_origen_passUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(b_origen_conectar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        d_destino.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        d_destino.setTitle("Configuración de Bases de Datos");

        l_destino.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        l_destino.setText("Destino");

        l_mysql.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        l_mysql.setText("(MySQL)");

        l_destino_nombreInstancia.setText("Nombre de la Instancia");

        tf_destino_nombreInstancia.setEnabled(false);

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
                            .addComponent(tf_destino_nombreUsuario)
                            .addComponent(tf_destino_puerto)
                            .addComponent(tf_destino_nombreBD)
                            .addComponent(tf_destino_nombreInstancia, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(pf_destino_passUsuario)))
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
                    .addComponent(pf_destino_passUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(b_destino_conectar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        d_tablas.setTitle("Replicación de Tablas Seleccionadas");

        l_sinReplicar.setText("Sin Replicar");

        list_sinReplicar.setModel(new DefaultListModel());
        list_sinReplicar.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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

        list_replicando.setModel(new DefaultListModel());
        list_replicando.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        sp_replicando.setViewportView(list_replicando);

        l_job.setText("HH:MM:SS");

        b_job.setText("Job");
        b_job.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_jobActionPerformed(evt);
            }
        });

        b_finalizar.setText("Finalizar");
        b_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_finalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout d_tablasLayout = new javax.swing.GroupLayout(d_tablas.getContentPane());
        d_tablas.getContentPane().setLayout(d_tablasLayout);
        d_tablasLayout.setHorizontalGroup(
            d_tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_tablasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(d_tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(d_tablasLayout.createSequentialGroup()
                        .addComponent(l_sinReplicar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(l_replicando))
                    .addGroup(d_tablasLayout.createSequentialGroup()
                        .addGroup(d_tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(d_tablasLayout.createSequentialGroup()
                                .addComponent(l_job)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_job))
                            .addComponent(sp_sinReplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(d_tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_add)
                            .addComponent(b_sub))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(d_tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sp_replicando, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_finalizar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        d_tablasLayout.setVerticalGroup(
            d_tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, d_tablasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(d_tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_sinReplicar)
                    .addComponent(l_replicando))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(d_tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(d_tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addGroup(d_tablasLayout.createSequentialGroup()
                            .addComponent(b_add)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(b_sub))
                        .addComponent(sp_sinReplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sp_replicando, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(d_tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_job)
                    .addComponent(b_finalizar)
                    .addComponent(l_job))
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
        // Establece la conexión a la base de datos origen.
        // TO DO: Validar cuando una conexión no sea exitosa.
        con_sqlserver = new JDBC_SQLServer();        
        con_sqlserver.establecerConexion(
            tf_origen_nombreBD.getText(), 
            tf_origen_puerto.getText(), 
            tf_origen_nombreUsuario.getText(), 
            pf_origen_passUsuario.getText());
        // TO DO: Cerrar esta conexión más adelante.
        d_origen.dispose();
        // Muestra la ventana para hacer la conexión a la base de datos destino.        
        d_destino.setModal(true);
        d_destino.pack();
        d_destino.setLocationRelativeTo(this);
        d_destino.setVisible(true);
    }//GEN-LAST:event_b_origen_conectarActionPerformed

    private void b_destino_conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_destino_conectarActionPerformed
        // Establece la conexión a la base de datos destino.
        // TO DO: Validar cuando una conexión no sea exitosa.
        con_mysql = new JDBC_MySQL();
        con_mysql.establecerConexion(
            tf_destino_nombreBD.getText(), 
            tf_destino_puerto.getText(), 
            tf_destino_nombreUsuario.getText(), 
            pf_destino_passUsuario.getText());
        // TO DO: Cerrar esta conexión más adelante.
        d_destino.dispose();
        // Inicializa el modelo del JList de las tablas sin replicar.
        DefaultListModel modeloSinReplicar = (DefaultListModel) list_sinReplicar.getModel();
        modeloSinReplicar.addElement("Company");
        modeloSinReplicar.addElement("Pass_in_trip");
        modeloSinReplicar.addElement("Passenger");
        modeloSinReplicar.addElement("Trip");
        // Muestra la ventana para seleccionar la tablas que serán replicadas.
        d_tablas.setModal(true);
        d_tablas.pack();
        d_tablas.setLocationRelativeTo(this);
        d_tablas.setVisible(true);
    }//GEN-LAST:event_b_destino_conectarActionPerformed

    private void b_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_addActionPerformed
        // Se agrega la tabla seleccionada a la lista de tablas que se estarán replicando.
        DefaultListModel modeloSinReplicar = (DefaultListModel) list_sinReplicar.getModel();
        // Valida que una tabla haya sido seleccionada.
        if (list_sinReplicar.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(d_tablas, "Por favor seleccione una tabla.", "Tablas Sin Replicar", JOptionPane.WARNING_MESSAGE);
        } else {
            String tablaSeleccionada = list_sinReplicar.getSelectedValue(); // Obtiene la tabla que fue seleccionada.
            DefaultListModel modeloReplicando = (DefaultListModel) list_replicando.getModel();
            modeloReplicando.addElement(tablaSeleccionada); // Agrega la tabla seleccionada a la lista de tablas que se estarán replicando.
            list_replicando.setModel(modeloReplicando);
            modeloSinReplicar.removeElement(tablaSeleccionada); // Elimina la tabla seleccionada de la lista de tablas sin replicar.
            list_sinReplicar.setModel(modeloSinReplicar);
        }
    }//GEN-LAST:event_b_addActionPerformed

    private void b_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_subActionPerformed
        // Se quita la tabla seleccionada de la lista de tablas que se estarán replicando.
        DefaultListModel modeloReplicando = (DefaultListModel) list_replicando.getModel();
        // Valida que una tabla haya sido seleccionada.
        if (modeloReplicando.isEmpty()) {            
            JOptionPane.showMessageDialog(d_tablas, "Por favor agregue por lo menos una tabla.", "Tablas que serán Replicadas", JOptionPane.WARNING_MESSAGE);
        } else if (list_replicando.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(d_tablas, "Por favor seleccione una tabla.", "Tablas que serán Replicadas", JOptionPane.WARNING_MESSAGE);
        } else {
            String tablaSeleccionada = list_replicando.getSelectedValue();
            DefaultListModel modeloSinReplicar = (DefaultListModel) list_sinReplicar.getModel();
            modeloSinReplicar.addElement(tablaSeleccionada);
            list_sinReplicar.setModel(modeloSinReplicar);
            modeloReplicando.removeElement(tablaSeleccionada);
            list_replicando.setModel(modeloReplicando);
        }
    }//GEN-LAST:event_b_subActionPerformed

    private void b_jobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_jobActionPerformed
        // Actualiza la etiqueta del job con la hora del sistema.
        Calendar calendario = new GregorianCalendar();
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minutos = calendario.get(Calendar.MINUTE);
        int segundos = calendario.get(Calendar.SECOND);
        l_job.setText(hora + ":" + minutos + ":" + segundos);
        
        // Ejecuta el job para las tablas que fueron seleccionadas.
        DefaultListModel modeloReplicando = (DefaultListModel) list_replicando.getModel();        
        String cargarBitacora = "select * from Bitacora;";
        try {
            // SQL Server
            Statement st_origen = con_sqlserver.getCon().createStatement();
            ResultSet rs_origen = st_origen.executeQuery(cargarBitacora);
            String operacion;
            
            String tabla;
            // int a = 0;
            while(rs_origen.next()) { // Revisa todas las tuplas de la tabla Bitacora.
                tabla = rs_origen.getString(2); // Obtiene el nombre de la tabla a la cual pertenece la operación.
                // System.out.println(a + " - " +tabla);
                for (int i = 0; i < modeloReplicando.size(); i++) { // Recorre la lista de tablas seleccionadas.
                    // System.out.println(modeloReplicando.get(i));
                    if (tabla.equals(modeloReplicando.get(i))) { // Revisa que el nombre de la tabla a la cual pertenece la operación sea igual a alguna de las tablas seleccionadas.
                        // System.out.println("check");
                        if (rs_origen.getBoolean(4) == false) { // Revisa que la operación no haya sido replicada.
                            // Replica la operación en MySQL.
                            operacion = rs_origen.getString(3);
                            Statement st_destino = con_mysql.getCon().createStatement();
                            st_destino.executeUpdate(operacion); // Replicación
                            st_destino.close();
                            // Marca la tupla que fue replicada.                            
                            Statement st_replicada = con_sqlserver.getCon().createStatement();
                            st_replicada.executeUpdate("update Bitacora set Replicada = 1 where Id = " + rs_origen.getInt(1) + ";");
                            st_replicada.close();
                        }
                    }
                }
                // a++;
            }
            st_origen.close();
            System.out.println("¡El job se ejecutó exitosamente!");
            // con_sqlserver.getCon().close();
        } catch (Exception e) {
            System.out.println("Ocurrió un error al ejecutar el job.");
            System.out.println(e);
            // e.printStackTrace();
        }
    }//GEN-LAST:event_b_jobActionPerformed

    private void b_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_finalizarActionPerformed
        // Cierra las conexiones y finaliza el programa.
        try {
            con_sqlserver.getCon().close();
            con_mysql.getCon().close();
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Ocurrió un error al finalizar el programa.");
            e.printStackTrace();
        }        
    }//GEN-LAST:event_b_finalizarActionPerformed

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
    private javax.swing.JButton b_continuar;
    private javax.swing.JButton b_destino_conectar;
    private javax.swing.JButton b_finalizar;
    private javax.swing.JButton b_job;
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
    private javax.swing.JLabel l_job;
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
    private javax.swing.JPasswordField pf_destino_passUsuario;
    private javax.swing.JPasswordField pf_origen_passUsuario;
    private javax.swing.JScrollPane sp_replicando;
    private javax.swing.JScrollPane sp_sinReplicar;
    private javax.swing.JTextField tf_destino_nombreBD;
    private javax.swing.JTextField tf_destino_nombreInstancia;
    private javax.swing.JTextField tf_destino_nombreUsuario;
    private javax.swing.JTextField tf_destino_puerto;
    private javax.swing.JTextField tf_origen_nombreBD;
    private javax.swing.JTextField tf_origen_nombreInstancia;
    private javax.swing.JTextField tf_origen_nombreUsuario;
    private javax.swing.JTextField tf_origen_puerto;
    // End of variables declaration//GEN-END:variables
}