package Login;

import static Login.ConexionBD.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Usuarios extends javax.swing.JFrame {

    Login loginF;
    Registro rU;
    DefaultTableModel modelo;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String[] datos = new String[5];
    
    //Metodo Contructor
    public Usuarios() {
        initComponents();
        CargarRegistros();
        //ColoresJTable Colorc = new ColoresJTable();
        this.setLocationRelativeTo(null);
        this.setMaximumSize(this.getSize());
        this.setMinimumSize(this.getSize());
    }
    
    //Metodo para cargar los registros a la JTable
    private void CargarRegistros(){
        modelo = (DefaultTableModel) jTable1.getModel();
        try {
            ps = conn.prepareStatement("Select Nombre, Apellido, Nombre_de_Usuario, Correo_Electronico, Número_de_teléfono FROM Usuarios ORDER BY Apellido, Nombre");
            rs = ps.executeQuery();
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
        } catch (SQLException e) {
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CerrarSesion = new javax.swing.JButton();
        BotonEliminarUsuario = new javax.swing.JButton();
        BotonActualizar = new javax.swing.JButton();
        BotonAnadirUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        CorreoElectronico = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Apellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        NombreUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Telefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Contrasena = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuarios Registrados");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(128, 156, 156));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CerrarSesion.setBackground(new java.awt.Color(128, 156, 156));
        CerrarSesion.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        CerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        CerrarSesion.setText("Cerrar Sesion");
        CerrarSesion.setBorder(null);
        CerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarSesionMouseClicked(evt);
            }
        });
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 570, 190, 50));

        BotonEliminarUsuario.setBackground(new java.awt.Color(128, 156, 156));
        BotonEliminarUsuario.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        BotonEliminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotonEliminarUsuario.setText("Eliminar");
        BotonEliminarUsuario.setBorder(null);
        BotonEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(BotonEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, 140, 50));

        BotonActualizar.setBackground(new java.awt.Color(128, 156, 156));
        BotonActualizar.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        BotonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        BotonActualizar.setText("Actualizar");
        BotonActualizar.setBorder(null);
        BotonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonActualizarMouseClicked(evt);
            }
        });
        BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 150, 50));

        BotonAnadirUsuario.setBackground(new java.awt.Color(128, 156, 156));
        BotonAnadirUsuario.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        BotonAnadirUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotonAnadirUsuario.setText("Añadir Nuevo Usuario");
        BotonAnadirUsuario.setBorder(null);
        BotonAnadirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnadirUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(BotonAnadirUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 280, 50));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTable1.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Nombre de usuario", "Correo Electronico", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setName(""); // NOI18N
        jTable1.setRowHeight(30);
        jTable1.setSelectionBackground(new java.awt.Color(128, 156, 156));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(3).setMinWidth(225);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(225);
            jTable1.getColumnModel().getColumn(4).setMinWidth(120);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(120);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 770, 237));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuarios Registrados");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 80));

        CorreoElectronico.setBackground(new java.awt.Color(128, 156, 156));
        CorreoElectronico.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        CorreoElectronico.setForeground(new java.awt.Color(255, 255, 255));
        CorreoElectronico.setBorder(null);
        jPanel1.add(CorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 210, 30));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Correo Electronico");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Apellido");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        Apellido.setBackground(new java.awt.Color(128, 156, 156));
        Apellido.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        Apellido.setForeground(new java.awt.Color(255, 255, 255));
        Apellido.setBorder(null);
        jPanel1.add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 210, 30));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        Nombre.setBackground(new java.awt.Color(128, 156, 156));
        Nombre.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setBorder(null);
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 210, 30));

        NombreUsuario.setBackground(new java.awt.Color(128, 156, 156));
        NombreUsuario.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        NombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        NombreUsuario.setBorder(null);
        jPanel1.add(NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 210, 30));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Nombre de Usuario");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, -1));

        Telefono.setBackground(new java.awt.Color(128, 156, 156));
        Telefono.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        Telefono.setForeground(new java.awt.Color(255, 255, 255));
        Telefono.setBorder(null);
        jPanel1.add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, 210, 30));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Telefono");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, -1, -1));

        Contrasena.setBackground(new java.awt.Color(128, 156, 156));
        Contrasena.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        Contrasena.setForeground(new java.awt.Color(255, 255, 255));
        Contrasena.setBorder(null);
        jPanel1.add(Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 210, 30));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Contraseña");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 870, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 500, 210, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 210, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 210, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 210, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 210, 10));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 210, 10));

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 870, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton Cerrar Sesion
    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        //Este codigo cierra la pantalla Principal y vuelve al Login
        if (loginF != null) {
        loginF.dispose();
        }
        loginF = new Login();   
        loginF.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void CerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionMouseClicked
    }//GEN-LAST:event_CerrarSesionMouseClicked

    //Accion boton Añadir usuario
    private void BotonAnadirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnadirUsuarioActionPerformed
        try {
            if (Nombre.getText().equalsIgnoreCase("") | Nombre.getText().equalsIgnoreCase(" ")) { //If para el nombre vacio
                JOptionPane.showMessageDialog(null, "El campo 'Nombre' está vacío, debe llenarlo");    
            } else if (Apellido.getText().equalsIgnoreCase("")) { //If para el Apellido vacío
                    JOptionPane.showMessageDialog(null, "El campo 'Apellido' está vacío, debe llenarlo");
                } else if (NombreUsuario.getText().equalsIgnoreCase("")) {//IF para el nombre de usuario vacio
                        JOptionPane.showMessageDialog(null, "El campo 'Nombre de usuario' está vacío, debe llenarlo");
                    } else if (CorreoElectronico.getText().equalsIgnoreCase("")) { //IF para el correo electronico vacio
                            JOptionPane.showMessageDialog(null, "El campo 'Correo Electronico' está vacío, debe llenarlo");
                        } else if (Contrasena.getText().equalsIgnoreCase("")) { //IF para la contraseña vacia
                                JOptionPane.showMessageDialog(null,"El campo 'Contraseña' está vacío, debe llenarlo");
                            } else if (Telefono.getText().equalsIgnoreCase("")) {//IF para el numero de telefono vacio
                                    JOptionPane.showMessageDialog(null,"El campo 'Numero de Telefono' está vacío, debe llenarlo");
                                } else{ //Else para el numero de telefono vacio
                                            ps=conn.prepareStatement("INSERT INTO Usuarios VALUES( ?, ?, ?, ?, ?, ?)");
                                            ps.setString(1, Nombre.getText());
                                            ps.setString(2, Apellido.getText());
                                            ps.setString(3, NombreUsuario.getText());
                                            ps.setString(4, CorreoElectronico.getText());
                                            ps.setString(5, Contrasena.getText());
                                            ps.setString(6, Telefono.getText());
                                            ps.executeUpdate();
                                            modelo.setRowCount(0);
                                            CargarRegistros();
                                }//Aqui cierra el utlimo else
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "¡Nombre de usuario en uso!");
            }
    }//GEN-LAST:event_BotonAnadirUsuarioActionPerformed

    private void BotonEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarUsuarioActionPerformed
        int RegistroSeleccionado = jTable1.getSelectedRow();
        if (RegistroSeleccionado == -1) {
            JOptionPane.showMessageDialog(null, "¡No ha seleccionado ningun registro!");
        } else{
            String Usuario = (String) modelo.getValueAt(RegistroSeleccionado, 2);
            modelo.removeRow(RegistroSeleccionado);
            try {
                ps = conn.prepareStatement("DELETE FROM Usuarios WHERE Nombre_de_Usuario = ?");
                ps.setString(1, Usuario);
                ps.executeUpdate();
            } catch (SQLException e) {
            }
        }
    }//GEN-LAST:event_BotonEliminarUsuarioActionPerformed

    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed
        try {
            int RegistroSeleccionado = jTable1.getSelectedRow();
            if (RegistroSeleccionado == -1) {
                JOptionPane.showMessageDialog(null, "¡No ha seleccionado ningun registro!");
            } else{
                if (Nombre.getText().equalsIgnoreCase("") | Nombre.getText().equalsIgnoreCase(" ")) { //If para el nombre vacio
                    JOptionPane.showMessageDialog(null, "El campo 'Nombre' está vacío, debe llenarlo");    
                } else if (Apellido.getText().equalsIgnoreCase("")) { //If para el Apellido vacío
                        JOptionPane.showMessageDialog(null, "El campo 'Apellido' está vacío, debe llenarlo");
                    } else if (NombreUsuario.getText().equalsIgnoreCase("")) {//IF para el nombre de usuario vacio
                            JOptionPane.showMessageDialog(null, "El campo 'Nombre de usuario' está vacío, debe llenarlo");
                        } else if (CorreoElectronico.getText().equalsIgnoreCase("")) { //IF para el correo electronico vacio
                                JOptionPane.showMessageDialog(null, "El campo 'Correo Electronico' está vacío, debe llenarlo");
                            } else if (Contrasena.getText().equalsIgnoreCase("")) { //IF para la contraseña vacia
                                    JOptionPane.showMessageDialog(null,"El campo 'Contraseña' está vacío, debe llenarlo");
                                } else if (Telefono.getText().equalsIgnoreCase("")) {//IF para el numero de telefono vacio
                                        JOptionPane.showMessageDialog(null,"El campo 'Numero de Telefono' está vacío, debe llenarlo");
                                    } else{ //Else para el numero de telefono vacia
                                            String Usuario = (String) modelo.getValueAt(RegistroSeleccionado, 2);
                                            ps = conn.prepareStatement("UPDATE Usuarios set Nombre = ?, Apellido = ?, Nombre_de_Usuario = ?, Correo_Electronico = ?, Contrasena = ?, Número_de_teléfono = ? WHERE Nombre_de_Usuario = ?");
                                            ps.setString(1, Nombre.getText());
                                            ps.setString(2, Apellido.getText());
                                            ps.setString(3, NombreUsuario.getText());
                                            ps.setString(4, CorreoElectronico.getText());
                                            ps.setString(5, Contrasena.getText());
                                            ps.setString(6,Telefono.getText());
                                            ps.setString(7, Usuario);
                                            ps.executeUpdate();
                                            modelo.setRowCount(0);
                                            CargarRegistros();   
                                        }
                                    }//Aqui cierra el Else de registro no seleccionado
                                } catch (SQLException ex) {
                                    JOptionPane.showMessageDialog(null, "¡Nombre de usuario en uso!");
                                }
    }//GEN-LAST:event_BotonActualizarActionPerformed

    private void BotonActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonActualizarMouseClicked
    }//GEN-LAST:event_BotonActualizarMouseClicked

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
    }//GEN-LAST:event_formKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonAnadirUsuario;
    private javax.swing.JButton BotonEliminarUsuario;
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JPasswordField Contrasena;
    private javax.swing.JTextField CorreoElectronico;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField NombreUsuario;
    private javax.swing.JTextField Telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}