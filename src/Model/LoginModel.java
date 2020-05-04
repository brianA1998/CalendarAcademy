package Model;

import Controller.LoginController;
import Controller.MenuController;
import View.LoginView;
import View.MenuView;
import java.sql.*;
import javax.swing.JOptionPane;

public class LoginModel {

    //Declaracion de variables
    Connection driverconnector;
    Connection conexion = Conectar();
    LoginView vista_login = new View.LoginView();
    public boolean bandera = true;

    /**
     * Este metodo permite la conexion con la base de datos
     *
     * @return la conexion a la base de datos
     */
    public Connection Conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            driverconnector = DriverManager.getConnection("jdbc:mysql://localhost/bd_calendar", "root", "");
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.err.print(e);
        }
        return driverconnector;
    }

    /**
     * Este metodo permite registrar usuarios a la base de datos y limpiar los
     * campos una vez que se guardaron los datos en la bd
     */
    public void RegistrarUsuarios() {
        //Realizando un Query a la base de datos
        try {
            if (vista_login.txt_username.getText().equals("") || vista_login.txt_password.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Completar todos los campos");
            } else {

                PreparedStatement insertarSQL = conexion.prepareStatement("INSERT INTO usuarios(user,password) VALUES (?,?)");

                insertarSQL.setString(1, vista_login.txt_username.getText());
                insertarSQL.setString(2, vista_login.txt_password.getText());
                insertarSQL.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cargado al sistema correctamente");
                bandera = true;
                MostrarMenu();
            }
        } catch (SQLException ex) {
            bandera = false;
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Insercion fallida");

        }
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

            if (vista_login.txt_username.getText().equals("") || vista_login.txt_password.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Completar todos los campos");
            } else {

                String usuario = vista_login.txt_username.getText();
                String password = vista_login.txt_password.getText();

                //Query
                String sql = "SELECT * FROM usuarios where user ='" + usuario + "' and password='" + password + "'";
                Statement consultaSQL = driverconnector.createStatement();
                ResultSet rs = consultaSQL.executeQuery(sql);
                if (rs.next()) {
                    resultado = 1;
                    if (resultado == 1) {
                        JOptionPane.showMessageDialog(null, "Bienvenido al sistema " + usuario);
                        bandera = true;
                        MostrarMenu();

                    }
                } else {
                    bandera = false;
                    JOptionPane.showMessageDialog(null, "Usted no esta cargado en el sistema,registrese");
                    vista_login.txt_username.setText("");
                    vista_login.txt_password.setText("");
                    vista_login.btn_login.setEnabled(false);
                }
            }

        } catch (Exception ex) {
            System.err.print(ex);
            JOptionPane.showMessageDialog(null, "No se puede ingresar al sistema");
        }
    }

    /**
     * Este metodo llama al metodo iniciar del controlador del menu y este
     * muestra la interfaz de menu
     */
    public void MostrarMenu() {
        MenuModel menu_modelo = new MenuModel();
        MenuView menu_vista = new MenuView();
        MenuController menu_controlador = new MenuController(menu_vista, menu_modelo);
        menu_controlador.Iniciar();
    }

}
