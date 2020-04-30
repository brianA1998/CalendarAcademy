package Model;

import View.LoginView;
import java.sql.*;
import javax.swing.JOptionPane;

public class LoginModel {

    //Declaracion de variables
    Connection cc;
    Connection cn = Conexion();
    LoginView v = new View.LoginView();

    /**
     * Este metodo permite la conexion con la base de datos
     *
     * @return la conexion a la base de datos
     */
    public Connection Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cc = DriverManager.getConnection("jdbc:mysql://localhost/bd_calendar", "root", "");
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.err.print(e);
        }
        return cc;
    }

    /**
     * Este metodo permite registrar usuarios a la base de datos
     */
    public void RegistrarUsuarios() {
        //Realizando un Query a la base de datos
        try {
            if (v.txt_username.getText().equals("") || v.txt_password.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Completar todos los campos");
            } else {

                PreparedStatement ppt = cn.prepareStatement("INSERT INTO usuarios(user,password) VALUES (?,?)");

                ppt.setString(1, v.txt_username.getText());
                ppt.setString(2, v.txt_password.getText());
                ppt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Insercion exitosa");
                //LimpiarCampos();
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Insercion fallida");
            //LimpiarCampos();
        }
    }

    /**
     * Este metodo nos permite limpiar todos los campos despues/antes de una
     * accion o evento
     */
    public void LimpiarCampos() {
        v.txt_username.setText("");
        v.txt_password.setText("");

    }

}
