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
     * Este metodo permite registrar usuarios a la base de datos y limpiar los
     * campos una vez que se guardaron los datos en la bd
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
                v.txt_username.setText("");
                v.txt_password.setText("");

            }
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Insercion fallida");

        }
    }

    /**
     * Este metodo permite bloquear el boton de login
     */
    public void BloquerBoton() {
        v.btn_login.setEnabled(false);
    }

    /**
     * Este metodo permite validar si el usuario existe en la base de datos o no
     * Nos va a redirrecionar al menuprincipal si existe el usuario Pero si no
     * existe nos va a pedir que nos registremos
     *
     */
    public void ValidarLogin() {
        int resultado = 0;

        try {

            if (v.txt_username.getText().equals("") || v.txt_password.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Completar todos los campos");
            } else {

                String usuario = v.txt_username.getText();
                String pass = v.txt_password.getText();

                //Query
                String sql = "SELECT * FROM usuarios where user ='" + usuario + "' and password='" + pass + "'";
                Statement st = cc.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if (rs.next()) {
                    resultado = 1;
                    if (resultado == 1) {
                        JOptionPane.showMessageDialog(null, "Bienvenido al Sistema " + usuario);
                        v.txt_username.setText("");
                        v.txt_password.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Usted no esta cargado en el sistema,registrese");
                        v.txt_username.setText("");
                        v.txt_password.setText("");
                        BloquerBoton();
                    }
                }
            }
        } catch (Exception ex) {
            System.err.print(ex);
            JOptionPane.showMessageDialog(null, "No se puede ingresar al sistema");
        }
    }

}
