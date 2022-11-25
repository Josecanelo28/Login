//José Ignacio Canelo
//2022-0446

package Login;

import static Login.ConexionBD.conn;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    //Variables
    Login loginF;
    Registro rU;
    Usuarios UT;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    //Metodo Constructor
    public Login() {
        initComponents();
        //getContentPane().setBackground(Color.lightGray);
        ImageIcon imagen1= new ImageIcon(getClass().getResource("/Imagenes/candado.png"));
        Icon imagen = new ImageIcon(imagen1.getImage().getScaledInstance(ImagenContraseña.getWidth(), ImagenContraseña.getHeight(), Image.SCALE_SMOOTH));
        ImagenContraseña.setIcon(imagen);
        ImageIcon imagen2= new ImageIcon(getClass().getResource("/Imagenes/iconoUsuario.png"));
        Icon imagen3 = new ImageIcon(imagen2.getImage().getScaledInstance(ImagenUsuario.getWidth(), ImagenUsuario.getHeight(), Image.SCALE_SMOOTH));
        ImagenUsuario.setIcon(imagen3);
        this.setLocationRelativeTo(null);
        this.setMaximumSize(this.getSize());
        this.setMinimumSize(this.getSize());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ImagenContraseña = new javax.swing.JLabel();
        IngresarUsuario = new javax.swing.JTextField();
        EtiquetaBienvenido = new javax.swing.JLabel();
        IngresarContrasena = new javax.swing.JPasswordField();
        BotonIniciarSesion = new javax.swing.JButton();
        BotonIrRegistrarse = new javax.swing.JButton();
        ImagenUsuario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesión");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(128, 156, 156));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(ImagenContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 60, 50));

        IngresarUsuario.setBackground(new java.awt.Color(128, 156, 156));
        IngresarUsuario.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        IngresarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        IngresarUsuario.setBorder(null);
        IngresarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(IngresarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 230, 50));

        EtiquetaBienvenido.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        EtiquetaBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaBienvenido.setText("Bienvenido");
        jPanel1.add(EtiquetaBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 430, 70));

        IngresarContrasena.setBackground(new java.awt.Color(128, 156, 156));
        IngresarContrasena.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        IngresarContrasena.setBorder(null);
        IngresarContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarContrasenaActionPerformed(evt);
            }
        });
        jPanel1.add(IngresarContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 230, 50));

        BotonIniciarSesion.setBackground(new java.awt.Color(128, 156, 156));
        BotonIniciarSesion.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        BotonIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        BotonIniciarSesion.setText("Iniciar Sesion");
        BotonIniciarSesion.setBorder(null);
        BotonIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonIniciarSesionMouseClicked(evt);
            }
        });
        BotonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIniciarSesionActionPerformed(evt);
            }
        });
        BotonIniciarSesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BotonIniciarSesionKeyTyped(evt);
            }
        });
        jPanel1.add(BotonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 160, 40));

        BotonIrRegistrarse.setBackground(new java.awt.Color(128, 156, 156));
        BotonIrRegistrarse.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        BotonIrRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        BotonIrRegistrarse.setText("Registrarse");
        BotonIrRegistrarse.setBorder(null);
        BotonIrRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonIrRegistrarseMouseClicked(evt);
            }
        });
        BotonIrRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIrRegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(BotonIrRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, 40));

        ImagenUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoUsuario.png"))); // NOI18N
        jPanel1.add(ImagenUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 60, 60));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 250, 10));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 250, 10));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 430, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIniciarSesionActionPerformed
    }//GEN-LAST:event_BotonIniciarSesionActionPerformed
    

//Accion para el boton de Iniciar Sesion   
    private void BotonIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonIniciarSesionMouseClicked
        //If para los campos vacios, empezando con el de Usuario
        if (IngresarUsuario.getText().equalsIgnoreCase("") | IngresarUsuario.getText().equalsIgnoreCase(" ") | IngresarUsuario.getText().equalsIgnoreCase("  ")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar su usuario y contraseña, si no está registrado debe registrarse.");
        } else{// Else para el usuario vacio
            if (IngresarContrasena.getText().equalsIgnoreCase("") | IngresarContrasena.getText().equalsIgnoreCase(" ") | IngresarContrasena.getText().equalsIgnoreCase("   ")) {
                JOptionPane.showMessageDialog(null, "Debe ingresar su usuario y contraseña, si no está registrado debe registrarse.");   
            } else{//Else para la contraseña vacia
                try {
                //Este codigo es para realizar una consulta a la base de datos
                ps=conn.prepareStatement("Select Nombre_de_Usuario,Contrasena FROM Usuarios WHERE Nombre_de_Usuario = ? AND Contrasena = ?");
                ps.setString(1, IngresarUsuario.getText());
                ps.setString(2, IngresarContrasena.getText());
                rs = ps.executeQuery();
                //Este while recorre la tabla en la BD y determina si hay datos
                while(rs.next()){
                    String nombreUsuario = rs.getString(1);
                    String NombreDeUsuario = IngresarUsuario.getText();
                    String contrasena = rs.getString(2);
                    String ContrasenaUsuario = IngresarContrasena.getText();
                    if (nombreUsuario.equals(NombreDeUsuario)) { //If nombre de usuario
                        if (ContrasenaUsuario.equals(contrasena)) { //If contraseña
                            if (UT != null) {
                                UT.dispose();
                            }
                            UT = new Usuarios();    
                            UT.setVisible(true);
                            this.setVisible(false);
                        } else{ // Else contraseña
                            JOptionPane.showMessageDialog(null, "¡Contraseña incorrecta!");
                        }//Aqui cierra el else de contraseña
                    } else{ // Else nombre de usuario
                        JOptionPane.showMessageDialog(null, "¡Usuario y/o Contraseña incorrectos!");
                    }//Aqui cierra el else de nombre de usuario
                }//Aqui cierra el while
                } catch (SQLException e) {
                }
            }//Aqui cierra el else de contraseña vacia
        }//Aqui cierra el else del if de usuario vacio
    }//GEN-LAST:event_BotonIniciarSesionMouseClicked

    private void BotonIrRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIrRegistrarseActionPerformed
    }//GEN-LAST:event_BotonIrRegistrarseActionPerformed

    //Accion del boton Registrarse
    private void BotonIrRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonIrRegistrarseMouseClicked
        //Este codigo abre la ventana de Registrarse y Cierra la del Login
        if (rU != null) {
            rU.dispose();
        }
        rU = new Registro();    
        rU.setVisible(true);
        this.setVisible(false);          
    }//GEN-LAST:event_BotonIrRegistrarseMouseClicked

    private void IngresarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarUsuarioActionPerformed
    }//GEN-LAST:event_IngresarUsuarioActionPerformed

    private void IngresarContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarContrasenaActionPerformed
    }//GEN-LAST:event_IngresarContrasenaActionPerformed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        
    }//GEN-LAST:event_formKeyTyped

    private void BotonIniciarSesionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotonIniciarSesionKeyTyped
    }//GEN-LAST:event_BotonIniciarSesionKeyTyped

    //Metodo main en el que se conecta la BD y se hace visible el Login
    //Todo esto al ejecutar el programa
    public static void main(String[] args) {
        ConexionBD con;
        con = new ConexionBD();
        Connection reg = con.getConnection();
        new Login().setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIniciarSesion;
    private javax.swing.JButton BotonIrRegistrarse;
    private javax.swing.JLabel EtiquetaBienvenido;
    private javax.swing.JLabel ImagenContraseña;
    private javax.swing.JLabel ImagenUsuario;
    private javax.swing.JPasswordField IngresarContrasena;
    private javax.swing.JTextField IngresarUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
